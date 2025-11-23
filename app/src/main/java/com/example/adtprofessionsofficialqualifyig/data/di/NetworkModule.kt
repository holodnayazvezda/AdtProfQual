package com.example.adtprofessionsofficialqualifyig.data.di

import com.example.adtprofessionsofficialqualifyig.common.Constants
import com.example.adtprofessionsofficialqualifyig.data.network.api.ApiService
import com.example.adtprofessionsofficialqualifyig.data.network.repository.ApiRepositoryImpl
import com.example.adtprofessionsofficialqualifyig.domain.repository.ApiRepository
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val dataModule = module {
    single {
        OkHttpClient.Builder().build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    single<ApiService> {
        get<Retrofit>().create(ApiService::class.java)
    }


    single<ApiRepository> { ApiRepositoryImpl(apiService = get()) }


}
