![OpenOSRS - CI (Push)](https://github.com/open-osrs/plugins/workflows/OpenOSRS%20-%20CI%20(Push)/badge.svg?branch=master)

# OpenOSRS official plugin repository

This is a collection of officially supported plugins. This is the default repo used in the OpenOSRS client.

Gradle commands:

```
./gradlew clean build copyDeps publishToMavenLocal -PreleaseToExternalmanager=spacespam -x tests -x checkStyleMain -x checkStyleTest
```

add includes to settings.gradle.kts