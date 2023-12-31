package com.example.mymovieapp.Utils

import android.content.Context
import android.net.ConnectivityManager

object CommonUtils {
    fun isNetworkConnected(context: Context): Boolean {
        val cm = (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager)
        val activeNetwork = cm.activeNetworkInfo
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting
    }
}