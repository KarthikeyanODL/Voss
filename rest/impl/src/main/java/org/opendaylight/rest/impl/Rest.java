package org.opendaylight.rest.impl;

import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rest.rev170830.HelloInputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rest.rev170830.HelloOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rest.rev170830.RestService;
import org.opendaylight.yangtools.yang.common.RpcResult;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Path("/booking")
public class Rest {


    private RpcProviderRegistry rpcProviderRegistry;


    public Rest(RpcProviderRegistry rpcProviderRegistry) {
        this.rpcProviderRegistry = rpcProviderRegistry;
    }
    public Rest(){}


    @Path("/get")
    @Produces("application/json")
    @GET
    public String getString(){

        return "You Got it";
    }



    @Path("/rpc")
    @Produces("application/json")
    @GET
    public String getResult(){


        RestService rmsService = rpcProviderRegistry.getRpcService(RestService.class);
        HelloInputBuilder inputBuilder=new HelloInputBuilder();
        inputBuilder.setIn("HI");

        Future<RpcResult<HelloOutput>> helloResult = rmsService.hello(inputBuilder.build());

        // Get the result from the RPC
        String result = null;
        try {
            result = helloResult.get().getResult().getOut().toString();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        if (result == null) {
            return "RPC call failed";
        }


        return "You Got it from RPC "+result;
    }
}
