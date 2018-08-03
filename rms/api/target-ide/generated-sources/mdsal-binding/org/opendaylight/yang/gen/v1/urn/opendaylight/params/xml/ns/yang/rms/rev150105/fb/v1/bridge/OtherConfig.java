package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>rms</b>
 * <pre>
 * container other_config {
 *     leaf floatingPointNumber {
 *         type boolean;
 *     }
 *     leaf int {
 *         type boolean;
 *     }
 *     leaf valueNode {
 *         type boolean;
 *     }
 *     leaf containerNode {
 *         type boolean;
 *     }
 *     leaf missingNode {
 *         type boolean;
 *     }
 *     leaf object {
 *         type boolean;
 *     }
 *     leaf pojo {
 *         type boolean;
 *     }
 *     leaf number {
 *         type boolean;
 *     }
 *     leaf integralNumber {
 *         type boolean;
 *     }
 *     leaf short {
 *         type boolean;
 *     }
 *     leaf long {
 *         type boolean;
 *     }
 *     leaf float {
 *         type boolean;
 *     }
 *     leaf double {
 *         type string;
 *     }
 *     leaf bigDecimal {
 *         type boolean;
 *     }
 *     leaf bigInteger {
 *         type boolean;
 *     }
 *     leaf textual {
 *         type boolean;
 *     }
 *     leaf boolean {
 *         type boolean;
 *     }
 *     leaf-list nodeType {
 *         type boolean;
 *     }
 *     leaf array {
 *         type boolean;
 *     }
 *     leaf null {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>rms/fb/v1/bridge/other_config</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfigBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfigBuilder
 *
 */
public interface OtherConfig
    extends
    ChildOf<Bridge>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:rms",
        "2015-01-05", "other_config").intern();

    /**
     * @return <code>java.lang.Boolean</code> <code>floatingPointNumber</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isFloatingPointNumber();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>int</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isInt();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>valueNode</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isValueNode();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>containerNode</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isContainerNode();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>missingNode</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMissingNode();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>object</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isObject();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>pojo</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPojo();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>number</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isNumber();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>integralNumber</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIntegralNumber();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>short</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isShort();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>long</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLong();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>float</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isFloat();
    
    /**
     * @return <code>java.lang.String</code> <code>double</code>, or <code>null</code> if not present
     */
    java.lang.String getDouble();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>bigDecimal</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isBigDecimal();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>bigInteger</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isBigInteger();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>textual</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isTextual();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>boolean</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isBoolean();
    
    /**
     * @return <code>java.util.List</code> <code>nodeType</code>, or <code>null</code> if not present
     */
    List<java.lang.Boolean> getNodeType();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>array</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isArray();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>null</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isNull();

}

