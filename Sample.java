import java.util.*;
public class Sample {
	public static void PrintSample(int number){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:-");
		int N = sc.nextInt();
		for(int i=1; i<=10; i++){
			System.out.println(N+"*"+i+"="+N*i);
		}
	}
	public static void main(String s[]){
		PrintSample(5);
	}
}