package stream;

public class Exercise03 {
  public String converNumberToString(final int n) {
    return String.valueOf(n)
        .chars()
        .mapToObj(
            c -> {
              switch (c) {
                case '0':
                  return "Zero";
                case '1':
                  return "One";
                case '2':
                  return "Two";
                case '3':
                  return "Three";
                case '4':
                  return "Four";
                case '5':
                  return "Five";
                case '6':
                  return "Six";
                case '7':
                  return "Seven";
                case '8':
                  return "Eight";
                case '9':
                  return "Nine";
                default:
                  throw new IllegalArgumentException("Invalid digit: " + (char) c);
              }
            })
        .reduce((s1, s2) -> s1 + ", " + s2)
        .orElse("");
  }
}
