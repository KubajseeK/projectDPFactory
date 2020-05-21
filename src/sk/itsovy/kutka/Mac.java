package sk.itsovy.kutka;

public class Mac implements Apple {
    private String processor;
    private int ramSize;
    private String GPU;

    public Mac(String processor, int ramSize, String GPU) {
        this.processor = processor;
        this.ramSize = ramSize;
        this.GPU = GPU;
    }
}
