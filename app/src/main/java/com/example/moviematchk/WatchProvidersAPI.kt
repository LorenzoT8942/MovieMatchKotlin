package com.example.moviematchk

import android.content.Context
import android.util.JsonReader
import android.util.Log
import androidx.lifecycle.ViewModel
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import java.io.IOException
import kotlin.reflect.typeOf

class WatchProvidersAPI{

    private val client = OkHttpClient();
    private val tmdbAuth = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIzMzQzNmM0YTQyYjYwYzAyYjllNDI0OWY5ZjM3NjhkMiIsInN1YiI6IjY0YWQ0ZWZiNmEzNDQ4MDBlYThlMThjOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.3KnFt0DuHUSrQ5iU0aZdB9ksAPpQ_bCVAFumUVyHJSI"

    fun requestWatchProvidersList(watchRegion : String = "it", context : Context) : String {
        val request = okhttp3.Request.Builder()
            .url(buildRequest("it"))
            .addHeader("accept", "application/json")
            .addHeader("Authorization", "Bearer $tmdbAuth")
            .build()

        client.newCall(request).enqueue( object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                e.printStackTrace()
            }
            override fun onResponse(call: Call, response: okhttp3.Response) {
                Log.d("deb", response.body!!.string())
                return response.body!!.string()
            }
        })
    }

    fun buildRequest(watchRegion: String) : String {
        val url = "https://api.themoviedb.org/3/watch/providers/movie?watch_region=$watchRegion";
        Log.d("deb", url)
        return url;
    }
}