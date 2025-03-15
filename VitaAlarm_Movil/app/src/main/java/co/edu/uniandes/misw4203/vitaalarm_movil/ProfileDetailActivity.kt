package co.edu.uniandes.misw4203.vitaalarm_movil

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import com.google.android.material.button.MaterialButton
import mostrarToastPersonalizado

class ProfileDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.detailProfile)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Referencias a los botones
        val btnActivateProfile = findViewById<Button>(R.id.btnActiveProfile)
        val btnDeleteProfile = findViewById<MaterialButton>(R.id.btnDeleteProfile)

        // Listener para activar perfil
        btnActivateProfile.setOnClickListener {
            mostrarToastPersonalizado(this, "Perfil activado", true)
            finish()
        }

        // Listener para eliminar perfil
        btnDeleteProfile.setOnClickListener {
            mostrarToastPersonalizado(this, "Perfil eliminado", false)
            finish()
        }


        // Recuperar el título del perfil pasado como extra
        val profileTitle = intent.getStringExtra("profileTitle")
        if (profileTitle != null) {
            // Mostrar la información del perfil en la pantalla
            displayProfileDetails(profileTitle)
        }
        updateMenuColors()
    }

    private fun displayProfileDetails(profileTitle: String) {
        // Obtener los detalles del perfil según el título
        val details = when (profileTitle) {
            "Trabajo" -> """
                📍 Ubicación: 
                “Oficina | Espacio de coworking | Casa”

                ⏳ Duración de la sesión:  
                “90 min – Enfoque profundo”

                🎵 Playlist:  
                “Concentración total – Beats para enfocarte”

                Contexto: 
                “Funcionalidades activas en el entorno “Trabajo”: 	📵 Bloqueo de distracciones: Redes sociales y apps no permitidas 🚫
                    ⏰ Alarmas programadas:
                    •	🔔 “Inicio de enfoque – 9:00 AM”
                    •	🍵 “Pausa activa – 10:30 AM”
                    •	💧 “Hidratación – 11:00 AM”
                    📅 Sincronización con calendario: Notificaciones de reuniones
            """.trimIndent()
            "Descanso" -> """
                📍 Ubicación: 
                “Casa | Lugar tranquilo”

                ⏳ Duración de la sesión:  
                “60 min – Relajación”

                🎵 Playlist:  
                “Música relajante – Sonidos de la naturaleza”

                Contexto: 
                “Funcionalidades activas en el entorno “Descanso”: 	📵 Bloqueo de distracciones: Redes sociales y apps no permitidas 🚫
                    ⏰ Alarmas programadas:
                    •	🔔 “Inicio de relajación – 8:00 PM”
                    •	🍵 “Pausa activa – 8:30 PM”
                    •	💧 “Hidratación – 9:00 PM”
            """.trimIndent()
            "Ejercicio" -> """
                📍 Ubicación: 
                “Gimnasio | Parque | Casa”

                ⏳ Duración de la sesión:  
                “45 min – Ejercicio intenso”

                🎵 Playlist:  
                “Música energética – Beats para entrenar”

                Contexto: 
                “Funcionalidades activas en el entorno “Ejercicio”: 	📵 Bloqueo de distracciones: Redes sociales y apps no permitidas 🚫
                    ⏰ Alarmas programadas:
                    •	🔔 “Inicio de ejercicio – 6:00 AM”
                    •	🍵 “Pausa activa – 6:30 AM”
                    •	💧 “Hidratación – 7:00 AM”
            """.trimIndent()
            else -> "Información no disponible"
        }

        // Mostrar los detalles en el TextView
        findViewById<TextView>(R.id.txtProfileDetails).text = details
    }

    private fun updateMenuColors() {
        // Cambiar colores para "Mis perfiles"
        val btnMisPerfiles = findViewById<LinearLayout>(R.id.btnMisPerfiles)
        val iconMisPerfiles = findViewById<ImageView>(R.id.iconMisPerfiles)
        val textMisPerfiles = findViewById<TextView>(R.id.textMisPerfiles)

        btnMisPerfiles.setBackgroundColor(ContextCompat.getColor(this, R.color.blue_light))
        iconMisPerfiles.setColorFilter(ContextCompat.getColor(this, R.color.white))
        textMisPerfiles.setTextColor(ContextCompat.getColor(this, R.color.white))

        // Restaurar colores para las otras opciones
        val btnIntegraciones = findViewById<LinearLayout>(R.id.btnIntegraciones)
        val iconIntegraciones = findViewById<ImageView>(R.id.iconIntegraciones)
        val textIntegraciones = findViewById<TextView>(R.id.textIntegraciones)

        btnIntegraciones.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        iconIntegraciones.setColorFilter(ContextCompat.getColor(this, R.color.gray_main))
        textIntegraciones.setTextColor(ContextCompat.getColor(this, R.color.gray_main))

        val btnAI = findViewById<LinearLayout>(R.id.btnAI)
        val iconAI = findViewById<ImageView>(R.id.iconAI)
        val textAI = findViewById<TextView>(R.id.textAI)

        btnAI.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        iconAI.setColorFilter(ContextCompat.getColor(this, R.color.gray_main))
        textAI.setTextColor(ContextCompat.getColor(this, R.color.gray_main))

        val btnMusica = findViewById<LinearLayout>(R.id.btnMusica)
        val iconMusica = findViewById<ImageView>(R.id.iconMusica)
        val textMusica = findViewById<TextView>(R.id.textMusica)

        btnMusica.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        iconMusica.setColorFilter(ContextCompat.getColor(this, R.color.gray_main))
        textMusica.setTextColor(ContextCompat.getColor(this, R.color.gray_main))
    }
}