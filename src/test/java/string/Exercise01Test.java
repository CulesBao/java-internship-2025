package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise01Test {
  @Test
  public void shouldReturnTrueWhenStringIsPalindrome() {
    final Exercise01 ex = new Exercise01();
    assertTrue(ex.isPalindrome("madam"));
    assertTrue(ex.isPalindrome("racecar"));
    assertTrue(ex.isPalindrome("a"));
  }

  @Test
  public void shouldReturnFalseWhenStringIsNotPalindrome() {
    final Exercise01 ex = new Exercise01();
    assertFalse(ex.isPalindrome("hello"));
    assertFalse(ex.isPalindrome("world"));
    assertFalse(ex.isPalindrome("ab"));
  }
}
