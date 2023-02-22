package com.generamobile.heads

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FiiiiveiviveieiviveFragment : Fragment() {
    private lateinit var mContext: Context
    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fiiiiveiviveieivive, container, false)
    }

    override fun onStart() {
        super.onStart()
        val gtgth = shareP.getString("country", null)
        val gujik = shareP.getString("appCamp", null)
        val hyujuj = shareP.getString("deepSt", null)
        val nnjjikik = shareP.getString("countryDev", null)
        val hujkiolol = shareP.getString("apps", null)
        val deffrfr = shareP.getString("wv", null)
        val bnhyju = shareP.getString("mainId", null)
        val hyjuki = "com.generamobile.heads"
        val jujikik = Build.VERSION.RELEASE
        val hyujikkrfd = MyTracker.getTrackerParams()
        hyujikkrfd.customUserId = bnhyju
        val hnhjuujju: String? = shareP.getString("instId", null)

        val gthyjuujju = Intent(mContext, LinaaActivity2::class.java)
        val hhyhyhy2hy2 = Intent(mContext, GammememrmmrrmActivity2::class.java)

        val ghyhy5hyyh = "deviceID="
        val hyhy5hy5h5y = "sub_id_1="
        val gt5hy5hy5hy = "ad_id="
        val gt5h5y5hyhy = "sub_id_4="
        val vbgbgbgbg = "sub_id_5="
        val rfededed = "sub_id_6="
        val ghyjuikik = "naming"
        val yhyjuujuj = "deeporg"

        val hyujuj5uj = AppsFlyerLib.getInstance().getAppsFlyerUID(mContext)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        hghyyhhyuj5(bnhyju.toString())


        val g5gt5gt5gt =
            "$deffrfr$hyhy5hy5h5y$gujik&$ghyhy5hyyh$hyujuj5uj&$gt5hy5hy5hy$bnhyju&$gt5h5y5hyhy$hyjuki&$vbgbgbgbg$jujikik&$rfededed$ghyjuikik"
        val gt5gt5gt = "$deffrfr$ghyhy5hyyh$bnhyju&$gt5hy5hy5hy$hnhjuujju&$gt5h5y5hyhy$hyjuki&$vbgbgbgbg$jujikik&$rfededed$ghyjuikik"
        val ghyjuujujuj =
            "$deffrfr$hyhy5hy5h5y$hyujuj&$ghyhy5hyyh$hyujuj5uj&$gt5hy5hy5hy$bnhyju&$gt5h5y5hyhy$hyjuki&$vbgbgbgbg$jujikik&$rfededed$yhyjuujuj"
        val hy2ju5uj5uj =
            "$deffrfr$hyhy5hy5h5y$hyujuj&$ghyhy5hyyh$bnhyju&$gt5hy5hy5hy$hnhjuujju&$gt5h5y5hyhy$hyjuki&$vbgbgbgbg$jujikik&$rfededed$yhyjuujuj"

        Log.d("AdvertId", bnhyju.toString())
        when (hujkiolol) {
            "1" ->
                if (gujik != "null") {
                    shareP.edit().putString("link", g5gt5gt5gt).apply()
                    startActivity(gthyjuujju)
                    activity?.finish()
                } else if (hyujuj != null || nnjjikik!!.contains(gtgth.toString())) {
                    shareP.edit().putString("link", ghyjuujujuj).apply()
                    startActivity(gthyjuujju)
                    activity?.finish()
                } else {
                    startActivity(hhyhyhy2hy2)
                    activity?.finish()
                }
            "0" ->
                if (hyujuj != null) {
                    shareP.edit().putString("link", hy2ju5uj5uj).apply()
                    startActivity(gthyjuujju)
                    activity?.finish()
                } else if (nnjjikik!!.contains(gtgth.toString())) {
                    shareP.edit().putString("link", gt5gt5gt).apply()
                    startActivity(gthyjuujju)
                    activity?.finish()
                } else {
                    startActivity(hhyhyhy2hy2)
                    activity?.finish()
                }
        }
    }

    private fun hghyyhhyuj5(h5hy95hy: String) {
        OneSignal.setExternalUserId(
            h5hy95hy,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {

                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val hyhy5hy = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $hyhy5hy"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val hyhy5hy59hy =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $hyhy5hy59hy"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val hy59hy5hy5hy = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $hy59hy5hy5hy"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {

                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }
}