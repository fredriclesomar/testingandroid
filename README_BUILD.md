# Hospital Maps — Android 12 build

Konfigurasi aplikasi:
- `minSdk = 31` (Android 12)
- `targetSdk = 35`
- `compileSdk = 35`
- AGP `8.7.3`
- Gradle `8.9`
- JDK `17`

## Build APK

Workflow `.github/workflows/build-apk.yml` menjalankan:
1. `gradle :app:assembleDebug`
2. verifikasi `minSdk=31` dan `targetSdk=35`
3. verifikasi `resources.arsc` / ZIP alignment menggunakan `zipalign -c -P 16 -v 4`
4. verifikasi signature menggunakan `apksigner verify --verbose`
5. upload `app-debug.apk` sebagai artifact `HospitalMaps-Android12-debug-apk`

Jadi APK yang lolos workflow sudah dipastikan ter-align dan signed untuk kebutuhan testing.
