package com.cursosant.cursoandroidl

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show()
        Log.d("LifeCycle","onCreate")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val texto = findViewById<TextView>(R.id.txt_output)
        val boton = findViewById<Button>(R.id.btn_accion)
        boton.setOnClickListener {
            texto.text = "Curso Android"
        }

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
        Log.d("LifeCycle","onStart")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show()
        Log.d("LifeCycle","onResume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show()
        Log.d("LifeCycle","onPause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show()
        Log.d("LifeCycle","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show()
        Log.d("LifeCycle","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show()
        Log.d("LifeCycle","onDestroy")
    }
}
