public class LoopsPractice {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("My name is Connie");
        }
        System.out.println("What grades do you get?");
        int[] grades = {98, 100, 100, 87, 84};
        for (int i = 0; i < 5; i++) {
            System.out.println(grades[i]);
        }
//
        System.out.println("What are your family members called?");
        String[] names = {"Irene", "Molly", "Nikki", "Caroline", "Sheila"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        /* reversing loop */
        System.out.println("now lets reverse!");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        // incrementing only even numbers by incrementing by 2
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        //enhanced for loop
        for (String n : names) {
            System.out.println(n);
        }

        //continue
        System.out.println("Continue statement");
        for (int i=0; i<10; i++){
            if (i==4) {
                continue;
            }
            System.out.println(i);
        }
        //break used to jump out of a loop.
        System.out.println("Break Statement");
        for(int i =1; i<10; i++) {
            System.out.println(i);
            if (i==4) {
                break;
            }
        }
        //while loops through a block of code as long as a specified condition is true
        System.out.println("While Statment");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }}