package com.example.gradlelibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.common.WrapperClass
import com.example.common.commonActivity

class MainActivity : WrapperClass() {
    override fun onCreate() {
        super.onCreate()
    }
    /*verride fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView:TextView=findViewById(R.id.textbuyer)
        //textView.setText()
    }*/
}