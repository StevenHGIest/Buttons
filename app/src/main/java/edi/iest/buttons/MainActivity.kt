package edi.iest.buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var etfrase: EditText
    lateinit var tvFrase: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            // Para hacer el mensaje de fondo ocupamos el Toast
        btn = findViewById(R.id.btnMostrar)
        etfrase = findViewById(R.id.edtvFrase)
        tvFrase = findViewById(R.id.tx)

        btn.setOnClickListener{
            val frase = etfrase.text.toString()
            Snackbar.make(tvFrase, "Su frase fuw $frase", Snackbar.LENGTH_LONG).show()
        }
    }
}