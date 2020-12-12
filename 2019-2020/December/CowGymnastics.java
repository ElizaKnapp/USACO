import java.util.*;
import java.io.*;

public class CowGymnastics {
	static StreamTokenizer in;

	static int nextInt() throws Exception{
		in.nextToken();
		return (int) in.nval;
	}

	public static void main(String[] args) throws Exception {
		in = new StreamTokenizer(new BufferedReader(new FileReader("gymnastics.in")));
        PrintWriter out = new PrintWriter(new File("gymnastics.out"));

    int rounds = nextInt();
    int highVal = nextInt();
    //cows go from 1 to 4 (highVal)
    int[][] cows = new int[rounds][highVal];
    for (int i = 0; i < rounds; i++) {
      for (int j = 0; j < highVal; j++) {
        cows[i][j] = nextInt();
      }
    }
    int first = 0;
    int second = 0;
    int count = 0;
    int total = 0;
    for (int i = 1; i <= highVal; i++) {
      for (int j = i + 1; j <= highVal; j++) {
        for (int k = 0; k < rounds; k++) {
          for (int x = 0; x < highVal; x++) {
            if (cows[k][x] == i) {
              first = x;
            }
            if (cows[k][x] == j) {
              second = k;
            }
          }
          if (first < second) {
            count++;
          }
        }
        if (count == rounds) {
          total++;
        }
      }
    }

    out.print(total);
    out.close();

	}
}
