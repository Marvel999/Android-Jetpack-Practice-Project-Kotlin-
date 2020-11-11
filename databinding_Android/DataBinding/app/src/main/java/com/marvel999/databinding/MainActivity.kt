package com.marvel999.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.marvel999.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activityMainBinding:ActivityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        val user:User= User("Manish kumar","22",false,"https://www.infidigit.com/wp-content/uploads/2019/12/Reverse-Image-Search.png")
        activityMainBinding.user=user;
//        activityMainBinding.button.setOnClickListener {
//            Toast.makeText(this,"Bullon is clicked",Toast.LENGTH_LONG);
//        }
    }
}