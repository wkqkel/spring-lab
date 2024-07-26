package org.exampe;

import org.example.CalculationRequest;
import org.example.CalculationRequestReader;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class CalculationRequestReaderTest {

    @Test
    public void System_in_으로_데이터를_읽어올_수_있다(){
        // given
        CalculationRequestReader calculatorRequestReader = new CalculationRequestReader();

        // when
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes()));
       CalculationRequest result = calculatorRequestReader.read();
        // then

        assertEquals(2,result.getNum1());
        assertEquals("+", result.getOperator());
        assertEquals(3, result.getNum2());
    }
}
