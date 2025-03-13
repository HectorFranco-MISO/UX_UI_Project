package co.edu.uniandes.misw4203.vitaalarm_movil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import co.edu.uniandes.misw4203.vitaalarm_movil.adapter.ProfileAdapter
import co.edu.uniandes.misw4203.vitaalarm_movil.model.Profile
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProfilesActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profiles)

        // Datos de ejemplo
        val profiles = listOf(
            Profile("T", "Trabajo", "Concentración en el trabajo"),
            Profile("D", "Descanso", "Relajación y descanso"),
            Profile("E", "Ejercicio", "Rutina de ejercicio")
        )

        // Configurar RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewProfiles)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Configurar el adaptador con un listener para manejar el clic en las cards
        val adapter = ProfileAdapter(profiles) { profile ->
            // Abrir ProfileDetailActivity con la información del perfil seleccionado
            val intent = Intent(this, ProfileDetailActivity::class.java).apply {
                putExtra("profileTitle", profile.title) // Pasar el título como identificador
            }
            startActivity(intent)
        }
        recyclerView.adapter = adapter

        // Cambiar colores del menú inferior
        updateMenuColors()



        // Referencia al botón de login
        val boton = findViewById<FloatingActionButton>(R.id.fabAddProfile)


        // Agregar el listener para navegar a OnboardingActivity
        boton.setOnClickListener {
            val intent = Intent(this, ProfileDetailActivity::class.java)
            startActivity(intent)
        }
    }

    private fun updateMenuColors() {
        val iconHeader = findViewById<ImageView>(R.id.iconHeader)
        // Cambiar colores para "Mis perfiles"
        val btnMisPerfiles = findViewById<LinearLayout>(R.id.btnMisPerfiles)
        val iconMisPerfiles = findViewById<ImageView>(R.id.iconMisPerfiles)
        val textMisPerfiles = findViewById<TextView>(R.id.textMisPerfiles)

        btnMisPerfiles.setBackgroundColor(ContextCompat.getColor(this, R.color.blue_light))
        iconMisPerfiles.setColorFilter(ContextCompat.getColor(this, R.color.white))
        textMisPerfiles.setTextColor(ContextCompat.getColor(this, R.color.white))
        iconHeader.setColorFilter(ContextCompat.getColor(this, R.color.yellow_main))

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