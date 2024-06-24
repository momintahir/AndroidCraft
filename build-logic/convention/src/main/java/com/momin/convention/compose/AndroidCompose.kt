package com.momin.convention.compose

import com.android.build.api.dsl.CommonExtension
import com.momin.convention.libs
import org.gradle.api.Project

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
    composeOptions {
      kotlinCompilerExtensionVersion = libs.findVersion("kotlinCompilerExtension").get().toString()
    }
  }

  extensions.configure<ComposeCompilerGradlePluginExtension> {
    enableStrongSkippingMode = true
    reportsDestination = layout.buildDirectory.dir("compose_compiler")
  }
}