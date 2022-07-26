package com.neppplus.intentpractice_20220726

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        
//        수정할 값 입력 완료 후 확인버튼을 눌렀을 때의 코드
        finishBtn.setOnClickListener { 
//            1. 가지고 돌아갈 데이터 변수화
            val name = nameEdt.text.toString()
            val phoneNum = phoneEdt.text.toString()
            
//            2. 티켓을 발권 + 수화물 첨부 + 실제로 수정했는지에 대한 여부 첨부
            val resultIntent = Intent()
            resultIntent.putExtra("name", name)
                .putExtra("phoneNum", phoneNum)
            setResult(RESULT_OK, resultIntent)  // 비행기 돌아가는 코드
            finish()
        }
    }
}