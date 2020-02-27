package com.example.myapplication

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

@Entity
data class MultipleChoiceQuestion(
    @PrimaryKey(autoGenerate = true) val question_id: Long,
    val answer: String,
    val choices: List<String>,
    val prompt: String,
    val quiz_id: Long
)