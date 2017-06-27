import java.util.Scanner;
public class Number {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter no");
	int no=sc.nextInt();
	int i=1, sum=0;
	for(i=1;i<100; i++){
		if(no%i==0){
			sum+=i;
			
		}
	}if(sum==no){
		System.out.println("this is perfect no");
	}
	else{
		System.out.println("this is  not perfect no");
	}
	}
}
	