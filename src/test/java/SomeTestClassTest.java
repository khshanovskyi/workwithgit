import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeTestClassTest {

    private static SomeTestClass someTestClass;

    @BeforeAll
    private static void before(){
        someTestClass = new SomeTestClass();
    }

    @Test
    void multi() {
        Assertions.assertAll(
                () -> assertEquals(4, someTestClass.multi(2,2)),
                () -> assertEquals(0, someTestClass.multi(0,0))
        );
    }
}