package pages;

import java.util.Map;

public class ExchangeRateData {
    private String result;
    private String provider;
    private String documentation;
    private String termsOfUse;
    private long timeLastUpdateUnix;
    private String timeLastUpdateUtc;
    private long timeNextUpdateUnix;
    private String timeNextUpdateUtc;
    private long timeEolUnix;
    private String baseCode;
    private Map<String, Double> rates;

    // Getters and setters

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getTermsOfUse() {
        return termsOfUse;
    }

    public void setTermsOfUse(String termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    public long getTimeLastUpdateUnix() {
        return timeLastUpdateUnix;
    }

    public void setTimeLastUpdateUnix(long timeLastUpdateUnix) {
        this.timeLastUpdateUnix = timeLastUpdateUnix;
    }

    public String getTimeLastUpdateUtc() {
        return timeLastUpdateUtc;
    }

    public void setTimeLastUpdateUtc(String timeLastUpdateUtc) {
        this.timeLastUpdateUtc = timeLastUpdateUtc;
    }

    public long getTimeNextUpdateUnix() {
        return timeNextUpdateUnix;
    }

    public void setTimeNextUpdateUnix(long timeNextUpdateUnix) {
        this.timeNextUpdateUnix = timeNextUpdateUnix;
    }

    public String getTimeNextUpdateUtc() {
        return timeNextUpdateUtc;
    }

    public void setTimeNextUpdateUtc(String timeNextUpdateUtc) {
        this.timeNextUpdateUtc = timeNextUpdateUtc;
    }

    public long getTimeEolUnix() {
        return timeEolUnix;
    }

    public void setTimeEolUnix(long timeEolUnix) {
        this.timeEolUnix = timeEolUnix;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    // toString() method
    @Override
    public String toString() {
        return "ExchangeRateData{" +
                "result='" + result + '\'' +
                ", provider='" + provider + '\'' +
                ", documentation='" + documentation + '\'' +
                ", termsOfUse='" + termsOfUse + '\'' +
                ", timeLastUpdateUnix=" + timeLastUpdateUnix +
                ", timeLastUpdateUtc='" + timeLastUpdateUtc + '\'' +
                ", timeNextUpdateUnix=" + timeNextUpdateUnix +
                ", timeNextUpdateUtc='" + timeNextUpdateUtc + '\'' +
                ", timeEolUnix=" + timeEolUnix +
                ", baseCode='" + baseCode + '\'' +
                ", rates=" + rates +
                '}';
    }
}
