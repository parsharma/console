/*
 * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.hal.config;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.jboss.hal.resources.Names;

/**
 * @author Harald Pehl
 */
@JsType
public class InstanceInfo {

    private String productName;
    private String productVersion;
    private String releaseName;
    private String releaseVersion;
    private String serverName;

    @JsIgnore
    InstanceInfo() {
        this.productName = Names.NOT_AVAILABLE;
        this.productVersion = Names.NOT_AVAILABLE;
        this.releaseName = Names.NOT_AVAILABLE;
        this.releaseVersion = Names.NOT_AVAILABLE;
        this.serverName = Names.NOT_AVAILABLE;
    }

    public String productName() {
        return productName;
    }

    public String productVersion() {
        return productVersion;
    }

    public String releaseName() {
        return releaseName;
    }

    public String releaseVersion() {
        return releaseVersion;
    }

    public String serverName() {
        return serverName;
    }

    @JsIgnore
    public void update(final String productName, final String productVersion,
            final String releaseName, final String releaseVersion,
            final String serverName) {
        this.productName = productName;
        this.productVersion = productVersion;
        this.releaseName = releaseName;
        this.releaseVersion = releaseVersion;
        this.serverName = serverName;
    }
}
