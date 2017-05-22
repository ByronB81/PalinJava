import java.util.ArrayList;
import java.util.List;

public class Palinjava {

  String originalString = "ab";

  public List<Object> runPalinjava(String strInput){
    List<Object> result = new ArrayList<Object>();
    result = originalString.split('');

    // result.add("a");
    // result.add("b");
    return result;
  }

}
