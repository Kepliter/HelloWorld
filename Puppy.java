public class Puppy {
	//定义整数类型的小狗年龄
	int PuppyAge;
	//？
	public Puppy (String name) {
		//输出小狗的名字
		System.out.println("小狗的名字是" + name);
	}
	//？
	public void setAge ( int age ) {
		//？
		PuppyAge = age;
	}
	
	public int getAge () {
		System.out.println("小狗的年龄是" + PuppyAge);
		return PuppyAge;
	}
	
	public static void main (String[] args) {
		Puppy myPuppy = new Puppy ("anker");
		myPuppy.setAge (3);
		myPuppy.getAge ();
		System.out.println ("变量值" + myPuppy.PuppyAge);
	}
}