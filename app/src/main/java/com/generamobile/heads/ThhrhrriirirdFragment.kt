package com.generamobile.heads

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generamobile.heads.jtgijgtjigt.JIOfjrfjfrjfrf
import com.mvffg.btwolib.decrypt
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec


class ThhrhrriirirdFragment : Fragment() {


    val h5ju5ki5ik: SharedPreferences by inject(named("SharedPreferences"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_thhrhrriirird, container, false)
    }

    val gt6tggt by activityViewModel<JIOfjrfjfrjfrf>(named("MainModel"))
    lateinit var hy5hy5ju5uj: String
    lateinit var hy59yh5hy5: String
    lateinit var nhjujkkiik: String
    private lateinit var hjjik5ik: Context
    val j5ju5ikki5lo = "AES/CBC/PKCS5Padding"
    val hy2jukiolol = SecretKeySpec("(G+KbPeShVmYq3t6w9z\$C&F)J@McQfTj".toByteArray(), "AES")
    val vbghy5j = IvParameterSpec(ByteArray(16))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hjjik5ik = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        jgtjgtjgtjigt()

        gt6tggt.fhifrhurf.observe(viewLifecycleOwner) {
            if (it != null) {
                hy5hy5ju5uj = it.heregeo
                nhjujkkiik = it.herenumber
                hy59yh5hy5 = it.herelinka
                val s1 = decrypt(j5ju5ikki5lo, hy5hy5ju5uj, hy2jukiolol, vbghy5j)
                val s2 = decrypt(j5ju5ikki5lo, hy59yh5hy5, hy2jukiolol, vbghy5j)

                h5ju5ki5ik.edit().putString("countryDev", s1).apply()
                h5ju5ki5ik.edit().putString("apps", nhjujkkiik).apply()
                h5ju5ki5ik.edit().putString("wv", s2).apply()

                gtjitgjigjogtj()
            }
        }

    }

    private fun jgtjgtjgtjigt() {
        gt6tggt.frnkgtgtjgt.observe(viewLifecycleOwner) {
            if (it != null) {
                val h5yhy5hy5 = it.toString()
                h5ju5ki5ik.edit().putString("mainId", h5yhy5hy5).apply()
            }
        }
    }

    private fun gtjitgjigjogtj() {
        findNavController().navigate(R.id.action_thhrhrriirirdFragment_to_fffffffffouuurFragment)
    }

    override fun onStart() {
        super.onStart()

    }
}