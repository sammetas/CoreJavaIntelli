import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxPalindromeSubStringLengthTest {
    MaxPalindromeSubStringLength maxPalindromeSubStringLength ;
    @Before
    public void setUp(){
          maxPalindromeSubStringLength = new MaxPalindromeSubStringLength();
    }

    @Test
    public void testShouldReturnZeroPalindrome(){

        int actual = maxPalindromeSubStringLength.findMaxSubStrPalindrome(null);
        int expecte = 0;

        Assert.assertEquals(actual,expecte);
    }

    @Test
    public void testShouldReturnNinePalindrom(){
         int actual = maxPalindromeSubStringLength.findMaxSubStrPalindrome("malayalam938ndfdknfshad");
         int expected = 9;
         Assert.assertEquals(actual,expected);
    }
}
