
plugins {
    alias(libs.plugins.versionsBenManes)
}

buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${libs.versions.kotlin.get()}")
        classpath("com.android.tools.build:gradle:7.2.2")
        classpath("com.mikepenz.aboutlibraries.plugin:aboutlibraries-plugin:${libs.versions.about.libraries.get()}")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
