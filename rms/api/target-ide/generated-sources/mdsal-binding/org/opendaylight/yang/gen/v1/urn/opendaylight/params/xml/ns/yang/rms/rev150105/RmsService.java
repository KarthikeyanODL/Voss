package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>rms</b>
 * <pre>
 * rpc hello {
 *     input {
 *         leaf in {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *         leaf out {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface RmsService
    extends
    RpcService
{




    Future<RpcResult<HelloOutput>> hello(HelloInput input);

}

