package com.gabriel.appfront_end.model.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gabriel.appfront_end.R
import com.gabriel.appfront_end.model.Tecnologia

class AdapterTecnologia(private val context: Context, private val tecnologias: MutableList<Tecnologia>):RecyclerView.Adapter<AdapterTecnologia.TecnologiaViewHolder>() {

//    responsavel por criar as visualizações na tela
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TecnologiaViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.tecnologias_item, parent, false)
        val holder = TecnologiaViewHolder(itemLista)
        return holder
    }

    // metodo responsavel por exebir as visualizações pro usuario
    override fun onBindViewHolder(holder: TecnologiaViewHolder, position: Int) {
            holder.foto.setImageResource(tecnologias[position].foto)
            holder.nome.text = tecnologias[position].nome
            holder.descricao.text = tecnologias[position].descricao
    }

    //    recebendo tamanho total da minha lista
    override fun getItemCount(): Int = tecnologias.size

    inner class TecnologiaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val foto = itemView.findViewById<ImageView>(R.id.fotoTec)
            val nome = itemView.findViewById<TextView>(R.id.nomeTec)
            val descricao = itemView.findViewById<TextView>(R.id.descricaoTec)
    }

}