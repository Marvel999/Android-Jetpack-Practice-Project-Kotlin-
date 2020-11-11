package com.marvel999.recyclerview_kotlin

import android.content.Context
import android.gesture.GestureLibraries
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CustumAdapter(private val context:Context,val list: ArrayList<User>,public val cellClickListener: CellClickListener): RecyclerView.Adapter<CustumAdapter.ViewHolder>() {
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        lateinit var likebtn:Button;
         fun binditem(user: User){
             val title=itemView.findViewById(R.id.title) as TextView;
             val description=itemView.findViewById(R.id.description) as TextView;
              likebtn=itemView.findViewById(R.id.like) as Button;
             val profileimage=itemView.findViewById(R.id.Profile) as ImageView;

             title.setText(user.title)
             description.setText(user.description)
              Glide.with(profileimage)
                  .load(user.imageUrl)
                  .into(profileimage)

         }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustumAdapter.ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.recyclerviewitem,parent,false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.binditem(list[position])
        holder.itemView.setOnClickListener{
            cellClickListener.onCellClickListener()

        }
        holder.likebtn.setOnClickListener {
            cellClickListener.ondeletListner()
        }

    }


}