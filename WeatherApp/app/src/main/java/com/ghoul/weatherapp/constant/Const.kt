package com.ghoul.weatherapp.constant

class Const {
    companion object{
        val permissions = arrayOf(
            android.Manifest.permission.ACCESS_COARSE_LOCATION,
            android.Manifest.permission.ACCESS_FINE_LOCATION
        )
        const val openWeatherMapApiKey = "YOUR API KEY HERE"

        const val colorBg1 = 0xff08203e
        const val colorBg2 = 0xff557c93
        const val cardColor = 0xff333639

        const val LOADING = "Loading..."
        const val  NA = "N/A"
    }
}
