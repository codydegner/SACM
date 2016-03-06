import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Driver {
	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("Q3.txt");
		BufferedReader b = new BufferedReader(f);
		int in = Integer.parseInt(b.readLine());
		while (in!=0){
			int sum = sumInt(in);
			int p = 11;
			while(sumInt(p*in)!=sum){
				p++;
			}
			System.out.println(p);
			in = Integer.parseInt(b.readLine());
		}
		b.close();
	}
	public static int sumInt(int toSum){
		int sum = 0;
		for(int rem = toSum; rem>0; rem/=10){
			sum += rem%10;
		}
		return sum;
	}
}