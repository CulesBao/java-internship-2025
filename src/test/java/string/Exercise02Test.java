package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise02Test {
  @Test
  public void shouldReturnSumOfNumbersInString() {
    final Exercise02 exercise02 = new Exercise02();
    assertEquals(123, exercise02.sumInString("abc123xyz"));
    assertEquals(44, exercise02.sumInString("aa11b33"));
    assertEquals(18, exercise02.sumInString("7 11"));
    assertEquals(0, exercise02.sumInString("Chocolate"));
    assertEquals(0, exercise02.sumInString(""));
    assertEquals(380, exercise02.sumInString("abc 123 def 33 mn 3.221"));
  }
}
