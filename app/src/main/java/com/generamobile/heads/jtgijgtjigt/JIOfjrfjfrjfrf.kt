package com.generamobile.heads.jtgijgtjigt

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.generamobile.heads.frbrfygrfg.FTdfetefeded
import com.generamobile.heads.frojifrojifrigt.Ifrfhfrhhrfurf
import com.generamobile.heads.frojifrojifrigt.JIOFjiojrfijfrijrf
import com.generamobile.heads.frojifrojifrigt.Nfrfhrufruh
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class JIOfjrfjfrjfrf(
    private val frojitgjigtji: Nfrfhrufruh,
    private val fnvnggtjgt: JIOFjiojrfijfrijrf,
    private val frjiogrjgtjtgijgti: SharedPreferences,
    val hyhyko: Application
) : ViewModel() {

    private val gtngtogtjigt = MutableLiveData<Ifrfhfrhhrfurf>()
    val dekojfogtj: LiveData<Ifrfhfrhhrfurf>
        get() = gtngtogtjigt

    private val gtjotgjiogt = MutableLiveData<FTdfetefeded>()
    val fhifrhurf: LiveData<FTdfetefeded>
        get() = gtjotgjiogt


    private val gtjijgtijigt = MutableLiveData<String>()
    val gttgjiojig: LiveData<String>
        get() = gtjijgtijigt

    private val gedgyderf = MutableLiveData<String>()
    val dejiorfjjig: LiveData<String>
        get() = gedgyderf


    private val fedfrfrfr = MutableLiveData<String?>()
    val frnkgtgtjgt: LiveData<String?>
        get() = fedfrfrfr


    init {
        viewModelScope.launch(Dispatchers.IO) {
            edjiorfjigrjigt()
        }
        viewModelScope.launch(Dispatchers.Main) {
            frrfjigtjigt()
        }
    }

    suspend fun frrfjigtjigt() {
        gtngtogtjigt.postValue(frojitgjigtji.getDat().body())
        ejrigtjgt()
    }

    suspend fun ejrigtjgt() {
        try {

            Log.d("lolo", "${fnvnggtjgt.getDataDev().body()}")
            gtjotgjiogt.postValue(fnvnggtjgt.getDataDev().body())
            Log.d("lolo", "${fnvnggtjgt.getDataDev().body()}")
        } catch (e: java.lang.Exception) {
            Log.d("lolo", e.toString())
        }
    }

    fun dnfrjoigtjigt(gtjogtogtjjigt: Context) {
        AppsFlyerLib.getInstance()
            .init("t3tidrYfU8wffQrmRRpUCH", dekorfjogtjt, hyhyko)
        AppsFlyerLib.getInstance().start(gtjogtogtjjigt)
    }

    fun frjogjgtjbjbgi(gjjigjgtgt: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            gjjigjgtgt
        ) { data: AppLinkData? ->
            data?.let {
                val deepData = data.targetUri?.host.toString()
                frjiogrjgtjtgijgti.edit().putString("deepSt", deepData).apply()
            }
        }
    }

    private val dekorfjogtjt = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            gtjijgtijigt.postValue(dataGotten)
        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun edjiorfjigrjigt() {
        val advertisingIdClient = AdvertisingIdClient(hyhyko)
        advertisingIdClient.start()
        val idUserAdvertising = advertisingIdClient.info.id.toString()
        fedfrfrfr.postValue(idUserAdvertising)
    }

}