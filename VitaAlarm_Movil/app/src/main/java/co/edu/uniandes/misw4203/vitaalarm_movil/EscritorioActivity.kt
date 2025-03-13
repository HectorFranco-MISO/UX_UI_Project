package co.edu.uniandes.misw4203.vitaalarm_movil

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EscritorioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_escritorio)

        // Configurar el padding para la ventana de la actividad
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.escritorioActivity)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Configurar el clic del botón "Mis perfiles" usando findViewById
        val btnMisPerfiles = findViewById<LinearLayout>(R.id.btnMisPerfiles)
        btnMisPerfiles.setOnClickListener {
            // Crear un Intent para abrir ProfilesActivity
            val intent = Intent(this, ProfilesActivity::class.java)
            startActivity(intent)
        }
    }
}