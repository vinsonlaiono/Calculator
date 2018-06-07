
public class Calculator {
	public int results;
	public int operandOne;
	public int operandTwo;
	public String operation;
	
	public void Calculater() {
		//Object constructor
	}
	
	// Setter for first operand
	public void setOperandOne(int opOne) {
		operandOne = opOne;
//		System.out.println("First Operand = " + operandOne);
	}
	// Getter for first operand
	public int getOperandOne() {
		return operandOne;
	}
	// Setter for second operand
	public void setOperandTwo(int opTwo) {
		operandTwo = opTwo;
//		System.out.println("First Operand = " + operandTwo);
	}
	// Getter for second operand
	public int getOperandTwo() {
		return operandTwo;
	}
	// Setter for operation
	public void setOperation(String function) {
		operation = function;
	}
	// Getter for operation
	public String getOperation() {
		return operation;
	}
	// Setter for results
	public void setResults(int num) {
		results = num;
//		System.out.println("Results = " + results);
	}
	
	public int performOperation(int firstNum, String function, int secNum ) {
		
		setOperandOne(firstNum);
		setOperation(function);
		setOperandTwo(secNum);
		
		if (getOperation() == "+") {
			setResults(getOperandOne() + getOperandTwo());
		}
		if (getOperation() == "-") {
			setResults(getOperandOne() - getOperandTwo());
		}
		return getResults();
	}
	// Getter for results
	public int getResults() {
		
		System.out.println(getOperandOne() + " " + getOperation() + " " + getOperandTwo() + " = "  + results);
		return results;
	}
	
	

}
