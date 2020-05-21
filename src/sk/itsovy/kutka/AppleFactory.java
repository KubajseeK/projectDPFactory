package sk.itsovy.kutka;

public class AppleFactory {
    public static Apple createApple(String type) {
        if (type.equals(Apple.IPHONE)) {
            System.out.println("iPhone Created Successfully!");
            return new IPhone(2, "A9", "A9 GPU");
        } else if (type.equals(Apple.MAC)) {
            return new Mac("Intel Core i5", 8, "Radeon Pro 570X");
        } else if (type.equals(Apple.MACBOOK)) {
            return new MacBook("Intel Iris Plus", "Intel Core i5", 16);
        } else {
            return null;
        }
    }
}
