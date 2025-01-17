// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** All Customer-managed key encryption properties for the resource. */
@Fluent
public final class CustomerManagedKeyEncryptionProperties {
    /*
     * All identity configuration for Customer-managed key settings defining
     * which identity should be used to auth to Key Vault.
     */
    @JsonProperty(value = "keyEncryptionKeyIdentity")
    private CustomerManagedKeyEncryptionPropertiesKeyEncryptionKeyIdentity keyEncryptionKeyIdentity;

    /*
     * key encryption key Url, with or without a version. Ex:
     * https://contosovault.vault.azure.net/keys/contosokek/562a4bb76b524a1493a6afe8e536ee78
     * or https://contosovault.vault.azure.net/keys/contosokek. Key auto
     * rotation is enabled by providing a key uri without version. Otherwise,
     * customer is responsible for rotating the key. The
     * keyEncryptionKeyIdentity(either SystemAssigned or UserAssigned) should
     * have permission to access this key url.
     */
    @JsonProperty(value = "keyEncryptionKeyUrl")
    private String keyEncryptionKeyUrl;

    /**
     * Get the keyEncryptionKeyIdentity property: All identity configuration for Customer-managed key settings defining
     * which identity should be used to auth to Key Vault.
     *
     * @return the keyEncryptionKeyIdentity value.
     */
    public CustomerManagedKeyEncryptionPropertiesKeyEncryptionKeyIdentity keyEncryptionKeyIdentity() {
        return this.keyEncryptionKeyIdentity;
    }

    /**
     * Set the keyEncryptionKeyIdentity property: All identity configuration for Customer-managed key settings defining
     * which identity should be used to auth to Key Vault.
     *
     * @param keyEncryptionKeyIdentity the keyEncryptionKeyIdentity value to set.
     * @return the CustomerManagedKeyEncryptionProperties object itself.
     */
    public CustomerManagedKeyEncryptionProperties withKeyEncryptionKeyIdentity(
        CustomerManagedKeyEncryptionPropertiesKeyEncryptionKeyIdentity keyEncryptionKeyIdentity) {
        this.keyEncryptionKeyIdentity = keyEncryptionKeyIdentity;
        return this;
    }

    /**
     * Get the keyEncryptionKeyUrl property: key encryption key Url, with or without a version. Ex:
     * https://contosovault.vault.azure.net/keys/contosokek/562a4bb76b524a1493a6afe8e536ee78 or
     * https://contosovault.vault.azure.net/keys/contosokek. Key auto rotation is enabled by providing a key uri without
     * version. Otherwise, customer is responsible for rotating the key. The keyEncryptionKeyIdentity(either
     * SystemAssigned or UserAssigned) should have permission to access this key url.
     *
     * @return the keyEncryptionKeyUrl value.
     */
    public String keyEncryptionKeyUrl() {
        return this.keyEncryptionKeyUrl;
    }

    /**
     * Set the keyEncryptionKeyUrl property: key encryption key Url, with or without a version. Ex:
     * https://contosovault.vault.azure.net/keys/contosokek/562a4bb76b524a1493a6afe8e536ee78 or
     * https://contosovault.vault.azure.net/keys/contosokek. Key auto rotation is enabled by providing a key uri without
     * version. Otherwise, customer is responsible for rotating the key. The keyEncryptionKeyIdentity(either
     * SystemAssigned or UserAssigned) should have permission to access this key url.
     *
     * @param keyEncryptionKeyUrl the keyEncryptionKeyUrl value to set.
     * @return the CustomerManagedKeyEncryptionProperties object itself.
     */
    public CustomerManagedKeyEncryptionProperties withKeyEncryptionKeyUrl(String keyEncryptionKeyUrl) {
        this.keyEncryptionKeyUrl = keyEncryptionKeyUrl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyEncryptionKeyIdentity() != null) {
            keyEncryptionKeyIdentity().validate();
        }
    }
}
