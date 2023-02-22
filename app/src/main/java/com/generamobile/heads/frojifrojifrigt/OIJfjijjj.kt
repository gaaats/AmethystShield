package com.generamobile.heads.frojifrojifrigt

import androidx.annotation.Keep
import com.generamobile.heads.frbrfygrfg.FTdfetefeded
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.Response
import retrofit2.http.GET

interface NJfnrrfhufruhfrhurf {
    @GET("go.php?to=1&")
    suspend fun getDataDev(): Response<FTdfetefeded>
}

interface NJfnrfrhuhfrhfr {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getData(): Response<Ifrfhfrhhrfurf>
}

class JIOFjiojrfijfrijrf(private val devData: NJfnrrfhufruhfrhurf) {
    suspend fun getDataDev() = devData.getDataDev()
}


class Nfrfhrufruh(private val countryApi: NJfnrfrhuhfrhfr) {
    suspend fun getDat() = countryApi.getData()
}



@Keep
data class Ifrfhfrhhrfurf(
    @JsonClass(generateAdapter = true)
    @field:Json(name = "countryCode")
    val cou: String,
)