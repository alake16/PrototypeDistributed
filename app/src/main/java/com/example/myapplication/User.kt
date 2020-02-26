package com.example.myapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true) val user_id: Long,
    val nickname: String
)