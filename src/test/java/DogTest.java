import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

class DogTest {
    private static final String[] dogNames = {"Blip","Slip","Flip","Clip"};
    private static Random rand = new Random();

    @Test
    void defaultConstructor(){
        Dog dog = new Dog();
        assertEquals("C3PO:25.4",dog.toString());
    }

    @Test
    void valueConstructor(){
        String name = dogNames[rand.nextInt(dogNames.length)];
        double length = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        Dog dog = new Dog(name,length);
        assertEquals(name+":"+length,dog.toString());
    }

    @Test
    void getName() {
        String name = dogNames[rand.nextInt(dogNames.length)];
        Dog dog = new Dog(name,80.5);
        assertEquals(name,dog.getName());
    }

    @Test
    void getLengthInInches() {
        String name = dogNames[rand.nextInt(dogNames.length)];
        double length = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        Dog dog = new Dog(name,length);
        assertEquals(length, dog.getLengthInInches());
    }

    @Test
    void getLengthInCentiMeters() {
        String name = dogNames[rand.nextInt(dogNames.length)];
        double length = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        Dog dog = new Dog(name,length);
        assertEquals(length*2.54, dog.getLengthInCentiMeters());
    }

    @Test
    void setName() {
        Dog dog = new Dog();
        String name = dogNames[rand.nextInt(dogNames.length)];
        dog.setName(name);
        assertEquals(name+":25.4",dog.toString());
    }

    @Test
    void setLength() {
        Dog dog = new Dog();
        double length = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        dog.setLength(length);
        assertEquals("C3PO:"+length,dog.toString());
    }
}