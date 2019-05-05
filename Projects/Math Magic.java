// Math Magic

public class Magic {
	public static void main(String[] args) {
		int myNumber = 666;
    // myNumber is the original number
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    System.out.println(stepSix);
    //Output is always 3 no matter what number is set initially
	}
}