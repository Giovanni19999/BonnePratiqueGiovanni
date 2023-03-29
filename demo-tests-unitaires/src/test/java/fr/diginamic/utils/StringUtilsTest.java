package fr.diginamic.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {


    @Test
    void levenshteinDistance_SizeLetter() {
        assertEquals(3,StringUtils.levenshteinDistance("savourer","savoir"));
    }
    @Test
    void levenshteinDistance_Size() {
        assertEquals(1,StringUtils.levenshteinDistance("aviron","avion"));
    }

    @Test
    void levenshteinDistance_Size2() {
        assertEquals(1,StringUtils.levenshteinDistance("chat","chats"));
    }
    @Test
    void levenshteinDistance_SizeLetter2() {
        assertEquals(2,StringUtils.levenshteinDistance("distance","instance"));
    }
    @Test
    void levenshteinDistance_Letter() {
        assertEquals(2,StringUtils.levenshteinDistance("Chien","Chine"));
    }
    @Test
    void levenshteinDistance_NullFirst() {
        assertNull(StringUtils.levenshteinDistance(null, "Chine"));
    }

    @Test
    void levenshteinDistance_NullSecond() {
        assertNull(StringUtils.levenshteinDistance("Chine", null));
    }
    @Test
    void levenshteinDistance_NullAll() {
        assertNull(StringUtils.levenshteinDistance(null, null));
    }
}