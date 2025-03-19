package WorldRPG;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class JUnitTest2 {
    @Test
    void testWorld(){
        World newWorld = new World();
    }

    @Test
    void testItem(){
        Item newItem = new Item("Dagger", 25);
    }

    @Test
    void testCharacter(){
        Character newCharacter = new Character("Julius",100.0,110.0,2);
    }





}
