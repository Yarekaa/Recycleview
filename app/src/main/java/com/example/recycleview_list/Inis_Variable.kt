package com.example.recycleview_list

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Inis_Variable (
    val fotomhs :Int = 0,
    val Nimmhs : String,
    val Telpmhs : String,
    val namamhs : String

) : Parcelable