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

    }

}
