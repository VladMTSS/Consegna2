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

        // Test 6
        assertEquals("  _____  __      __\n |_   _| \\ \\    / /\n   | |    \\ \\  / / \n   | |     \\ \\/ /  \n  _| |_     \\  /   \n |_____|     \\/    \n", RomanPrinter.print(4));
        assertEquals(" __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n", RomanPrinter.print(5));
        assertEquals(" __      __  _____ \n \\ \\    / / |_   _|\n  \\ \\  / /    | |  \n   \\ \\/ /     | |  \n    \\  /     _| |_ \n     \\/     |_____|\n", RomanPrinter.print(6));
    
        // Test 10
        assertEquals(" __      __  _____   _____ \n \\ \\    / / |_   _| |_   _|\n  \\ \\  / /    | |     | |  \n   \\ \\/ /     | |     | |  \n    \\  /     _| |_   _| |_ \n     \\/     |_____| |_____|\n", RomanPrinter.print(7));
        assertEquals(" __      __  _____   _____   _____ \n \\ \\    / / |_   _| |_   _| |_   _|\n  \\ \\  / /    | |     | |     | |  \n   \\ \\/ /     | |     | |     | |  \n    \\  /     _| |_   _| |_   _| |_ \n     \\/     |_____| |_____| |_____|\n", RomanPrinter.print(8));
        assertEquals("  _____  __   __\n |_   _| \\ \\ / /\n   | |    \\ V / \n   | |     > <  \n  _| |_   / . \\ \n |_____| /_/ \\_\\\n", RomanPrinter.print(9));
        assertEquals(" __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n", RomanPrinter.print(10));

        // Test 20
        assertEquals(" __   __ __      __\n \\ \\ / / \\ \\    / /\n  \\ V /   \\ \\  / / \n   > <     \\ \\/ /  \n  / . \\     \\  /   \n /_/ \\_\\     \\/    \n", RomanPrinter.print(15));
        assertEquals(" __   __  _____  __   __\n \\ \\ / / |_   _| \\ \\ / /\n  \\ V /    | |    \\ V / \n   > <     | |     > <  \n  / . \\   _| |_   / . \\ \n /_/ \\_\\ |_____| /_/ \\_\\\n", RomanPrinter.print(19));
        assertEquals(" __   __ __   __\n \\ \\ / / \\ \\ / /\n  \\ V /   \\ V / \n   > <     > <  \n  / . \\   / . \\ \n /_/ \\_\\ /_/ \\_\\\n", RomanPrinter.print(20));

        // Test 50
        assertEquals(" __   __ __   __ __   __\n \\ \\ / / \\ \\ / / \\ \\ / /\n  \\ V /   \\ V /   \\ V / \n   > <     > <     > <  \n  / . \\   / . \\   / . \\ \n /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n", RomanPrinter.print(30));
        assertEquals(" __   __  _      \n \\ \\ / / | |     \n  \\ V /  | |     \n   > <   | |     \n  / . \\  | |____ \n /_/ \\_\\ |______|\n", RomanPrinter.print(40));
        assertEquals("  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n", RomanPrinter.print(50));

        // Test 100
        assertEquals("  _       __   __\n | |      \\ \\ / /\n | |       \\ V / \n | |        > <  \n | |____   / . \\ \n |______| /_/ \\_\\\n", RomanPrinter.print(60));
        assertEquals("  _       __   __ __   __\n | |      \\ \\ / / \\ \\ / /\n | |       \\ V /   \\ V / \n | |        > <     > <  \n | |____   / . \\   / . \\ \n |______| /_/ \\_\\ /_/ \\_\\\n", RomanPrinter.print(70));
        assertEquals("  _       __   __ __   __ __   __\n | |      \\ \\ / / \\ \\ / / \\ \\ / /\n | |       \\ V /   \\ V /   \\ V / \n | |        > <     > <     > <  \n | |____   / . \\   / . \\   / . \\ \n |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n", RomanPrinter.print(80));
        assertEquals(" __   __   _____ \n \\ \\ / /  / ____|\n  \\ V /  | |     \n   > <   | |     \n  / . \\  | |____ \n /_/ \\_\\  \\_____|\n", RomanPrinter.print(90));
        assertEquals("   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|\n", RomanPrinter.print(100));

        // Test 500
        assertEquals("   _____    _____ \n  / ____|  / ____|\n | |      | |     \n | |      | |     \n | |____  | |____ \n  \\_____|  \\_____|\n", RomanPrinter.print(200));
        assertEquals("   _____    _____    _____ \n  / ____|  / ____|  / ____|\n | |      | |      | |     \n | |      | |      | |     \n | |____  | |____  | |____ \n  \\_____|  \\_____|  \\_____|\n", RomanPrinter.print(300));
        assertEquals("   _____   _____  \n  / ____| |  __ \\ \n | |      | |  | |\n | |      | |  | |\n | |____  | |__| |\n  \\_____| |_____/ \n", RomanPrinter.print(400));
        assertEquals("  _____  \n |  __ \\ \n | |  | |\n | |  | |\n | |__| |\n |_____/ \n", RomanPrinter.print(500));


        // Test 1000
        assertEquals("  _____     _____ \n |  __ \\   / ____|\n | |  | | | |     \n | |  | | | |     \n | |__| | | |____ \n |_____/   \\_____|\n", RomanPrinter.print(600));
        assertEquals("  _____     _____    _____ \n |  __ \\   / ____|  / ____|\n | |  | | | |      | |     \n | |  | | | |      | |     \n | |__| | | |____  | |____ \n |_____/   \\_____|  \\_____|\n", RomanPrinter.print(700));
        assertEquals("  _____     _____    _____    _____ \n |  __ \\   / ____|  / ____|  / ____|\n | |  | | | |      | |      | |     \n | |  | | | |      | |      | |     \n | |__| | | |____  | |____  | |____ \n |_____/   \\_____|  \\_____|  \\_____|\n", RomanPrinter.print(800));
        assertEquals("   _____   __  __ \n  / ____| |  \\/  |\n | |      | \\  / |\n | |      | |\\/| |\n | |____  | |  | |\n  \\_____| |_|  |_|\n", RomanPrinter.print(900));
        assertEquals("  __  __ \n |  \\/  |\n | \\  / |\n | |\\/| |\n | |  | |\n |_|  |_|\n", RomanPrinter.print(1000));

    }

    @Test
    public void testOutOfBounds() {
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(0));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(1001));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(-1));
    }

    //extra tests pt. 1
    @Test(expected = IllegalArgumentException.class)
    public void testAsciiArtWithInvalidChar() {
        RomanPrinter.printAsciiArt("Z");
    }

    @Test
    public void testPrintWithAllRomanSymbols() {
        // CMXLIV → C, M, X, L, I, V = tutti tranne D (che testiamo separatamente)
        RomanPrinter.print(944);
    }

    @Test
    public void testExtraCoverage() {
        // Test carattere non riconosciuto
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.printAsciiArt("Z"));

        // Test composizione completa di simboli: CMXLIV
        assertEquals(
                RomanPrinter.printAsciiArt("CMXLIV"),
                RomanPrinter.print(944)
        );

        // Test ciascun simbolo separato
        assertEquals(RomanPrinter.printAsciiArt("I"), RomanPrinter.print(1));
        assertEquals(RomanPrinter.printAsciiArt("V"), RomanPrinter.print(5));
        assertEquals(RomanPrinter.printAsciiArt("X"), RomanPrinter.print(10));
        assertEquals(RomanPrinter.printAsciiArt("L"), RomanPrinter.print(50));
        assertEquals(RomanPrinter.printAsciiArt("C"), RomanPrinter.print(100));
        assertEquals(RomanPrinter.printAsciiArt("D"), RomanPrinter.print(500));
        assertEquals(RomanPrinter.printAsciiArt("M"), RomanPrinter.print(1000));
    }

    //extra tests pt.2
    @Test
    public void testAsciiArtEmptyInput() {
        String expected = "\n\n\n\n\n\n";
        assertEquals(expected, RomanPrinter.printAsciiArt(""));
    }

    @Test
    public void testAsciiArtLowercaseInput() {
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.printAsciiArt("ivxlcdm"));
    }

    @Test
    public void testAsciiArtWithRepeatedSymbols() {
        String output = RomanPrinter.printAsciiArt("III");
        assertEquals(
                "  _____   _____   _____ \n" +
                " |_   _| |_   _| |_   _|\n" +
                "   | |     | |     | |  \n" +
                "   | |     | |     | |  \n" +
                "  _| |_   _| |_   _| |_ \n" +
                " |_____| |_____| |_____|\n",
                output
        );
    }

    //extra tests pt. 3
    @Test
    public void testIntegerToRomanConstructor() {
        new IntegerToRoman();
    }
    @Test
    public void testRomanPrinterConstructor() {
        new RomanPrinter();
    }
}
