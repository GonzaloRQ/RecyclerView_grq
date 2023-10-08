package com.gramirez.bol2_2

import android.graphics.Movie
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.gramirez.bol2_2.databinding.ActivityMainBinding
import com.gramirez.bol2_2.model.Ciudades

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val ciudades = listOf(
            Ciudades("Almeria", "https://upload.wikimedia.org/wikipedia/commons/9/9e/Aeropuerto_de_Almer%C3%ADa.jpeg"),
            Ciudades("Sevilla", "https://upload.wikimedia.org/wikipedia/commons/9/9e/Aeropuerto_de_Almer%C3%ADa.jpeg"),
            Ciudades("Caceres", "https://upload.wikimedia.org/wikipedia/commons/9/9e/Aeropuerto_de_Almer%C3%ADa.jpeg"),
            Ciudades("Melilla", "https://upload.wikimedia.org/wikipedia/commons/9/9e/Aeropuerto_de_Almer%C3%ADa.jpeg"),
            Ciudades("Granada", "https://upload.wikimedia.org/wikipedia/commons/9/9e/Aeropuerto_de_Almer%C3%ADa.jpeg"),
            Ciudades("Madrid", "https://upload.wikimedia.org/wikipedia/commons/9/9e/Aeropuerto_de_Almer%C3%ADa.jpeg"),
            Ciudades("Barcelona", "https://upload.wikimedia.org/wikipedia/commons/9/9e/Aeropuerto_de_Almer%C3%ADa.jpeg"),
            Ciudades("Lanzarote", "https://upload.wikimedia.org/wikipedia/commons/9/9e/Aeropuerto_de_Almer%C3%ADa.jpeg")
        )

        val bd = ActivityMainBinding.inflate(layoutInflater).apply{
            setContentView(root)

            recyclerView.layoutManager = GridLayoutManager(this@MainActivity, 2)

            recyclerView.adapter = CiudadesAdapter(ciudades, this@MainActivity)
        }


    }
}

