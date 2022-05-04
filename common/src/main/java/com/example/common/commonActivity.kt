package com.example.common

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class commonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)
        var textView:TextView=findViewById(R.id.text)
        if (this.packageName.equals("com.example.gradlelibrary")){
            textView.setText(this.packageName+"-->" + "Its A Big Deal  for me")
        }else
            textView.setText(this.packageName+"-->"+ "Its A Big Deal  for me")

        var button:Button=findViewById(R.id.button)
        button.setOnClickListener {
            movetonext()
        }
    }
    fun  movetonext(){
        val intent= Intent(this,BasicActivity::class.java)
        startActivity(intent)
    }
}