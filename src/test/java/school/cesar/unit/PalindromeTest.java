package school.cesar.unit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

public class PalindromeTest {

    public Palindrome palindrome = new Palindrome();

    @Test
    public void check_palindrome_vazio() {
        String frase = "";
        palindrome.check(frase);
        Assertions.assertTrue(true);
    }

    @Test
    public void check_palindrome_com_valorValido() {
        String frase = "ana";
        Assertions.assertTrue(palindrome.check(frase));
    }

    @Test
    public void check_palindrome_Invalido() {
        String frase = "nana";
        Assertions.assertFalse(palindrome.check(frase));
    }

    //método em aula

    @Test
    //leight menor/igual que 1
    // booleana, esperado true ou false
    public void check_stringLenght1_true (){
        Assertions.assertTrue(palindrome.check("a"));
    }

    @Test
    // lenght maior que 1
    public void check_stringWithSameStartEnd_true() {
        Assertions.assertTrue(palindrome.check("aa"));
    }

    @Test
    // para ser false, não pode ter nenhum caractere e nem ser palindromo
    public void check_nonPalondromeWord_False() {
        Assertions.assertFalse(palindrome.check("as"));
    }

    @Test
    public void check_countPalindromeCalls_true(){
        class PalindromeSpy extends Palindrome{
            public int countCalls = 0;

            @Override
            public boolean check(String word) {
                countCalls++;
                return super.check(word);
            }
        }
        PalindromeSpy spy = new PalindromeSpy();
        spy.check("aa");

        Assertions.assertEquals(2, spy.countCalls);
    }

}