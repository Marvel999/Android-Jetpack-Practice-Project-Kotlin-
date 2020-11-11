package com.marvel999.mvvm_first_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        next_activity_btn.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Hii",Toast.LENGTH_LONG).show();
            val intent=Intent(this,second_Activity::class.java);
            startActivity(intent);
        })


    }
}