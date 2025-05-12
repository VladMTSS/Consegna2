package it.unipd.mtss;

//////////////////////////////////////////////////////////////////// 
// VLAD MIHAI PANAIT 	2111949
// GIOELE MARZOLA 		2113193 
////////////////////////////////////////////////////////////////////

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RomanPrinterTest {

    @Test
    public void testPrint() {
        // Test 3
        assertEquals("  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n", RomanPrinter.print(1));
        assertEquals("  _____   _____ \n |_   _| |_   _|\n   | |     | |  \n   | |     | |  \n  _| |_   _| |_ \n |_____| |_____|\n", RomanPrinter.print(2));
        assertEquals("  _____   _____   _____ \n |_   _| |_   _| |_   _|\n   | |     | |     | |  \n   | |     | |     | |  \n  _| |_   _| |_   _| |_ \n |_____| |_____| |_____|\n", RomanPrinter.print(3));
    }

}
