/*****************************************
 * Molly McNutt - mrm2234
 *
 *
 ****************************************/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class PatternMatch {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
   doSomething("bc", "bbcbbbbc|bcbcbc|bcow|bc");
    }


  public static void doSomething(String pattern, String blobs) {
    String[] split = blobs.split("[|]");
    String answer = "";
    int totalCount = 0;
    if (pattern.length() == 0){
      for (String a : split){
        int counter = 0;
        answer += counter + "|";
      }
      answer += totalCount;
      System.out.print(answer);
    }
    else {
      for (String c : split){
        int count = 0;
        for (int i = 0; i< (c.length() - pattern.length() + 1); i++){
          if (c.substring(i, i+pattern.length()).equals(pattern)){
            count++;
            totalCount++;
          }
        }
        answer += count + "|";
      }
      answer += totalCount;
      System.out.print(answer);
    }

  }
}
