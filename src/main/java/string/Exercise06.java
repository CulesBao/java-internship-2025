package string;

public class Exercise06 {
    public boolean isValidBarcodeEAN13(final String barcode) {
        if (barcode == null || barcode.length() != 13) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < 12; i++) {
            int digit = barcode.charAt(i) - '0';
            sum += (i % 2 == 0) ? digit : digit * 3;
        }

        int checkDigit = (10 - (sum % 10)) % 10;
        int providedCheckDigit = barcode.charAt(12) - '0';

        return checkDigit == providedCheckDigit;
    }
}
