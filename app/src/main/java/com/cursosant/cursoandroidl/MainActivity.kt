package com.cursosant.cursoandroidl

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//Agrega un fragmento dentro del contenedor
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.fragment_container_view, PrimerFragment())
        }
    }
}


