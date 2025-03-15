import android.app.Activity
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import androidx.core.content.ContextCompat
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import co.edu.uniandes.misw4203.vitaalarm_movil.R

fun mostrarToastPersonalizado(
    context: Context,
    mensaje: String,
    esExitoso: Boolean // true = verde (Perfil creado), false = rojo (Perfil eliminado)
) {
    val inflater = (context as Activity).layoutInflater
    val layout: View = inflater.inflate(R.layout.custom_toast, null)

    // Referencias a los elementos del layout
    val toastIcon = layout.findViewById<ImageView>(R.id.notification_icon)
    val toastTitle = layout.findViewById<TextView>(R.id.notification_title)
    val toastMessage = layout.findViewById<TextView>(R.id.notification_description)

    // Configuración de estilos dinámicos según el tipo de notificación
    if (esExitoso) {
        // Notificación de éxito (Verde)
        toastIcon.setImageResource(R.drawable.ic_bell) // Ícono verde
        toastIcon.setBackgroundResource(R.drawable.circle_success_background) // Fondo verde
        toastTitle.text = "Notificación"
        toastTitle.setTextColor(ContextCompat.getColor(context, R.color.success)) // Texto verde
        toastMessage.text = mensaje
        toastMessage.setTextColor(ContextCompat.getColor(context, R.color.success))
    }

    val toast = Toast(context)
    toast.duration = Toast.LENGTH_LONG
    toast.view = layout
    toast.setGravity(Gravity.TOP or Gravity.FILL_HORIZONTAL, 0, 20)
    toast.show()
}
