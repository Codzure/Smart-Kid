package com.leon.smartkid

data class Dataclass(
    val responseObject: List<ResponseObject>,
    val statusCode: String,
    val statusMessage: String,
    val successful: Boolean
)