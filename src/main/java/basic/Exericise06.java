package basic;

import java.util.List;

public class Exericise06 {
  private static final List<String> monthNames =
      List.of(
          "January",
          "February",
          "March",
          "April",
          "May",
          "June",
          "July",
          "August",
          "September",
          "October",
          "November",
          "December");

  public String getMonthName(int n) {
    if (n < 1 || n > 12) {
      return "Invalid month";
    }
    return monthNames.get(n - 1);
  }
}
