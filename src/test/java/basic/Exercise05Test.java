package src.test.java.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import src.main.java.basic.Exercise05;

class Exercise05Test {
  @Test
  public void shoudFactorial_OK() {
    Exercise05 exercise05 = new Exercise05();
    assertEquals(1, exercise05.factorial(0));
    assertEquals(1, exercise05.factorial(1));
    assertEquals(2, exercise05.factorial(2));
    assertEquals(6, exercise05.factorial(3));
    assertEquals(24, exercise05.factorial(4));
    assertEquals(120, exercise05.factorial(5));
    assertEquals(720, exercise05.factorial(6));
  }

  @Test
  public void shoudFactorial_Throws() {
    Exercise05 exercise05 = new Exercise05();
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          exercise05.factorial(-1);
        });
  }
}
