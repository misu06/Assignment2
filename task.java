import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class task {

    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);
        boolean m = true; // Initialize the loop control variable

        do {
            System.out.println("Press 1 for task 1");
            System.out.println("Press 2 for task 2");
            System.out.println("Press 3 for task 3");
            System.out.println("Press 4 for task 4");
            System.out.println("Press 5 for task 5");
            System.out.println("Press 6 for task 6");
            System.out.println("Press 7 for task 7");
            System.out.println("Press 8 for task 8");
            System.out.println("Enter your choice");

            int choice = cout.nextInt();
            cout.nextLine(); // Consume the newline character

            switch (choice) {

                // For case 1

                case 1: {
                    System.out.println("Enter the string you want to check if it is a palindrome:");
                    String s = cout.nextLine();
                    String revStr = new StringBuilder(s).reverse().toString();
                    if (s.equalsIgnoreCase(revStr)) {
                        System.out.println("It's a palindrome!");
                    } else {
                        System.out.println("It's not a palindrome.");
                    }

                }
                break;


                //for case 2

                case 2:
                {
                    System.out.println("Enter an Email address: ");
                    String email = cout.nextLine();
                    Pattern pattern = Pattern.compile("^[a-zA-Z0-9.]+@gmail\\.com$");

//Pattren pattren1=Pattern.compile("[a-zA-Z]@gmail\\.com");

                    Matcher match = pattern.matcher(email);
                    boolean c = match.matches();
                    System.out.println("Is the Email valid = "+c);
                }
                break;


                //for case 3

                case 3:
                {

                    LocalDate date=LocalDate.now();
                    System.out.println("Date of format yyyy-mm-dd: ");
                    System.out.println("The local date is : "+date);
                    System.out.println("===========================");
                    System.out.println("Date of format dd-mm-yyyy: ");
                    DateTimeFormatter formatee=DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    String formatedDate=date.format(formatee);
                    System.out.println("the local date now is : "+formatedDate);

                }
                break;


                //for case 4

                case 4:
                {
                    LocalDate date=LocalDate.now();
                    System.out.println("Date of format yyyy-mm-dd: ");
                    System.out.println("The local date is: "+date);
                    System.out.println("==========================");
                    LocalDate daysPlusDate=date.plusDays(30);
                    System.out.println("Date of format dd-mm-yyyy: ");
                    DateTimeFormatter formatee=DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    String formatedDate=daysPlusDate.format(formatee);
                    System.out.println("the local date now is : "+formatedDate);

                }
                break;

                //for case 5
                case 5:
                {
                    System.out.println("Enter a number:");
                    String inputString = cout.nextLine();
                    int number = Integer.parseInt(inputString);

                    // Roman numeral symbols and their corresponding values
                    String[] romanSymbol = { "M",  "CM", "D", "C",  "XC", "L",  "X", "IX", "V", "I" };
                    int[] romanValue = { 1000, 900, 500, 100, 90, 50, 10, 9, 5, 1 };

                    StringBuilder romanNumeral = new StringBuilder();

                    // Convert the integer to a Roman numeral
                    for (int i = 0; i < romanValue.length; i++) {
                        int quotient = number / romanValue[i];
                        if (quotient == 0) continue;

                        // Handle cases like 4, 9 where subtraction is used
                        if (quotient == 4 && i > 0) {
                            romanNumeral.append(romanSymbol[i]).append(romanSymbol[i - 1]);
                        } else {
                            romanNumeral.append(romanSymbol[i].repeat(quotient));
                        }

                        number = number % romanValue[i];
                    }

                    System.out.println("Roman numeral = " + romanNumeral);

                }
                break;


                //for case 6


                case 6:
                {
                    System.out.println("Enter your special charater..!");
                    String userString= cout.nextLine();
                    if (userString.equals("()")||userString.equals("{}")||userString.equals("[]")||userString.equals("(){}")||userString.equals("{}[]")||userString.equals("(){}[]"))
                    {
                        System.out.println("true");
                    }
                    else{
                        System.out.println("false");
                    }
                }
                break;

                //for case 7


                case 7:
                {
                    System.out.println("Enter the number of strings: ");
                    int n = cout.nextInt();
                    cout.nextLine();
                    String[] userStrings = new String[n];
                    System.out.println("=========================");
                    System.out.println("Enter the strings: ");
                    for (int i = 0; i < n; i++) {
                        userStrings[i] = cout.nextLine();
                    }
                    System.out.println("==========================");
                    for (int i = 0; i < userStrings.length; i++) {
                        if (userStrings[i].isEmpty()) {
                            System.out.println("string is empty..!");
                            break;
                        } else {
                            System.out.println(userStrings[i]);
                        }
                    }
                    System.out.println("---------------------------");

                    String prefix = userStrings[0];

                    for (int i = 1; i < userStrings.length; i++) {
                        while (userStrings[i].indexOf(prefix) != 0) {
                            prefix = prefix.substring(0, prefix.length() - 1);
                            if (prefix.isEmpty()) {
                                System.out.println("prefix is empty");

                            } else {
                                System.out.print(prefix + ",");
                            }
                        }
                    }

                }
                break;


                //for case 8

                case 8:
                {
                    System.out.println("Entered a string");
                    String Str = cout.nextLine();
                    String newStr = "";
                    System.out.println("entered String ->" + Str);
                    if (Str.isEmpty()) {
                        System.out.println("the string is empty..!");
                    }
                    char[] arr = Str.toCharArray();
                    for (int i = 0; i < arr.length; i++) {
                        int j;
                        for (j = 0; j < arr.length; j++) {
                            if (arr[j] == arr[i]) {
                                break;
                            }
                        }
                        if (i == j) {
                            newStr += arr[i];
                        }
                    }
                    System.out.println("New String after removal of duplication->" + newStr);
                    char[] arr1 = newStr.toCharArray();
                    Arrays.sort(arr1);
                    newStr = String.valueOf(arr1);
                    System.out.println("new string after sorting -> "+newStr);

                }
                break;

                // Add other cases here for tasks 2 to 8 as needed
                default: {
                    System.out.println("Invalid choice. Please try again.");
                }
                break;
            }

            System.out.println("Do you want to continue? (true/false)");
            m = cout.nextBoolean();
            cout.nextLine(); // Consume the newline character
        } while (m);
    }
}