//从java自带程序中找到并导入Scanner
import java.util.Scanner;

public class OperatorDemo {
	public static void main (String[] args) {
		
		/*键盘录入,并赋值给Scanner a;
		 * a是自己起的变量名，此语法格式中只有a可以变
		 */
		Scanner a = new Scanner(System.in);
		System.out.println ("请输入一个三位数的整数");
		
		//将键盘录入的变量a记录，并赋值给整数型数据num
		int num = a.nextInt();
		
		//拆分数据
		int ge = num % 10;
		int shi = num / 10 % 10;
		int bai = num / 10 / 10 % 10;
		System.out.println ("您输入的三位整数为：" + num);
		System.out.println ("整数" + num +"的个位是" + ge);
		System.out.println ("整数" + num +"的十位是" + shi);
		System.out.println ("整数" + num +"的百位是" + bai);
	}
	
}