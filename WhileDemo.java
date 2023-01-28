//创建叫做whiledemo的类
public class WhileDemo {
	//主方法
	public static void main (String[] agrs) {
		/*初始化数值10，并赋给整数型数据类型a
		 * 循环：当a<=20时，输出a，啊进行自加
		 * 当a>20时，false，while循环结束，停止执行代码
		 */
		int a = 10;
		while (a <= 20) {
			System.out.println ("a = " + a);
			a++;
			System.out.println ("\n");
		}
	}
}