package fr.sfr.quotify.enums;

public enum ClientIndexEnum {
    STANDARD  ("0"),
    MAJOR ("-0.07"),
    MINOR ("0.1"),
    CONQUEST      ("-0.05");

    public final String value;

    ClientIndexEnum(String value) {
        this.value = value;
    }
}
