package com.neppplus.intentpractice_20220726

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        MainActivty에서 보내준 데이터(수화물) 찾는 코드
        val myName = intent.getStringExtra("myName")

//        받아온 데이터(수화물) 활용 코드
        dataTxt.text = myName

//        다시 돌아가기
        backBtn.setOnClickListener {
//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)
            finish()
        }
    }
}