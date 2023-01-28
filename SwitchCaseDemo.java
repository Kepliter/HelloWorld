public class SwitchCaseDemo {
	public static void main (String[] args) {
		
		/*定义字符型数据变量grade，
		 * 将B赋值给grade，
		 */
		char grade = 'B';
		switch (grade) {
		case 'A' :
			System.out.println ("优秀");
			
			/*break可写可不写，
			 * 作用：case值成功匹配switch之后，跳出switch语句。
			 * 		如果不写，匹配成功后程序不跳出，
			 * 		从匹配成功开始，往后的代码全部执行。
			 */
			break;
		case 'B' :
		case 'C' :
			System.out.println ("良好");
			break;
		case 'D' :
			System.out.println ("及格");
			break;
		
			//default可写可不写，变量在case值中未匹配到相同值时执行
		default:
			System.out.println ("等级未知");
		}
		System.out.println ("成绩是" + grade);
	}
}