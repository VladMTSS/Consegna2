////////////////////////////////////////////////////////////////////
// VLAD MIHAI PANAIT 2111949
// GIOELE MARZOLA 2113193
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 1000 inclusi.");
        }

        final int[] arabic = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        int index = 0;
        int remaining = number;

        while (remaining > 0) {
            if (remaining >= arabic[index]) {
                result.append(roman[index]);
                remaining -= arabic[index];
            } else {
                index++;
            }
        }

        return result.toString();
    }
}