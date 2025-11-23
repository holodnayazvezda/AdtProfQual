package com.example.adtprofessionsofficialqualifyig.domain.usecase

import com.example.adtprofessionsofficialqualifyig.data.models.LoginRequest
import com.example.adtprofessionsofficialqualifyig.data.models.TokenResponse
import com.example.adtprofessionsofficialqualifyig.domain.repository.ApiRepository
import org.koin.core.annotation.Factory

@Factory
class LoginUseCase(
    private val repository: ApiRepository
) {
    suspend operator fun invoke(request: LoginRequest): TokenResponse {
        return repository.login(request)
    }
}
