package com.example.ej10

import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun mayorEdad(fechaNacimiento: String): Boolean {
        val fecha = fechaNacimiento.split("/")
        val dia = fecha[0].toInt()
        val mes = fecha[1].toInt()
        val anio = fecha[2].toInt()

        val fechaActual = Calendar.getInstance()
        val anioActual = fechaActual.get(Calendar.YEAR)
        val mesActual = fechaActual.get(Calendar.MONTH)
        val diaActual = fechaActual.get(Calendar.DAY_OF_MONTH)
        if (anioActual - anio > 18) {
            return true
        } else if (anioActual - anio == 18) {
            if (mesActual - mes > 0) {
                return true
            } else if (mesActual - mes == 0) {
                if (diaActual - dia >= 0) {
                    return true
                }
            }
        }
        return false
    }



    fun comprar(view : View){
        val fechaNacimiento = findViewById<EditText>(R.id.fechaNacimiento).toString()
        val nombre = findViewById<EditText>(R.id.nombre).text.toString()
        val apellidos = findViewById<EditText>(R.id.apellidos).text.toString()

        if (nombre.isEmpty() || apellidos.isEmpty()|| fechaNacimiento.isEmpty()) {
            Toast.makeText(this, "No has rellenado los campos obligatorios.", Toast.LENGTH_LONG).show()
        } else {
            print("Entra aqui")
            val edad = mayorEdad(fechaNacimiento)

            val cocacola = findViewById<EditText>(R.id.cocacola).text?.toString()?.toDouble() ?: 0.0
            val kaslimon = findViewById<EditText>(R.id.kaslimon).text?.toString()?.toDouble() ?: 0.0
            val kasnaranja = findViewById<EditText>(R.id.kaslimon).text?.toString()?.toDouble() ?: 0.0
            val redbull = findViewById<EditText>(R.id.redbull).text?.toString()?.toDouble() ?: 0.0
            val cerveza = findViewById<EditText>(R.id.cerveza).text?.toString()?.toDouble() ?: 0.0
            val botellavino = findViewById<EditText>(R.id.botellavino).text?.toString()?.toDouble() ?: 0.0

            if (edad){
                if (cerveza > 0 || botellavino > 0){
                    Toast.makeText(this, "No puedes comprar cerveza ni botellas de vino, eres menor", Toast.LENGTH_LONG).show()
                }
            }else{
                var total = 0.0
                val precioCocacola = cocacola * 0.57
                val precioKaslimon = kaslimon * 0.54
                val precioKasnaranja = kasnaranja * 0.54
                val precioRedbull = redbull * 1.25
                val precioCerveza = cerveza * 0.62
                val precioBotellavino = botellavino * 3.21
                total = precioCocacola + precioKaslimon + precioKasnaranja + precioRedbull + precioCerveza + precioBotellavino
                Toast.makeText(this, "El total es: " + total, Toast.LENGTH_LONG).show()
            }

        }
    }
}