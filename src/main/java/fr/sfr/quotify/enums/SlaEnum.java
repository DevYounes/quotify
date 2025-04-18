package fr.sfr.quotify.enums;

public enum SlaEnum {
    EORS("0.244"),
    ORS ("0.202"),
    HLS ("0.174"),
    OWS ("0.146");

    public final String value;

    SlaEnum(String value) {
        this.value = value;
    }
}
