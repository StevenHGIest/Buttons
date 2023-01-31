package edi.iest.buttons

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import edi.iest.buttons.R.*

class SegundaActivity : AppCompatActivity(), View.OnClickListener {

    private var cambioIcono = false
    var bnPantalla = findViewById<Button>(R.id.bnPantalla)
    var ivLogo = findViewById<ImageView>(R.id.ivLogo)
    var bnCerrar = findViewById<Button>(R.id.bnCerrar)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_segunda)

        // Podemos agarrar los valores que enviamos, perop se hace dependiendo del tipo
        var fraseRecivida = intent.getStringExtra("frase")
        var edad = intent.getIntExtra("age", 0)

        Log.d("Datos", "Datos recividos $fraseRecivida y $edad")


        bnCerrar.setOnClickListener(this)

    /*btn.setOnClickListener{

        }


        bnCerrar.setOnClickListener {
            finish()
        }
        // le damos override on clicl sitener, le damos ok

        ivLogo.setOnClickListener {
            var arregloImagenes = arrayOf<Int>(R.drawable.anahuac, R.drawable.iest2)
            if (cambioIcono) {
                ivLogo.setImageResource(arregloImagenes[0])
            }else {
                ivLogo.setImageResource(arregloImagenes[1])
            }

            cambioIcono = !cambioIcono
            // setImageRecource cambi ala imagen de un iamageView
            //ivLogo.setImageResource(R.drawable.anahuac)        }

        }*/
    }
    //De aqui ocupara todos los metodos
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.bnCerrar -> finish()
            R.id.bnPantalla -> {
                val i = Intent(this, MainActivity::class.java)
                startActivity(i)
            }
            R.id.ivLogo -> {
                var arregloImagenes = arrayOf<Int>(R.drawable.anahuac, R.drawable.iest2)
                if (cambioIcono) {
                    ivLogo.setImageResource(arregloImagenes[0])
                }else {
                    ivLogo.setImageResource(arregloImagenes[1])
                }

                cambioIcono = !cambioIcono
            }
        }
    }
}