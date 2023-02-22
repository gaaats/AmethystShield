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


class SeccseccccoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_seccsecccco, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        gthy5hy5hy = context
    }

    private lateinit var gthy5hy5hy: Context
    val h5hy5yh5hy: SharedPreferences by inject(named("SharedPreferences"))
    val hy59hyhyjuujjuuj by activityViewModel<JIOfjrfjfrjfrf>(named("MainModel"))

    lateinit var hy55hyhy: String

    override fun onStart() {
        super.onStart()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        hy59hyhyjuujjuuj.dekojfogtj.observe(viewLifecycleOwner) {
            if (it!=null) {
                hy55hyhy = it.cou
                h5hy5yh5hy.edit().putString("country", hy55hyhy).apply()
                jgiiojjgtjgtjigt()
            }
        }

    }

    private fun jgiiojjgtjgtjigt() {
        findNavController().navigate(R.id.action_seccseccccoFragment_to_thhrhrriirirdFragment)
    }
}