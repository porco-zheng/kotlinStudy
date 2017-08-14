package com.porco.kotlinlearn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.async

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt.text = "sss"
        val list = findViewById(R.id.list) as RecyclerView
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = ListAdapter(items)
        toast("sss")
        val url = "http://activity.tuia.cn/activity/index?id=409&slotId=1091&login=normal&appKey=vgwYsSrbLLiiW5w6UgrjEVc2cPJ&deviceId=31b4c068-96a6-4d1b-be19-89bd4a8f6e2c&tck_rid_6c8=0a1b638dj29whk80-15924120&tck_loc_c5d=tactivity-409&tenter=SOW&"
        async() {
            Request(url).run()
        }

    }

    fun toast(message: String ,length: Int = Toast.LENGTH_LONG){
        Toast.makeText(this,message,length).show()
    }

    private val items = listOf(
            "aaaa",
            "bbbb",
            "cccc",
            "dddd"
    )

}
