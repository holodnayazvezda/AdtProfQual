package com.example.adtprofessionsofficialqualifyig.data.models

data class ApplicationRequest(
    val professionId: Long,
    val applicantName: String,
    val applicantEmail: String,
    val coverLetter: String? = null
)
