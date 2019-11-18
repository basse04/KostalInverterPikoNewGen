/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.openhab.binding.kostalinverterpikonewgen.internal.configuration;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link KostalInverterPikoNewGenConfigurationBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Örjan Backsell - Initial contribution
 */

public class KostalInverterPikoNewGenConfigurationBindingConstants {

    private static final String BINDING_ID = "kostalinverterpikonewgen";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_KOSTALINVERTERPIKONEWGEN = new ThingTypeUID(BINDING_ID,
            "kostalinverterpikonewgen");

    // List of all Channel IDs
    public static final String CHANNEL_BATTERYTYPE = "batteryType";
    public static final String CHANNEL_BATTERYUSAGECONSUMPTION = "batteryUsageConsumption";
    public static final String CHANNEL_BATTERYUSAGESTRATEGY = "batteryUsageStrategy";
    public static final String CHANNEL_SMARTBATTERYCONTROL = "smartBatteryControl";
    public static final String CHANNEL_SMARTBATTERYCONTROL_TEXT = "smartBatteryControl_Text";
    public static final String CHANNEL_BATTERYCHARGETIMEFROM = "batteryChargeTimeFrom";
    public static final String CHANNEL_BATTERYCHARGETIMETO = "batteryChargeTimeTo";
    public static final String CHANNEL_MAXDEPTHOFDISCHARGE = "maxDepthOfDischarge";
    public static final String CHANNEL_SHADOWMANAGEMENT = "shadowManagement";
    public static final String CHANNEL_EXTERNALMODULECONTROL = "externalModuleControl";
    public static final String CHANNEL_INVERTERNAME = "inverterName";
}
