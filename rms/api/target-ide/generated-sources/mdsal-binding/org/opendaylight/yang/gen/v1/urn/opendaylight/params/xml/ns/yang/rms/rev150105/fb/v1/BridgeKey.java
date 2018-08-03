package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class BridgeKey
 implements Identifier<Bridge> {
    private static final long serialVersionUID = 1916020205329037148L;
    private final java.lang.String _brName;


    public BridgeKey(java.lang.String _brName) {
    
    
        this._brName = _brName;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public BridgeKey(BridgeKey source) {
        this._brName = source._brName;
    }


    public java.lang.String getBrName() {
        return _brName;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_brName);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BridgeKey other = (BridgeKey) obj;
        if (!Objects.equals(_brName, other._brName)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.BridgeKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_brName != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_brName=");
            builder.append(_brName);
         }
        return builder.append(']').toString();
    }
}

