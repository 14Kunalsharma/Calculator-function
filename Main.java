import java.util.*;
class Main {
	public static int cal(int x, int y){
		int add=x+y;
		System.out.println("Add="+add);
		int sub=x-y;
		System.out.println("Sub="+sub);
		int mul=x*y;
		System.out.println("Mul="+mul);
		int div=x/y;
		System.out.println("Div="+div);
		return 0;
		}
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of x: 		");
		int x=sc.nextInt();
		System.out.print("Enter value of y: 		");
		int y=sc.nextInt();
		cal(x,y);
    }
}