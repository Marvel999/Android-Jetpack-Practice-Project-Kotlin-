package com.marvel999.recyclerview_kotlin

import android.annotation.SuppressLint
import android.icu.lang.UCharacter
import android.icu.lang.UCharacter.VerticalOrientation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),CellClickListener {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arraylist=ArrayList<User>();
        arraylist.add(User("Manish","Student",true,"https://i.pinimg.com/originals/f5/af/d3/f5afd37438d206466c271b550a0a3eca.jpg"))
        arraylist.add(User("Ankit","Student",true,"https://i.pinimg.com/originals/f5/af/d3/f5afd37438d206466c271b550a0a3eca.jpg"))
        arraylist.add(User("RAju","Student",true,"https://i.pinimg.com/originals/f5/af/d3/f5afd37438d206466c271b550a0a3eca.jpg"))
        arraylist.add(User("Shamu","Student",true,"https://i.pinimg.com/originals/f5/af/d3/f5afd37438d206466c271b550a0a3eca.jpg"))
        recylerview.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false);
        val custumAdapter:CustumAdapter= CustumAdapter(this,arraylist,this)
        recylerview.adapter=custumAdapter;
    }

    override fun onCellClickListener() {
        Toast.makeText(this,"item get clicked",Toast.LENGTH_LONG).show();
    }

    override fun ondeletListner() {
        Toast.makeText(this,"like buttton is cliked",Toast.LENGTH_LONG).show();
    }
}