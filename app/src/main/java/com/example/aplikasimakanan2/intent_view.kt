package com.example.aplikasimakanan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_intent_view.*
import kotlinx.android.synthetic.main.activity_intent_view.tv_deskripsi
import kotlinx.android.synthetic.main.activity_intent_view.tv_judul

class intent_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_view)

        var intent = intent
        val aTitle = intent.getStringExtra("iTitle")
        val aDesc = intent.getStringExtra("iDesc")
        val aPrice = intent.getStringExtra("iPrice")
        val aImg = intent.getIntExtra("iImg", 0)
        
        tv_judul.text = aTitle
        tv_deskripsi.text = aDesc
        tv_hargaa.text = aPrice
        img_vieww.setImageResource(aImg)


    }
}