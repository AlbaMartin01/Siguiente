package com.example.siguiente

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ImageView>(R.id.imagenUsuario).setBackgroundDrawable(null);

        findViewById<Button>(R.id.botonMaps).setOnClickListener {
            var intento = Intent(this, Maps::class.java)
            startActivity(intento)
        }

        findViewById<Button>(R.id.botonCall).setOnClickListener {
            var intento = Intent(this, Call::class.java)
            startActivity(intento)
        }

        findViewById<Button>(R.id.botonPlay).setOnClickListener {
            var intento = Intent(this, Play::class.java)
            startActivity(intento)
        }

    }
}