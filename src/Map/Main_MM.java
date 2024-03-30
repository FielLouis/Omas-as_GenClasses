package Map;

import java.util.Scanner;

public class Main_MM {
    //Note: only properly works (i.e., aesthetically pleasing for the eyes) if the values objects are Strings lol
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMap<Integer, String> myMap = new MyMap<>();
        //objects are integers for keys and strings for values

        char c;
        int key;
        String val;

        System.out.println("==================================== How to Operate ====================================");
        System.out.println("a - adds keys and values, follow with a key (Integer value) and a value (String value)\n\te.g., a 1 hamburger\n\tp.s. only one-worded strings please");
        System.out.println("g - gets value for a specific key, follow with a key (Integer value)\n\te.g., g 1");
        System.out.println("r - removes value for a specific key, follow with a key (Integer value)\n\te.g., r 1");
        System.out.println("p - display arraylists");
        System.out.println("x - exit program");
        System.out.print("========================================================================================\n");

        while(true) {
            System.out.print("\nWhat would you like to do?\n");
            System.out.print("Enter choice: ");
            c = sc.next().charAt(0);

            if(c == 'x') {
                break;
            }

            switch (c) {
                case 'a' -> {
                    key = sc.nextInt();
                    val = sc.nextLine();
                    myMap.put(key, val);
                }
                case 'g' -> {
                    key = sc.nextInt();
                    if(myMap.get(key) == null) {
                        System.out.println("Value: " + myMap.get(key));
                    } else {
                        //i think this only works if values is set to String XD
                        System.out.println("Value: " + myMap.get(key).substring(1));
                    }
                }
                case 'r' -> {
                    key = sc.nextInt();
                    if(myMap.get(key) == null) {
                        System.out.println("Value: " + myMap.remove(key));
                    } else {
                        //i think this only works if values is set to String XD
                        System.out.println("Removed " + myMap.remove(key).substring(1));
                    }
                }
                case 'p' -> myMap.print();
                default -> System.out.println("Error: input is not within choices!");
            }
        }
    }
}
