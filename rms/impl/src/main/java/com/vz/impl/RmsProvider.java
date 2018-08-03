/*
 * Copyright © 2017 verizon and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package com.vz.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.RmsService;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.RpcRegistration;


public class RmsProvider {

    private static final Logger LOG = LoggerFactory.getLogger(RmsProvider.class);

    private final DataBroker dataBroker;
    private final RpcProviderRegistry rpcProviderRegistry;
    
   private RpcRegistration<RmsService> serviceRegistration;

    public RmsProvider(final DataBroker dataBroker, RpcProviderRegistry rpcProviderRegistry) {
        this.dataBroker = dataBroker;
        this.rpcProviderRegistry=rpcProviderRegistry;
    }

    /**
     * Method called when the blueprint container is created.
     */
    public void init() {
        serviceRegistration = rpcProviderRegistry.addRpcImplementation(RmsService.class, new RmsImpl(dataBroker));
        Rest initializeObj = new Rest(rpcProviderRegistry);
        LOG.info("RmsProvider Session Initiated");
    }

    /**
     * Method called when the blueprint container is destroyed.
     */
    public void close() {
        LOG.info("RmsProvider Closed");
    }
}