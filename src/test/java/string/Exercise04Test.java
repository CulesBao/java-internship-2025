package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise04Test {
  @Test
  public void testCountAppearanceOfCharacter() {
    final Exercise04 exercise04 = new Exercise04();

    assertEquals("a3b2c", exercise04.countAppearanceOfCharacter("aaabbc"));
    assertEquals("abc", exercise04.countAppearanceOfCharacter("abc"));
    assertEquals("abca", exercise04.countAppearanceOfCharacter("abca"));
    assertEquals("", exercise04.countAppearanceOfCharacter(""));
    assertEquals("ab13c", exercise04.countAppearanceOfCharacter("abbbbbbbbbbbbbc"));
    assertEquals("abc4e6fd", exercise04.countAppearanceOfCharacter("abcccceeeeeefd"));
  }
}
