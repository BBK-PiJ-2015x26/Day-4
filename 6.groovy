//Integer2 Class
class Integer2 {
	int value
	//Method that return this value as in int (getter)
	int getValue() {
		return value
	}
	//Setter method
	void setValue(int value) {
		this.value = value
	}
	// Returns true if number is even, false otherwise
	boolean isEven() {
		if (value % 2 == 0) {
			return true
		} else if (value % 2 == 1) {
			return false
		}
	}
	// Returns true if number is odd, false otherwise
	boolean isOdd() {
		if (value % 2 == 1) {
			return true
		} else if (value % 2 == 0) {
			return false
		}
	}
	void prettyPrint() {
		println value
	}
	String toString() {
		String s = String.valueOf(value)
		return s 
	}
}
	
Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);
print "The number you entered is "
if (i2.isEven()) {
println "even.";
} else if (i2.isOdd()) {
println "odd.";
} else {
println "undefined!! Your code is buggy!";
}
int parsedInt = Integer.parseInt(i2.toString());
if (parsedInt == i2.getValue()) {
println("Your toString() method seems to work fine.");
}
