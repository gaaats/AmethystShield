package com.generamobile.heads

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generamobile.heads.jtgijgtjigt.JIOfjrfjfrjfrf
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class FiiirsssttsttsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiiirsssttstts, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        forigjjijgtjigt()

    }

    private fun forigjjijgtjigt() {
        findNavController().navigate(R.id.action_fiiirsssttsttsFragment_to_seccseccccoFragment)
    }
}