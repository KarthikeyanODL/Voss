package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>rms</b>
 * <pre>
 * module rms {
 *     yang-version 1;
 *     namespace "urn:opendaylight:params:xml:ns:yang:rms";
 *     prefix "rms";
 *
 *     revision 2015-01-05 {
 *         description "";
 *     }
 *
 *     container fb {
 *         list v1 {
 *             key "fb_name"
 *             leaf fb_name {
 *                 type string;
 *             }
 *             list bridge {
 *                 key "br_name"
 *                 leaf br_name {
 *                     type string;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf xuuid {
 *                     type string;
 *                 }
 *                 leaf datapath_type {
 *                     type string;
 *                 }
 *                 leaf datapath_id {
 *                     type string;
 *                 }
 *                 leaf disable-in-band {
 *                     type string;
 *                 }
 *                 leaf-list controllers {
 *                     type string;
 *                 }
 *                 leaf protocols {
 *                     type string;
 *                 }
 *                 leaf fail_mode {
 *                     type string;
 *                 }
 *                 container other_config {
 *                     leaf floatingPointNumber {
 *                         type boolean;
 *                     }
 *                     leaf int {
 *                         type boolean;
 *                     }
 *                     leaf valueNode {
 *                         type boolean;
 *                     }
 *                     leaf containerNode {
 *                         type boolean;
 *                     }
 *                     leaf missingNode {
 *                         type boolean;
 *                     }
 *                     leaf object {
 *                         type boolean;
 *                     }
 *                     leaf pojo {
 *                         type boolean;
 *                     }
 *                     leaf number {
 *                         type boolean;
 *                     }
 *                     leaf integralNumber {
 *                         type boolean;
 *                     }
 *                     leaf short {
 *                         type boolean;
 *                     }
 *                     leaf long {
 *                         type boolean;
 *                     }
 *                     leaf float {
 *                         type boolean;
 *                     }
 *                     leaf double {
 *                         type string;
 *                     }
 *                     leaf bigDecimal {
 *                         type boolean;
 *                     }
 *                     leaf bigInteger {
 *                         type boolean;
 *                     }
 *                     leaf textual {
 *                         type boolean;
 *                     }
 *                     leaf boolean {
 *                         type boolean;
 *                     }
 *                     leaf-list nodeType {
 *                         type boolean;
 *                     }
 *                     leaf array {
 *                         type boolean;
 *                     }
 *                     leaf null {
 *                         type boolean;
 *                     }
 *                 }
 *                 leaf lldp_enable {
 *                     type boolean;
 *                 }
 *                 leaf lldp-msg-tx-hold {
 *                     type string;
 *                 }
 *                 leaf lldp-msg-tx-interval {
 *                     type string;
 *                 }
 *                 leaf lldp-reinit-delay {
 *                     type string;
 *                 }
 *                 leaf lldp-tx-delay {
 *                     type string;
 *                 }
 *                 leaf-list _uuid1 {
 *                     type string;
 *                 }
 *             }
 *         }
 *     }
 *
 *     rpc hello {
 *         input {
 *             leaf in {
 *                 type string;
 *             }
 *         }
 *         
 *         output {
 *             leaf out {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface RmsData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.Fb</code> <code>fb</code>, or <code>null</code> if not present
     */
    Fb getFb();

}

