package Day1;

public class CheckNumber {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if (num > 0)
            System.out.println("Positive number");
        else if (num < 0)
            System.out.println("Negative number");
        else
            System.out.println("Zero");
    }
}
