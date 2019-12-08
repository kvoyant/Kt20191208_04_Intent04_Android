package com.yhkim.kt20191208_04_intent04_android

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialBtn.setOnClickListener {
//            누구에게 전화를 걸지 정보를 미리 명시
            val uri = Uri.parse("tel:01012345678")//val 불변, var 변경가능
//            어느화면에 넘겨줄지 명시
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)
        }

        callBtn.setOnClickListener {
            val uri = Uri.parse("tel:01065781700")
            val intent = Intent(Intent.ACTION_CALL, uri)
            startActivity(intent)//처리전 앱 죽는다.
            //마시멜로 업데이트 ( 보안별 팝업이 뜸 이전에는 모든 권한 동의가 뜸 )
        }
    }
}
