class SmartDevice(val name: String, val category: String) {
    var deviceStatus: String = "Offline"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when(statusCode) {
            0 -> "Offline"
            1 -> "Online"
            else -> "Unknown"
        }
    }

    var speakerVolume: Int = 50
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun turnOn() {
        println("\nSmart device is turned on.")
        deviceStatus = "Oneline"
    }

    fun turnOff() {
        println("\nSmart device is turned off.")
        deviceStatus = "Offline"
    }
}

fun main() {
    val smartTvDevice = SmartDevice(name = "Android TV", category = "Entertainment", statusCode = 1)
    print("Device Name: ${smartTvDevice.name}\nDevice Category: ${smartTvDevice.category}")
    print("\nSpeaker Volume: ${smartTvDevice.speakerVolume}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
    print(smartTvDevice.deviceStatus)
}