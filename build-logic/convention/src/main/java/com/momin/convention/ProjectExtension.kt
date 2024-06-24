package com.momin.convention

import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension

val Project.libs
    get() = extensions.getByType<VersionCatalogsExtension>().named("libs")