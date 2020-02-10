package dev.alexfranco.mtw.basketballcontadorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var marcadorA: Int = 0
    var marcadorB: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLimpiar.setOnClickListener(View.OnClickListener {
            this.limpiarMarcadores()
        })

        // EQUIPO A
        btnA3Puntos.setOnClickListener(View.OnClickListener {
            this.sumarPuntos("A", 3)
        })
        btnA2Puntos.setOnClickListener(View.OnClickListener {
            this.sumarPuntos("A", 2)
        })
        btnALibre.setOnClickListener(View.OnClickListener {
            this.sumarPuntos("A", 1)
        })

        // EQUIPO B
        btnB3Puntos.setOnClickListener(View.OnClickListener {
            this.sumarPuntos("B", 3)
        })
        btnB2Puntos.setOnClickListener(View.OnClickListener {
            this.sumarPuntos("B", 2)
        })
        btnBLibre.setOnClickListener(View.OnClickListener {
            this.sumarPuntos("B", 1)
        })
    }

    private fun sumarPuntos(equipo: String, puntos: Int) {
        if (equipo == "A") {
            this.marcadorA += puntos
        }
        if (equipo == "B") {
            this.marcadorB += puntos
        }
        actualizarMarcadores(this.marcadorA, this.marcadorB)
    }

    private fun limpiarMarcadores() {
        this.marcadorA = 0
        this.marcadorB = 0
        actualizarMarcadores(this.marcadorA, this.marcadorB)
    }

    private fun actualizarMarcadores(A: Int, B: Int) {
        txtMarcadorA.text = A.toString()
        txtMarcadorB.text = B.toString()
    }

}
