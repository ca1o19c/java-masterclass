package Challenges;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Types Primitives Section")
public class TypesPrimitivesTest {
    @Test
    @DisplayName("checks if the value of the longTotal variable is 50800\n")
    void testMinimumOfPrimitiveType() {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);

        assertEquals(50800, longTotal);
    }
}
