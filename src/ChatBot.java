import java.util.Scanner;
public class ChatBot<userEntry> {

    // instance variables
    private String name;
    private int number;

    // constructor
    public ChatBot(String chatBotName, int faveNum) {
        name = chatBotName;
        number = faveNum;
    }

    // method that prints a greeting
    public void greeting(String yourName) {
        System.out.println("Hello, " + yourName + " my name is " + name); // name is an instance variable
        System.out.println("and I am a chat bot! How are you today?");
    }

    // method that prints the weather
    public void weather() {
        System.out.println("I actually don't know much about the weather! Ha ha!");
        System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
    }

    // method that converts feet to meters and returns the meters
    public double convertFeetToMeters(int numFeet) {
        final double METERS_PER_FOOT = 0.3048;
        return METERS_PER_FOOT * numFeet;
    }

    // method that prints information about favorite numbers
    public void favoriteNumber(int yourNumber) {
        int distance = yourNumber - number;  // number is an instance variable
        System.out.println("My favorite number is " + number);
        System.out.println("That is " + distance + " away from your number!");
    }

    // method that adds and returns the sum of three numbers
    public int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // method that RETURNS a goodbye message as a String -- note there is no printing here!
    public String goodbye() {
        return "It was nice talking with you! Have a great day! Sincerely, " + name;
    }

    public int subtract(int nu1, int nu2){
        return nu1 - nu2;
    }

    public void nextNumber(int n){
        System.out.println("The number after the one entered is: " + (n + 1));
    }


    // Taken and modified from the web.
    static String keywordsChecker(String shortEssay, String keywords) {
        String usedWord = "none";
        int count = 0;
        String[] word = keywords.split(",");
        for (int i = 0; i < word.length; i++) {
            if (shortEssay.contains(word[i])) {
                usedWord = word[i];
            }
        }
        return usedWord;
    }

    public String check(String userInput) {
        Scanner scan1 = new Scanner(System.in);
        String a = "completed run";
        if (userInput.equals("weather")) {
            weather();
            return a;
        } else if (userInput.equals("feet")) {
            System.out.println("Enter the number of feet you would like to convert to meters: ");
            int feet = scan1.nextInt();
            String ftToM = String.valueOf(convertFeetToMeters(feet));
            System.out.println(feet + " feet to meters is: " + ftToM);
            return a;
        } else if (userInput.equals("favorite")) {
            System.out.println("What is your favorite number?");
            int favNumber = scan1.nextInt();
            favoriteNumber(favNumber);
            return a;
        } else if (userInput.equals("add")) {
            System.out.println("Enter three numbers you would like to add:");
            System.out.println("1:");
            int n1 = scan1.nextInt();
            System.out.println("2:");
            int n2 = scan1.nextInt();
            System.out.println("3:");
            int n3 = scan1.nextInt();
            int additionResult = addNumbers(n1,n2,n3);
            System.out.println(n1 + " + " + n2 + " + " + n3 + " + " + "is equal to " + additionResult + "!");
            return a;
        } else if (userInput.equals("none")) {
            System.out.println("Please enter one of the keywords!");
            return a;
        }
        return a;
    }
}
