package com.cursosant.cursoandroidl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class PrimerFragment : Fragment(R.layout.fragment_primer) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.btn_navegar)
        button.setOnClickListener {
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragment_container_view, SegundoFragment())
                addToBackStack("primerFragment")
            }
        }
    }
}