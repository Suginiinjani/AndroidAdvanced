package com.bootcamp.tasksib

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Member(
    val imgMember: Int,
    val nameMember: String,
    val descMember: String
): Parcelable
