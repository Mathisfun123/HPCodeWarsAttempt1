import java.util.*;
import java.io.*;

public class prob04 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("prob04-2-in.txt"));
		String ln = sc.nextLine();
		while(!ln.equals("0 0")){
			String elem[] = ln.split(" ");
			double basethenpow [] = new double[2];
			for (int i = 0; i < elem.length; i++) {
				basethenpow[i]=Double.parseDouble(elem[i]);
			}
			if(basethenpow[1]<0){
				System.out.printf("%.2f%n",(basethenpow[0]* Math.pow(10,basethenpow[1])));
			}else if(basethenpow[1]>0){
				System.out.printf("%.2f%n",(basethenpow[0]* Math.pow(10,basethenpow[1])));
			}else{
				System.out.printf("%.2f%n",1.00);
			}
			ln= sc.nextLine();
		}
	}

}
