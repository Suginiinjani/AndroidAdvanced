package com.bootcamp.tasksib

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MemberAdapter(private val context: Context, private val member: List<Member>, val listener: (Member)->Unit)
    : RecyclerView.Adapter<MemberAdapter.MemberViewHolder>() {
    class MemberViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgMember = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameMember = view.findViewById<TextView>(R.id.tv_item_name)
        val descMember = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(member: Member, listener: (Member) -> Unit){
            imgMember.setImageResource(member.imgMember)
            nameMember.text = member.nameMember
            descMember.text = member.descMember
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        return MemberViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_member, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        holder.bindView(member[position], listener)
    }

    override fun getItemCount(): Int = member.size
}