package enums;


public enum Note {
    //deklaracja stałej to jak zapis Note C = new Note(frequency)
    C(100), Cis(200), D(300), Dis(400), E(500), F(600), Fis(700), G(800), Gis(900), A(10), Ais(20), H(30);
    private final double frequency;

    Note(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    public double getFrequency(Octave octave) {
        return frequency * (octave.ordinal()+1);
    }
}
