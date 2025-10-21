package com.example.puntobaselavenganza.ApiMindicador

import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

object CargarListaUtm {
    fun cargaUtmMindicador(owner: LifecycleOwner){
        owner.lifecycleScope.launch {
            val respuesta = MindiRepo.fetchApiMin()

            respuesta.onSuccess { utmList ->
                if (utmList.isEmpty()) {
                    Toast.makeText(
                        context,
                        "Sin datos desde el servicio",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                // Hacer variable
                // Hacer lista y ingresar los valores

            }
        }
    }
}