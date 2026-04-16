package Day4;

import java.util.*;

public class StringOperations {

    static String performOperation(String str, int choice) {

        if(choice == 1) {
            System.out.println("Adding string to itself...");
            return str + str;
        }

        else if(choice == 2) {
            System.out.println("Replacing odd positions with #...");
            char arr[] = str.toCharArray();
            for(int i = 0; i < arr.length; i++) {
                if(i % 2 != 0)
                    arr[i] = '#';
            }
            return new String(arr);
        }

        else if(choice == 3) {
            System.out.println("Removing duplicate characters...");
            String result = "";
            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(result.indexOf(ch) == -1)
                    result += ch;
            }
            return result;
        }

        else if(choice == 4) {
            System.out.println("Changing odd positions to uppercase...");
            char arr[] = str.toCharArray();
            for(int i = 0; i < arr.length; i++) {
                if(i % 2 != 0)
                    arr[i] = Character.toUpperCase(arr[i]);
            }
            return new String(arr);
        }

        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Choose operation:");
        System.out.println("1. Add string to itself");
        System.out.println("2. Replace odd positions with #");
        System.out.println("3. Remove duplicate characters");
        System.out.println("4. Change odd positions to uppercase");

        int choice = sc.nextInt();

        String result = performOperation(str, choice);

        System.out.println("Result: " + result);
    }
}
