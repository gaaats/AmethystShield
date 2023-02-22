package com.generamobile.heads

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.generamobile.heads.databinding.FragmentPlaayayayaa1Binding
import com.google.android.material.snackbar.Snackbar


class Plaayayayaa1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        hyhyujujuj = FragmentPlaayayayaa1Binding.inflate(inflater, container, false)
        return sdevggbb.root
    }

    private var hyhyujujuj: FragmentPlaayayayaa1Binding? = null
    private val sdevggbb
        get() = hyhyujujuj
            ?: throw RuntimeException("FragmentPlaayayayaa1Binding = null")


    private fun hyjuujujuj() {
        Snackbar.make(
            sdevggbb.root,
            "Error, error, error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            fryrfyugfrurfgyrf()


        } catch (e: Exception) {
            hyjuujujuj()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun fryrfyugfrurfgyrf() {
        rfhifrhirfhihrfhurf()
        gtjogtiojgtjgtjitg()
        rfoigtjtggthtg()
        rfrfjrfji()
    }

    private fun rfrfjrfji() {
        sdevggbb.rightDovnp.setOnClickListener {
            findNavController().navigate(R.id.action_plaayayayaa1Fragment_to_plaayayayay2Fragment)
        }
    }

    private fun rfoigtjtggthtg() {
        sdevggbb.rightTop.setOnClickListener {
            Toast.makeText(requireContext(), "Try again", Toast.LENGTH_SHORT).show()
        }
    }

    private fun gtjogtiojgtjgtjitg() {
        sdevggbb.leeeftTop.setOnClickListener {
            findNavController().navigate(R.id.action_plaayayayaa1Fragment_to_plaayayayay2Fragment)
        }
    }

    private fun rfhifrhirfhihrfhurf() {
        sdevggbb.leeeftDovn.setOnClickListener {
            Toast.makeText(requireContext(), "Try again", Toast.LENGTH_SHORT).show()
        }
    }


    override fun onDestroy() {
        hyhyujujuj = null
        super.onDestroy()
    }
}