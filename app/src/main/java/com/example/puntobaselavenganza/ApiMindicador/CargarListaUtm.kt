package com.example.puntobaselavenganza.ApiMindicador

import android.content.Context
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import com.example.puntobaselavenganza.MainActivity
import kotlinx.coroutines.launch
import kotlin.math.round


object CargarListaUtm {
    var primerValor : Int = 0
    fun cargaUtmMindicador(owner: LifecycleOwner, context: Context){
        owner.lifecycleScope.launch {
            val respuesta = MindiRepo.fetchApiMin()

            respuesta.onSuccess { utmList ->

                Toast.makeText(
                    context,
                    "Wena funciono",
                    Toast.LENGTH_SHORT
                ).show()




                // primerValor = listaValores[0].toString().toIntOrNull()?: 0





            }
            respuesta.onFailure {
                print("No Funciona")
                Toast.makeText(
                    context,
                    "No funciona",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
    }

    fun calculo(valor : Int ): Int {
        var result: Int = valor / primerValor
        return result
    }
}
