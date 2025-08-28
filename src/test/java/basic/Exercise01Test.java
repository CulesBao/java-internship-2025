package basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Exercise01Test {
  @Test
  public void testGcd() {
    final Exercise01 exercise = new Exercise01();
    assertEquals(6, exercise.gcd(54, 24));
    assertEquals(1, exercise.gcd(17, 13));
    assertEquals(10, exercise.gcd(0, 10));
    assertEquals(10, exercise.gcd(10, 0));
    assertEquals(5, exercise.gcd(5, 5));
  }

  @Test
  public void testLcm() {
    final Exercise01 exercise = new Exercise01();
    assertEquals(216, exercise.lcm(54, 24));
    assertEquals(221, exercise.lcm(17, 13));
    assertEquals(0, exercise.lcm(0, 10));
    assertEquals(0, exercise.lcm(10, 0));
    assertEquals(5, exercise.lcm(5, 5));
  }
}
