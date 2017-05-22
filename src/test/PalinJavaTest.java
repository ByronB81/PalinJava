import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PalinJavaTest {

  @Test
  public void runPalinJava_returnString_ArrayList() {
    Palindrome testPalindrome = new Palindrom();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add("ab");
    assertEquals(expectedOutput, testPalindrome.runPalinJava("ab"));
  }

}
