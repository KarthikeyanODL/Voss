/*
 * Copyright © 2017 verizon and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package com.vz.impl;

import java.util.Collection;
import java.util.concurrent.Future;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.DataChangeListener;
import org.opendaylight.controller.md.sal.binding.api.DataTreeChangeListener;
import org.opendaylight.controller.md.sal.binding.api.DataTreeModification;
import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.Fb;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.HelloInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.HelloOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.HelloOutputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.RmsService;
import org.opendaylight.controller.md.sal.common.api.data.AsyncDataBroker.DataChangeScope;
import org.opendaylight.controller.md.sal.common.api.data.AsyncDataChangeEvent;
import org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.common.RpcResult;
import  org.opendaylight.yangtools.yang.common.RpcResultBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RmsImpl implements RmsService,DataChangeListener {
	private static final Logger LOG = LoggerFactory.getLogger(RmsImpl.class);
	private final DataBroker dataBroker;
	public static final InstanceIdentifier<Fb> FB_IID = InstanceIdentifier.builder(Fb.class).build();
	
	 
	 public RmsImpl(final DataBroker dataBroker) {
	        this.dataBroker = dataBroker;
	        ListenerRegistration<DataChangeListener> cupDataChangeListener=dataBroker.registerDataChangeListener(LogicalDatastoreType.CONFIGURATION, FB_IID,this,DataChangeScope.SUBTREE);
	      
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
		// TODO Auto-generated method stub
		HelloOutputBuilder outputBuilder=new HelloOutputBuilder();
		outputBuilder.setOut("this is from RPC");
		return RpcResultBuilder.success(outputBuilder.build()).buildFuture();
	}
	
	 
	

	@Override
	public void onDataChanged(AsyncDataChangeEvent<InstanceIdentifier<?>, DataObject> change) {
		// TODO Auto-generated method stub
		LOG.info("Data Tree changed******Create"+change.getCreatedData());
		LOG.info("Data Tree changed******Update"+change.getUpdatedData());
		
	}

}
