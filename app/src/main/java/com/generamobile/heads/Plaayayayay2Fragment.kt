package com.generamobile.heads

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.generamobile.heads.databinding.FragmentPlaayayayay2Binding
import com.google.android.material.snackbar.Snackbar


class Plaayayayay2Fragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            frhirfihrfhrfhhrf()
            fjirfjjrf()
            frirfhrfuihhurf()
            jij()


        } catch (e: Exception) {
            hyhyhy2hy2hy()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun frhirfihrfhrfhhrf() {
        gtjjgtijgtjgtjjgtigt()
        foirfhgrfyugfrgyfrgr()
        gtjotgjtgjitgjij()
        fgnrghiugthgt()
    }

    private fun gtjjgtijgtjgtjjgtigt() {
        binding.btnElem8.setOnClickListener {
            it.visibility = View.GONE
            ghyujuj2uj()
        }
        binding.btnElem9.setOnClickListener {
            it.visibility = View.GONE
            ghyujuj2uj()
        }
    }

    private fun foirfhgrfyugfrgyfrgr() {
        binding.btnElem10.setOnClickListener {
            it.visibility = View.GONE
            ghyujuj2uj()
        }
        binding.btnElem13.setOnClickListener {
            it.visibility = View.GONE
            ghyujuj2uj()
        }
    }

    private fun gtjotgjtgjitgjij() {
        binding.btnElem12.setOnClickListener {
            it.visibility = View.GONE
            ghyujuj2uj()
        }


        binding.btnElem1.setOnClickListener {
            it.visibility = View.GONE
            ghyujuj2uj()
        }
    }

    private fun fgnrghiugthgt() {
        binding.btnElem2.setOnClickListener {
            it.visibility = View.GONE
            ghyujuj2uj()
        }
        binding.btnElem3.setOnClickListener {
            it.visibility = View.GONE
            ghyujuj2uj()
        }
    }

    private fun fjirfjjrf() {
        binding.btnElem4.setOnClickListener {
            it.visibility = View.GONE
            ghyujuj2uj()
        }
    }

    private fun frirfhrfuihhurf() {
        binding.btnElem5.setOnClickListener {
            it.visibility = View.GONE
            ghyujuj2uj()
        }
        binding.btnElem6.setOnClickListener {
            it.visibility = View.GONE
            ghyujuj2uj()
        }
    }

    private fun jij() {
        binding.btnElem7.setOnClickListener {
            it.visibility = View.GONE
            ghyujuj2uj()
        }
    }


    private var ghthyujjuuj: FragmentPlaayayayay2Binding? = null
    private val binding
        get() = ghthyujjuuj ?: throw RuntimeException("FragmentPlaayayayay2Binding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ghthyujjuuj = FragmentPlaayayayay2Binding.inflate(inflater, container, false)
        return binding.root
    }




    override fun onDestroy() {
        ghthyujjuuj = null
        super.onDestroy()
    }

    private fun hyhyhy2hy2hy() {
        Snackbar.make(
            binding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }


    private fun hgthgthu(imageView: ImageView): Boolean {
        if (imageView.visibility == View.GONE) {
            return true
        }
        return false
    }

    private fun ghyujuj2uj() {
        if (hgthgthu(binding.btnElem1) && hgthgthu(binding.btnElem2) && hgthgthu(
                binding.btnElem3
            ) && hgthgthu(binding.btnElem4) && hgthgthu(binding.btnElem5) && hgthgthu(
                binding.btnElem6
            ) && hgthgthu(binding.btnElem7) && hgthgthu(binding.btnElem8) && hgthgthu(
                binding.btnElem9
            ) && hgthgthu(binding.btnElem10) && hgthgthu(binding.btnElem13) && hgthgthu(
                binding.btnElem12
            )
        ) {
            hyhyhy5hy5()
        }
    }

    private fun hyhyhy5hy5() {
        findNavController().navigate(R.id.action_plaayayayay2Fragment_to_plaayayayaa1Fragment)
    }
}