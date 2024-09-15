class Data {
    int a, b;

    // Constructor to initialize values
    Data(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to demonstrate arithmetic operators
    void arithmeticOperations() {
        System.out.println("Arithmetic Operations:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulus
    }

    // Method to demonstrate relational operators
    void relationalOperations() {
        System.out.println("\nRelational Operations:");
        System.out.println("a == b: " + (a == b));  // Equal to
        System.out.println("a != b: " + (a != b));  // Not equal to
        System.out.println("a > b: " + (a > b));    // Greater than
        System.out.println("a < b: " + (a < b));    // Less than
        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to
        System.out.println("a <= b: " + (a <= b));  // Less than or equal to
    }

    // Method to demonstrate logical operators
    void logicalOperations() {
        System.out.println("\nLogical Operations:");
        boolean x = (a > b);
        boolean y = (a < b);

        System.out.println("x && y: " + (x && y));  // Logical AND
        System.out.println("x || y: " + (x || y));  // Logical OR
        System.out.println("!x: " + (!x));          // Logical NOT
    }

    // Method to demonstrate bitwise operators
    void bitwiseOperations() {
        System.out.println("\nBitwise Operations:");
        System.out.println("a & b: " + (a & b));   // Bitwise AND
        System.out.println("a | b: " + (a | b));   // Bitwise OR
        System.out.println("a ^ b: " + (a ^ b));   // Bitwise XOR
        System.out.println("~a: " + (~a));         // Bitwise NOT
        System.out.println("a << 2: " + (a << 2)); // Left shift
        System.out.println("a >> 2: " + (a >> 2)); // Right shift
    }

    // Method to demonstrate assignment operators
    void assignmentOperations() {
        System.out.println("\nAssignment Operations:");
        int c = a;  // Assign
        System.out.println("c = a: " + c);
        c += b;     // Add and assign
        System.out.println("c += b: " + c);
        c -= b;     // Subtract and assign
        System.out.println("c -= b: " + c);
        c *= b;     // Multiply and assign
        System.out.println("c *= b: " + c);
        c /= b;     // Divide and assign
        System.out.println("c /= b: " + c);
        c %= b;     // Modulus and assign
        System.out.println("c %= b: " + c);
    }
}


class Operator{
	public static void main(String args[]){

		Data d1 = new Data(10,2);

		d1.arithmeticOperations();
        d1.relationalOperations();
        d1.logicalOperations();
        d1.bitwiseOperations();
        d1.assignmentOperations();

	}
}