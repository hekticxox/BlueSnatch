BlueSnatch

BlueSnatch is a no-nonsense Android app that scans nearby Bluetooth devices, logs their info, and lets you keep tabs on your digital surroundings like a true street boss. It’s built to handle all the modern Android Bluetooth permission craziness and drops the device list right into a file for easy access or further hustle.
What This Repo Does

    Bluetooth Scanning: Sniffs out nearby Bluetooth devices in range and grabs their names & MAC addresses.

    Permission Handling: Automatically requests all necessary Bluetooth and location permissions for Android 10+ and Android 12+ (SDK 31+).

    Logging: Saves every found device info into a local log file (BluetoothLog.txt) in the app’s external storage folder.

    Simple UI: Minimal interface with automatic scan start & graceful shutdown after scan finishes.

    Extensible: Ready for you to add background services, Termux integration, or UI dashboards.

Why BlueSnatch?

In a world where Bluetooth is everywhere, BlueSnatch lets you:

    Track devices in your vicinity like a pro.

    Capture and keep Bluetooth device data stealthy and clean.

    Build on it for security audits, tracking, or just street-smart digital reconnaissance.

Requirements

    Android device running API 23+ (Marshmallow and above).

    Supports modern Bluetooth permissions (BLUETOOTH_SCAN, BLUETOOTH_CONNECT) for Android 12+.

    Bluetooth hardware enabled on the device.

How to Use

    Build & install the app from the source.

    Launch, grant permissions when prompted.

    App starts scanning automatically.

    Watch logs for found devices, or check BluetoothLog.txt inside the app's external files folder.

    Scan finishes, app closes clean.

Permissions Used

    BLUETOOTH

    BLUETOOTH_ADMIN

    ACCESS_FINE_LOCATION

    BLUETOOTH_SCAN (Android 12+)

    BLUETOOTH_CONNECT (Android 12+)

Next Steps & Customization

    Add background scanning with services.

    Push logs to Termux or remote server.

    Build notification alerts for device detection.

    Integrate with other hacking tools or Termux CLI.

Stay Real

This is your toolkit, Chapta. Use it right, use it smart, and keep your digital hustle clean.
