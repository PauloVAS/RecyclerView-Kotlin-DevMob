package com.finepointmobile.kotlinrecyclerviewbeta

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class UsersAdapter(private val users: ArrayList<String>) : RecyclerView.Adapter<UsersAdapter.MyCustomAdapter>() {

    override fun onBindViewHolder(holder: MyCustomAdapter, position: Int) {
        holder.firstName.text = users[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCustomAdapter {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false)
        return MyCustomAdapter(view)
    }

    override fun getItemCount() = users.size

    class MyCustomAdapter(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val firstName: TextView = itemView.findViewById(R.id.firstName)
    }
}
