package com.example.puntobaselavenganza.ApiMindicador

import retrofit2.http.GET

interface LlamadoApi {
    @GET("api/utm")
    suspend fun getUtm() : ListaMindi
}