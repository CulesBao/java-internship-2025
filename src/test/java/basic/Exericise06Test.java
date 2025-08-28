package basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exericise06Test {
  @Test
  public void shoudGetMonthName_OK() {
    final Exericise06 exericise06 = new Exericise06();

    assertEquals("January", exericise06.getMonthName(1));
    assertEquals("February", exericise06.getMonthName(2));
    assertEquals("March", exericise06.getMonthName(3));
    assertEquals("April", exericise06.getMonthName(4));
    assertEquals("May", exericise06.getMonthName(5));
    assertEquals("June", exericise06.getMonthName(6));
    assertEquals("July", exericise06.getMonthName(7));
    assertEquals("August", exericise06.getMonthName(8));
    assertEquals("September", exericise06.getMonthName(9));
    assertEquals("October", exericise06.getMonthName(10));
    assertEquals("November", exericise06.getMonthName(11));
    assertEquals("December", exericise06.getMonthName(12));
  }

  @Test
  public void shoudGetMonthName_Invalid() {
    Exericise06 exericise06 = new Exericise06();
    assertEquals("Invalid month", exericise06.getMonthName(0));
    assertEquals("Invalid month", exericise06.getMonthName(13));
    assertEquals("Invalid month", exericise06.getMonthName(-1));
  }
}
