import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void additional() {
        assertEquals(2, calculator.AddcalculationsOperations(1, 1));
    }

    @Test
    void difference() {
        assertEquals(1, calculator.DiffcalculationsOperations(2, 1));
    }
}
