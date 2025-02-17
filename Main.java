import java.util.Scanner;

public class Main {


    // Method (Q1) to find the smallest number
    public static double smallestNum(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    // Method (Q2) to check if the number is positive, negative, or zero
    public static void check(int num) {
        if (num > 0) {
            System.out.println("The Number { " + num + " } is positive( + )");
        } else if (num < 0) {
            System.out.println("The Number { " + num + " } is negative( - )");
        } else {
            System.out.println("The Number { " + num + " } is is zero");
        }
    }

    public static boolean password(String password) {
        //    نتاكد من طول الكلمة اذا اقل من 8 ،اذا اقل خلاص يطلع من method
        if (password.length() < 8) {
            return false; //
        }
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            // نتاكد من باسورد انه يتكون من أحرف وأرقام فقط. استعملت  method جاهزة ترجع false او true
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            // نتاكد من باسورد انه رقم
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        // نتاكد من باسورد انها تحتوي على رقمين
        return digitCount >= 2;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//     Q1  Write a Java method to find the smallest number among three numbers.
        System.out.println("*******************");
        System.out.println("----- Smallest number -----");
        System.out.print("Please enter first number: ");
        int numFirst = input.nextInt();
        System.out.print("Please enter Second number: ");
        int numSecond = input.nextInt();
        System.out.print("Please enter third number: ");
        int numThird = input.nextInt();
        System.out.println("The smallest number is  " + smallestNum(numFirst, numSecond, numThird));
//    Q2 Write a Java method that check if the entered number is negative or  positive or zero.
        System.out.println("*******************");
        System.out.println("----- number is negative(-) or positive(+) or zero(0)-----");
        System.out.print("Please enter  number: ");
        int numQ2 = input.nextInt();
        check(numQ2);
//   Q 3 Write a Java method to check whether a string is a valid password.
        System.out.println("*******************");
        System.out.println("----- Password -----");

        System.out.print(
                "1- A password must have at least eight characters.\n" +
                        "2- A password consists of only letters and digits.\n" +
                        "3- A password must contain at least two digits \n");
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.) : ");
        String pw = input.next();
        if (password(pw)) {
            System.out.println("Password is valid: " + pw);
        } else {
            System.out.println("NOT Password is valid: " + pw);

        }
    }
}