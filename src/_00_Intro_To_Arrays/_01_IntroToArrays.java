package _00_Intro_To_Arrays;

import java.lang.reflect.Array;
import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array of 5 Strings
//String[] Strings = new String[5];
//Strings[3] = "hello world";
//        // 2. print the third element in the array
//System.out.println(Strings[3]);
//        // 3. set the third element to a different value
//Strings[3] = "hi world";
//        // 4. print the third element again
//System.out.println(Strings[3]);
//        // 5. use a for loop to set all the elements in the array to a string
//        //    of your choice
//for(int i = 0; i<Strings.length; i++) {
//	Strings[i] = "hello";
//}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
//for(int i = 0; i<Strings.length; i++) {
//	System.out.println(Strings[i]);
//}
        // 7. make an array of 50 integers
int[] integers = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
Random r = new Random();
for(int i = 0; i<integers.length; i++) {
	integers[i] = r.nextInt(100);
}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
int check = 100;
	for(int p = 0; p<integers.length; p++) {
		if(integers[p] < check) {
			check = integers[p];
	}
}
	System.out.println(check);

//        // 10 print the entire array to see if step 8 was correct
//for(int i = 0; i<50; i++) {
//	System.out.println(integers[i]);
//}
//        // 11. print the largest number in the array.
check = 0;
for(int p = 0; p<integers.length; p++) {
	if(integers[p] > check) {
	check = integers[p];
	}
}
System.out.println(check);
// 12. print only the last element in the array
System.out.println(integers[49]);
    }
}
