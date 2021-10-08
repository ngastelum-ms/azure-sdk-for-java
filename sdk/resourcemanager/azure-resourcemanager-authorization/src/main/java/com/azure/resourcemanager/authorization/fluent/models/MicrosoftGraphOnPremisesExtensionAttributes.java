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

/** onPremisesExtensionAttributes. */
@Fluent
public final class MicrosoftGraphOnPremisesExtensionAttributes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphOnPremisesExtensionAttributes.class);

    /*
     * First customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute1")
    private String extensionAttribute1;

    /*
     * Tenth customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute10")
    private String extensionAttribute10;

    /*
     * Eleventh customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute11")
    private String extensionAttribute11;

    /*
     * Twelfth customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute12")
    private String extensionAttribute12;

    /*
     * Thirteenth customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute13")
    private String extensionAttribute13;

    /*
     * Fourteenth customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute14")
    private String extensionAttribute14;

    /*
     * Fifteenth customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute15")
    private String extensionAttribute15;

    /*
     * Second customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute2")
    private String extensionAttribute2;

    /*
     * Third customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute3")
    private String extensionAttribute3;

    /*
     * Fourth customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute4")
    private String extensionAttribute4;

    /*
     * Fifth customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute5")
    private String extensionAttribute5;

    /*
     * Sixth customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute6")
    private String extensionAttribute6;

    /*
     * Seventh customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute7")
    private String extensionAttribute7;

    /*
     * Eighth customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute8")
    private String extensionAttribute8;

    /*
     * Ninth customizable extension attribute.
     */
    @JsonProperty(value = "extensionAttribute9")
    private String extensionAttribute9;

    /*
     * onPremisesExtensionAttributes
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the extensionAttribute1 property: First customizable extension attribute.
     *
     * @return the extensionAttribute1 value.
     */
    public String extensionAttribute1() {
        return this.extensionAttribute1;
    }

    /**
     * Set the extensionAttribute1 property: First customizable extension attribute.
     *
     * @param extensionAttribute1 the extensionAttribute1 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute1(String extensionAttribute1) {
        this.extensionAttribute1 = extensionAttribute1;
        return this;
    }

    /**
     * Get the extensionAttribute10 property: Tenth customizable extension attribute.
     *
     * @return the extensionAttribute10 value.
     */
    public String extensionAttribute10() {
        return this.extensionAttribute10;
    }

    /**
     * Set the extensionAttribute10 property: Tenth customizable extension attribute.
     *
     * @param extensionAttribute10 the extensionAttribute10 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute10(String extensionAttribute10) {
        this.extensionAttribute10 = extensionAttribute10;
        return this;
    }

    /**
     * Get the extensionAttribute11 property: Eleventh customizable extension attribute.
     *
     * @return the extensionAttribute11 value.
     */
    public String extensionAttribute11() {
        return this.extensionAttribute11;
    }

    /**
     * Set the extensionAttribute11 property: Eleventh customizable extension attribute.
     *
     * @param extensionAttribute11 the extensionAttribute11 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute11(String extensionAttribute11) {
        this.extensionAttribute11 = extensionAttribute11;
        return this;
    }

    /**
     * Get the extensionAttribute12 property: Twelfth customizable extension attribute.
     *
     * @return the extensionAttribute12 value.
     */
    public String extensionAttribute12() {
        return this.extensionAttribute12;
    }

    /**
     * Set the extensionAttribute12 property: Twelfth customizable extension attribute.
     *
     * @param extensionAttribute12 the extensionAttribute12 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute12(String extensionAttribute12) {
        this.extensionAttribute12 = extensionAttribute12;
        return this;
    }

    /**
     * Get the extensionAttribute13 property: Thirteenth customizable extension attribute.
     *
     * @return the extensionAttribute13 value.
     */
    public String extensionAttribute13() {
        return this.extensionAttribute13;
    }

    /**
     * Set the extensionAttribute13 property: Thirteenth customizable extension attribute.
     *
     * @param extensionAttribute13 the extensionAttribute13 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute13(String extensionAttribute13) {
        this.extensionAttribute13 = extensionAttribute13;
        return this;
    }

    /**
     * Get the extensionAttribute14 property: Fourteenth customizable extension attribute.
     *
     * @return the extensionAttribute14 value.
     */
    public String extensionAttribute14() {
        return this.extensionAttribute14;
    }

    /**
     * Set the extensionAttribute14 property: Fourteenth customizable extension attribute.
     *
     * @param extensionAttribute14 the extensionAttribute14 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute14(String extensionAttribute14) {
        this.extensionAttribute14 = extensionAttribute14;
        return this;
    }

    /**
     * Get the extensionAttribute15 property: Fifteenth customizable extension attribute.
     *
     * @return the extensionAttribute15 value.
     */
    public String extensionAttribute15() {
        return this.extensionAttribute15;
    }

    /**
     * Set the extensionAttribute15 property: Fifteenth customizable extension attribute.
     *
     * @param extensionAttribute15 the extensionAttribute15 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute15(String extensionAttribute15) {
        this.extensionAttribute15 = extensionAttribute15;
        return this;
    }

    /**
     * Get the extensionAttribute2 property: Second customizable extension attribute.
     *
     * @return the extensionAttribute2 value.
     */
    public String extensionAttribute2() {
        return this.extensionAttribute2;
    }

    /**
     * Set the extensionAttribute2 property: Second customizable extension attribute.
     *
     * @param extensionAttribute2 the extensionAttribute2 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute2(String extensionAttribute2) {
        this.extensionAttribute2 = extensionAttribute2;
        return this;
    }

    /**
     * Get the extensionAttribute3 property: Third customizable extension attribute.
     *
     * @return the extensionAttribute3 value.
     */
    public String extensionAttribute3() {
        return this.extensionAttribute3;
    }

    /**
     * Set the extensionAttribute3 property: Third customizable extension attribute.
     *
     * @param extensionAttribute3 the extensionAttribute3 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute3(String extensionAttribute3) {
        this.extensionAttribute3 = extensionAttribute3;
        return this;
    }

    /**
     * Get the extensionAttribute4 property: Fourth customizable extension attribute.
     *
     * @return the extensionAttribute4 value.
     */
    public String extensionAttribute4() {
        return this.extensionAttribute4;
    }

    /**
     * Set the extensionAttribute4 property: Fourth customizable extension attribute.
     *
     * @param extensionAttribute4 the extensionAttribute4 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute4(String extensionAttribute4) {
        this.extensionAttribute4 = extensionAttribute4;
        return this;
    }

    /**
     * Get the extensionAttribute5 property: Fifth customizable extension attribute.
     *
     * @return the extensionAttribute5 value.
     */
    public String extensionAttribute5() {
        return this.extensionAttribute5;
    }

    /**
     * Set the extensionAttribute5 property: Fifth customizable extension attribute.
     *
     * @param extensionAttribute5 the extensionAttribute5 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute5(String extensionAttribute5) {
        this.extensionAttribute5 = extensionAttribute5;
        return this;
    }

    /**
     * Get the extensionAttribute6 property: Sixth customizable extension attribute.
     *
     * @return the extensionAttribute6 value.
     */
    public String extensionAttribute6() {
        return this.extensionAttribute6;
    }

    /**
     * Set the extensionAttribute6 property: Sixth customizable extension attribute.
     *
     * @param extensionAttribute6 the extensionAttribute6 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute6(String extensionAttribute6) {
        this.extensionAttribute6 = extensionAttribute6;
        return this;
    }

    /**
     * Get the extensionAttribute7 property: Seventh customizable extension attribute.
     *
     * @return the extensionAttribute7 value.
     */
    public String extensionAttribute7() {
        return this.extensionAttribute7;
    }

    /**
     * Set the extensionAttribute7 property: Seventh customizable extension attribute.
     *
     * @param extensionAttribute7 the extensionAttribute7 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute7(String extensionAttribute7) {
        this.extensionAttribute7 = extensionAttribute7;
        return this;
    }

    /**
     * Get the extensionAttribute8 property: Eighth customizable extension attribute.
     *
     * @return the extensionAttribute8 value.
     */
    public String extensionAttribute8() {
        return this.extensionAttribute8;
    }

    /**
     * Set the extensionAttribute8 property: Eighth customizable extension attribute.
     *
     * @param extensionAttribute8 the extensionAttribute8 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute8(String extensionAttribute8) {
        this.extensionAttribute8 = extensionAttribute8;
        return this;
    }

    /**
     * Get the extensionAttribute9 property: Ninth customizable extension attribute.
     *
     * @return the extensionAttribute9 value.
     */
    public String extensionAttribute9() {
        return this.extensionAttribute9;
    }

    /**
     * Set the extensionAttribute9 property: Ninth customizable extension attribute.
     *
     * @param extensionAttribute9 the extensionAttribute9 value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withExtensionAttribute9(String extensionAttribute9) {
        this.extensionAttribute9 = extensionAttribute9;
        return this;
    }

    /**
     * Get the additionalProperties property: onPremisesExtensionAttributes.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: onPremisesExtensionAttributes.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOnPremisesExtensionAttributes object itself.
     */
    public MicrosoftGraphOnPremisesExtensionAttributes withAdditionalProperties(
        Map<String, Object> additionalProperties) {
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