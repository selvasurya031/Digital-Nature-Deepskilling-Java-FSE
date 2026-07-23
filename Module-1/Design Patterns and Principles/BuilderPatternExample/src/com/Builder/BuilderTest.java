package Week__1.Week_1.BuilderPatternExample.src.com.Builder;

public class BuilderTest {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setcpu("Intel i9")
                .setRam(32)
                .setStorage(1000)

                .build();

        Computer officePC = new Computer.Builder()
                .setcpu("Intel i5")
                .setRam(16)
                .setStorage(512)
                .build();

        System.out.println("Gaming PC");
        gamingPC.display();

        System.out.println("Office PC");
        officePC.display();
    }
}