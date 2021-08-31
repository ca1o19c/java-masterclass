package FirstSteps;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Types Primitives Section")
public class ByteShortIntLongTest {
    @Test
    @DisplayName("must return the minimum value of each primitive type\n")
    void testMinimumOfPrimitiveType() {
        assertEquals(Integer.MIN_VALUE, -2147483648);
    }
}
