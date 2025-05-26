package com.cursosant.cursoandroidl

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.commit
import com.cursosant.cursoandroidl.databinding.FragmentPrimerBinding

class PrimerFragment : Fragment(R.layout.fragment_primer) {

    private lateinit var binding: FragmentPrimerBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPrimerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = binding.btnNavegar
        button.setOnClickListener {
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragment_container_view, SegundoFragment.newInstance("Lizz", 22))
                addToBackStack("primerFragment")
            }
        }
    }
}
