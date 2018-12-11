package com.wf.ew.oauth.endpoint.support;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangfan on 2018-12-11 下午 3:50.
 */
public class ClientParam {
    public final static String DEFAULT_REDIRECT_URL = "urn:ietf:wg:oauth:2.0:oob";
    private String name;
    private Set<String> scope;
    @org.codehaus.jackson.annotate.JsonProperty("redirect_uri")
    @com.fasterxml.jackson.annotation.JsonProperty("redirect_uri")
    private Set<String> redirectUri;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(Set<String> redirectUri) {
        this.redirectUri = redirectUri;
    }

    public Set<String> getScope() {
        return scope;
    }

    public void setScope(Set<String> scope) {
        this.scope = scope;
    }

    public void populateDefault() {
        if (getScope() == null) {
            setScope(new HashSet<>());
        }
        if (getRedirectUri() == null) {
            setRedirectUri(new HashSet<>());
        }
        if (this.getRedirectUri().size() == 0) {
            getRedirectUri().add(DEFAULT_REDIRECT_URL);
        }
        if (getScope().size() == 0) {
            getScope().add("DEFAULT");
        }
    }
}
