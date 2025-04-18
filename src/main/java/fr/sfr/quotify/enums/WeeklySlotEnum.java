package fr.sfr.quotify.enums;

public enum WeeklySlotEnum {
    MONDAY_FRIDAY   ("0"),
    MONDAY_SATURDAY ("0.01"),
    MONDAY_SUNDAY   ("0.02");


    public final String value;

    WeeklySlotEnum(String value) {
        this.value = value;
    }
}
