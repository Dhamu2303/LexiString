package lexi;
//import java.util.Arrays;
import java.util.Scanner;

public class lexistring {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		/*System.out.print("Enter the number of string ");
		int n=scanner.nextInt();
		String[] w=new String[n];
		scanner.nextLine();
		System.out.println("Enter the string ");
		for(int i=0;i<n;i++) {
			w[i]=scanner.nextLine();*/
	
		System.out.print("Enter a String s:");
		String s=scanner.nextLine();
		System.out.print("Enter an integer k:");
		int k=scanner.nextInt();
		scanner.close();
		findlexisub(s,k);
	}
	public static void findlexisub(String s,int k) {
		String ssubstring=s.substring(0,k);
		String lsubstring=s.substring(0, k);
		for(int i=1;i<=s.length()-k;i++) {
			String curr=s.substring(i, i+k);
			if(curr.compareTo(ssubstring)<0) {
				ssubstring=curr;
			}
			if(curr.compareTo(lsubstring)>0) {
				lsubstring=curr;
			}
		}
		System.out.println("Lexicographically smallest string of lenght "+k+":"+ssubstring);
		System.out.println("Lexicographically largest string of lenght "+k+":"+lsubstring);
	}

}
