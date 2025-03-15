package co.edu.uniandes.misw4203.vitaalarm_movil

import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import android.view.LayoutInflater
import android.widget.Button
import android.widget.NumberPicker
import androidx.appcompat.app.AlertDialog
import mostrarToastPersonalizado

class CreateProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create_profile)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.createProfile)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Listener para activar perfil
        val btnSaveProfile = findViewById<Button>(R.id.btnSaveProfile)
        btnSaveProfile.setOnClickListener {
            mostrarToastPersonalizado(this, "Perfil guardado", true)
            finish()
        }

        // Capturar el campo de playlist
        val edtPlaylist = findViewById<MaterialAutoCompleteTextView>(R.id.edtPlaylist)
        val edtLocation = findViewById<MaterialAutoCompleteTextView>(R.id.edtLocation)

        // Lista de playlists quemadas en el código
        val playlists = listOf(
            "🎵 Chill Vibes",
            "🔥 Workout Energy",
            "🎸 Rock Clásico",
            "🎶 Lo-Fi Beats",
            "💃 Fiesta Latina"
        )

        val locations = listOf(
            "Oficina",
            "GYM",
            "Casa",
            "Universidad"
        )


        // Configurar el adaptador con las playlists
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, playlists)
        edtPlaylist.setAdapter(adapter)

        // Configurar el adaptador con las ubicaciones
        val adapterU = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, locations)
        edtLocation.setAdapter(adapterU)

        // Forzar la apertura del menú al hacer clic
        edtPlaylist.setOnClickListener {
            edtPlaylist.showDropDown()
        }

        // Forzar la apertura del menú al hacer clic
        edtLocation.setOnClickListener {
            edtLocation.showDropDown()
        }


        // Captura del campo de duración de la sesión
        val edtSessionDuration = findViewById<EditText>(R.id.edtSessionDuration)

        // Al hacer clic en el campo, abrir el TimePicker
        edtSessionDuration.setOnClickListener {
            mostrarTemporizador(edtSessionDuration)
        }
    }

    private fun mostrarTemporizador(editText: EditText) {
        val inflater = LayoutInflater.from(this)
        val view = inflater.inflate(R.layout.dialog_timer_picker, null)

        val numberPickerHours = view.findViewById<NumberPicker>(R.id.numberPickerHours)
        val numberPickerMinutes = view.findViewById<NumberPicker>(R.id.numberPickerMinutes)

        // Configuración de los NumberPickers
        numberPickerHours.minValue = 0
        numberPickerHours.maxValue = 12 // Puedes ajustar el máximo de horas

        numberPickerMinutes.minValue = 0
        numberPickerMinutes.maxValue = 59
        numberPickerMinutes.wrapSelectorWheel = true

        // Crear el AlertDialog
        val dialog = AlertDialog.Builder(this)
            .setTitle("Seleccionar la duración")
            .setView(view)
            .setPositiveButton("OK") { _, _ ->
                val horas = numberPickerHours.value
                val minutos = numberPickerMinutes.value
                editText.setText(String.format("%02d:%02d", horas, minutos))
            }
            .setNegativeButton("Cancelar", null)
            .create()

        dialog.show()
    }
}
