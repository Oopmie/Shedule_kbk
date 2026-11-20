package com.example.shedule_kbk.data.model

data class Lesson(
    val id: Long,
    val subject: String,
    val teacher: String,
    val classroom: String,
    val date: String,
    val startTime: String,
    val endTime: String,
    val lessonNumber: Int
)