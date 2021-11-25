import java.io.*;

public class TestByteIO {
    public static void main(String args[]) {
        /*---two command line arguments are required
        for this program ------------------------------*/
        if (args.length != 2) {
            System.err.println("You must execute the program with two command line arguments");
            System.exit(1);
        }
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            // Create an input stream for the first file
            input = new FileInputStream(args[0]);
            // Create an output stream for the second file
            output = new FileOutputStream(args[1]);
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
        } catch (IOException ioe) {
            System.err.println("I/O error - " + ioe);
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (IOException ioe) {
                System.err.println("I/O error - " + ioe);
            }

        }

    }
}