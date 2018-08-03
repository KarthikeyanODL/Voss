package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig
 *
 */
public class OtherConfigBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig> {

    private java.lang.String _double;
    private List<java.lang.Boolean> _nodeType;
    private java.lang.Boolean _array;
    private java.lang.Boolean _bigDecimal;
    private java.lang.Boolean _bigInteger;
    private java.lang.Boolean _boolean;
    private java.lang.Boolean _containerNode;
    private java.lang.Boolean _float;
    private java.lang.Boolean _floatingPointNumber;
    private java.lang.Boolean _int;
    private java.lang.Boolean _integralNumber;
    private java.lang.Boolean _long;
    private java.lang.Boolean _missingNode;
    private java.lang.Boolean _null;
    private java.lang.Boolean _number;
    private java.lang.Boolean _object;
    private java.lang.Boolean _pojo;
    private java.lang.Boolean _short;
    private java.lang.Boolean _textual;
    private java.lang.Boolean _valueNode;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>> augmentation = Collections.emptyMap();

    public OtherConfigBuilder() {
    }

    public OtherConfigBuilder(OtherConfig base) {
        this._double = base.getDouble();
        this._nodeType = base.getNodeType();
        this._array = base.isArray();
        this._bigDecimal = base.isBigDecimal();
        this._bigInteger = base.isBigInteger();
        this._boolean = base.isBoolean();
        this._containerNode = base.isContainerNode();
        this._float = base.isFloat();
        this._floatingPointNumber = base.isFloatingPointNumber();
        this._int = base.isInt();
        this._integralNumber = base.isIntegralNumber();
        this._long = base.isLong();
        this._missingNode = base.isMissingNode();
        this._null = base.isNull();
        this._number = base.isNumber();
        this._object = base.isObject();
        this._pojo = base.isPojo();
        this._short = base.isShort();
        this._textual = base.isTextual();
        this._valueNode = base.isValueNode();
        if (base instanceof OtherConfigImpl) {
            OtherConfigImpl impl = (OtherConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getDouble() {
        return _double;
    }
    
    public List<java.lang.Boolean> getNodeType() {
        return _nodeType;
    }
    
    public java.lang.Boolean isArray() {
        return _array;
    }
    
    public java.lang.Boolean isBigDecimal() {
        return _bigDecimal;
    }
    
    public java.lang.Boolean isBigInteger() {
        return _bigInteger;
    }
    
    public java.lang.Boolean isBoolean() {
        return _boolean;
    }
    
    public java.lang.Boolean isContainerNode() {
        return _containerNode;
    }
    
    public java.lang.Boolean isFloat() {
        return _float;
    }
    
    public java.lang.Boolean isFloatingPointNumber() {
        return _floatingPointNumber;
    }
    
    public java.lang.Boolean isInt() {
        return _int;
    }
    
    public java.lang.Boolean isIntegralNumber() {
        return _integralNumber;
    }
    
    public java.lang.Boolean isLong() {
        return _long;
    }
    
    public java.lang.Boolean isMissingNode() {
        return _missingNode;
    }
    
    public java.lang.Boolean isNull() {
        return _null;
    }
    
    public java.lang.Boolean isNumber() {
        return _number;
    }
    
    public java.lang.Boolean isObject() {
        return _object;
    }
    
    public java.lang.Boolean isPojo() {
        return _pojo;
    }
    
    public java.lang.Boolean isShort() {
        return _short;
    }
    
    public java.lang.Boolean isTextual() {
        return _textual;
    }
    
    public java.lang.Boolean isValueNode() {
        return _valueNode;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public OtherConfigBuilder setDouble(final java.lang.String value) {
        this._double = value;
        return this;
    }
    
     
    public OtherConfigBuilder setNodeType(final List<java.lang.Boolean> value) {
        this._nodeType = value;
        return this;
    }
    
     
    public OtherConfigBuilder setArray(final java.lang.Boolean value) {
        this._array = value;
        return this;
    }
    
     
    public OtherConfigBuilder setBigDecimal(final java.lang.Boolean value) {
        this._bigDecimal = value;
        return this;
    }
    
     
    public OtherConfigBuilder setBigInteger(final java.lang.Boolean value) {
        this._bigInteger = value;
        return this;
    }
    
     
    public OtherConfigBuilder setBoolean(final java.lang.Boolean value) {
        this._boolean = value;
        return this;
    }
    
     
    public OtherConfigBuilder setContainerNode(final java.lang.Boolean value) {
        this._containerNode = value;
        return this;
    }
    
     
    public OtherConfigBuilder setFloat(final java.lang.Boolean value) {
        this._float = value;
        return this;
    }
    
     
    public OtherConfigBuilder setFloatingPointNumber(final java.lang.Boolean value) {
        this._floatingPointNumber = value;
        return this;
    }
    
     
    public OtherConfigBuilder setInt(final java.lang.Boolean value) {
        this._int = value;
        return this;
    }
    
     
    public OtherConfigBuilder setIntegralNumber(final java.lang.Boolean value) {
        this._integralNumber = value;
        return this;
    }
    
     
    public OtherConfigBuilder setLong(final java.lang.Boolean value) {
        this._long = value;
        return this;
    }
    
     
    public OtherConfigBuilder setMissingNode(final java.lang.Boolean value) {
        this._missingNode = value;
        return this;
    }
    
     
    public OtherConfigBuilder setNull(final java.lang.Boolean value) {
        this._null = value;
        return this;
    }
    
     
    public OtherConfigBuilder setNumber(final java.lang.Boolean value) {
        this._number = value;
        return this;
    }
    
     
    public OtherConfigBuilder setObject(final java.lang.Boolean value) {
        this._object = value;
        return this;
    }
    
     
    public OtherConfigBuilder setPojo(final java.lang.Boolean value) {
        this._pojo = value;
        return this;
    }
    
     
    public OtherConfigBuilder setShort(final java.lang.Boolean value) {
        this._short = value;
        return this;
    }
    
     
    public OtherConfigBuilder setTextual(final java.lang.Boolean value) {
        this._textual = value;
        return this;
    }
    
     
    public OtherConfigBuilder setValueNode(final java.lang.Boolean value) {
        this._valueNode = value;
        return this;
    }
    
    public OtherConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public OtherConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public OtherConfig build() {
        return new OtherConfigImpl(this);
    }

    private static final class OtherConfigImpl implements OtherConfig {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig.class;
        }

        private final java.lang.String _double;
        private final List<java.lang.Boolean> _nodeType;
        private final java.lang.Boolean _array;
        private final java.lang.Boolean _bigDecimal;
        private final java.lang.Boolean _bigInteger;
        private final java.lang.Boolean _boolean;
        private final java.lang.Boolean _containerNode;
        private final java.lang.Boolean _float;
        private final java.lang.Boolean _floatingPointNumber;
        private final java.lang.Boolean _int;
        private final java.lang.Boolean _integralNumber;
        private final java.lang.Boolean _long;
        private final java.lang.Boolean _missingNode;
        private final java.lang.Boolean _null;
        private final java.lang.Boolean _number;
        private final java.lang.Boolean _object;
        private final java.lang.Boolean _pojo;
        private final java.lang.Boolean _short;
        private final java.lang.Boolean _textual;
        private final java.lang.Boolean _valueNode;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>> augmentation = Collections.emptyMap();

        private OtherConfigImpl(OtherConfigBuilder base) {
            this._double = base.getDouble();
            this._nodeType = base.getNodeType();
            this._array = base.isArray();
            this._bigDecimal = base.isBigDecimal();
            this._bigInteger = base.isBigInteger();
            this._boolean = base.isBoolean();
            this._containerNode = base.isContainerNode();
            this._float = base.isFloat();
            this._floatingPointNumber = base.isFloatingPointNumber();
            this._int = base.isInt();
            this._integralNumber = base.isIntegralNumber();
            this._long = base.isLong();
            this._missingNode = base.isMissingNode();
            this._null = base.isNull();
            this._number = base.isNumber();
            this._object = base.isObject();
            this._pojo = base.isPojo();
            this._short = base.isShort();
            this._textual = base.isTextual();
            this._valueNode = base.isValueNode();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDouble() {
            return _double;
        }
        
        @Override
        public List<java.lang.Boolean> getNodeType() {
            return _nodeType;
        }
        
        @Override
        public java.lang.Boolean isArray() {
            return _array;
        }
        
        @Override
        public java.lang.Boolean isBigDecimal() {
            return _bigDecimal;
        }
        
        @Override
        public java.lang.Boolean isBigInteger() {
            return _bigInteger;
        }
        
        @Override
        public java.lang.Boolean isBoolean() {
            return _boolean;
        }
        
        @Override
        public java.lang.Boolean isContainerNode() {
            return _containerNode;
        }
        
        @Override
        public java.lang.Boolean isFloat() {
            return _float;
        }
        
        @Override
        public java.lang.Boolean isFloatingPointNumber() {
            return _floatingPointNumber;
        }
        
        @Override
        public java.lang.Boolean isInt() {
            return _int;
        }
        
        @Override
        public java.lang.Boolean isIntegralNumber() {
            return _integralNumber;
        }
        
        @Override
        public java.lang.Boolean isLong() {
            return _long;
        }
        
        @Override
        public java.lang.Boolean isMissingNode() {
            return _missingNode;
        }
        
        @Override
        public java.lang.Boolean isNull() {
            return _null;
        }
        
        @Override
        public java.lang.Boolean isNumber() {
            return _number;
        }
        
        @Override
        public java.lang.Boolean isObject() {
            return _object;
        }
        
        @Override
        public java.lang.Boolean isPojo() {
            return _pojo;
        }
        
        @Override
        public java.lang.Boolean isShort() {
            return _short;
        }
        
        @Override
        public java.lang.Boolean isTextual() {
            return _textual;
        }
        
        @Override
        public java.lang.Boolean isValueNode() {
            return _valueNode;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_double);
            result = prime * result + Objects.hashCode(_nodeType);
            result = prime * result + Objects.hashCode(_array);
            result = prime * result + Objects.hashCode(_bigDecimal);
            result = prime * result + Objects.hashCode(_bigInteger);
            result = prime * result + Objects.hashCode(_boolean);
            result = prime * result + Objects.hashCode(_containerNode);
            result = prime * result + Objects.hashCode(_float);
            result = prime * result + Objects.hashCode(_floatingPointNumber);
            result = prime * result + Objects.hashCode(_int);
            result = prime * result + Objects.hashCode(_integralNumber);
            result = prime * result + Objects.hashCode(_long);
            result = prime * result + Objects.hashCode(_missingNode);
            result = prime * result + Objects.hashCode(_null);
            result = prime * result + Objects.hashCode(_number);
            result = prime * result + Objects.hashCode(_object);
            result = prime * result + Objects.hashCode(_pojo);
            result = prime * result + Objects.hashCode(_short);
            result = prime * result + Objects.hashCode(_textual);
            result = prime * result + Objects.hashCode(_valueNode);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig)obj;
            if (!Objects.equals(_double, other.getDouble())) {
                return false;
            }
            if (!Objects.equals(_nodeType, other.getNodeType())) {
                return false;
            }
            if (!Objects.equals(_array, other.isArray())) {
                return false;
            }
            if (!Objects.equals(_bigDecimal, other.isBigDecimal())) {
                return false;
            }
            if (!Objects.equals(_bigInteger, other.isBigInteger())) {
                return false;
            }
            if (!Objects.equals(_boolean, other.isBoolean())) {
                return false;
            }
            if (!Objects.equals(_containerNode, other.isContainerNode())) {
                return false;
            }
            if (!Objects.equals(_float, other.isFloat())) {
                return false;
            }
            if (!Objects.equals(_floatingPointNumber, other.isFloatingPointNumber())) {
                return false;
            }
            if (!Objects.equals(_int, other.isInt())) {
                return false;
            }
            if (!Objects.equals(_integralNumber, other.isIntegralNumber())) {
                return false;
            }
            if (!Objects.equals(_long, other.isLong())) {
                return false;
            }
            if (!Objects.equals(_missingNode, other.isMissingNode())) {
                return false;
            }
            if (!Objects.equals(_null, other.isNull())) {
                return false;
            }
            if (!Objects.equals(_number, other.isNumber())) {
                return false;
            }
            if (!Objects.equals(_object, other.isObject())) {
                return false;
            }
            if (!Objects.equals(_pojo, other.isPojo())) {
                return false;
            }
            if (!Objects.equals(_short, other.isShort())) {
                return false;
            }
            if (!Objects.equals(_textual, other.isTextual())) {
                return false;
            }
            if (!Objects.equals(_valueNode, other.isValueNode())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OtherConfigImpl otherImpl = (OtherConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "OtherConfig [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_double != null) {
                builder.append("_double=");
                builder.append(_double);
                builder.append(", ");
            }
            if (_nodeType != null) {
                builder.append("_nodeType=");
                builder.append(_nodeType);
                builder.append(", ");
            }
            if (_array != null) {
                builder.append("_array=");
                builder.append(_array);
                builder.append(", ");
            }
            if (_bigDecimal != null) {
                builder.append("_bigDecimal=");
                builder.append(_bigDecimal);
                builder.append(", ");
            }
            if (_bigInteger != null) {
                builder.append("_bigInteger=");
                builder.append(_bigInteger);
                builder.append(", ");
            }
            if (_boolean != null) {
                builder.append("_boolean=");
                builder.append(_boolean);
                builder.append(", ");
            }
            if (_containerNode != null) {
                builder.append("_containerNode=");
                builder.append(_containerNode);
                builder.append(", ");
            }
            if (_float != null) {
                builder.append("_float=");
                builder.append(_float);
                builder.append(", ");
            }
            if (_floatingPointNumber != null) {
                builder.append("_floatingPointNumber=");
                builder.append(_floatingPointNumber);
                builder.append(", ");
            }
            if (_int != null) {
                builder.append("_int=");
                builder.append(_int);
                builder.append(", ");
            }
            if (_integralNumber != null) {
                builder.append("_integralNumber=");
                builder.append(_integralNumber);
                builder.append(", ");
            }
            if (_long != null) {
                builder.append("_long=");
                builder.append(_long);
                builder.append(", ");
            }
            if (_missingNode != null) {
                builder.append("_missingNode=");
                builder.append(_missingNode);
                builder.append(", ");
            }
            if (_null != null) {
                builder.append("_null=");
                builder.append(_null);
                builder.append(", ");
            }
            if (_number != null) {
                builder.append("_number=");
                builder.append(_number);
                builder.append(", ");
            }
            if (_object != null) {
                builder.append("_object=");
                builder.append(_object);
                builder.append(", ");
            }
            if (_pojo != null) {
                builder.append("_pojo=");
                builder.append(_pojo);
                builder.append(", ");
            }
            if (_short != null) {
                builder.append("_short=");
                builder.append(_short);
                builder.append(", ");
            }
            if (_textual != null) {
                builder.append("_textual=");
                builder.append(_textual);
                builder.append(", ");
            }
            if (_valueNode != null) {
                builder.append("_valueNode=");
                builder.append(_valueNode);
            }
            final int builderLength = builder.length();
            final int builderAdditionalLength = builder.substring(name.length(), builderLength).length();
            if (builderAdditionalLength > 2 && !builder.substring(builderLength - 2, builderLength).equals(", ")) {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
