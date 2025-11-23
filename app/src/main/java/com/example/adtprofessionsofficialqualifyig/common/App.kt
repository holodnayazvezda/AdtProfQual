package com.example.adtprofessionsofficialqualifyig.common

import android.app.Application
import com.example.adtprofessionsofficialqualifyig.common.di.AppModule
import com.example.adtprofessionsofficialqualifyig.data.di.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.ksp.generated.module

class App : Application() {
    companion object {
        lateinit var instanse: Application
    }

    override fun onCreate() {
        super.onCreate()
        instanse = this
        startKoin {
            androidContext(this@App)
            modules(
                AppModule().module,
                dataModule
            )
        }
    }
}
