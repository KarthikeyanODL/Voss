package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.V1;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>rms</b>
 * <pre>
 * list bridge {
 *     key "br_name"
 *     leaf br_name {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf xuuid {
 *         type string;
 *     }
 *     leaf datapath_type {
 *         type string;
 *     }
 *     leaf datapath_id {
 *         type string;
 *     }
 *     leaf disable-in-band {
 *         type string;
 *     }
 *     leaf-list controllers {
 *         type string;
 *     }
 *     leaf protocols {
 *         type string;
 *     }
 *     leaf fail_mode {
 *         type string;
 *     }
 *     container other_config {
 *         leaf floatingPointNumber {
 *             type boolean;
 *         }
 *         leaf int {
 *             type boolean;
 *         }
 *         leaf valueNode {
 *             type boolean;
 *         }
 *         leaf containerNode {
 *             type boolean;
 *         }
 *         leaf missingNode {
 *             type boolean;
 *         }
 *         leaf object {
 *             type boolean;
 *         }
 *         leaf pojo {
 *             type boolean;
 *         }
 *         leaf number {
 *             type boolean;
 *         }
 *         leaf integralNumber {
 *             type boolean;
 *         }
 *         leaf short {
 *             type boolean;
 *         }
 *         leaf long {
 *             type boolean;
 *         }
 *         leaf float {
 *             type boolean;
 *         }
 *         leaf double {
 *             type string;
 *         }
 *         leaf bigDecimal {
 *             type boolean;
 *         }
 *         leaf bigInteger {
 *             type boolean;
 *         }
 *         leaf textual {
 *             type boolean;
 *         }
 *         leaf boolean {
 *             type boolean;
 *         }
 *         leaf-list nodeType {
 *             type boolean;
 *         }
 *         leaf array {
 *             type boolean;
 *         }
 *         leaf null {
 *             type boolean;
 *         }
 *     }
 *     leaf lldp_enable {
 *         type boolean;
 *     }
 *     leaf lldp-msg-tx-hold {
 *         type string;
 *     }
 *     leaf lldp-msg-tx-interval {
 *         type string;
 *     }
 *     leaf lldp-reinit-delay {
 *         type string;
 *     }
 *     leaf lldp-tx-delay {
 *         type string;
 *     }
 *     leaf-list _uuid1 {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>rms/fb/v1/bridge</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.BridgeBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.BridgeBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.BridgeKey
 *
 */
public interface Bridge
    extends
    ChildOf<V1>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>,
    Identifiable<BridgeKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:rms",
        "2015-01-05", "bridge").intern();

    /**
     * @return <code>java.lang.String</code> <code>brName</code>, or <code>null</code> if not present
     */
    java.lang.String getBrName();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * @return <code>java.lang.String</code> <code>xuuid</code>, or <code>null</code> if not present
     */
    java.lang.String getXuuid();
    
    /**
     * @return <code>java.lang.String</code> <code>datapathType</code>, or <code>null</code> if not present
     */
    java.lang.String getDatapathType();
    
    /**
     * @return <code>java.lang.String</code> <code>datapathId</code>, or <code>null</code> if not present
     */
    java.lang.String getDatapathId();
    
    /**
     * @return <code>java.lang.String</code> <code>disableInBand</code>, or <code>null</code> if not present
     */
    java.lang.String getDisableInBand();
    
    /**
     * @return <code>java.util.List</code> <code>controllers</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getControllers();
    
    /**
     * @return <code>java.lang.String</code> <code>protocols</code>, or <code>null</code> if not present
     */
    java.lang.String getProtocols();
    
    /**
     * @return <code>java.lang.String</code> <code>failMode</code>, or <code>null</code> if not present
     */
    java.lang.String getFailMode();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig</code> <code>otherConfig</code>, or <code>null</code> if not present
     */
    OtherConfig getOtherConfig();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>lldpEnable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLldpEnable();
    
    /**
     * @return <code>java.lang.String</code> <code>lldpMsgTxHold</code>, or <code>null</code> if not present
     */
    java.lang.String getLldpMsgTxHold();
    
    /**
     * @return <code>java.lang.String</code> <code>lldpMsgTxInterval</code>, or <code>null</code> if not present
     */
    java.lang.String getLldpMsgTxInterval();
    
    /**
     * @return <code>java.lang.String</code> <code>lldpReinitDelay</code>, or <code>null</code> if not present
     */
    java.lang.String getLldpReinitDelay();
    
    /**
     * @return <code>java.lang.String</code> <code>lldpTxDelay</code>, or <code>null</code> if not present
     */
    java.lang.String getLldpTxDelay();
    
    /**
     * @return <code>java.util.List</code> <code>uuid1</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getUuid1();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.BridgeKey</code> <code>key</code>, or <code>null</code> if not present
     */
    BridgeKey getKey();

}

