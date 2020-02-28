package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

public class PalindromeTest {

    @Test
    public void palidrome_isPalidrome_fiveLetter (){
        Assertions.assertTrue(Palindrome.check( "ASA"));


    }
 //valor passado com 1 string
    @Test
    public void check_stringLength1_true (){
        Assertions.assertTrue(Palindrome.check("a"));
    }


  //retorno true
    @Test
    public void check_stringWithSameStartEnd_true(){
     Assertions.assertTrue(Palindrome.check("aa"));
    }

    //string não palidrome

    @Test
    public void check_nonPalidromeWord_false (){
        Assertions.assertFalse(Palindrome.check("ab"));
    }

}
