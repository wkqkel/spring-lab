package org.exampe;

import org.example.Calculator;
import org.example.InvalidOperatorException;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class CalculatorTest {
    @Test
    public void 덧셈_연산을_할_수_있다() {
        // given
        long num1 = 2;
        String op = "+";
        long num2 = 3;
        Calculator calc = new Calculator();

        // when
        long res = calc.calculate(num1, op, num2);

        // then
        assertEquals(5, res);
        assertThat(res).isEqualTo(5); // assertJ assert
    }

    @Test
    public void 잘못된_연산자가_요청으로_들어온_경우_에러가_난다() {
        // given
        long num1 = 2;
        String op = "x";
        long num2 = 3;
        Calculator cal = new Calculator();

        assertThrows(InvalidOperatorException.class, () -> {
            cal.calculate(num1, op, num2);
        });
    }
}
