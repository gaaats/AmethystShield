package com.generamobile.heads

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mvffg.btwolib.BTwoLib
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named

class LinaaActivity2 : AppCompatActivity() {

    private fun nh2ju2ki2ki(): String {
        val h595hy = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val hy59jju = hy2hy6.getString("link", null)
        h595hy.edit().putString("SAVED_URL", hy59jju).apply()
        return h595hy.getString("SAVED_URL", hy59jju).toString()
    }

    lateinit var gthyhyhy5: BTwoLib
    val hy2hy6: SharedPreferences by inject(named("SharedPreferences"))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gthyhyhy5 = BTwoLib(this@LinaaActivity2)
        setContentView(gthyhyhy5)
        gthyhyhy5.profiter(nh2ju2ki2ki())
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
            gthyhyhy5.onActivityResult(requestCode, resultCode, data)
        }
    }

    override fun onBackPressed() {
        if (!gthyhyhy5.onBackPressed()) {
            return
        }
        super.onBackPressed()
    }


}