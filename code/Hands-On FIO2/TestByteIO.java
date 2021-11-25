import java.io.*;

public class TestByteIO {
    public static void main(String args[]) {
        /*---two command line arguments are required
        for this program ------------------------------*/
        if (args.length != 2) {
            System.err.println("You must execute the program with two command line arguments");
            System.exit(1);
        }

        try {
            // Create an input stream for the first file
            FileInputStream input = new FileInputStream(args[0]);
            // Create an output stream for the second file
            FileOutputStream output = new FileOutputStream(args[1]);
            /*
             * Read data (bytes) from the input file until the end of file (EOF) is reached
             * ------------------
             */
            int data = input.read();
            while (data != -1) {
                // Send byte to the output file
                output.write(data);
                data = input.read();
            }
            // Close both files
            input.close();
            output.close();
        } catch (IOException ioe) {
            System.err.println("I/O error - " + ioe);
        }
    }
}