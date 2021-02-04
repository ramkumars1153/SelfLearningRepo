
class Sub{
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	public void run2() {
		System.out.println("Running2Sub");
	}
}

class Add extends Sub{
	public void add(int a, int b){
		System.out.println(a+b);
	}
	
	public void run1(){
		System.out.println("Running1Add");
	} 
}

public class Inheritance {

	public static void main(String[] args) 
	{
		Add addition = new Add();
		addition.add(15, 11);
		
		Sub subraction = new Sub();
		subraction.sub(22, 11);
		
		addition.run2();

	}

}
