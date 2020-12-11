
public class Palindrome{
	public static void main(String[] args){
		int max = 0;
		int counter = 0;
		//test input
		for(int number1 = 999;number1>499;number1--){
			for(int number2 = 999;number2>100;number2--){
				int answer = number1*number2;
				if(isPalindrome(answer)){
					if(answer>max)
						max = answer;
					break;
				}
				System.out.print("current numbers:"+number1+" * "+number2+"\r");
			}
		}
		System.out.println("\n"+max);
	}
	
	public static boolean isPalindrome(int input){
		String stringInput = Integer.toString(input);
		int front = 0;
		int back = stringInput.length()-1;
		while(true){
			if(stringInput.charAt(front) != stringInput.charAt(back))
				return false;
			if(front>back)
				break;
			front++;
			back--;
		}
		return true;
	}
}