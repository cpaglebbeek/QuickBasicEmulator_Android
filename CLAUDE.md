# CLAUDE.md — QuickBasicEmulator_Android

## Rol

Android-app. MVP-2 (v0.6.0-Lampson) = WebView rond Web-build. MVP-3 (v1.0+) optioneel native.

## Sessie-startprotocol

1. Pull deze repo + QuickBasicEmulator_Web + Meta_QuickBasicEmulator
2. Lees ROADMAP

## Versie-bump-regel

Conform `feedback_randomringtone_versioning`: bij ELKE bugfix minimaal +0.0.1 bump in `version.json` + build.gradle.kts.

## Build-protocol

Conform `feedback_randomringtone_release_build`: altijd `assembleRelease` (geen debug, ook bij DEBUG marker — 1.9 MB vs 17 MB).

## Deploy-protocol

Conform `feedback_randomringtone_deploy`: na elke build APK + timestamp uploaden naar icthorse.nl. Standaard DEBUG marker tot stable.
Conform `feedback_stable_apk_releases`: bij stable markering APK kopiëren naar `releases/` + committen + pushen.

## WebView-bundeling

Web-build wordt **niet** runtime opgehaald (offline-by-default):
1. In Web-repo: `npm run build` → `dist/`
2. Kopieer `dist/*` naar `app/src/main/assets/web-build/`
3. WebView laadt `file:///android_asset/web-build/index.html`

## Code-locaties

| Wat | Waar |
|---|---|
| Entry activity | `app/src/main/java/nl/cpaglebbeek/quickbasic/MainActivity.kt` |
| WebView bundle | `app/src/main/assets/web-build/` (v0.6.0+) |
| Build-config | `app/build.gradle.kts` |
| Releases | `releases/` (per stable APK) |

