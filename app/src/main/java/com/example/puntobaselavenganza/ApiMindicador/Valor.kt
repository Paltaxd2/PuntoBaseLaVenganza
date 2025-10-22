package com.example.puntobaselavenganza.ApiMindicador

data class Valor(
    val fecha : String,
    val valor : Int
)

data class ListaMindi(
    val version : String,
    val autor: String,
    val codigo : String,
    val nombre : String,
    val unidad_medida : String,
    val serie : List<Valor>
)
