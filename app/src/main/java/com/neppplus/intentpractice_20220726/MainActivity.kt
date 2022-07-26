package com.neppplus.intentpractice_20220726

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        버튼 클릭시 SecondActivity로 이동
        moveBtn.setOnClickListener {
//            티켓(myIntent)을 발권 - 출발지(this) -> 목적지(SecondActivity)로 이동하는 티켓
            val myIntent = Intent(this, SecondActivity::class.java)
//            비행기 출발
            startActivity(myIntent)
        }
    }
}