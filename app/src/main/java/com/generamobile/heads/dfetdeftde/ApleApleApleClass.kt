package com.generamobile.heads.dfetdeftde

import android.app.Application
import android.content.Context
import com.generamobile.heads.gtjigtjijgit.IUFhrffhrhuhrf
import com.generamobile.heads.gtjigtjijgit.gtkoigtjoigtjigt
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class ApleApleApleClass : Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        tgjogjjitgtgt()
        gjojjgtjigtgtghyhy()

        val nhmm = MyTracker.getTrackerConfig()
        nhmm.isTrackingLaunchEnabled = true
        val gthyhyhy = MyTracker.getInstanceId(this)
        val vbnn = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        vbnn.edit().putString("instId", gthyhyhy).apply()

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@ApleApleApleClass)
            modules(
                listOf(
                    IUFhrffhrhuhrf, gtkoigtjoigtjigt
                )
            )
        }
    }

    private fun gjojjgtjigtgtghyhy() {
        MyTracker.initTracker("99378970660442936186", this)
    }

    private fun tgjogjjitgtgt() {
        OneSignal.setAppId("7296c5ee-2a8b-4ee9-9e23-6917220a13b5")
    }

}