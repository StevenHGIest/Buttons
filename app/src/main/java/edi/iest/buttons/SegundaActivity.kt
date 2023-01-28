package edi.iest.buttons

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import edi.iest.buttons.R.*

class SegundaActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_segunda)

        // Podemos agarrar los valores que enviamos, perop se hace dependiendo del tipo
        var fraseRecivida = intent.getStringExtra("frase")
        var edad = intent.getIntExtra("age", 0)

        Log.d("Datos", "Datos recividos $fraseRecivida y $edad")


        var btn = findViewById<Button>(R.id.bnPantalla)
        btn.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        var bnCerrar = findViewById<Button>(R.id.bnCerrar)
        bnCerrar.setOnClickListener {
            finish()
        }
    }
}