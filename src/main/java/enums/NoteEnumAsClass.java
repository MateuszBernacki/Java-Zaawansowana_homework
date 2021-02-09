package enums;

public class NoteEnumAsClass {
    public final static NoteEnumAsClass C = new NoteEnumAsClass("C", 100);
    public final static NoteEnumAsClass D = new NoteEnumAsClass("D", 200);
    public final static NoteEnumAsClass E = new NoteEnumAsClass("E", 300);
    public final static NoteEnumAsClass F = new NoteEnumAsClass("F",400);



    private final String name;
    private final int frequency;
    private NoteEnumAsClass(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String name(){
        return name;
    }
    public static NoteEnumAsClass[] valuesof(){
        return new NoteEnumAsClass[]{C,D,E,F};
    }

    public int getFrequency() {
        return frequency;
    }
}
