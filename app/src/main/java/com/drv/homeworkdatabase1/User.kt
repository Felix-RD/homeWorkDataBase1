package com.drv.homeworkdatabase1

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.net.CookieHandler

@Entity
data class User (
    var name : String = "",
    var style: String = "",
    var price: String = ""
        ){
    @PrimaryKey(autoGenerate = true) var id: Int = 0

}
