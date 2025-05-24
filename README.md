#BlueSnatch

**BlueSnatch** is a no-nonsense Android app that scans nearby Bluetooth devices, logs their info, and lets you keep tabs on your digital surroundings like a true street boss. Built for stealth ops or data awareness, it handles the modern Android Bluetooth permission madness and drops the goods into a file for easy access or further hustle.

---

##What This Repo Does

- **Bluetooth Scanning**  
  Sniffs out nearby Bluetooth devices and grabs their names & MAC addresses.

- **Permission Handling**  
  Automatically handles required Bluetooth & location permissions for Android 10+ and 12+ (SDK 31+).

- **Logging**  
  Saves found devices into `BluetoothLog.txt` in the app’s external storage folder.

- **Simple UI**  
  Minimal interface with automatic scanning on launch, clean shutdown after scan completes.

- **Extensible**  
  Designed for upgrades: background services, Termux integration, custom UI dashboards — go wild.

---

## Why BlueSnatch?

In a world flooded with Bluetooth devices, BlueSnatch lets you:

- Track local BT devices like a pro.
- Log and archive devices for later analysis.
- Customize it for security auditing, recon, or just digital flexin’.

---

## Requirements

- Android device running **API 23+ (Marshmallow and up)**  
- Supports **modern BT permissions** (Android 12+):
  - `BLUETOOTH_SCAN`
  - `BLUETOOTH_CONNECT`
- Device with Bluetooth hardware enabled

---

## How to Use

1. **Build** the project in Android Studio
2. **Install** the APK on your device
3. **Launch** the app, grant requested permissions
4. **Scan** auto-starts, logs nearby devices
5. Check `BluetoothLog.txt` in:

