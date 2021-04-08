package com.example.trabajosexpres.Modelo

data class WeatherByCity (

        val coord : Coord,
        val weather : List<Weather>,
        val base : String,
        val main : Main,
        val wind : Wind,
        val rain : Rain,
        val clouds : Clouds,
        val dt : Int,
        val sys : Sys,
        val timezone : Int,
        val id : Int,
        val name : String,
        val cod : Int
)