/*
 * Copyright © 2017 verizon and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.rest.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rest.rev170830.HelloInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rest.rev170830.HelloOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rest.rev170830.HelloOutputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rest.rev170830.RestService;

import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Future;

public class RestImpl implements RestService {
	private static final Logger LOG = LoggerFactory.getLogger(RestImpl.class);
	private final DataBroker dataBroker;
	//public static final InstanceIdentifier<Fb> FB_IID = InstanceIdentifier.builder(Fb.class).build();


	 public RestImpl(final DataBroker dataBroker) {
	        this.dataBroker = dataBroker;
	       // ListenerRegistration<DataChangeListener> cupDataChangeListener=dataBroker.registerDataChangeListener(LogicalDatastoreType.CONFIGURATION, FB_IID,this,DataChangeScope.SUBTREE);
	      
	 }
	
	 /**
     * Method called when the blueprint container is created.
     */
    public void init() {
        LOG.info("RmsImpl Session Initiated");
    }

    /**
     * Method called when the blueprint container is destroyed.
     */
    public void close() {
        LOG.info("RmsImpl Closed");
    }




	@Override
	public Future<RpcResult<HelloOutput>> hello(HelloInput input) {
		HelloOutputBuilder outputBuilder=new HelloOutputBuilder();
		outputBuilder.setOut("this is from RPC");
		return RpcResultBuilder.success(outputBuilder.build()).buildFuture();

	}
}
