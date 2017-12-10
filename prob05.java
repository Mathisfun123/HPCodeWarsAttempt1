import java.util.*;
import java.io.*;

public class prob05 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("prob05-1-in.txt"));
		int n = sc.nextInt(); sc.nextLine();
		for(int p= 0; p< n; p++){
			int numtodestroy =sc.nextInt();
			String word = sc.next();
			sc.nextLine();

			String rem = "";
			for(int l = 0; l<word.length()/numtodestroy;l++){
				if(l!=(word.length()/numtodestroy)-1){
					rem+= word.substring((l*numtodestroy)+1,(l+4)*numtodestroy);
				}
			}
			System.out.println(rem);

		}
	}

}
