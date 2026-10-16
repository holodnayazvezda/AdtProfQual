# AdtProfQual

Android-приложение с каталогом профессий и отправкой заявок. В проекте есть модели авторизации, получения профессий и подачи заявки, а также экраны главной страницы, поиска, входящих и профиля. Используются Kotlin, Jetpack Compose, Koin и Retrofit.

## Сборка и запуск

Откройте корень проекта в Android Studio, установите Android SDK 36 и выполните синхронизацию Gradle. Используйте JDK, совместимый с версией Android Gradle Plugin проекта; настройки Java указаны в `app/build.gradle.kts`. Минимальная версия устройства — Android API 27.

Для сборки отладочного APK:

```sh
sh gradlew :app:assembleDebug
```

В Windows: `gradlew.bat :app:assembleDebug`. APK появится в `app/build/outputs/apk/debug/`. Для запуска выберите модуль `app` и устройство или эмулятор в Android Studio.

## Устройство проекта

Перед сетевым использованием задайте адрес совместимого API в `app/src/main/java/com/example/adtprofessionsofficialqualifyig/common/Constants.kt`: исходное значение `BASE_API_URL` является примером. Контракт запросов описан в интерфейсе `ApiService.kt` в каталоге `data/network/api/`.
