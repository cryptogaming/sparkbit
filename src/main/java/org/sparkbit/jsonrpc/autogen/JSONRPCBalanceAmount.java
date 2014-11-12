package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Wed Nov 12 12:35:36 PST 2014
 */
public class JSONRPCBalanceAmount implements com.bitmechanic.barrister.BStruct {


    public static class Builder {
        private Long _raw;
        public Builder raw(Long raw) { this._raw = raw; return this; }
        private Double _qty;
        public Builder qty(Double qty) { this._qty = qty; return this; }
        private String _display;
        public Builder display(String display) { this._display = display; return this; }
        public JSONRPCBalanceAmount build() {
            return new JSONRPCBalanceAmount(this._raw, this._qty, this._display);
        }

        public Builder() { }
        public Builder(JSONRPCBalanceAmount obj) {
            this._raw = obj.getRaw();
            this._qty = obj.getQty();
            this._display = obj.getDisplay();
        }
    }

    private Long raw;
    private String display;
    private Double qty;

    public JSONRPCBalanceAmount() {
        super();
    }

    public JSONRPCBalanceAmount(java.util.Map _map) throws com.bitmechanic.barrister.RpcException {
        this(
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("raw"), false),
            (Double)com.bitmechanic.barrister.FloatTypeConverter.unmarshal(_map.get("qty"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("display"), false)
        );
    }

    @org.codehaus.jackson.annotate.JsonCreator
    public JSONRPCBalanceAmount(
            @org.codehaus.jackson.annotate.JsonProperty("raw") Long raw, 
            @org.codehaus.jackson.annotate.JsonProperty("qty") Double qty, 
            @org.codehaus.jackson.annotate.JsonProperty("display") String display) {
        super();
        this.raw = raw;
        this.qty = qty;
        this.display = display;
    }

    public void setRaw(Long raw) {
        this.raw = raw;
    }

    public Long getRaw() {
        return this.raw;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return this.display;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getQty() {
        return this.qty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCBalanceAmount:");
        sb.append(" raw=").append(raw);
        sb.append(" display=").append(display);
        sb.append(" qty=").append(qty);
        return sb.toString();
    }

    @Override
    public boolean equals(Object _other) {
        if (this == _other) { return true; }
        if (_other == null) { return false; }
        if (!(_other instanceof JSONRPCBalanceAmount)) { return false; }
        JSONRPCBalanceAmount _o = (JSONRPCBalanceAmount)_other;
        if (raw == null && _o.raw != null) { return false; }
        else if (raw != null && !raw.equals(_o.raw)) { return false; }
        if (display == null && _o.display != null) { return false; }
        else if (display != null && !display.equals(_o.display)) { return false; }
        if (qty == null && _o.qty != null) { return false; }
        else if (qty != null && !qty.equals(_o.qty)) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
        int _hash = 1;
        _hash = _hash * 31 + (raw == null ? 0 : raw.hashCode());
        _hash = _hash * 31 + (display == null ? 0 : display.hashCode());
        _hash = _hash * 31 + (qty == null ? 0 : qty.hashCode());
        return _hash;
    }
}

