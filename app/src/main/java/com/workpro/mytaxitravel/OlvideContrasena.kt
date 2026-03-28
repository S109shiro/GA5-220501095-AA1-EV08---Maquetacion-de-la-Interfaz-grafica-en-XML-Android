package com.workpro.mytaxitravel

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class OlvideContrasena : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_olvide_contrasena1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Obtener botones
        val buttonCancel = findViewById<Button>(R.id.btnForgotCancel)
        val buttonNext = findViewById<Button>(R.id.btnForgotNext)

        buttonCancel.setOnClickListener {
            gotoLogin()
        }
        buttonNext.setOnClickListener {
            gotoNext()
        }

    }

    fun gotoLogin(){
        val call = Intent(this, ActivityLogin::class.java)
        startActivity(call)
    }

    fun gotoNext(){
        val call = Intent(this, OlvideContrasenaSecond::class.java)
        startActivity(call)
    }
}