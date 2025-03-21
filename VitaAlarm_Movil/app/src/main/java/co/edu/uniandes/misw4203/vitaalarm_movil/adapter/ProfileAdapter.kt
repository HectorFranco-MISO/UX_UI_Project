package co.edu.uniandes.misw4203.vitaalarm_movil.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import co.edu.uniandes.misw4203.vitaalarm_movil.ProfileDetailActivity
import co.edu.uniandes.misw4203.vitaalarm_movil.R
import co.edu.uniandes.misw4203.vitaalarm_movil.model.Profile

class ProfileAdapter(
    private val profiles: List<Profile>,
    private val onItemClick: (Profile) -> Unit // Callback para manejar el clic
) : RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {

    class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileIcon: TextView = itemView.findViewById(R.id.profile_icon)
        val profileTitle: TextView = itemView.findViewById(R.id.profile_title)
        val profileDescription: TextView = itemView.findViewById(R.id.profile_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_profile, parent, false)
        return ProfileViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val profile = profiles[position]
        holder.profileIcon.text = profile.icon
        holder.profileTitle.text = profile.title
        holder.profileDescription.text = profile.description

        // Configurar el clic en la card
        holder.itemView.setOnClickListener {
            onItemClick(profile) // Llamar al callback con el perfil seleccionado
        }
    }

    override fun getItemCount(): Int {
        return profiles.size
    }
}