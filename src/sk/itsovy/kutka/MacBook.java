package sk.itsovy.kutka;

public class MacBook implements Apple {
    private String GPU;
    private String processor;
    private int ramSize;

    public MacBook(String GPU, String processor, int ramSize) {
        this.GPU = GPU;
        this.processor = processor;
        this.ramSize = ramSize;
    }
}
