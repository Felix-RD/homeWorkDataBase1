package com.drv.homeworkdatabase1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class UserAdapter:RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    private var list = mutableListOf<User>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_view_holder,parent,false)

        return UserViewHolder (view)
        }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
       val user = list[position]
        holder.tvName.text = user.name
        holder.tvStyle.text = user.style
        holder.tvPrice.text= user.price
    }

    override fun getItemCount()=list.size

    fun setData(data: List<User>){
        list.apply {
            list.clear()
            addAll(data)
        }
    }

        class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val tvName = itemView.findViewById<TextView>(R.id.tv_name)
            val tvStyle = itemView.findViewById<TextView>(R.id.edStyle)
            val tvPrice = itemView.findViewById<TextView>(R.id.tv_price)
        }
    }








//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//
//class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){
//    private var list = mutableListOf<User>()
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
//      val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_view_holder,parent,false)
//      return  UserViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
//      val  user = list[position]
//        holder.tvName.text = user.name
//        holder.tvStyle.text= user.style
//        holder.tvPrice.text= user.price
//    }
//
//    override fun getItemCount()=  list.size
//
//
//    fun setData(data: list<User>) {
//        list.apply {
//            clear()
//            addAll()
//    }
//
//
//
//    class UserViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
//    val tvName :  TextView = itemView.findViewById<TextView>(R.id.tv_name)
//    val tvStyle : TextView = itemView.findViewById<TextView>(R.id.tv_style)
//    val tvPrice : TextView = itemView.findViewById<TextView>(R.id.tv_price)
//
//  }


