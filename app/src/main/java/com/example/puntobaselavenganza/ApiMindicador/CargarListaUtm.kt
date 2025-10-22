package com.example.puntobaselavenganza.ApiMindicador

import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import com.example.puntobaselavenganza.MainActivity
import kotlinx.coroutines.launch


object CargarListaUtm {
    fun cargaUtmMindicador(owner: LifecycleOwner, mainActivity: MainActivity){
        owner.lifecycleScope.launch {
            val respuesta = MindiRepo.fetchApiMin()

            respuesta.onSuccess { utmList ->
                if (utmList.isEmpty()) {
                    Toast.makeText(
                        mainActivity,
                        "Sin datos desde el servicio",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                val listaValoresInt: MutableList<Int> = utmList.map { it.valor }.toMutableList()

                var primerValor: Int = listaValoresInt[0]

                traerValor(primerValor)

            }

        }
    }

    fun traerValor(primerUtm : Int): Int{
        // Calcular
    }
}