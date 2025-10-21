package com.example.puntobaselavenganza.ApiMindicador

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object MindiRepo {

    suspend fun fetchApiMin(): Result<List<Valor>> = withContext(Dispatchers.IO) {
        try {
            Result.success(MinApiClient.service.getUtm())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}