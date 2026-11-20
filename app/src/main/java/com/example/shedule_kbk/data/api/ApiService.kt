package com.example.shedule_kbk.data.api

import com.example.shedule_kbk.data.model.Lesson
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {

    @GET("api/schedule/my")
    suspend fun getMySchedule(
        @Header("Authorization") token: String
    ): List<Lesson>
}