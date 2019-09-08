package com.example.kotlinanimeroom

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.usuario_recycle_linha.view.*

class UsuarioAdapter(var items: List<Usuario>, val context: Context) : RecyclerView.Adapter<AnimeViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {

        return AnimeViewHolder(LayoutInflater.from(context).inflate(R.layout.usuario_recycle_linha, parent, false))

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {

        holder.username.setText(items.get(position).userName)

        holder.foto.setImageBitmap(items.get(position).imagem)

        holder.idNum.setText(items.get(position).id.toString())

    }
}

class AnimeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val username = itemView.usernameRecycle
    val foto = itemView.userRecyclePhoto
    val idNum = itemView.idNumberRecycle

}
