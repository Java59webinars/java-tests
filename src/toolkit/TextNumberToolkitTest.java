package toolkit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextNumberToolkitTest {

    @BeforeEach
    void setUp() {
//        String str1= "Listen";
//        String str2="Silent";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isAnagramLettersOnly_basic_true() {
        assertTrue(TextNumberToolkit.isAnagramLettersOnly("Listen","Silent"));
    }

    @Test
    void isAnagramLettersOnly_ignoreNonLetters_and_case() {
        assertTrue(TextNumberToolkit.isAnagramLettersOnly("New York Times123","monkey writes456%"));
    }

    @Test
    void isAnagramLettersOnly_null_false() {
        assertFalse(TextNumberToolkit.isAnagramLettersOnly(null,"monkey writes456%"));
        assertFalse(TextNumberToolkit.isAnagramLettersOnly("monkey writes456%",null));

    }

    @Test
    void isAnagramLettersOnly_blank_false() {
        assertFalse(TextNumberToolkit.isAnagramLettersOnly("123  !! ==","monkey writes456%"));
        assertFalse(TextNumberToolkit.isAnagramLettersOnly("asasfa","123  !! =="));
    }

    @Test
    void isAnagramLettersOnly_length_dif_false() {
        assertFalse(TextNumberToolkit.isAnagramLettersOnly("Listen","Silent Silent"));
    }
}