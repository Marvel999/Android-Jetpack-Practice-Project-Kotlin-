package com.marvel999.databinding

import android.graphics.drawable.Drawable
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

data class User(val name:String,val age:String,val status:Boolean,val image_url:String) {
    private val Tag="User";
    public fun clickhandel(){
        Log.e(Tag,"${name} is clicked")
    }

    
    @BindingAdapter("imageUrl")
    fun loadImage(view: ImageView, imageUrl: String) {
        Glide.with(view)
            .load(imageUrl)
            .into(view)
    }

 @BindingAdapter("app:textset")
      fun textloder(imageview:TextView, imageurl:String){
     if(imageurl!=null)
        imageview.setText(imageurl)
    }


}