package com.example.moviematchk.model

import android.media.Image

class WatchProvider(val wp_ID : Int, val wp_name: String, wp_image: Image){
    private val id: Int = wp_ID
    private val name: String = wp_name
    private val image: Image = wp_image
}