package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Wed Nov 12 12:35:36 PST 2014
 */
public class JSONRPCBalance implements com.bitmechanic.barrister.BStruct {


    public static class Builder {
        private String _assetRef;
        public Builder assetRef(String assetRef) { this._assetRef = assetRef; return this; }
        private JSONRPCBalanceAmount _balance;
        public Builder balance(JSONRPCBalanceAmount balance) { this._balance = balance; return this; }
        private JSONRPCBalanceAmount _spendable;
        public Builder spendable(JSONRPCBalanceAmount spendable) { this._spendable = spendable; return this; }
        private String _name;
        public Builder name(String name) { this._name = name; return this; }
        private String _name_short;
        public Builder name_short(String name_short) { this._name_short = name_short; return this; }
        private String _domain;
        public Builder domain(String domain) { this._domain = domain; return this; }
        private String _url;
        public Builder url(String url) { this._url = url; return this; }
        private String _issuer;
        public Builder issuer(String issuer) { this._issuer = issuer; return this; }
        private String _description;
        public Builder description(String description) { this._description = description; return this; }
        private String _units;
        public Builder units(String units) { this._units = units; return this; }
        private Double _multiple;
        public Builder multiple(Double multiple) { this._multiple = multiple; return this; }
        private String _status;
        public Builder status(String status) { this._status = status; return this; }
        private Boolean _valid;
        public Builder valid(Boolean valid) { this._valid = valid; return this; }
        private Long _checked_unixtime;
        public Builder checked_unixtime(Long checked_unixtime) { this._checked_unixtime = checked_unixtime; return this; }
        private String _contract_url;
        public Builder contract_url(String contract_url) { this._contract_url = contract_url; return this; }
        private String _contract_file;
        public Builder contract_file(String contract_file) { this._contract_file = contract_file; return this; }
        private String _genesis_txid;
        public Builder genesis_txid(String genesis_txid) { this._genesis_txid = genesis_txid; return this; }
        private Long _added_unixtime;
        public Builder added_unixtime(Long added_unixtime) { this._added_unixtime = added_unixtime; return this; }
        private String _issue_date;
        public Builder issue_date(String issue_date) { this._issue_date = issue_date; return this; }
        private Long _issue_unixtime;
        public Builder issue_unixtime(Long issue_unixtime) { this._issue_unixtime = issue_unixtime; return this; }
        private String _expiry_date;
        public Builder expiry_date(String expiry_date) { this._expiry_date = expiry_date; return this; }
        private Long _expiry_unixtime;
        public Builder expiry_unixtime(Long expiry_unixtime) { this._expiry_unixtime = expiry_unixtime; return this; }
        private String[] _tracker_urls;
        public Builder tracker_urls(String[] tracker_urls) { this._tracker_urls = tracker_urls; return this; }
        private String _icon_url;
        public Builder icon_url(String icon_url) { this._icon_url = icon_url; return this; }
        private String _image_url;
        public Builder image_url(String image_url) { this._image_url = image_url; return this; }
        private String _feed_url;
        public Builder feed_url(String feed_url) { this._feed_url = feed_url; return this; }
        private String _redemption_url;
        public Builder redemption_url(String redemption_url) { this._redemption_url = redemption_url; return this; }
        private Boolean _visible;
        public Builder visible(Boolean visible) { this._visible = visible; return this; }
        public JSONRPCBalance build() {
            return new JSONRPCBalance(this._assetRef, this._balance, this._spendable, this._name, this._name_short, this._domain, this._url, this._issuer, this._description, this._units, this._multiple, this._status, this._valid, this._checked_unixtime, this._contract_url, this._contract_file, this._genesis_txid, this._added_unixtime, this._issue_date, this._issue_unixtime, this._expiry_date, this._expiry_unixtime, this._tracker_urls, this._icon_url, this._image_url, this._feed_url, this._redemption_url, this._visible);
        }

