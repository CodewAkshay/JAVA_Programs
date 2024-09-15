import java.util.*;

class StackData{
	public static void main(String[] args){
	Stack<String> stack = new Stack<>();


	stack.push("Amravati");
	stack.push("Mumbai");
	stack.push("Pune");
	stack.push("Kolhapur");
	stack.push("Sambhajinagar");

	System.out.println("Stack : "+stack);
	stack.pop();
	System.out.println("After Pop : "+stack);
	
	System.out.println("After Peek : "+stack.peek());
	}
}
