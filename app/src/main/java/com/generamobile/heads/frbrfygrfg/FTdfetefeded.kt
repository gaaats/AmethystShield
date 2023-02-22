package com.generamobile.heads.frbrfygrfg

import androidx.annotation.Keep
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@Keep
data class FTdfetefeded(
    @JsonClass(generateAdapter = true)
    @Json(name = "heregeo")
    val heregeo: String,
    @Json(name = "herelinka")
    val herelinka: String,
    @Json(name = "herenumber")
    val herenumber: String
)