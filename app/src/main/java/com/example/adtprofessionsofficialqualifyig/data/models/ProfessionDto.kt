package com.example.adtprofessionsofficialqualifyig.data.models

data class ProfessionDto(
    val id: Long,
    val title: String,
    val description: String,
    val salaryFrom: Int? = null,
    val salaryTo: Int? = null
)
