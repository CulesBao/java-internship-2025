package basic;

public class Exercise07 {
  private String convertToBinary(int n) {
    String binaryString = "";
    while (n > 0) {
      binaryString = (n % 2) + binaryString;
      n = n / 2;
    }
    return binaryString;
  }

  private int convertToDecimal(final String binaryString) {
    int decimalValue = 0;
    int length = binaryString.length();
    for (int i = 0; i < length; i++) {
      if (binaryString.charAt(length - i - 1) == '1') {
        decimalValue += Math.pow(2, i);
      }
    }
    return decimalValue;
  }

  public int reversedBinary(final int n) {
    final String binaryString = convertToBinary(n);
    final String reversedString = new StringBuilder(binaryString).reverse().toString();
    return convertToDecimal(reversedString);
  }
}
