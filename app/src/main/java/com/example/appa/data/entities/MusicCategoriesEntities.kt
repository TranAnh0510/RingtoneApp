package com.example.appa.data.entities

import com.example.appa.data.model.musicserver.MusicServerUI

data class MusicCategoriesEntities(
    val name: String = "",
    val pathImage: String? = "",
    val listSong: List<MusicEntities> = mutableListOf()
)

data class MusicEntities(
    val name: String = "",
    val category: String = "",
    val path: String = "",
    val image: String = "",
    val duration: String = "00:00",
    val sing: String = "",
)

fun MusicEntities.toModelUI() = MusicServerUI(
    name = name,
    category = category,
    path = path,
    duration = duration,
)