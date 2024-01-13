/**
 * Author: Ashley DeMott
 * Project: Hello World - Java edition
 */
public class Main {
    public static void main(String[] args) {
        // Variables can be stored in different types
        String hello = "Hello";     // Use double quotes
        char character = 'A';       // Use single quotes
        int count = 0;              // Whole numbers
        double pi = 3.1415926;      // Numbers with decimals
        float score = 45.678F;      // 'F' to indicate float
        boolean isTrue = true;      // True/False values

        // STRINGS //

        // Strings can be added together
        hello += " World!";

        // Can print variables using print/println
        System.out.println(hello);

        // Can also change to upper and lowercase
        System.out.println(hello.toUpperCase());


        // CHARACTERS //

        // Chars can only be one letter long, what does this do?
        character += '!';

        // Can append variables in print/println using '+'
        // See ASCII table: ([A]65 + [!]33 = [b]98)
        System.out.println("A + ! = " + character);


        // INTEGERS //

        // Can use prefix and postfix operators to add 1
        count++;

        // Can use format to place variables in-between text
        // Statements can be on many lines, ended by a semicolon (;)
        System.out.format("%s mississippi, "
                          + "%s mississippi, "
                          + "%s mississippi", count, count++, ++count);
        // Be aware of the differences between postfix and prefix


        // DOUBLES AND FLOATS //

        // Can format doubles and floats so only certain digits appear
        System.out.format("%nPi can be shortened to %.2f", pi);

        // However, this does round up
        System.out.format("%nScore is %.1f", score);


        // BOOLEANS, LOOPS, AND IF/ELSE //

        // For loops are repeated until the middle
        //  statement (start; end; change) is false
        for(int i = 0; i <= 1; i++) {
            // Can use ternary operators to simplify an if/else statement
            System.out.format("%nThis is %strue.", isTrue ? "" : "not ");

            isTrue = !isTrue; // '!' means not, or the opposite boolean value
        }

        // While loops repeat while the statement is true
        System.out.format("%nLooping! ");
        while(isTrue) {
            // If/else, entered if the statement is true
            if(count > 0) {
                System.out.print(count);
                count--;
            }
            // Otherwise, jumps to here
            else {
                isTrue = false;
                System.out.print("Final loop! ");
            }

            // Statement repeated every loop
            System.out.print("... ");
        }

        // Statement reached after the loop is complete
        System.out.print("All done!");
    }
}