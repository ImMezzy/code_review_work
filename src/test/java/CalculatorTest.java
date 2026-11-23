import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addShouldSumTwoNumbers() {
        assertEquals(10, calculator.add(7, 3));
        assertEquals(-2, calculator.add(-5, 3));
    }

    @Test
    void difShouldSubtractSecondNumber() {
        assertEquals(4, calculator.dif(7, 3));
        assertEquals(-8, calculator.dif(-5, 3));
    }

    @Test
    void timesShouldMultiplyTwoNumbers() {
        assertEquals(21, calculator.times(7, 3));
        assertEquals(-15, calculator.times(-5, 3));
    }

    @Test
    void divShouldDivideIntegers() {
        assertEquals(2, calculator.div(7, 3));
        assertEquals(-2, calculator.div(-7, 3));
    }

    @Test
    void divShouldThrowExceptionWhenDividingByZero() {
        assertThrows(
                ArithmeticException.class,
                () -> calculator.div(7, 0)
        );
    }

    @Test
    void solverShouldReturnSix() {
        assertEquals(6, calculator.solver());
    }
}