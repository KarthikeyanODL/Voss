/*
 * Copyright © 2017 Vz and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.rest.cli.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.rest.cli.api.RestCliCommands;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestCliCommandsImpl implements RestCliCommands {

    private static final Logger LOG = LoggerFactory.getLogger(RestCliCommandsImpl.class);
    private final DataBroker dataBroker;

    public RestCliCommandsImpl(final DataBroker db) {
        this.dataBroker = db;
        LOG.info("RestCliCommandImpl initialized");
    }

    @Override
    public Object testCommand(Object testArgument) {
        return "This is a test implementation of test-command";
    }
}
