import java.util.Arrays;
import java.util.Date;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Stack;

public class HelloWorld {

	static String reverse(String string) {
		StringBuilder str = new StringBuilder();
		
		for(int i = string.length()-1; i>=0; i--) {
			str.append(string.charAt(i));
		}
		
		return str.toString();
	}
	
	static int uniqueIntegers(int [] nums) {
		int i = 0;
		
		if(nums.length == 0) return i;
		
		for(int j = 1; j < nums.length; j++) {
			if(nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}
	
	static int[] twoSum(int nums[], int target) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("There's no two number which sum equals target.");
	}
	
	static int  searchInsert(int[] nums, int target) {
        if(nums.length == 0) return 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target || target < nums[i]){
                return i;
            }
        }
        return nums.length;
    }
	//smallest number between 3 numbers 
	static int smallest(int num1, int num2, int num3) {
		int smallestNum = num1;
		
		if(smallestNum > num2) {
			smallestNum = num2;
		}
		
		if(smallestNum > num3) {
			smallestNum = num3;
		}
		
		return smallestNum;
	}
	//average of 3 numbers 
	static double average(int num1, int num2, int num3) {
		double number = num1 + num2 + num3;
		return number / 3.0 ;
	}
	
	//middle character of str. If str length is even return 2 characters, if str length is odd return 1 character.
	static String middleChar(String str) {
		StringBuilder string = new StringBuilder();
		if(str.length() % 2 == 0) {
			string.append(str.charAt((str.length() / 2) -1));
			string.append(str.charAt(str.length() / 2));
		} else {
			string.append(str.charAt(str.length() / 2));
		}
		
		return string.toString();
	}
	
	//count number of vowels in string 
	static int count_vowels(String str) {
		int vowels = 0;
		
		Stack<Character> vowel_map = new Stack<Character>();
		
		vowel_map.add('a');
		vowel_map.add('e');
		vowel_map.add('i');
		vowel_map.add('o');
		vowel_map.add('u');
		vowel_map.add('A');
		vowel_map.add('E');
		vowel_map.add('I');
		vowel_map.add('O');
		vowel_map.add('U');
		
		for(int i = 0; i < str.length(); i++) {
			if(vowel_map.contains(str.charAt(i))) {
				vowels++;
			}
	}
		return vowels;
	}
	
	//count number of words in string
	static int count_word(String str) {
		int words = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ' || str.charAt(i) == '.') {
				words++;
			}
		}
		return words;
	}
	
	static int sum_of_integers(int num) {
		int result = 0;
		
		while(num > 0) {
			result += num % 10;
			num = num / 10;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int number = 4573;
		
		System.out.println("sum: " + sum_of_integers(number));
		
		/* count number of words in string
		String phrase = "Hello world.";
		
		System.out.println("Number of words in string: " + count_word(phrase));
		*/
		
		/*Number of vowels in string
		String palav = "aeiouvAEIOUV";
		
		System.out.println("number os vowels:" + count_vowels(palav));
		*/
		
		/* middle character 
		String a = "a5cccdsadds";
		
		System.out.println(middleChar(a));
		*/
		/* smallest number and average 
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int a = scan.nextInt();
		System.out.print("Input the Second number: ");
		int b = scan.nextInt();
		System.out.print("Input the third number: ");
		int c = scan.nextInt();
		System.out.println("Smallest number: " + smallest(a,b,c));
		System.out.println("Average: " + average(a,b,c));
		 */
		/*
		//Input: nums = [1,3,5,6], target = 5 Output: 2
		int [] nums = {1,3,5,6};
		
		System.out.println("Insert at position: " + searchInsert(nums,2));
		
		*/
		/* twoSum
		int [] arr = {1,2,3,4,5};
		
		for(int e : twoSum(arr,9)) {
			System.out.print(e + 1);
			System.out.print(" ");
		}
		*/
		
		/* Return number of unique integers
		int[] numbers = {1,1,1,3,4,5};
		
		System.out.println(uniqueIntegers(numbers));
		*/
		
		/* reverse string
		String thisIsString = "Hello world!";
		
		if(thisIsString.isEmpty()) {
			System.out.println("String is empty.");
		}else {
			System.out.println("Original String: " + thisIsString);
			System.out.println("Reversed String: " + reverse(thisIsString));
		}
		*/
		
		/*
		//String as key and Integer as value
		//Hashtable <String, Integer> numbers = new Hashtable<String, Integer>();
		
		//Integer as key and String as value
		Hashtable <Integer, String> numbers = new Hashtable<Integer, String>();
		
		//numbers.put("this", 1);
		//numbers.put("is", 2);
		//numbers.put("sparta", 3);
		
		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		numbers.computeIfAbsent(4, k -> "four");
		numbers.computeIfAbsent(2, k -> "tttt");
		
		System.out.println(numbers.get(4));
		System.out.println(numbers.get(2));
		
		String pav = numbers.get(1);
		
		System.out.println(pav);
		 */
		
		/* implements interface
		BluePen pen = new BluePen();
		
		pen.setColor("blue");
		
		pen.printColor();
		
		pen.write();
		
		pen.earse();
		*/
		
		/* array and sort array 
		int[] numbers = {89,23,2,9,5,4,7,1,34};
		
		int temp;

		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++ ) {
				if(numbers[i]>numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		//loop array
		System.out.println("First form:\n");
		for(int d = 0; d < numbers.length; d++) {
			System.out.println(numbers[d]);
		}
		//simple way to loop array
		System.out.println("Second form:\n");
		for(int integers: numbers) {
			System.out.println(integers);
		}
		*/
		/* Drink Game
		John j = new John();
		
		j.setGender('M');
		j.setName("Joao");
		j.setAge(18);
		
		j.drinkAlcool("whisky");
		j.drinkAlcool("Gin");
		j.drinkAlcool("whisky");
		j.drinkAlcool("Gin");
		j.drinkAlcool("whisky");
		j.drinkAlcool("cola");
		*/
		/* credit cards
		Date date = new Date();
		
		DebitCard card = new DebitCard("yin",3122333,date,151);	
		
		DebitCard gold = new DebitCard("Lobo", 31232133,date,90);
		*/
		
		/* class person
		Person lab_rat = new Person();
		
		lab_rat.setName("John");
		lab_rat.setAge(23);
		lab_rat.setGender('M');
		
		lab_rat.personInfo();
		lab_rat.happyBirthday();
		*/
		
		/* Print hello world
		System.out.println("Hello world!");
		*/
		
		/* create a variable and then print it in console
		int number = 23;
		
		String str = "This is string!";
		
		char ch = 'c';
		
		System.out.println(number);
		System.out.println(str);
		System.out.println(ch);
		*/
		
		/* cicle for 
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		*/
		
		/* if and else statement
		int number = 7;
		
		if(number < 4) {
			System.out.println("Number is greater than 4!");
		}else {
			System.out.println("Chose other number!");
		}
		*/
		
		/* while statement
		int i = 0;
		
		while(i < 10) {
			System.out.println("I'm too small, i need level up!");
			i++;
		}
		
		System.out.println("Finally i'm level " + i +"!!");
		*/
		
		/* do while statement
		int d = 0;
		
		do {
			d++;
		} while(d < 10);
		
		System.out.println("Ups, i'm level " + d + "!!");
		*/
	}

}
