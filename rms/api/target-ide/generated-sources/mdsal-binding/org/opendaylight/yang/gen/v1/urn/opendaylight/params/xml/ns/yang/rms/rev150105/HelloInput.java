package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>rms</b>
 * <pre>
 * container input {
 *     leaf in {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>rms/hello/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.HelloInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.HelloInputBuilder
 *
 */
public interface HelloInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.HelloInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:rms",
        "2015-01-05", "input").intern();

    /**
     * @return <code>java.lang.String</code> <code>in</code>, or <code>null</code> if not present
     */
    java.lang.String getIn();

}

