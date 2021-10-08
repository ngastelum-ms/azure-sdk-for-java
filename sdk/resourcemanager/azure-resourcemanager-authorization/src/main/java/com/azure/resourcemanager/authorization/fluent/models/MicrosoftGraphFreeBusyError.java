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
import java.util.Map;

/** freeBusyError. */
@Fluent
public final class MicrosoftGraphFreeBusyError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphFreeBusyError.class);

    /*
     * Describes the error.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The response code from querying for the availability of the user,
     * distribution list, or resource.
     */
    @JsonProperty(value = "responseCode")
    private String responseCode;

    /*
     * freeBusyError
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the message property: Describes the error.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Describes the error.
     *
     * @param message the message value to set.
     * @return the MicrosoftGraphFreeBusyError object itself.
     */
    public MicrosoftGraphFreeBusyError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the responseCode property: The response code from querying for the availability of the user, distribution
     * list, or resource.
     *
     * @return the responseCode value.
     */
    public String responseCode() {
        return this.responseCode;
    }

    /**
     * Set the responseCode property: The response code from querying for the availability of the user, distribution
     * list, or resource.
     *
     * @param responseCode the responseCode value to set.
     * @return the MicrosoftGraphFreeBusyError object itself.
     */
    public MicrosoftGraphFreeBusyError withResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * Get the additionalProperties property: freeBusyError.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: freeBusyError.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphFreeBusyError object itself.
     */
    public MicrosoftGraphFreeBusyError withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    }
}