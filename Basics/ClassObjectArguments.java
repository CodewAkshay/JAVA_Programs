class Data{
	private int a,b;

	public void setData(int x, int y){
	a = x;
	b = y;
	}
	public void showData(){
	int sum=a+b;
	System.out.println("Sum of Two numbers: "+sum);
	}
}

class ClassObjectArguments{
	public static void main(String args[]){
	Data d1 = new Data();
	d1.setData(10,2);
	d1.showData();
	}
}