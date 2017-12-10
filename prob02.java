import java.util.*;
import java.io.*;

public class prob02 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("prob02-1-in.txt"));
		int ln = sc.nextInt();
		while(sc.hasNextLine()&& ln!=0){
			System.out.println(ln+ " gallons per week will last "+ 10000/ln + " weeks");
			ln=sc.nextInt();
		}

	}

}
