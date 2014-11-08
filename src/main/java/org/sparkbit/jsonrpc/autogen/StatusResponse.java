package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Fri Nov 07 12:02:54 PST 2014
 */
public class StatusResponse implements com.bitmechanic.barrister.BStruct {


    public static class Builder {
        private Boolean _connected;
        public Builder connected(Boolean connected) { this._connected = connected; return this; }
        private Boolean _synced;
        public Builder synced(Boolean synced) { this._synced = synced; return this; }
        private Long _blocks;
        public Builder blocks(Long blocks) { this._blocks = blocks; return this; }
        public StatusResponse build() {
            return new StatusResponse(this._connected, this._synced, this._blocks);
        }

        public Builder() { }
        public Builder(StatusResponse obj) {
            this._connected = obj.getConnected();
            this._synced = obj.getSynced();
            this._blocks = obj.getBlocks();
        }
    }

    private Boolean synced;
    private Boolean connected;
    private Long blocks;

    public StatusResponse() {
        super();
    }

    public StatusResponse(java.util.Map _map) throws com.bitmechanic.barrister.RpcException {
        this(
            (Boolean)com.bitmechanic.barrister.BoolTypeConverter.unmarshal(_map.get("connected"), false),
            (Boolean)com.bitmechanic.barrister.BoolTypeConverter.unmarshal(_map.get("synced"), false),
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("blocks"), false)
        );
    }

    @org.codehaus.jackson.annotate.JsonCreator
    public StatusResponse(
            @org.codehaus.jackson.annotate.JsonProperty("connected") Boolean connected, 
            @org.codehaus.jackson.annotate.JsonProperty("synced") Boolean synced, 
            @org.codehaus.jackson.annotate.JsonProperty("blocks") Long blocks) {
        super();
        this.connected = connected;
        this.synced = synced;
        this.blocks = blocks;
    }

    public void setSynced(Boolean synced) {
        this.synced = synced;
    }

    public Boolean getSynced() {
        return this.synced;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    public Boolean getConnected() {
        return this.connected;
    }

    public void setBlocks(Long blocks) {
        this.blocks = blocks;
    }

    public Long getBlocks() {
        return this.blocks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StatusResponse:");
        sb.append(" synced=").append(synced);
        sb.append(" connected=").append(connected);
        sb.append(" blocks=").append(blocks);
        return sb.toString();
    }

    @Override
    public boolean equals(Object _other) {
        if (this == _other) { return true; }
        if (_other == null) { return false; }
        if (!(_other instanceof StatusResponse)) { return false; }
        StatusResponse _o = (StatusResponse)_other;
        if (synced == null && _o.synced != null) { return false; }
        else if (synced != null && !synced.equals(_o.synced)) { return false; }
        if (connected == null && _o.connected != null) { return false; }
        else if (connected != null && !connected.equals(_o.connected)) { return false; }
        if (blocks == null && _o.blocks != null) { return false; }
        else if (blocks != null && !blocks.equals(_o.blocks)) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
        int _hash = 1;
        _hash = _hash * 31 + (synced == null ? 0 : synced.hashCode());
        _hash = _hash * 31 + (connected == null ? 0 : connected.hashCode());
        _hash = _hash * 31 + (blocks == null ? 0 : blocks.hashCode());
        return _hash;
    }
}

