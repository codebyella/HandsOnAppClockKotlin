package com.example.handsonappclockkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.academytechmaster.handsonappclockkotlin.R

class MainActivity : AppCompatActivity() {

    private var txtHoraAtual: TextView? = null
    private var btnCuddleTime: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        iniciarComponentesDeLayout()
    }

    private fun iniciarComponentesDeLayout() {
        txtHoraAtual = findViewById(R.id.txtHoraAtual)
        btnCuddleTime = findViewById(R.id.btnCuddleTime)
    }

    fun atualizarCuddleTime(view: View?) {
        txtHoraAtual?.text = "${txtHoraAtual?.text} is cuddle time!"
    }
}