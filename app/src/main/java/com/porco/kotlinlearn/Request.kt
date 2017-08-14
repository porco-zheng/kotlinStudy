package com.porco.kotlinlearn

import android.util.Log
import java.net.URL

/**
 * Created by porco on 2017/7/11.
 */
class Request(val url: String) {
    public fun run(){
        val str = URL(url).readText()
        Log.d("sss",str)
    }
}