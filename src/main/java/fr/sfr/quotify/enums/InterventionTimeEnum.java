package fr.sfr.quotify.enums;

public enum InterventionTimeEnum {
     FOUR_HOURS    ("0.1"),
     EIGHT_HOURS   ("0.08"),
     DAY_PLUS_ONE  ("0.005"),
     DAY_PLUS_FIVE ("0.004"),
     DAY_PLUS_TEN  ("0.003");

    public final String value;

    InterventionTimeEnum(String value) {
        this.value = value;
    }
}
