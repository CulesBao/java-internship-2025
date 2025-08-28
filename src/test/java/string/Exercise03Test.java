package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise03Test {
  @Test
  public void trueIfStringIsRepeatBySubstring() {
    final Exercise03 exercise03 = new Exercise03();
    assertTrue(exercise03.isRepeatBySubstring("abab"));
    assertTrue(exercise03.isRepeatBySubstring("abcabc"));
    assertTrue(exercise03.isRepeatBySubstring("aaaa"));
    assertTrue(exercise03.isRepeatBySubstring("zzzzzz"));
  }

  @Test
  public void falseIfStringIsNotRepeatBySubstring() {
    final Exercise03 exercise03 = new Exercise03();
    assertFalse(exercise03.isRepeatBySubstring("abac"));
    assertFalse(exercise03.isRepeatBySubstring("abcdabc"));
    assertFalse(exercise03.isRepeatBySubstring("aabb"));
    assertFalse(exercise03.isRepeatBySubstring("xyzxyzx"));
  }
}
