package ussd.prototype;

class RequestObject {

    private  String msisdn;
    private int imsi;
    private String shortCode;
    private String optional;
    private String ussdNodeId;
    private String text;
    private String networkName;
    private String countryName;


    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public int getImsi() {
        return imsi;
    }

    public void setImsi(int imsi) {
        this.imsi = imsi;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }

    public String getUssdNodeId() {
        return ussdNodeId;
    }

    public void setUssdNodeId(String ussdNodeId) {
        this.ussdNodeId = ussdNodeId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
