import jdk.swing.interop.SwingInterOpUtils;
import java.awt.*;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       /*
       System.out.println("Hello Aidan");

        // strings
        String name = "connie bernardin";
        System.out.println(name.toUpperCase(Locale.ROOT));

        //variables
        int a = 5;
        double b = 10.5 ;

        //arithmetic
        System.out.println(a);
        System.out.println(a * b);
        System.out.println(b);

        //increment
        System.out.println(a--);
        System.out.println(a);
        System.out.println(++b * b);

        //reference types
        Point p1 = new Point(-1, 6);
        System.out.println(p1);

        //strings
          String linda = "Rosa";
          String x = linda;
        System.out.println(linda);
        System.out.println(linda.equals(x));
        System.out.println(x.toUpperCase(Locale.ROOT));
        System.out.println(x.contains("d"));*/

        //Arrays
        String[] names = new String[5];
        names[0] = "Wendy";
        names[1] = "Connie";
        names[2] = "Nikki";
        names[3] = "Molly";
        names[4] = "Caroline";

        //print out list of array values
        System.out.println(Arrays.toString(names));

        //alternative way to store array
        String[] names2 = {"Wendy", "connie", "Nikki"};
        System.out.println(names2[1]); //print second value in array
        names2[0] = null;//to remove a value from array
        names2[1] = "Constance";// to change array value

        //to print out size of array or number of values within array
        System.out.println(names2.length);

    }
}
