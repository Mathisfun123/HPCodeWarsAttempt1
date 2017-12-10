import java.util.*;
import java.io.*;

public class prob01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("prob01-1-in.txt"));
		while(sc.hasNextLine()){
			String name = sc.nextLine();
			System.out.println("All hail the mighty " + name+" who has protected us for so long" );
		}

	}

}
