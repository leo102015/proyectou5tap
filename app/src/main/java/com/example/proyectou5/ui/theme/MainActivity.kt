package com.example.proyectou5.ui.theme

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val email = editTextEmail.text.toString()

            val contact = Contact(name, email)
            // Puedes hacer algo con el objeto de contacto, como enviarlo a un servidor, etc.
            // Por ahora, solo mostraremos los detalles en el Log.
            println("Nombre: ${contact.name}, Correo Electrónico: ${contact.email}")
        }
    }
}
