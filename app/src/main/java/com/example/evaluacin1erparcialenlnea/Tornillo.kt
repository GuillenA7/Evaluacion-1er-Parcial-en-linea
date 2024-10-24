package com.example.evaluacin1erparcialenlnea

class Tornillo(
    nombre: String = "",
    codigo: String = "",
    var tamaño: Double = 0.0,
    var material: String = ""
) : Producto(nombre, codigo)