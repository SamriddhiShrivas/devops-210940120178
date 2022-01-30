import java.util.Scanner;
class EvenOROdd{
  public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter one number");
	int num = scan.nextInt();
	
	if(num%2 == 0){
		System.out.print(num +" is ");
		System.out.println("even");
	}else {
		System.out.print("this "+num +" is ");
		System.out.println("odd");	
	}
  }
}
