package com.leon.smartkid

data class DeviceActivation(
    val password: String,
    val userId: String,
    val client_id: String,
    val deviceName: String,
    val deviceOS: String,
    val deviceType: String,
)