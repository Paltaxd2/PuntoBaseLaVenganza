package com.example.puntobaselavenganza

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.puntobaselavenganza.ApiMindicador.CargarListaUtm

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val txTitulo : TextView = findViewById(R.id.txt_Titulo)
        val edTxValor : EditText = findViewById(R.id.edTxt_Valor)
        val btCalcular : Button = findViewById(R.id.btn_Calcular)
        val txResult : TextView = findViewById(R.id.txt_Resultado)

        CargarListaUtm.cargaUtmMindicador(this, this)

        btCalcular.setOnClickListener{
            var valor = edTxValor.text.toString().toIntOrNull()?:0
            var result : Int = CargarListaUtm.calculo(valor)
            txResult.text = "El valor en UTM es : ${result}"

        }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}