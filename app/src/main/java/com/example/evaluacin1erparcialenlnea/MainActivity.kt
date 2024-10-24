package com.example.evaluacin1erparcialenlnea

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Arreglo de objetos Tornillo
    private val arregloTornillos = arrayOfNulls<Tornillo>(5)
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias a los componentes de la interfaz
        val editNombre = findViewById<EditText>(R.id.editNombre)
        val editCodigo = findViewById<EditText>(R.id.editCodigo)
        val editTamaño = findViewById<EditText>(R.id.editTamaño)
        val editMaterial = findViewById<EditText>(R.id.editMaterial)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        val btnBuscar = findViewById<Button>(R.id.btnBuscar)
        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)

        // Funcionalidad botón Registrar
        btnRegistrar.setOnClickListener {
            if (editNombre.text.isNotEmpty() && editCodigo.text.isNotEmpty() && editTamaño.text.isNotEmpty() && editMaterial.text.isNotEmpty()) {
                if (contador < arregloTornillos.size) {
                    val nombre = editNombre.text.toString()
                    val codigo = editCodigo.text.toString()
                    val tamaño = editTamaño.text.toString().toDoubleOrNull() ?: 0.0
                    val material = editMaterial.text.toString()

                    // Crear un nuevo tornillo y agregar al arreglo
                    arregloTornillos[contador] = Tornillo(nombre, codigo, tamaño, material)
                    contador++
                    Toast.makeText(this, "Tornillo registrado correctamente", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "No hay espacio disponible en el inventario", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
            }
        }

        // Funcionalidad botón Buscar
        btnBuscar.setOnClickListener {
            val codigoBuscar = editCodigo.text.toString()
            val tornilloEncontrado = arregloTornillos.find { it?.codigo == codigoBuscar }

            if (tornilloEncontrado != null) {
                editNombre.setText(tornilloEncontrado.nombre)
                editTamaño.setText(tornilloEncontrado.tamaño.toString())
                editMaterial.setText(tornilloEncontrado.material)
                Toast.makeText(this, "Tornillo encontrado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Tornillo no encontrado", Toast.LENGTH_SHORT).show()
            }
        }

        // Funcionalidad botón Limpiar
        btnLimpiar.setOnClickListener {
            editNombre.text.clear()
            editCodigo.text.clear()
            editTamaño.text.clear()
            editMaterial.text.clear()
            editNombre.requestFocus()
            Toast.makeText(this, "Formulario limpiado", Toast.LENGTH_SHORT).show()
        }
    }
}