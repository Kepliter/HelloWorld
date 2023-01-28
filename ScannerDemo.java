import java.util.Scanner;
public class ScannerDemo {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println ("请输入您的姓名");
		String name = sc.next();
		System.out.println (name);
		
		System.out.println ("请输入您的年龄");
		int age = sc.nextInt();
		System.out.println (age);
		
		System.out.println ("请输入您的身高");
		double height = sc.nextDouble();
		System.out.println (height);
		
		System.out.println ("请输入您的性别");
		String gender = sc.next();
		System.out.println (gender);
		
		System.out.println ("是否已婚");
		boolean flag = sc.nextBoolean();
		System.out.println (flag);
		
		System.out.println ("恭喜您成为我们的会员");
		}
}