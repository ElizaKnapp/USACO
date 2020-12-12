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

    out.println(mailboxes);

    out.close();

	}
}
