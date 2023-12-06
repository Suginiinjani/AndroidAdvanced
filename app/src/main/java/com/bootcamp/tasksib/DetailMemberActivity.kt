package com.bootcamp.tasksib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailMemberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_member)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val member = intent.getParcelableExtra<Member>(MainActivity.INTENT_PARCELABLE)
        val imgMember = findViewById<ImageView>(R.id.img_item_photo)
        val nameMember = findViewById<TextView>(R.id.tv_item_name)
        val descMember = findViewById<TextView>(R.id.tv_item_description)

        imgMember.setImageResource(member?.imgMember!!)
        nameMember.text = member.nameMember
        descMember.text = member.descMember
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}