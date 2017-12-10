import java.util.*;
import java.io.*;

public class prob03 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("prob03-1-in.txt"));
		int n = sc.nextInt(); sc.nextLine();
		for(int p = 0; p< n;p++){
			String word = sc.nextLine();
			String [] characters = word.split("");
			Arrays.sort(characters); boolean condition = false;
			for (int i = 0; i < characters.length-1; i++) {
				if(characters[i].equals(characters[i+1])){
					condition=true;
				}
			}
			if(condition){
				System.out.println("likes "+word );
			}else{
				System.out.println("hates "+word);
			}
		}
	}

}
