package com.example.adtprofessionsofficialqualifyig.data.network.api

import com.example.adtprofessionsofficialqualifyig.data.models.ApplicationRequest
import com.example.adtprofessionsofficialqualifyig.data.models.ApplicationResponse
import com.example.adtprofessionsofficialqualifyig.data.models.LoginRequest
import com.example.adtprofessionsofficialqualifyig.data.models.ProfessionDto
import com.example.adtprofessionsofficialqualifyig.data.models.TokenResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {

    @GET("professions")
    suspend fun getProfessions(
        @Query("page") page: Int = 1,
        @Query("page_size") pageSize: Int = 20
    ): List<ProfessionDto>

    @POST("applications")
    suspend fun submitApplication(
        @Body request: ApplicationRequest
    ): ApplicationResponse

    @POST("auth/login")
    suspend fun login(
        @Body request: LoginRequest
    ): TokenResponse
}
