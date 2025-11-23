package com.example.adtprofessionsofficialqualifyig.domain.usecase

import com.example.adtprofessionsofficialqualifyig.data.models.ProfessionDto
import com.example.adtprofessionsofficialqualifyig.domain.repository.ApiRepository
import org.koin.core.annotation.Factory

@Factory
class GetProfessionsUseCase(
    private val repository: ApiRepository
) {
    suspend operator fun invoke(page: Int = 1, pageSize: Int = 20): List<ProfessionDto> {
        return repository.getProfessions(page, pageSize)
    }
}
