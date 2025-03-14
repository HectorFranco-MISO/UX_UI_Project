package co.edu.uniandes.misw4203.vitaalarm_movil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import android.widget.ImageView

class LoginActivity : AppCompatActivity() {

    // Credenciales fijas para la simulación
    private val EMAIL = "miguelmartinez@gmail.com"
    private val PASSWORD = "Alemania2025*"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Referencias a los elementos de la UI
        val emailInput = findViewById<TextInputEditText>(R.id.emailInput)
        val passwordInput = findViewById<TextInputEditText>(R.id.passwordInput)
        val loginButton = findViewById<Button>(R.id.btnLogin)

        val facebookLogin = findViewById<ImageView>(R.id.facebookLogin)
        val googleLogin = findViewById<ImageView>(R.id.googleLogin)

        // Listener del botón de login
        loginButton.setOnClickListener {
            val emailIngresado = emailInput.text.toString().trim()
            val passwordIngresada = passwordInput.text.toString().trim()

            if (validarCredenciales(emailIngresado, passwordIngresada)) {
                // Si las credenciales son correctas, pasar a OnboardingActivity
                navegarAOnboarding()
            } else {
                // Si las credenciales son incorrectas, mostrar un mensaje de error
                Toast.makeText(this, "Usuario no encontrado", Toast.LENGTH_SHORT).show()
            }
        }

        // Listeners para imágenes de Facebook y Google
        facebookLogin.setOnClickListener {
            navegarAOnboarding()
        }

        googleLogin.setOnClickListener {
            navegarAOnboarding()
        }
    }

    private fun validarCredenciales(email: String, password: String): Boolean {
        return email == EMAIL && password == PASSWORD
    }


    private fun navegarAOnboarding() {
        val intent = Intent(this, OnboardingActivity::class.java)
        startActivity(intent)
        finish() // Cierra la pantalla de login para que no pueda regresar
    }
}