package com.bnta.week_one_fri;

public class Exercise3 {
    public static void main (String[] args) {
        /*
//            Write a program that reverses an array of Strings
//            String[] content = {"you", "are", "how", "hello"}
//            Tip. Use for loop and you to start at highest index.
//            Output should be: hello how are you?. Note question mark at the end
//        */
        String[] content = {"you", "are", "how", "hello"};
        System.out.println(" lets reverse!!");

        String result = "";
        for (int i = content.length - 1; i >= 0; i--) {
          //  System.out.println(content[i]);
            result += content[i] + " "; //combines each reverse line plus a space
        }

        System.out.println(result.substring(0, result.length() - 1) + "?"); //substring selects certain part of code
                                                                            // 0 denotes starting point of code
                                                                            //result.length denotes end point
                                                                            // -1 removes space
    }
}