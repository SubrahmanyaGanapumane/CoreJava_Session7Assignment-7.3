package session7;

import java.util.Scanner;

public class Assignment7_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the main string: ");
		String string =in.nextLine();
		System.out.println("Enter sub string to be find: ");
	    String apple = in.nextLine();
	    char[] strArr = string.toCharArray();
	    char[] subArr = apple.toCharArray();
	    if(isPresent(subArr, strArr)){
	    	System.out.println("Sub string present in main string");
	    }
	    else{
	    	System.out.println("Substring not found!!");
	    }
	}




public static boolean isPresent(char[] sub, char[] str) {
    for (int i = 0; i < str.length - sub.length+1; i++) {
        for (int j = 0; j < sub.length; j++) {
            if (str[i + j] == sub[j]) {
                if (j == sub.length - 1) {
                    return true;
                }
            } else {
                break;
            }
        }
    }
    return false;
}
}
