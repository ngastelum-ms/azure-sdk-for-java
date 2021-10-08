// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphTaskStatus. */
public final class MicrosoftGraphTaskStatus extends ExpandableStringEnum<MicrosoftGraphTaskStatus> {
    /** Static value notStarted for MicrosoftGraphTaskStatus. */
    public static final MicrosoftGraphTaskStatus NOT_STARTED = fromString("notStarted");

    /** Static value inProgress for MicrosoftGraphTaskStatus. */
    public static final MicrosoftGraphTaskStatus IN_PROGRESS = fromString("inProgress");

    /** Static value completed for MicrosoftGraphTaskStatus. */
    public static final MicrosoftGraphTaskStatus COMPLETED = fromString("completed");

    /** Static value waitingOnOthers for MicrosoftGraphTaskStatus. */
    public static final MicrosoftGraphTaskStatus WAITING_ON_OTHERS = fromString("waitingOnOthers");

    /** Static value deferred for MicrosoftGraphTaskStatus. */
    public static final MicrosoftGraphTaskStatus DEFERRED = fromString("deferred");

    /**
     * Creates or finds a MicrosoftGraphTaskStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphTaskStatus.
     */
    @JsonCreator
    public static MicrosoftGraphTaskStatus fromString(String name) {
        return fromString(name, MicrosoftGraphTaskStatus.class);
    }

    /** @return known MicrosoftGraphTaskStatus values. */
    public static Collection<MicrosoftGraphTaskStatus> values() {
        return values(MicrosoftGraphTaskStatus.class);
    }
}