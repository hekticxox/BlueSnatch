package com.example.bluescan

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import org.json.JSONArray
import org.json.JSONObject
import java.io.File

class ScanReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "com.example.bluescan.SCAN") {
            val devices = mutableListOf<JSONObject>()
            val bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
            if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled) {
                writeResult(context, JSONArray().put(JSONObject().put("error", "Bluetooth disabled or unavailable")))
                return
            }

            val receiver = object : BroadcastReceiver() {
                override fun onReceive(ctx: Context?, intent: Intent?) {
                    if (BluetoothDevice.ACTION_FOUND == intent?.action) {
                        val device: BluetoothDevice? = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE)
                        device?.let {
                            val obj = JSONObject()
                            obj.put("name", it.name ?: "unknown")
                            obj.put("address", it.address)
                            devices.add(obj)
                        }
                    }
                    if (BluetoothAdapter.ACTION_DISCOVERY_FINISHED == intent?.action) {
                        context.unregisterReceiver(this)
                        writeResult(context, JSONArray(devices))
                    }
                }
            }

            val filter = android.content.IntentFilter(BluetoothDevice.ACTION_FOUND)
            context.registerReceiver(receiver, filter)
            context.registerReceiver(receiver, android.content.IntentFilter(BluetoothAdapter.ACTION_DISCOVERY_FINISHED))

            bluetoothAdapter.startDiscovery()
        }
    }

    private fun writeResult(context: Context, jsonArray: JSONArray) {
        val file = File("/sdcard/bluescan_result.json")
        file.writeText(jsonArray.toString())
    }
}
