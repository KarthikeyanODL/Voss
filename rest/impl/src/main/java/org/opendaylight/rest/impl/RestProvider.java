/*
 * Copyright © 2017 Vz and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.rest.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker;
import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rest.rev170830.RestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestProvider {

    private static final Logger LOG = LoggerFactory.getLogger(RestProvider.class);

    private final DataBroker dataBroker;
    private final RpcProviderRegistry rpcProviderRegistry;

    private BindingAwareBroker.RpcRegistration<RestService> serviceRegistration;


    public RestProvider(final DataBroker dataBroker,RpcProviderRegistry rpcProviderRegistry) {
        this.dataBroker = dataBroker;
        this.rpcProviderRegistry=rpcProviderRegistry;
    }

    /**
     * Method called when the blueprint container is created.
     */
    public void init() {
        LOG.info("RestProvider Session Initiated");
        serviceRegistration = rpcProviderRegistry.addRpcImplementation(RestService.class, new RestImpl(dataBroker));
        Rest initializeObj = new Rest(rpcProviderRegistry);
    }

    /**
     * Method called when the blueprint container is destroyed.
     */
    public void close() {
        LOG.info("RestProvider Closed");
    }




}