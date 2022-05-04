package com.example.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BasicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic);
        var textView:TextView=findViewById(R.id.basic_textView)
        textView.text="hai hello how  are you"
    }
}