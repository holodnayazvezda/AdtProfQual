package com.example.adtprofessionsofficialqualifyig.domain.repository

import com.example.adtprofessionsofficialqualifyig.data.models.ApplicationRequest
import com.example.adtprofessionsofficialqualifyig.data.models.ApplicationResponse
import com.example.adtprofessionsofficialqualifyig.data.models.LoginRequest
import com.example.adtprofessionsofficialqualifyig.data.models.ProfessionDto
import com.example.adtprofessionsofficialqualifyig.data.models.TokenResponse

interface ApiRepository {
    suspend fun getProfessions(page: Int = 1, pageSize: Int = 20): List<ProfessionDto>
    suspend fun submitApplication(request: ApplicationRequest): ApplicationResponse
    suspend fun login(request: LoginRequest): TokenResponse
}