        public Builder() { }
        public Builder(JSONRPCBalance obj) {
            this._assetRef = obj.getAssetRef();
            this._balance = obj.getBalance();
            this._spendable = obj.getSpendable();
            this._name = obj.getName();
            this._name_short = obj.getName_short();
            this._domain = obj.getDomain();
            this._url = obj.getUrl();
            this._issuer = obj.getIssuer();
            this._description = obj.getDescription();
            this._units = obj.getUnits();
            this._multiple = obj.getMultiple();
            this._status = obj.getStatus();
            this._valid = obj.getValid();
            this._checked_unixtime = obj.getChecked_unixtime();
            this._contract_url = obj.getContract_url();
            this._contract_file = obj.getContract_file();
            this._genesis_txid = obj.getGenesis_txid();
            this._added_unixtime = obj.getAdded_unixtime();
            this._issue_date = obj.getIssue_date();
            this._issue_unixtime = obj.getIssue_unixtime();
            this._expiry_date = obj.getExpiry_date();
            this._expiry_unixtime = obj.getExpiry_unixtime();
            this._tracker_urls = obj.getTracker_urls();
            this._icon_url = obj.getIcon_url();
            this._image_url = obj.getImage_url();
            this._feed_url = obj.getFeed_url();
            this._redemption_url = obj.getRedemption_url();
            this._visible = obj.getVisible();
        }
    }

    private Boolean valid;
    private String redemption_url;
    private Boolean visible;
    private String[] tracker_urls;
    private JSONRPCBalanceAmount balance;
    private String genesis_txid;
    private String image_url;
    private String description;
    private String name;
    private Long expiry_unixtime;
    private String domain;
    private Double multiple;
    private String feed_url;
    private String status;
    private String name_short;
    private String assetRef;
    private String icon_url;
    private String issue_date;
    private String units;
    private String url;
    private String contract_file;
    private String issuer;
    private Long checked_unixtime;
    private String contract_url;
    private Long issue_unixtime;
    private String expiry_date;
    private JSONRPCBalanceAmount spendable;
    private Long added_unixtime;

    public JSONRPCBalance() {
        super();
    }

