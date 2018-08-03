package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.V1;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>rms</b>
 * <pre>
 * container fb {
 *     list v1 {
 *         key "fb_name"
 *         leaf fb_name {
 *             type string;
 *         }
 *         list bridge {
 *             key "br_name"
 *             leaf br_name {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf xuuid {
 *                 type string;
 *             }
 *             leaf datapath_type {
 *                 type string;
 *             }
 *             leaf datapath_id {
 *                 type string;
 *             }
 *             leaf disable-in-band {
 *                 type string;
 *             }
 *             leaf-list controllers {
 *                 type string;
 *             }
 *             leaf protocols {
 *                 type string;
 *             }
 *             leaf fail_mode {
 *                 type string;
 *             }
 *             container other_config {
 *                 leaf floatingPointNumber {
 *                     type boolean;
 *                 }
 *                 leaf int {
 *                     type boolean;
 *                 }
 *                 leaf valueNode {
 *                     type boolean;
 *                 }
 *                 leaf containerNode {
 *                     type boolean;
 *                 }
 *                 leaf missingNode {
 *                     type boolean;
 *                 }
 *                 leaf object {
 *                     type boolean;
 *                 }
 *                 leaf pojo {
 *                     type boolean;
 *                 }
 *                 leaf number {
 *                     type boolean;
 *                 }
 *                 leaf integralNumber {
 *                     type boolean;
 *                 }
 *                 leaf short {
 *                     type boolean;
 *                 }
 *                 leaf long {
 *                     type boolean;
 *                 }
 *                 leaf float {
 *                     type boolean;
 *                 }
 *                 leaf double {
 *                     type string;
 *                 }
 *                 leaf bigDecimal {
 *                     type boolean;
 *                 }
 *                 leaf bigInteger {
 *                     type boolean;
 *                 }
 *                 leaf textual {
 *                     type boolean;
 *                 }
 *                 leaf boolean {
 *                     type boolean;
 *                 }
 *                 leaf-list nodeType {
 *                     type boolean;
 *                 }
 *                 leaf array {
 *                     type boolean;
 *                 }
 *                 leaf null {
 *                     type boolean;
 *                 }
 *             }
 *             leaf lldp_enable {
 *                 type boolean;
 *             }
 *             leaf lldp-msg-tx-hold {
 *                 type string;
 *             }
 *             leaf lldp-msg-tx-interval {
 *                 type string;
 *             }
 *             leaf lldp-reinit-delay {
 *                 type string;
 *             }
 *             leaf lldp-tx-delay {
 *                 type string;
 *             }
 *             leaf-list _uuid1 {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>rms/fb</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.FbBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.FbBuilder
 *
 */
public interface Fb
    extends
    ChildOf<RmsData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.Fb>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:rms",
        "2015-01-05", "fb").intern();

    /**
     * @return <code>java.util.List</code> <code>v1</code>, or <code>null</code> if not present
     */
    List<V1> getV1();

}

