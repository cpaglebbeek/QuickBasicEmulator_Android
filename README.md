# QuickBasicEmulator_Android

Android-app voor QuickBasicEmulator. MVP-2 (v0.6.0-Lampson) is een **WebView-wrapper** rond de Web-build. Native runtime in MVP-3 (v1.0+).

> ⚠️ **v0.0.1-Gates — Skeleton.** WebView-wrapper komt v0.6.0.

## Tech

- **Kotlin** + **Jetpack Compose**
- WebView-component bundelt `QuickBasicEmulator_Web/dist/` als asset
- Minimum SDK 26 (Android 8.0)

## Build

```bash
./gradlew assembleRelease
```

APK output: `app/build/outputs/apk/release/app-release.apk`

## Project + ecosystem

- **Meta:** [`cpaglebbeek/Meta_QuickBasicEmulator`](https://github.com/cpaglebbeek/Meta_QuickBasicEmulator)
- **Ecosystem:** Retro_Computing
- **Licentie:** AGPL-3.0
