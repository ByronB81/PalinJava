import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PalinjavaTest {

  @Test
  public void runPalinjava_returnString_ArrayList() {
    Palinjava testPalinjava = new Palinjava();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add("ab");
    assertEquals(expectedOutput, testPalinjava.runPalinJava("ab"));
  }

}
