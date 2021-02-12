package homework.task08;

enum Color{
    GREEN(0x0F0),
    RED(0xF00),
    BLUE(0x00F);


    private final int value;

    Color(int value) {
        this.value = value;
    }



    public int getValue() {
        return value;
    }
}