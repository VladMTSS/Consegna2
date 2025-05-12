///////////////////////////////////////////////////////////////////
// VLAD MIHAI PANAIT 2111949
// GIOELE MARZOLA 2113193
///////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    static String printAsciiArt(String roman) {
        // Mapping ASCII art per ogni carattere romano (ordine: M, D, C, L, X, V, I)
        final String[][] asciiMap = {
                { "  __  __ ", "  _____  ", "   _____ ", "  _      ", " __   __", " __      __", "  _____ " },
                { " |  \\/  |", " |  __ \\ ", "  / ____|", " | |     ", " \\ \\ / /", " \\ \\    / /", " |_   _|" },
                { " | \\  / |", " | |  | |", " | |     ", " | |     ", "  \\ V / ", "  \\ \\  / / ", "   | |  " },
                { " | |\\/| |", " | |  | |", " | |     ", " | |     ", "   > <  ", "   \\ \\/ /  ", "   | |  " },
                { " | |  | |", " | |__| |", " | |____ ", " | |____ ", "  / . \\ ", "    \\  /   ", "  _| |_ " },
                { " |_|  |_|", " |_____/ ", "  \\_____|", " |______|", " /_/ \\_\\", "     \\/    ", " |_____|" }
        };

        StringBuilder output = new StringBuilder();

        for (int row = 0; row < asciiMap.length; row++) {
            for (char c : roman.toCharArray()) {
                int idx = "MDCLXVI".indexOf(c);
                if (idx >= 0) {
                    output.append(asciiMap[row][idx]);
                } else {
                    throw new IllegalArgumentException("Carattere romano non riconosciuto: " + c);
                }
            }
            output.append("\n");
        }

        return output.toString();
    }
}
