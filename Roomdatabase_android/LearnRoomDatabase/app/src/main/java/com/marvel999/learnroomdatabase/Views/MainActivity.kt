package com.marvel999.learnroomdatabase.Views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.marvel999.learnroomdatabase.R

class MainActivity : AppCompatActivity() {
    lateinit var viewModelInstance:ViewModel;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModelInstance= ViewModelProvider(this).get(ViewModel.class);
    }
}