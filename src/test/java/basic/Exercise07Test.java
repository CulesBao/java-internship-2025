package basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise07Test {
  @Test
  public void shoudReversedBinary_OK() {
    final Exercise07 exercise07 = new Exercise07();

    assertEquals(11, exercise07.reversedBinary(13));
    assertEquals(7, exercise07.reversedBinary(14));
    assertEquals(1, exercise07.reversedBinary(8));
  }
}
