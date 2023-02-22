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
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class FffffffffouuurFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fffffffffouuur, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gjgtjigt = gnkgtngt.getString("apps", null)
        val bgvnbgigj = gnkgtngt.getString("appCamp", null)

        if (gjgtjigt=="1" && bgvnbgigj == null) {
            gttjgijgti.dnfrjoigtjigt(gtjgtijgti)
            gttjgijgti.gttgjiojig.observe(viewLifecycleOwner) {
                if (it != null) {
                    gkofdede = it.toString()
                    gnkgtngt.edit().putString("appCamp", gkofdede).apply()
                    frjfrirfirfo()
                }
            }
        } else {
            frjfrirfirfo()
        }
    }

    private fun frjfrirfirfo() {
        findNavController().navigate(R.id.action_fffffffffouuurFragment_to_fiiiiveiviveieiviveFragment)
    }

    val gttjgijgti by activityViewModel<JIOfjrfjfrjfrf>(named("MainModel"))
    val gnkgtngt: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var gkofdede: String
    private lateinit var gtjgtijgti: Context


    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtjgtijgti = context
    }
}