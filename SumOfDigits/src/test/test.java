package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.calSumOfDigits;

class test {

	@Test

    void testCalculateWithTwoDigitNumber() {
        calSumOfDigits calculator = new calSumOfDigits();
        
        // เราจะทดสอบกับตัวอย่างข้อมูล
        int result = calculator.calculate(45); // 4 + 5 = 9
        assertEquals(9, result);
    }

    @Test
    void testCalculateWithThreeDigitNumber() {
        calSumOfDigits calculator = new calSumOfDigits();
        
        // เราจะทดสอบกับตัวอย่างข้อมูล
        int result = calculator.calculate(123); // 1 + 2 + 3 = 6
        assertEquals(6, result);
    }
    
    @Test
    void testCalculateWithSingleDigitNumber() {
        calSumOfDigits calculator = new calSumOfDigits();
        
        // เราจะทดสอบกับตัวอย่างข้อมูล
        int result = calculator.calculate(7); // 7
        assertEquals(7, result);
    }
    
    @Test
    void testCalculateWithInvalidNumber() {
        calSumOfDigits calculator = new calSumOfDigits();
        
        // เราจะทดสอบกับข้อมูลที่ไม่ถูกต้อง (น้อยกว่าสองหลัก)
        int result = calculator.calculate(5); // น่าจะไม่ถูกต้อง
        assertEquals(0, result); // เราคาดหวังว่าผลลัพธ์จะเป็น 0
    }


}
