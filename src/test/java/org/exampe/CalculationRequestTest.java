package org.exampe;

import org.example.CalculationRequest;
import org.junit.Test;

public class CalculationRequestTest {
    @Test
    public void 유효한_숫자를_파싱할_수_있다(){
        String[] parts = new String[]{"2","+","3"};

        CalculationRequest request = new CalculationRequest(parts);

        assertEquals(2, request.getNum1());
        assertEquals("+", request.getOperator());
    }
}
