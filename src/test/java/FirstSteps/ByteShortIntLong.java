package FirstSteps;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Types Primitives Section")
public class ByteShortIntLong {
    @Test
    @DisplayName("must return the minimum value of each primitive type\n")
    void testMinimumOfPrimitiveType() {
        assertEquals(-2147483648, Integer.MIN_VALUE);
    }
}
