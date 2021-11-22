public class User{
	private int age;
	public void setAge(int a){
		//添加过滤网筛选合法值
		if(a<0 ||a>150){
			System.out.println("输入年龄不合法");
		    return;
		}
		//程序执行到这里说明年龄合法  进行赋值运算
		age=a;
	}
	
	public int getAge(){
		return age;
	}
}