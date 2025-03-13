import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import co.edu.uniandes.misw4203.vitaalarm_movil.ProfilesActivity
import co.edu.uniandes.misw4203.vitaalarm_movil.R

open class BaseActivity : AppCompatActivity() {
    override fun onResume() {
        super.onResume()

        // Verifica que la vista esté en el layout antes de acceder a ella
        val btnMisPerfiles = findViewById<LinearLayout>(R.id.btnMisPerfiles)
        btnMisPerfiles?.setOnClickListener {
            val intent = Intent(this, ProfilesActivity::class.java)
            startActivity(intent)
        }
    }
}