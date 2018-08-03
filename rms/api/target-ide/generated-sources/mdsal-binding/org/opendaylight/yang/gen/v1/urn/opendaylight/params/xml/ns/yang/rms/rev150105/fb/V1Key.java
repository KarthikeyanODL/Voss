package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class V1Key
 implements Identifier<V1> {
    private static final long serialVersionUID = -8546488065295538852L;
    private final java.lang.String _fbName;


    public V1Key(java.lang.String _fbName) {
    
    
        this._fbName = _fbName;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public V1Key(V1Key source) {
        this._fbName = source._fbName;
    }


    public java.lang.String getFbName() {
        return _fbName;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_fbName);
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
        V1Key other = (V1Key) obj;
        if (!Objects.equals(_fbName, other._fbName)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.V1Key.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_fbName != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_fbName=");
            builder.append(_fbName);
         }
        return builder.append(']').toString();
    }
}

