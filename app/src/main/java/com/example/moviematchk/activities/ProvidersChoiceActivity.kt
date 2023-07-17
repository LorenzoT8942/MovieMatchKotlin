package com.example.moviematchk.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.moviematchk.R
import com.example.moviematchk.WatchProvidersAPI
import com.example.moviematchk.controller.WatchProvidersViewModel
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class ProvidersChoiceActivity : AppCompatActivity() {

    private lateinit var watchProviders_rv : RecyclerView
    private val client = OkHttpClient();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.providers_choice)

        watchProviders_rv = findViewById(R.id.wpList_rv)

        val wpViewModel = WatchProvidersViewModel()
    }
}