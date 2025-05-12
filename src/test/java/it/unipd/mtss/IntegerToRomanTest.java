package it.unipd.mtss;

//////////////////////////////////////////////////////////////////// 
// VLAD MIHAI PANAIT 	2111949
// GIOELE MARZOLA 		2113193 
////////////////////////////////////////////////////////////////////

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class IntegerToRomanTest {
    @Test
    public void testConvert() {
        //Test 3
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));

        //Test 6
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));

        //Test 10
        assertEquals("VII", IntegerToRoman.convert(7));
        assertEquals("VIII", IntegerToRoman.convert(8));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));

        //Test 20
        assertEquals("XIV", IntegerToRoman.convert(14));
        assertEquals("XVII", IntegerToRoman.convert(17));
        assertEquals("XIX", IntegerToRoman.convert(19));
        assertEquals("XX", IntegerToRoman.convert(20));
    }
}
