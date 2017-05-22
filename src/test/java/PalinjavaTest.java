import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PalinjavaTest {

  // @Test
  // public void runPalinjava_returnStringBoolean_true() {
  //   Palinjava testPalinjava = new Palinjava();
  //   List<Object> expectedOutput = new ArrayList<Object>();
  //   expectedOutput.add("a");
  //   assertEquals(true, expectedOutput instanceof String);
  // }

  @Test
  public void runPalinjava_returnArray_ArrayList() {
    Palinjava testPalinjava = new Palinjava();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add("a");
    expectedOutput.add("b");
    assertEquals(expectedOutput, testPalinjava.runPalinjava("ab"));
  }

  

}
