package com.gramirez.bol2_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import android.content.Context
import com.gramirez.bol2_2.model.Ciudades
import com.gramirez.bol2_2.databinding.ActivityMainBinding
import com.gramirez.bol2_2.databinding.ViewCityBinding


class CiudadesAdapter(val ciudades: List<Ciudades>, val context: Context) :
    RecyclerView.Adapter<CiudadesAdapter.ViewHolder>(){
        class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
            val bd = ViewCityBinding.bind(view)

            fun bind(ciudades: Ciudades){
                with(bd) {
                    nomCiudad.text = ciudades.nomCiudad
                    Glide.with(root.context).load(ciudades.urlCiudad).into(ciudadImagen)

                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.view_city, parent, false)
        return ViewHolder(view)
    }
    override fun getItemCount() = ciudades.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(ciudades[position])
    }
    }

