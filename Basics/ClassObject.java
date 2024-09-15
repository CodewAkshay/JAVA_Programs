class Data{
	private int a,b;

	public void setData(){
	a = 10;
	b = 2;
	}
	public void showData(){
	int sum=a+b;
	System.out.println("Sum of Two numbers: "+sum);
	}
}

class ClassObject{
	public static void main(String args[]){
	Data d1 = new Data();
	d1.setData();
	d1.showData();
	}
}