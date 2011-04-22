/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.plugins

import org.gradle.api.Project

 /**
 * <p>A {@link Convention} used for the ApplicationPlugin.</p>
 *
 * @author Rene Groeschke
 */
class ApplicationPluginConvention {
    /**
     * The name of the application.
     */
    String applicationName

    /**
     * The fully qualified name of the application's main class.
     */
    String mainClassName

    private final Project project

    ApplicationPluginConvention(Project project) {
        this.project = project
    }

    String getApplicationPrefix() {
        "${applicationName}${project.version == Project.DEFAULT_VERSION ? '' : '-' + project.version }"
    }
}
