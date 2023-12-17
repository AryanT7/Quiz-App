package com.example.quizpert

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        button.setOnClickListener{
            if(inputName.text.toString().isEmpty()){
                Toast.makeText(this,"Name required!",Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this,QuestionActivity::class.java)
                intent.putExtra(setData.name,inputName.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}