    public JSONRPCBalance(java.util.Map _map) throws com.bitmechanic.barrister.RpcException {
        this(
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("assetRef"), false),
            (JSONRPCBalanceAmount)com.bitmechanic.barrister.StructTypeConverter.unmarshal(JSONRPCBalanceAmount.class, _map.get("balance"), false),
            (JSONRPCBalanceAmount)com.bitmechanic.barrister.StructTypeConverter.unmarshal(JSONRPCBalanceAmount.class, _map.get("spendable"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("name"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("name_short"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("domain"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("url"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("issuer"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("description"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("units"), true),
            (Double)com.bitmechanic.barrister.FloatTypeConverter.unmarshal(_map.get("multiple"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("status"), true),
            (Boolean)com.bitmechanic.barrister.BoolTypeConverter.unmarshal(_map.get("valid"), true),
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("checked_unixtime"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("contract_url"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("contract_file"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("genesis_txid"), true),
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("added_unixtime"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("issue_date"), true),
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("issue_unixtime"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("expiry_date"), true),
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("expiry_unixtime"), true),
            (String[])com.bitmechanic.barrister.StringTypeConverter.unmarshalList(_map.get("tracker_urls"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("icon_url"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("image_url"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("feed_url"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("redemption_url"), true),
            (Boolean)com.bitmechanic.barrister.BoolTypeConverter.unmarshal(_map.get("visible"), true)
        );
    }

    @org.codehaus.jackson.annotate.JsonCreator
    public JSONRPCBalance(
            @org.codehaus.jackson.annotate.JsonProperty("assetRef") String assetRef, 
            @org.codehaus.jackson.annotate.JsonProperty("balance") JSONRPCBalanceAmount balance, 
            @org.codehaus.jackson.annotate.JsonProperty("spendable") JSONRPCBalanceAmount spendable, 
            @org.codehaus.jackson.annotate.JsonProperty("name") String name, 
            @org.codehaus.jackson.annotate.JsonProperty("name_short") String name_short, 
            @org.codehaus.jackson.annotate.JsonProperty("domain") String domain, 
            @org.codehaus.jackson.annotate.JsonProperty("url") String url, 
            @org.codehaus.jackson.annotate.JsonProperty("issuer") String issuer, 
            @org.codehaus.jackson.annotate.JsonProperty("description") String description, 
            @org.codehaus.jackson.annotate.JsonProperty("units") String units, 
            @org.codehaus.jackson.annotate.JsonProperty("multiple") Double multiple, 
            @org.codehaus.jackson.annotate.JsonProperty("status") String status, 
            @org.codehaus.jackson.annotate.JsonProperty("valid") Boolean valid, 
            @org.codehaus.jackson.annotate.JsonProperty("checked_unixtime") Long checked_unixtime, 
            @org.codehaus.jackson.annotate.JsonProperty("contract_url") String contract_url, 
            @org.codehaus.jackson.annotate.JsonProperty("contract_file") String contract_file, 
            @org.codehaus.jackson.annotate.JsonProperty("genesis_txid") String genesis_txid, 
            @org.codehaus.jackson.annotate.JsonProperty("added_unixtime") Long added_unixtime, 
            @org.codehaus.jackson.annotate.JsonProperty("issue_date") String issue_date, 
            @org.codehaus.jackson.annotate.JsonProperty("issue_unixtime") Long issue_unixtime, 
            @org.codehaus.jackson.annotate.JsonProperty("expiry_date") String expiry_date, 
            @org.codehaus.jackson.annotate.JsonProperty("expiry_unixtime") Long expiry_unixtime, 
            @org.codehaus.jackson.annotate.JsonProperty("tracker_urls") String[] tracker_urls, 
            @org.codehaus.jackson.annotate.JsonProperty("icon_url") String icon_url, 
            @org.codehaus.jackson.annotate.JsonProperty("image_url") String image_url, 
            @org.codehaus.jackson.annotate.JsonProperty("feed_url") String feed_url, 
            @org.codehaus.jackson.annotate.JsonProperty("redemption_url") String redemption_url, 
            @org.codehaus.jackson.annotate.JsonProperty("visible") Boolean visible) {
        super();
        this.assetRef = assetRef;
        this.balance = balance;
        this.spendable = spendable;
        this.name = name;
        this.name_short = name_short;
        this.domain = domain;
        this.url = url;
        this.issuer = issuer;
        this.description = description;
        this.units = units;
        this.multiple = multiple;
        this.status = status;
        this.valid = valid;
        this.checked_unixtime = checked_unixtime;
        this.contract_url = contract_url;
        this.contract_file = contract_file;
        this.genesis_txid = genesis_txid;
        this.added_unixtime = added_unixtime;
        this.issue_date = issue_date;
        this.issue_unixtime = issue_unixtime;
        this.expiry_date = expiry_date;
        this.expiry_unixtime = expiry_unixtime;
        this.tracker_urls = tracker_urls;
        this.icon_url = icon_url;
        this.image_url = image_url;
        this.feed_url = feed_url;
        this.redemption_url = redemption_url;
        this.visible = visible;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Boolean getValid() {
        return this.valid;
    }

    public void setRedemption_url(String redemption_url) {
        this.redemption_url = redemption_url;
    }

    public String getRedemption_url() {
        return this.redemption_url;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public void setTracker_urls(String[] tracker_urls) {
        this.tracker_urls = tracker_urls;
    }

    public String[] getTracker_urls() {
        return this.tracker_urls;
    }

    public void setBalance(JSONRPCBalanceAmount balance) {
        this.balance = balance;
    }

    public JSONRPCBalanceAmount getBalance() {
        return this.balance;
    }

    public void setGenesis_txid(String genesis_txid) {
        this.genesis_txid = genesis_txid;
    }

    public String getGenesis_txid() {
        return this.genesis_txid;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setExpiry_unixtime(Long expiry_unixtime) {
        this.expiry_unixtime = expiry_unixtime;
    }

    public Long getExpiry_unixtime() {
        return this.expiry_unixtime;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setMultiple(Double multiple) {
        this.multiple = multiple;
    }

    public Double getMultiple() {
        return this.multiple;
    }

    public void setFeed_url(String feed_url) {
        this.feed_url = feed_url;
    }

    public String getFeed_url() {
        return this.feed_url;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setName_short(String name_short) {
        this.name_short = name_short;
    }

    public String getName_short() {
        return this.name_short;
    }

    public void setAssetRef(String assetRef) {
        this.assetRef = assetRef;
    }

    public String getAssetRef() {
        return this.assetRef;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getIcon_url() {
        return this.icon_url;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getIssue_date() {
        return this.issue_date;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getUnits() {
        return this.units;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public void setContract_file(String contract_file) {
        this.contract_file = contract_file;
    }

    public String getContract_file() {
        return this.contract_file;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getIssuer() {
        return this.issuer;
    }

    public void setChecked_unixtime(Long checked_unixtime) {
        this.checked_unixtime = checked_unixtime;
    }

    public Long getChecked_unixtime() {
        return this.checked_unixtime;
    }

    public void setContract_url(String contract_url) {
        this.contract_url = contract_url;
    }

    public String getContract_url() {
        return this.contract_url;
    }

    public void setIssue_unixtime(Long issue_unixtime) {
        this.issue_unixtime = issue_unixtime;
    }

    public Long getIssue_unixtime() {
        return this.issue_unixtime;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getExpiry_date() {
        return this.expiry_date;
    }

    public void setSpendable(JSONRPCBalanceAmount spendable) {
        this.spendable = spendable;
    }

    public JSONRPCBalanceAmount getSpendable() {
        return this.spendable;
    }

    public void setAdded_unixtime(Long added_unixtime) {
        this.added_unixtime = added_unixtime;
    }

    public Long getAdded_unixtime() {
        return this.added_unixtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCBalance:");
        sb.append(" valid=").append(valid);
        sb.append(" redemption_url=").append(redemption_url);
        sb.append(" visible=").append(visible);
        sb.append(" tracker_urls=").append(tracker_urls);
        sb.append(" balance=").append(balance);
        sb.append(" genesis_txid=").append(genesis_txid);
        sb.append(" image_url=").append(image_url);
        sb.append(" description=").append(description);
        sb.append(" name=").append(name);
        sb.append(" expiry_unixtime=").append(expiry_unixtime);
        sb.append(" domain=").append(domain);
        sb.append(" multiple=").append(multiple);
        sb.append(" feed_url=").append(feed_url);
        sb.append(" status=").append(status);
        sb.append(" name_short=").append(name_short);
        sb.append(" assetRef=").append(assetRef);
        sb.append(" icon_url=").append(icon_url);
        sb.append(" issue_date=").append(issue_date);
        sb.append(" units=").append(units);
        sb.append(" url=").append(url);
        sb.append(" contract_file=").append(contract_file);
        sb.append(" issuer=").append(issuer);
        sb.append(" checked_unixtime=").append(checked_unixtime);
        sb.append(" contract_url=").append(contract_url);
        sb.append(" issue_unixtime=").append(issue_unixtime);
        sb.append(" expiry_date=").append(expiry_date);
        sb.append(" spendable=").append(spendable);
        sb.append(" added_unixtime=").append(added_unixtime);
        return sb.toString();
    }

    @Override
    public boolean equals(Object _other) {
        if (this == _other) { return true; }
        if (_other == null) { return false; }
        if (!(_other instanceof JSONRPCBalance)) { return false; }
        JSONRPCBalance _o = (JSONRPCBalance)_other;
        if (valid == null && _o.valid != null) { return false; }
        else if (valid != null && !valid.equals(_o.valid)) { return false; }
        if (redemption_url == null && _o.redemption_url != null) { return false; }
        else if (redemption_url != null && !redemption_url.equals(_o.redemption_url)) { return false; }
        if (visible == null && _o.visible != null) { return false; }
        else if (visible != null && !visible.equals(_o.visible)) { return false; }
        if (tracker_urls == null && _o.tracker_urls != null) { return false; }
        else if (tracker_urls != null && !java.util.Arrays.equals(tracker_urls, _o.tracker_urls)) { return false; }
        if (balance == null && _o.balance != null) { return false; }
        else if (balance != null && !balance.equals(_o.balance)) { return false; }
        if (genesis_txid == null && _o.genesis_txid != null) { return false; }
        else if (genesis_txid != null && !genesis_txid.equals(_o.genesis_txid)) { return false; }
        if (image_url == null && _o.image_url != null) { return false; }
        else if (image_url != null && !image_url.equals(_o.image_url)) { return false; }
        if (description == null && _o.description != null) { return false; }
        else if (description != null && !description.equals(_o.description)) { return false; }
        if (name == null && _o.name != null) { return false; }
        else if (name != null && !name.equals(_o.name)) { return false; }
        if (expiry_unixtime == null && _o.expiry_unixtime != null) { return false; }
        else if (expiry_unixtime != null && !expiry_unixtime.equals(_o.expiry_unixtime)) { return false; }
        if (domain == null && _o.domain != null) { return false; }
        else if (domain != null && !domain.equals(_o.domain)) { return false; }
        if (multiple == null && _o.multiple != null) { return false; }
        else if (multiple != null && !multiple.equals(_o.multiple)) { return false; }
        if (feed_url == null && _o.feed_url != null) { return false; }
        else if (feed_url != null && !feed_url.equals(_o.feed_url)) { return false; }
        if (status == null && _o.status != null) { return false; }
        else if (status != null && !status.equals(_o.status)) { return false; }
        if (name_short == null && _o.name_short != null) { return false; }
        else if (name_short != null && !name_short.equals(_o.name_short)) { return false; }
        if (assetRef == null && _o.assetRef != null) { return false; }
        else if (assetRef != null && !assetRef.equals(_o.assetRef)) { return false; }
        if (icon_url == null && _o.icon_url != null) { return false; }
        else if (icon_url != null && !icon_url.equals(_o.icon_url)) { return false; }
        if (issue_date == null && _o.issue_date != null) { return false; }
        else if (issue_date != null && !issue_date.equals(_o.issue_date)) { return false; }
        if (units == null && _o.units != null) { return false; }
        else if (units != null && !units.equals(_o.units)) { return false; }
        if (url == null && _o.url != null) { return false; }
        else if (url != null && !url.equals(_o.url)) { return false; }
        if (contract_file == null && _o.contract_file != null) { return false; }
        else if (contract_file != null && !contract_file.equals(_o.contract_file)) { return false; }
        if (issuer == null && _o.issuer != null) { return false; }
        else if (issuer != null && !issuer.equals(_o.issuer)) { return false; }
        if (checked_unixtime == null && _o.checked_unixtime != null) { return false; }
        else if (checked_unixtime != null && !checked_unixtime.equals(_o.checked_unixtime)) { return false; }
        if (contract_url == null && _o.contract_url != null) { return false; }
        else if (contract_url != null && !contract_url.equals(_o.contract_url)) { return false; }
        if (issue_unixtime == null && _o.issue_unixtime != null) { return false; }
        else if (issue_unixtime != null && !issue_unixtime.equals(_o.issue_unixtime)) { return false; }
        if (expiry_date == null && _o.expiry_date != null) { return false; }
        else if (expiry_date != null && !expiry_date.equals(_o.expiry_date)) { return false; }
        if (spendable == null && _o.spendable != null) { return false; }
        else if (spendable != null && !spendable.equals(_o.spendable)) { return false; }
        if (added_unixtime == null && _o.added_unixtime != null) { return false; }
        else if (added_unixtime != null && !added_unixtime.equals(_o.added_unixtime)) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
        int _hash = 1;
        _hash = _hash * 31 + (valid == null ? 0 : valid.hashCode());
        _hash = _hash * 31 + (redemption_url == null ? 0 : redemption_url.hashCode());
        _hash = _hash * 31 + (visible == null ? 0 : visible.hashCode());
        _hash = _hash * 31 + (tracker_urls == null ? 0 : java.util.Arrays.hashCode(tracker_urls));
        _hash = _hash * 31 + (balance == null ? 0 : balance.hashCode());
        _hash = _hash * 31 + (genesis_txid == null ? 0 : genesis_txid.hashCode());
        _hash = _hash * 31 + (image_url == null ? 0 : image_url.hashCode());
        _hash = _hash * 31 + (description == null ? 0 : description.hashCode());
        _hash = _hash * 31 + (name == null ? 0 : name.hashCode());
        _hash = _hash * 31 + (expiry_unixtime == null ? 0 : expiry_unixtime.hashCode());
        _hash = _hash * 31 + (domain == null ? 0 : domain.hashCode());
        _hash = _hash * 31 + (multiple == null ? 0 : multiple.hashCode());
        _hash = _hash * 31 + (feed_url == null ? 0 : feed_url.hashCode());
        _hash = _hash * 31 + (status == null ? 0 : status.hashCode());
        _hash = _hash * 31 + (name_short == null ? 0 : name_short.hashCode());
        _hash = _hash * 31 + (assetRef == null ? 0 : assetRef.hashCode());
        _hash = _hash * 31 + (icon_url == null ? 0 : icon_url.hashCode());
        _hash = _hash * 31 + (issue_date == null ? 0 : issue_date.hashCode());
        _hash = _hash * 31 + (units == null ? 0 : units.hashCode());
        _hash = _hash * 31 + (url == null ? 0 : url.hashCode());
        _hash = _hash * 31 + (contract_file == null ? 0 : contract_file.hashCode());
        _hash = _hash * 31 + (issuer == null ? 0 : issuer.hashCode());
        _hash = _hash * 31 + (checked_unixtime == null ? 0 : checked_unixtime.hashCode());
        _hash = _hash * 31 + (contract_url == null ? 0 : contract_url.hashCode());
        _hash = _hash * 31 + (issue_unixtime == null ? 0 : issue_unixtime.hashCode());
        _hash = _hash * 31 + (expiry_date == null ? 0 : expiry_date.hashCode());
        _hash = _hash * 31 + (spendable == null ? 0 : spendable.hashCode());
        _hash = _hash * 31 + (added_unixtime == null ? 0 : added_unixtime.hashCode());
        return _hash;
    }
}

