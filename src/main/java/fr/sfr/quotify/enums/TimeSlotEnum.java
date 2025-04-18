package fr.sfr.quotify.enums;

public enum TimeSlotEnum {
    STANDAR_HOURS  ("0"),
    EXTENDED_HOURS ("0.005"),
    DAY_NIGHT      ("0.01");

    public final String value;

    TimeSlotEnum(String value) {
        this.value = value;
    }
}
