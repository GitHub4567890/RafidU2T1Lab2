import java.util.Scanner;

public class ChatBotRunner {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ChatBot chatbot1 = new ChatBot("Bot", 15);
        System.out.println("Hello! Enter your name!");
        String userName = scan.nextLine();
        chatbot1.greeting(userName);
        String uselessPlaceholder = scan.nextLine();
        System.out.println("Cool!");
        String userInput = "a";
        while (!(userInput.equals("end"))){
                System.out.println("Would you like to check the weather, convert feet to meters, tell me your favorite number, add numbers, or end this chat?");
                System.out.println("Enter weather, feet, favorite, add, or end: ");
                userInput = scan.nextLine();
                String keyWordFound = ChatBot.keywordsChecker("weather, feet, favorite, add, end", userInput);
                chatbot1.check(keyWordFound);
        }
        System.out.println(chatbot1.goodbye());
        }
    }

//        int num  = chatbot1.subtract(7,4);
//        System.out.println(num);
//        chatbot1.nextNumber(4);

//        chatbot1.favoriteNumber(3);
//        chatbot1.weather();
//
//        double feetInMeters = chatbot1.convertFeetToMeters(16);
//        System.out.println("There are " + feetInMeters + "in 16 feet.");
//
//        int result = chatbot1.addNumbers(10, 12, 3);
//        System.out.println("The sum is " + result);
//
//        String bye = chatbot1.goodbye();
//        System.out.println(bye);

//public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter keywords: ");
//        String keyword = input.nextLine();
//        System.out.println("Enter essay: ");
//        String essay = input.nextLine();
//        System.out.println(ChatBot.keywordsChecker(essay, keyword));
//
//    }
