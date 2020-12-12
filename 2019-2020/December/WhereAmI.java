import java.util.*;
import java.io.*;

public class WhereAmI {
	static StreamTokenizer in;

	static int nextInt() throws Exception{
		in.nextToken();
		return (int) in.nval;
	}

  static String nextString() throws Exception {
    in.nextToken();
    return (String) in.sval ;
  }

	public static void main(String[] args) throws Exception {
		in = new StreamTokenizer(new BufferedReader(new FileReader("whereami.in")));
        PrintWriter out = new PrintWriter(new File("whereami.out"));

    int total = nextInt();
    String mailboxes = nextString();

    int ans = 0;
    //go through each combination starting with index 0, then 1 etc. all the way to size - 1
    for (int i = 0; i < mailboxes.length(); i++) { //i = starting character
      for (int j = i + 1; j < mailboxes.length(); j++) { //j = ending character
        //when you have a given index string, check if it exists in either of the side substrings
        //if it does not, ans = this new size ONLY if new size < ans
        String stringToCheck = mailboxes.substring(i, j + 1);
        if ((mailboxes.substring(0, i).contains(stringToCheck) ||
         mailboxes.substring(j + 1).contains(stringToCheck)) &&
         stringToCheck.length() > ans) {
           ans = stringToCheck.length();

         }
      }
    }
    //continue until checked all possible

    out.println(ans + 1);
    out.close();

	}
}
