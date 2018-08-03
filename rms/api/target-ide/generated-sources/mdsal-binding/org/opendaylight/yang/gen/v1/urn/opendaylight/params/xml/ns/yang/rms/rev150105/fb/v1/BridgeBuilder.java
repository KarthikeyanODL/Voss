package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.bridge.OtherConfig;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge
 *
 */
public class BridgeBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge> {

    private java.lang.String _brName;
    private List<java.lang.String> _controllers;
    private java.lang.String _datapathId;
    private java.lang.String _datapathType;
    private java.lang.String _disableInBand;
    private java.lang.String _failMode;
    private BridgeKey _key;
    private java.lang.String _lldpMsgTxHold;
    private java.lang.String _lldpMsgTxInterval;
    private java.lang.String _lldpReinitDelay;
    private java.lang.String _lldpTxDelay;
    private java.lang.String _name;
    private OtherConfig _otherConfig;
    private java.lang.String _protocols;
    private List<java.lang.String> _uuid1;
    private java.lang.String _xuuid;
    private java.lang.Boolean _lldpEnable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>> augmentation = Collections.emptyMap();

    public BridgeBuilder() {
    }

    public BridgeBuilder(Bridge base) {
        if (base.getKey() == null) {
            this._key = new BridgeKey(
                base.getBrName()
            );
            this._brName = base.getBrName();
        } else {
            this._key = base.getKey();
            this._brName = _key.getBrName();
        }
        this._controllers = base.getControllers();
        this._datapathId = base.getDatapathId();
        this._datapathType = base.getDatapathType();
        this._disableInBand = base.getDisableInBand();
        this._failMode = base.getFailMode();
        this._lldpMsgTxHold = base.getLldpMsgTxHold();
        this._lldpMsgTxInterval = base.getLldpMsgTxInterval();
        this._lldpReinitDelay = base.getLldpReinitDelay();
        this._lldpTxDelay = base.getLldpTxDelay();
        this._name = base.getName();
        this._otherConfig = base.getOtherConfig();
        this._protocols = base.getProtocols();
        this._uuid1 = base.getUuid1();
        this._xuuid = base.getXuuid();
        this._lldpEnable = base.isLldpEnable();
        if (base instanceof BridgeImpl) {
            BridgeImpl impl = (BridgeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getBrName() {
        return _brName;
    }
    
    public List<java.lang.String> getControllers() {
        return _controllers;
    }
    
    public java.lang.String getDatapathId() {
        return _datapathId;
    }
    
    public java.lang.String getDatapathType() {
        return _datapathType;
    }
    
    public java.lang.String getDisableInBand() {
        return _disableInBand;
    }
    
    public java.lang.String getFailMode() {
        return _failMode;
    }
    
    public BridgeKey getKey() {
        return _key;
    }
    
    public java.lang.String getLldpMsgTxHold() {
        return _lldpMsgTxHold;
    }
    
    public java.lang.String getLldpMsgTxInterval() {
        return _lldpMsgTxInterval;
    }
    
    public java.lang.String getLldpReinitDelay() {
        return _lldpReinitDelay;
    }
    
    public java.lang.String getLldpTxDelay() {
        return _lldpTxDelay;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public OtherConfig getOtherConfig() {
        return _otherConfig;
    }
    
    public java.lang.String getProtocols() {
        return _protocols;
    }
    
    public List<java.lang.String> getUuid1() {
        return _uuid1;
    }
    
    public java.lang.String getXuuid() {
        return _xuuid;
    }
    
    public java.lang.Boolean isLldpEnable() {
        return _lldpEnable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public BridgeBuilder setBrName(final java.lang.String value) {
        this._brName = value;
        return this;
    }
    
     
    public BridgeBuilder setControllers(final List<java.lang.String> value) {
        this._controllers = value;
        return this;
    }
    
     
    public BridgeBuilder setDatapathId(final java.lang.String value) {
        this._datapathId = value;
        return this;
    }
    
     
    public BridgeBuilder setDatapathType(final java.lang.String value) {
        this._datapathType = value;
        return this;
    }
    
     
    public BridgeBuilder setDisableInBand(final java.lang.String value) {
        this._disableInBand = value;
        return this;
    }
    
     
    public BridgeBuilder setFailMode(final java.lang.String value) {
        this._failMode = value;
        return this;
    }
    
     
    public BridgeBuilder setKey(final BridgeKey value) {
        this._key = value;
        return this;
    }
    
     
    public BridgeBuilder setLldpMsgTxHold(final java.lang.String value) {
        this._lldpMsgTxHold = value;
        return this;
    }
    
     
    public BridgeBuilder setLldpMsgTxInterval(final java.lang.String value) {
        this._lldpMsgTxInterval = value;
        return this;
    }
    
     
    public BridgeBuilder setLldpReinitDelay(final java.lang.String value) {
        this._lldpReinitDelay = value;
        return this;
    }
    
     
    public BridgeBuilder setLldpTxDelay(final java.lang.String value) {
        this._lldpTxDelay = value;
        return this;
    }
    
     
    public BridgeBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public BridgeBuilder setOtherConfig(final OtherConfig value) {
        this._otherConfig = value;
        return this;
    }
    
     
    public BridgeBuilder setProtocols(final java.lang.String value) {
        this._protocols = value;
        return this;
    }
    
     
    public BridgeBuilder setUuid1(final List<java.lang.String> value) {
        this._uuid1 = value;
        return this;
    }
    
     
    public BridgeBuilder setXuuid(final java.lang.String value) {
        this._xuuid = value;
        return this;
    }
    
     
    public BridgeBuilder setLldpEnable(final java.lang.Boolean value) {
        this._lldpEnable = value;
        return this;
    }
    
    public BridgeBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public BridgeBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Bridge build() {
        return new BridgeImpl(this);
    }

    private static final class BridgeImpl implements Bridge {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge.class;
        }

        private final java.lang.String _brName;
        private final List<java.lang.String> _controllers;
        private final java.lang.String _datapathId;
        private final java.lang.String _datapathType;
        private final java.lang.String _disableInBand;
        private final java.lang.String _failMode;
        private final BridgeKey _key;
        private final java.lang.String _lldpMsgTxHold;
        private final java.lang.String _lldpMsgTxInterval;
        private final java.lang.String _lldpReinitDelay;
        private final java.lang.String _lldpTxDelay;
        private final java.lang.String _name;
        private final OtherConfig _otherConfig;
        private final java.lang.String _protocols;
        private final List<java.lang.String> _uuid1;
        private final java.lang.String _xuuid;
        private final java.lang.Boolean _lldpEnable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>> augmentation = Collections.emptyMap();

        private BridgeImpl(BridgeBuilder base) {
            if (base.getKey() == null) {
                this._key = new BridgeKey(
                    base.getBrName()
                );
                this._brName = base.getBrName();
            } else {
                this._key = base.getKey();
                this._brName = _key.getBrName();
            }
            this._controllers = base.getControllers();
            this._datapathId = base.getDatapathId();
            this._datapathType = base.getDatapathType();
            this._disableInBand = base.getDisableInBand();
            this._failMode = base.getFailMode();
            this._lldpMsgTxHold = base.getLldpMsgTxHold();
            this._lldpMsgTxInterval = base.getLldpMsgTxInterval();
            this._lldpReinitDelay = base.getLldpReinitDelay();
            this._lldpTxDelay = base.getLldpTxDelay();
            this._name = base.getName();
            this._otherConfig = base.getOtherConfig();
            this._protocols = base.getProtocols();
            this._uuid1 = base.getUuid1();
            this._xuuid = base.getXuuid();
            this._lldpEnable = base.isLldpEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getBrName() {
            return _brName;
        }
        
        @Override
        public List<java.lang.String> getControllers() {
            return _controllers;
        }
        
        @Override
        public java.lang.String getDatapathId() {
            return _datapathId;
        }
        
        @Override
        public java.lang.String getDatapathType() {
            return _datapathType;
        }
        
        @Override
        public java.lang.String getDisableInBand() {
            return _disableInBand;
        }
        
        @Override
        public java.lang.String getFailMode() {
            return _failMode;
        }
        
        @Override
        public BridgeKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getLldpMsgTxHold() {
            return _lldpMsgTxHold;
        }
        
        @Override
        public java.lang.String getLldpMsgTxInterval() {
            return _lldpMsgTxInterval;
        }
        
        @Override
        public java.lang.String getLldpReinitDelay() {
            return _lldpReinitDelay;
        }
        
        @Override
        public java.lang.String getLldpTxDelay() {
            return _lldpTxDelay;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public OtherConfig getOtherConfig() {
            return _otherConfig;
        }
        
        @Override
        public java.lang.String getProtocols() {
            return _protocols;
        }
        
        @Override
        public List<java.lang.String> getUuid1() {
            return _uuid1;
        }
        
        @Override
        public java.lang.String getXuuid() {
            return _xuuid;
        }
        
        @Override
        public java.lang.Boolean isLldpEnable() {
            return _lldpEnable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_brName);
            result = prime * result + Objects.hashCode(_controllers);
            result = prime * result + Objects.hashCode(_datapathId);
            result = prime * result + Objects.hashCode(_datapathType);
            result = prime * result + Objects.hashCode(_disableInBand);
            result = prime * result + Objects.hashCode(_failMode);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_lldpMsgTxHold);
            result = prime * result + Objects.hashCode(_lldpMsgTxInterval);
            result = prime * result + Objects.hashCode(_lldpReinitDelay);
            result = prime * result + Objects.hashCode(_lldpTxDelay);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_otherConfig);
            result = prime * result + Objects.hashCode(_protocols);
            result = prime * result + Objects.hashCode(_uuid1);
            result = prime * result + Objects.hashCode(_xuuid);
            result = prime * result + Objects.hashCode(_lldpEnable);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge)obj;
            if (!Objects.equals(_brName, other.getBrName())) {
                return false;
            }
            if (!Objects.equals(_controllers, other.getControllers())) {
                return false;
            }
            if (!Objects.equals(_datapathId, other.getDatapathId())) {
                return false;
            }
            if (!Objects.equals(_datapathType, other.getDatapathType())) {
                return false;
            }
            if (!Objects.equals(_disableInBand, other.getDisableInBand())) {
                return false;
            }
            if (!Objects.equals(_failMode, other.getFailMode())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_lldpMsgTxHold, other.getLldpMsgTxHold())) {
                return false;
            }
            if (!Objects.equals(_lldpMsgTxInterval, other.getLldpMsgTxInterval())) {
                return false;
            }
            if (!Objects.equals(_lldpReinitDelay, other.getLldpReinitDelay())) {
                return false;
            }
            if (!Objects.equals(_lldpTxDelay, other.getLldpTxDelay())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_otherConfig, other.getOtherConfig())) {
                return false;
            }
            if (!Objects.equals(_protocols, other.getProtocols())) {
                return false;
            }
            if (!Objects.equals(_uuid1, other.getUuid1())) {
                return false;
            }
            if (!Objects.equals(_xuuid, other.getXuuid())) {
                return false;
            }
            if (!Objects.equals(_lldpEnable, other.isLldpEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                BridgeImpl otherImpl = (BridgeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.rms.rev150105.fb.v1.Bridge>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Bridge [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_brName != null) {
                builder.append("_brName=");
                builder.append(_brName);
                builder.append(", ");
            }
            if (_controllers != null) {
                builder.append("_controllers=");
                builder.append(_controllers);
                builder.append(", ");
            }
            if (_datapathId != null) {
                builder.append("_datapathId=");
                builder.append(_datapathId);
                builder.append(", ");
            }
            if (_datapathType != null) {
                builder.append("_datapathType=");
                builder.append(_datapathType);
                builder.append(", ");
            }
            if (_disableInBand != null) {
                builder.append("_disableInBand=");
                builder.append(_disableInBand);
                builder.append(", ");
            }
            if (_failMode != null) {
                builder.append("_failMode=");
                builder.append(_failMode);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_lldpMsgTxHold != null) {
                builder.append("_lldpMsgTxHold=");
                builder.append(_lldpMsgTxHold);
                builder.append(", ");
            }
            if (_lldpMsgTxInterval != null) {
                builder.append("_lldpMsgTxInterval=");
                builder.append(_lldpMsgTxInterval);
                builder.append(", ");
            }
            if (_lldpReinitDelay != null) {
                builder.append("_lldpReinitDelay=");
                builder.append(_lldpReinitDelay);
                builder.append(", ");
            }
            if (_lldpTxDelay != null) {
                builder.append("_lldpTxDelay=");
                builder.append(_lldpTxDelay);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_otherConfig != null) {
                builder.append("_otherConfig=");
                builder.append(_otherConfig);
                builder.append(", ");
            }
            if (_protocols != null) {
                builder.append("_protocols=");
                builder.append(_protocols);
                builder.append(", ");
            }
            if (_uuid1 != null) {
                builder.append("_uuid1=");
                builder.append(_uuid1);
                builder.append(", ");
            }
            if (_xuuid != null) {
                builder.append("_xuuid=");
                builder.append(_xuuid);
                builder.append(", ");
            }
            if (_lldpEnable != null) {
                builder.append("_lldpEnable=");
                builder.append(_lldpEnable);
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
