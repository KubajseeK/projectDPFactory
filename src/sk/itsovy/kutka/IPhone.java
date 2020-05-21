package sk.itsovy.kutka;

public class IPhone implements Apple {
    private int ramSize;
    private String processor;
    private String GPU;

    public IPhone(int ramSize, String processor, String GPU) {
        this.ramSize = ramSize;
        this.processor = processor;
        this.GPU = GPU;
    }
}
