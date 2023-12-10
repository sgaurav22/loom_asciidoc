package bootiful.loom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {
    Main main;
    @BeforeEach
    void setup() {
        main = new Main();
    }

    @Test
    void testArrayListWithSizeZero() {
        Assertions.assertTrue(main.list.isEmpty());
    }
    @Test
    void testArrayListWithSizeOne() {
        String str = "grv";
        main.addNewString(str);
        Assertions.assertEquals(1, main.list.size());
    }

    @Test
    void testArrayListWithRemoveElement() {
        String str = "grv";
        main.addNewString(str);
        Assertions.assertEquals(1, main.list.size());

        main.removeString();
        Assertions.assertTrue(main.list.isEmpty());
    }
}