class Data{
	// protected int a = 12;
	void display(){
	}
}
class Sum extends Data{
	void display(){
	int a = 12;
	int b = 6;
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	}
}

class Jinheritance{
	public static void main(String args[]){
	Sum s = new Sum();
	s.display();
	}
}