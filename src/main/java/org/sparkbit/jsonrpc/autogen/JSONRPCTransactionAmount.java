package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Fri Jan 02 19:56:25 PST 2015
 */
public class JSONRPCTransactionAmount implements com.bitmechanic.barrister.BStruct {


    public static class Builder {
        private String _asset_ref;
        public Builder asset_ref(String asset_ref) { this._asset_ref = asset_ref; return this; }
        private Long _raw;
        public Builder raw(Long raw) { this._raw = raw; return this; }
        private Double _qty;
        public Builder qty(Double qty) { this._qty = qty; return this; }
        private String _display;
        public Builder display(String display) { this._display = display; return this; }
        private String _name;
        public Builder name(String name) { this._name = name; return this; }
        private String _name_short;
        public Builder name_short(String name_short) { this._name_short = name_short; return this; }
        public JSONRPCTransactionAmount build() {
            return new JSONRPCTransactionAmount(this._asset_ref, this._raw, this._qty, this._display, this._name, this._name_short);
        }

        public Builder() { }
        public Builder(JSONRPCTransactionAmount obj) {
            this._asset_ref = obj.getAsset_ref();
            this._raw = obj.getRaw();
            this._qty = obj.getQty();
            this._display = obj.getDisplay();
            this._name = obj.getName();
            this._name_short = obj.getName_short();
        }
    }

    private Long raw;
    private String asset_ref;
    private String name_short;
    private String name;
    private String display;
    private Double qty;

    public JSONRPCTransactionAmount() {
        super();
    }

    public JSONRPCTransactionAmount(java.util.Map _map) throws com.bitmechanic.barrister.RpcException {
        this(
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("asset_ref"), false),
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("raw"), false),
            (Double)com.bitmechanic.barrister.FloatTypeConverter.unmarshal(_map.get("qty"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("display"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("name"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("name_short"), false)
        );
    }

    @org.codehaus.jackson.annotate.JsonCreator
    public JSONRPCTransactionAmount(
            @org.codehaus.jackson.annotate.JsonProperty("asset_ref") String asset_ref, 
            @org.codehaus.jackson.annotate.JsonProperty("raw") Long raw, 
            @org.codehaus.jackson.annotate.JsonProperty("qty") Double qty, 
            @org.codehaus.jackson.annotate.JsonProperty("display") String display, 
            @org.codehaus.jackson.annotate.JsonProperty("name") String name, 
            @org.codehaus.jackson.annotate.JsonProperty("name_short") String name_short) {
        super();
        this.asset_ref = asset_ref;
        this.raw = raw;
        this.qty = qty;
        this.display = display;
        this.name = name;
        this.name_short = name_short;
    }

    public void setRaw(Long raw) {
        this.raw = raw;
    }

    public Long getRaw() {
        return this.raw;
    }

    public void setAsset_ref(String asset_ref) {
        this.asset_ref = asset_ref;
    }

    public String getAsset_ref() {
        return this.asset_ref;
    }

    public void setName_short(String name_short) {
        this.name_short = name_short;
    }

    public String getName_short() {
        return this.name_short;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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
        StringBuilder sb = new StringBuilder("JSONRPCTransactionAmount:");
        sb.append(" raw=").append(raw);
        sb.append(" asset_ref=").append(asset_ref);
        sb.append(" name_short=").append(name_short);
        sb.append(" name=").append(name);
        sb.append(" display=").append(display);
        sb.append(" qty=").append(qty);
        return sb.toString();
    }

    @Override
    public boolean equals(Object _other) {
        if (this == _other) { return true; }
        if (_other == null) { return false; }
        if (!(_other instanceof JSONRPCTransactionAmount)) { return false; }
        JSONRPCTransactionAmount _o = (JSONRPCTransactionAmount)_other;
        if (raw == null && _o.raw != null) { return false; }
        else if (raw != null && !raw.equals(_o.raw)) { return false; }
        if (asset_ref == null && _o.asset_ref != null) { return false; }
        else if (asset_ref != null && !asset_ref.equals(_o.asset_ref)) { return false; }
        if (name_short == null && _o.name_short != null) { return false; }
        else if (name_short != null && !name_short.equals(_o.name_short)) { return false; }
        if (name == null && _o.name != null) { return false; }
        else if (name != null && !name.equals(_o.name)) { return false; }
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
        _hash = _hash * 31 + (asset_ref == null ? 0 : asset_ref.hashCode());
        _hash = _hash * 31 + (name_short == null ? 0 : name_short.hashCode());
        _hash = _hash * 31 + (name == null ? 0 : name.hashCode());
        _hash = _hash * 31 + (display == null ? 0 : display.hashCode());
        _hash = _hash * 31 + (qty == null ? 0 : qty.hashCode());
        return _hash;
    }
}

