package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise04Test {
  @Test
  public void testCountAppearanceOfCharacter() {
    final Exercise04 exercise04 = new Exercise04();

    assertEquals("a3b2c", exercise04.countAppearanceOfCharacter("aaabbc"));
    assertEquals("abc", exercise04.countAppearanceOfCharacter("abc"));
    assertEquals("a4b2", exercise04.countAppearanceOfCharacter("aaaabb"));
    assertEquals("", exercise04.countAppearanceOfCharacter(""));
    assertEquals("x5y3z2", exercise04.countAppearanceOfCharacter("xxxxxyyyzz"));
    assertEquals("abc4e6fd", exercise04.countAppearanceOfCharacter("abcccceeeeeefd"));
  }
}
