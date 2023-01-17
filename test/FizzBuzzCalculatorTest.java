import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzCalculatorTest {

    @org.junit.jupiter.api.Test
    @DisplayName("read1")
    void testReadNumber0() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.readNumber(1);
        String expected = "mot";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("read0")
    void testReadNumber1() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.readNumber(0);
        String expected = "muoi";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("read3")
    void testReadNumber2() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.readNumber(3);
        String expected = "Fizz";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("read5")
    void testReadNumber5() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.readNumber(5);
        String expected = "Buzz";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testTranslate52")
     void testFizzBuzzTranslate0() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.fizzBuzzTranslate(52);
        String expected = "52";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testTranslate63")
    void testFizzBuzzTranslate1() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.fizzBuzzTranslate(63);
        String expected = "Fizz";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testTranslate20")
    void testFizzBuzzTranslate2() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.fizzBuzzTranslate(20);
        String expected = "Buzz";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testTranslate90")
    void testFizzBuzzTranslate3() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.fizzBuzzTranslate(90);
        String expected = "FizzBuzz";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testTranslate0")
    void testFizzBuzzTranslate4() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.fizzBuzzTranslate(0);
        String expected = "Can nhap so nguyen duong lon hon 0";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testTranslate-5")
    void testFizzBuzzTranslate5() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.fizzBuzzTranslate(- 5);
        String expected = "Can nhap so nguyen duong lon hon 0";
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("testRead0")
    void testReadFizzBuzzTranslate0() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.readFizzBuzzTranslate(0);
        String expected = "Can nhap so nguyen duong tu 1 den 99";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testRead100")
    void testReadFizzBuzzTranslate1() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.readFizzBuzzTranslate(100);
        String expected = "Can nhap so nguyen duong tu 1 den 99";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testRead3")
    void testReadFizzBuzzTranslate2() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.readFizzBuzzTranslate(3);
        String expected = "Fizz";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testRead5")
    void testReadFizzBuzzTranslate3() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.readFizzBuzzTranslate(5);
        String expected = "Buzz";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testRead31")
    void testReadFizzBuzzTranslate4() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.readFizzBuzzTranslate(31);
        String expected = "Fizz mot";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testRead55")
    void testReadFizzBuzzTranslate5() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.readFizzBuzzTranslate(55);
        String expected = "Buzz Buzz";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testRead83")
    void testReadFizzBuzzTranslate6() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.readFizzBuzzTranslate(83);
        String expected = "tam Fizz";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testRead25")
    void testReadFizzBuzzTranslate7() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.readFizzBuzzTranslate(25);
        String expected = "hai Buzz";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testRead40")
    void testReadFizzBuzzTranslate8() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.readFizzBuzzTranslate(40);
        String expected = "bon muoi";
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testRead77")
    void testReadFizzBuzzTranslate9() {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String result = fizzBuzzCalculator.readFizzBuzzTranslate(77);
        String expected = "bay bay";
        assertEquals(expected, result);
    }

}