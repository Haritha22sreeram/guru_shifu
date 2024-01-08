package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaCalculatorTest {
    @Test
    void shouldReturnValidAreaForRectangle() {
        AreaCalculator rectangle1 = AreaCalculator.rectangle(0, 0);
        AreaCalculator rectangle2 = AreaCalculator.rectangle(15, 0);
        AreaCalculator rectangle3 = AreaCalculator.rectangle(0, 4);
        AreaCalculator rectangle4 = AreaCalculator.rectangle(12, 9);

        double area1 = rectangle1.area();
        double area2 = rectangle2.area();
        double area3 = rectangle3.area();
        double area4 = rectangle4.area();

        assertEquals(0, area1, 0.0000001);
        assertEquals(0, area2, 0.0000001);
        assertEquals(0, area3, 0.0000001);
        assertEquals(12 * 9, area4, 0.0000001);
    }   
}
