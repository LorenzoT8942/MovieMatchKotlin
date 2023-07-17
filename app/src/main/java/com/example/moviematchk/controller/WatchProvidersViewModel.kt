package com.example.moviematchk.controller


import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.moviematchk.WatchProvidersAPI
import com.example.moviematchk.model.WatchProvider
import com.google.gson.Gson

class WatchProvidersViewModel : ViewModel() {

    private val wpApi = WatchProvidersAPI();

    fun getWatchProvidersList(context : Context) : Array<WatchProvider> {
        val providersList : String = wpApi.requestWatchProvidersList("it", context)
        val gson : Gson = Gson()



    }

}