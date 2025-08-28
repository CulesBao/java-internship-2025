package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise06Test {
    @Test
    public void testIsValidBarcodeEAN13() {
        final Exercise06 exercise06 = new Exercise06();
        assertTrue(exercise06.isValidBarcodeEAN13("8938505974194"));
        assertFalse(exercise06.isValidBarcodeEAN13("898505974194"));
        assertFalse(exercise06.isValidBarcodeEAN13("8138505974194"));
        assertFalse(exercise06.isValidBarcodeEAN13("8931505974194"));
        assertFalse(exercise06.isValidBarcodeEAN13(null));
    }
}
