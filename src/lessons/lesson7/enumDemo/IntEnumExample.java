package lessons.lesson7.enumDemo;

public enum IntEnumExample {
    SIGN_CREATE(0),
    SIGNCREATE_BONUS(1),
    HOME_SCREEN(2),
    REGITER_SCREEM(3);

    private final int value;

    IntEnumExample(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
