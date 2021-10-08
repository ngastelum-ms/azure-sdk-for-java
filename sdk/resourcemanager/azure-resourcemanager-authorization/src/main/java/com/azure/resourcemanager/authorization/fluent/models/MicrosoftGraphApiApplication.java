// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** apiApplication. */
@Fluent
public final class MicrosoftGraphApiApplication {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphApiApplication.class);

    /*
     * When true, allows an application to use claims mapping without
     * specifying a custom signing key.
     */
    @JsonProperty(value = "acceptMappedClaims")
    private Boolean acceptMappedClaims;

    /*
     * Used for bundling consent if you have a solution that contains two
     * parts: a client app and a custom web API app. If you set the appID of
     * the client app to this value, the user only consents once to the client
     * app. Azure AD knows that consenting to the client means implicitly
     * consenting to the web API and automatically provisions service
     * principals for both APIs at the same time. Both the client and the web
     * API app must be registered in the same tenant.
     */
    @JsonProperty(value = "knownClientApplications")
    private List<UUID> knownClientApplications;

    /*
     * The definition of the delegated permissions exposed by the web API
     * represented by this application registration. These delegated
     * permissions may be requested by a client application, and may be granted
     * by users or administrators during consent. Delegated permissions are
     * sometimes referred to as OAuth 2.0 scopes.
     */
    @JsonProperty(value = "oauth2PermissionScopes")
    private List<MicrosoftGraphPermissionScope> oauth2PermissionScopes;

    /*
     * Lists the client applications that are pre-authorized with the specified
     * delegated permissions to access this application's APIs. Users are not
     * required to consent to any pre-authorized application (for the
     * permissions specified). However, any additional permissions not listed
     * in preAuthorizedApplications (requested through incremental consent for
     * example) will require user consent.
     */
    @JsonProperty(value = "preAuthorizedApplications")
    private List<MicrosoftGraphPreAuthorizedApplication> preAuthorizedApplications;

    /*
     * Specifies the access token version expected by this resource. This
     * changes the version and format of the JWT produced independent of the
     * endpoint or client used to request the access token.  The endpoint used,
     * v1.0 or v2.0, is chosen by the client and only impacts the version of
     * id_tokens. Resources need to explicitly configure
     * requestedAccessTokenVersion to indicate the supported access token
     * format.  Possible values for requestedAccessTokenVersion are 1, 2, or
     * null. If the value is null, this defaults to 1, which corresponds to the
     * v1.0 endpoint.  If signInAudience on the application is configured as
     * AzureADandPersonalMicrosoftAccount, the value for this property must be
     * 2
     */
    @JsonProperty(value = "requestedAccessTokenVersion")
    private Integer requestedAccessTokenVersion;

    /*
     * apiApplication
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the acceptMappedClaims property: When true, allows an application to use claims mapping without specifying a
     * custom signing key.
     *
     * @return the acceptMappedClaims value.
     */
    public Boolean acceptMappedClaims() {
        return this.acceptMappedClaims;
    }

    /**
     * Set the acceptMappedClaims property: When true, allows an application to use claims mapping without specifying a
     * custom signing key.
     *
     * @param acceptMappedClaims the acceptMappedClaims value to set.
     * @return the MicrosoftGraphApiApplication object itself.
     */
    public MicrosoftGraphApiApplication withAcceptMappedClaims(Boolean acceptMappedClaims) {
        this.acceptMappedClaims = acceptMappedClaims;
        return this;
    }

    /**
     * Get the knownClientApplications property: Used for bundling consent if you have a solution that contains two
     * parts: a client app and a custom web API app. If you set the appID of the client app to this value, the user only
     * consents once to the client app. Azure AD knows that consenting to the client means implicitly consenting to the
     * web API and automatically provisions service principals for both APIs at the same time. Both the client and the
     * web API app must be registered in the same tenant.
     *
     * @return the knownClientApplications value.
     */
    public List<UUID> knownClientApplications() {
        return this.knownClientApplications;
    }

    /**
     * Set the knownClientApplications property: Used for bundling consent if you have a solution that contains two
     * parts: a client app and a custom web API app. If you set the appID of the client app to this value, the user only
     * consents once to the client app. Azure AD knows that consenting to the client means implicitly consenting to the
     * web API and automatically provisions service principals for both APIs at the same time. Both the client and the
     * web API app must be registered in the same tenant.
     *
     * @param knownClientApplications the knownClientApplications value to set.
     * @return the MicrosoftGraphApiApplication object itself.
     */
    public MicrosoftGraphApiApplication withKnownClientApplications(List<UUID> knownClientApplications) {
        this.knownClientApplications = knownClientApplications;
        return this;
    }

    /**
     * Get the oauth2PermissionScopes property: The definition of the delegated permissions exposed by the web API
     * represented by this application registration. These delegated permissions may be requested by a client
     * application, and may be granted by users or administrators during consent. Delegated permissions are sometimes
     * referred to as OAuth 2.0 scopes.
     *
     * @return the oauth2PermissionScopes value.
     */
    public List<MicrosoftGraphPermissionScope> oauth2PermissionScopes() {
        return this.oauth2PermissionScopes;
    }

    /**
     * Set the oauth2PermissionScopes property: The definition of the delegated permissions exposed by the web API
     * represented by this application registration. These delegated permissions may be requested by a client
     * application, and may be granted by users or administrators during consent. Delegated permissions are sometimes
     * referred to as OAuth 2.0 scopes.
     *
     * @param oauth2PermissionScopes the oauth2PermissionScopes value to set.
     * @return the MicrosoftGraphApiApplication object itself.
     */
    public MicrosoftGraphApiApplication withOauth2PermissionScopes(
        List<MicrosoftGraphPermissionScope> oauth2PermissionScopes) {
        this.oauth2PermissionScopes = oauth2PermissionScopes;
        return this;
    }

    /**
     * Get the preAuthorizedApplications property: Lists the client applications that are pre-authorized with the
     * specified delegated permissions to access this application's APIs. Users are not required to consent to any
     * pre-authorized application (for the permissions specified). However, any additional permissions not listed in
     * preAuthorizedApplications (requested through incremental consent for example) will require user consent.
     *
     * @return the preAuthorizedApplications value.
     */
    public List<MicrosoftGraphPreAuthorizedApplication> preAuthorizedApplications() {
        return this.preAuthorizedApplications;
    }

    /**
     * Set the preAuthorizedApplications property: Lists the client applications that are pre-authorized with the
     * specified delegated permissions to access this application's APIs. Users are not required to consent to any
     * pre-authorized application (for the permissions specified). However, any additional permissions not listed in
     * preAuthorizedApplications (requested through incremental consent for example) will require user consent.
     *
     * @param preAuthorizedApplications the preAuthorizedApplications value to set.
     * @return the MicrosoftGraphApiApplication object itself.
     */
    public MicrosoftGraphApiApplication withPreAuthorizedApplications(
        List<MicrosoftGraphPreAuthorizedApplication> preAuthorizedApplications) {
        this.preAuthorizedApplications = preAuthorizedApplications;
        return this;
    }

    /**
     * Get the requestedAccessTokenVersion property: Specifies the access token version expected by this resource. This
     * changes the version and format of the JWT produced independent of the endpoint or client used to request the
     * access token. The endpoint used, v1.0 or v2.0, is chosen by the client and only impacts the version of id_tokens.
     * Resources need to explicitly configure requestedAccessTokenVersion to indicate the supported access token format.
     * Possible values for requestedAccessTokenVersion are 1, 2, or null. If the value is null, this defaults to 1,
     * which corresponds to the v1.0 endpoint. If signInAudience on the application is configured as
     * AzureADandPersonalMicrosoftAccount, the value for this property must be 2.
     *
     * @return the requestedAccessTokenVersion value.
     */
    public Integer requestedAccessTokenVersion() {
        return this.requestedAccessTokenVersion;
    }

    /**
     * Set the requestedAccessTokenVersion property: Specifies the access token version expected by this resource. This
     * changes the version and format of the JWT produced independent of the endpoint or client used to request the
     * access token. The endpoint used, v1.0 or v2.0, is chosen by the client and only impacts the version of id_tokens.
     * Resources need to explicitly configure requestedAccessTokenVersion to indicate the supported access token format.
     * Possible values for requestedAccessTokenVersion are 1, 2, or null. If the value is null, this defaults to 1,
     * which corresponds to the v1.0 endpoint. If signInAudience on the application is configured as
     * AzureADandPersonalMicrosoftAccount, the value for this property must be 2.
     *
     * @param requestedAccessTokenVersion the requestedAccessTokenVersion value to set.
     * @return the MicrosoftGraphApiApplication object itself.
     */
    public MicrosoftGraphApiApplication withRequestedAccessTokenVersion(Integer requestedAccessTokenVersion) {
        this.requestedAccessTokenVersion = requestedAccessTokenVersion;
        return this;
    }

    /**
     * Get the additionalProperties property: apiApplication.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: apiApplication.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphApiApplication object itself.
     */
    public MicrosoftGraphApiApplication withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (oauth2PermissionScopes() != null) {
            oauth2PermissionScopes().forEach(e -> e.validate());
        }
        if (preAuthorizedApplications() != null) {
            preAuthorizedApplications().forEach(e -> e.validate());
        }
    }
}