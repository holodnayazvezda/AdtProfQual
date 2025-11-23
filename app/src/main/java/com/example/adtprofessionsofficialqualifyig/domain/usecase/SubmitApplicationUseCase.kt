package com.example.adtprofessionsofficialqualifyig.domain.usecase

import com.example.adtprofessionsofficialqualifyig.data.models.ApplicationRequest
import com.example.adtprofessionsofficialqualifyig.data.models.ApplicationResponse
import com.example.adtprofessionsofficialqualifyig.domain.repository.ApiRepository
import org.koin.core.annotation.Factory

@Factory
class SubmitApplicationUseCase(
    private val repository: ApiRepository
) {
    suspend operator fun invoke(request: ApplicationRequest): ApplicationResponse {
        return repository.submitApplication(request)
    }
}
