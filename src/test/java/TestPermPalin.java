import com.howtocrack.coding.interview.IsPermOfAStringPalindrome;
import org.junit.Assert;
import org.junit.Test;

public class TestPermPalin {

    @Test
    public void testPermPalindrome(){
        IsPermOfAStringPalindrome isPermOfAStringPalindrome = new IsPermOfAStringPalindrome();
        boolean actual = isPermOfAStringPalindrome.isPermutationsIsPalindrome("mamamam");
        Assert.assertEquals(true,actual);
        boolean actual1 = isPermOfAStringPalindrome.isPermutationsIsPalindrome("Tact Coa");
         Assert.assertEquals(true,actual1);

    }
}
