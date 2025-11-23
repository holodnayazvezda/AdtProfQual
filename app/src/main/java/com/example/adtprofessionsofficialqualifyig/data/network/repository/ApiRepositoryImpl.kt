package com.example.adtprofessionsofficialqualifyig.data.network.repository

import com.example.adtprofessionsofficialqualifyig.data.models.ApplicationRequest
import com.example.adtprofessionsofficialqualifyig.data.models.ApplicationResponse
import com.example.adtprofessionsofficialqualifyig.data.models.LoginRequest
import com.example.adtprofessionsofficialqualifyig.data.models.ProfessionDto
import com.example.adtprofessionsofficialqualifyig.data.models.TokenResponse
import com.example.adtprofessionsofficialqualifyig.data.network.api.ApiService
import com.example.adtprofessionsofficialqualifyig.domain.repository.ApiRepository
import org.koin.core.annotation.Single

@Single
class ApiRepositoryImpl(
    private val apiService: ApiService
) : ApiRepository {

    override suspend fun getProfessions(page: Int, pageSize: Int): List<ProfessionDto> {
        return apiService.getProfessions(page, pageSize)
    }

    override suspend fun submitApplication(request: ApplicationRequest): ApplicationResponse {
        return apiService.submitApplication(request)
    }

    override suspend fun login(request: LoginRequest): TokenResponse {
        return apiService.login(request)
    }
}
