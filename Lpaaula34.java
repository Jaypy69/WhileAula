package LPAlore;
import java.util.Scanner;
public class Lpaaula34 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int p=0, i=0, x=0, n;
		
		while (x<=3) {
			System.out.println("Mostre um número");
			n=ler.nextInt();
			if(n%2!=0) {
				i=i+1;
			}
			else {
				p=p+1;
			}
			x++;
		}
		System.out.println("Quantidade de pares: "+p);
		System.out.println("Quantidade de ímpares: "+i);
		ler.close();
	}

}
