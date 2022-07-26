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

//            데이터(수화물) 첨부하는 코드 > 비행기 티켓(myIntent)에 뭔가(extra)를 첨부(put)한다.
            val myName = dataEdt.text.toString()
            myIntent.putExtra("myName", myName)
                .putExtra("데이터2", "데이터2")
                .putExtra("데이터3", "데이터3")
//            myIntent.putExtra("데이터2", "데이터2")
//            myIntent.putExtra("데이터3", "데이터3")

//            비행기 출발
            startActivity(myIntent)
        }

//        Intent(3) 회원정보 수정 버튼 클릭 이벤트
//        데이터 수정받기 위한 출발 코드 작성
        editBtn.setOnClickListener {
            val myIntent = Intent(this, EditActivity::class.java)
            startActivityForResult(myIntent,1000)
        }
    }
}