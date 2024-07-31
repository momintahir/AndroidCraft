package com.momin.convention.compose

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.compose.compiler.gradle.ComposeCompilerGradlePluginExtension

/**
 * Configure Compose-specific options
 */
internal fun Project.configureAndroidCompose(
  commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
  pluginManager.apply("org.jetbrains.kotlin.plugin.compose")

  commonExtension.apply {
    buildFeatures {
      compose = true
    }
  }

  extensions.configure<ComposeCompilerGradlePluginExtension> {
    enableStrongSkippingMode.set(true)
    reportsDestination.set(layout.buildDirectory.dir("compose_compiler"))
  }
}