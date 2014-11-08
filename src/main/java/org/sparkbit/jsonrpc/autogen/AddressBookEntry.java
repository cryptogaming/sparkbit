package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Sat Nov 08 00:25:30 PST 2014
 */
public class AddressBookEntry implements com.bitmechanic.barrister.BStruct {


    public static class Builder {
        private String _label;
        public Builder label(String label) { this._label = label; return this; }
        private String _bitcoinAddress;
        public Builder bitcoinAddress(String bitcoinAddress) { this._bitcoinAddress = bitcoinAddress; return this; }
        private String _coinsparkAddress;
        public Builder coinsparkAddress(String coinsparkAddress) { this._coinsparkAddress = coinsparkAddress; return this; }
        public AddressBookEntry build() {
            return new AddressBookEntry(this._label, this._bitcoinAddress, this._coinsparkAddress);
        }

        public Builder() { }
        public Builder(AddressBookEntry obj) {
            this._label = obj.getLabel();
            this._bitcoinAddress = obj.getBitcoinAddress();
            this._coinsparkAddress = obj.getCoinsparkAddress();
        }
    }

    private String coinsparkAddress;
    private String label;
    private String bitcoinAddress;

    public AddressBookEntry() {
        super();
    }

    public AddressBookEntry(java.util.Map _map) throws com.bitmechanic.barrister.RpcException {
        this(
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("label"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("bitcoinAddress"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("coinsparkAddress"), false)
        );
    }

    @org.codehaus.jackson.annotate.JsonCreator
    public AddressBookEntry(
            @org.codehaus.jackson.annotate.JsonProperty("label") String label, 
            @org.codehaus.jackson.annotate.JsonProperty("bitcoinAddress") String bitcoinAddress, 
            @org.codehaus.jackson.annotate.JsonProperty("coinsparkAddress") String coinsparkAddress) {
        super();
        this.label = label;
        this.bitcoinAddress = bitcoinAddress;
        this.coinsparkAddress = coinsparkAddress;
    }

    public void setCoinsparkAddress(String coinsparkAddress) {
        this.coinsparkAddress = coinsparkAddress;
    }

    public String getCoinsparkAddress() {
        return this.coinsparkAddress;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public void setBitcoinAddress(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    public String getBitcoinAddress() {
        return this.bitcoinAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AddressBookEntry:");
        sb.append(" coinsparkAddress=").append(coinsparkAddress);
        sb.append(" label=").append(label);
        sb.append(" bitcoinAddress=").append(bitcoinAddress);
        return sb.toString();
    }

    @Override
    public boolean equals(Object _other) {
        if (this == _other) { return true; }
        if (_other == null) { return false; }
        if (!(_other instanceof AddressBookEntry)) { return false; }
        AddressBookEntry _o = (AddressBookEntry)_other;
        if (coinsparkAddress == null && _o.coinsparkAddress != null) { return false; }
        else if (coinsparkAddress != null && !coinsparkAddress.equals(_o.coinsparkAddress)) { return false; }
        if (label == null && _o.label != null) { return false; }
        else if (label != null && !label.equals(_o.label)) { return false; }
        if (bitcoinAddress == null && _o.bitcoinAddress != null) { return false; }
        else if (bitcoinAddress != null && !bitcoinAddress.equals(_o.bitcoinAddress)) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
        int _hash = 1;
        _hash = _hash * 31 + (coinsparkAddress == null ? 0 : coinsparkAddress.hashCode());
        _hash = _hash * 31 + (label == null ? 0 : label.hashCode());
        _hash = _hash * 31 + (bitcoinAddress == null ? 0 : bitcoinAddress.hashCode());
        return _hash;
    }
}

