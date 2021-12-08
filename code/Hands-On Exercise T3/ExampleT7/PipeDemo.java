package ExampleT7;

import java.io.*;

public class PipeDemo extends Thread {
    PipedOutputStream output;

    // Create an instance of the PipeDemo class
    public PipeDemo(PipedOutputStream out) {
        // Copy to local member variable
        output = out;
    }

    public void run() {
        try {
            // Strings to be sent to the treat executing the main method
            String[] slist = { "John", "Mark", "Peter", "Ann", "Vicky" };
            // Create a DataOutputStream (as a filter)for convenient writing
            DataOutputStream doutput = new DataOutputStream(output);
            // Send the strings to the tread that execute the method main
            for (String element : slist)
                doutput.writeUTF(element);
            // Close the stream
            doutput.close();
        } catch (Exception e) {
            // no code req'd
        }
    }

    public static void main(String args[]) {
        try {
            // Create a pipe for writing into by the writer thread
            PipedOutputStream pout = new PipedOutputStream();
            // Create a pipe for reading from by the thread executing method main,
            // and connect it to output pipe of the writer thread
            PipedInputStream pin = new PipedInputStream(pout);
            /* connect a DataInputputStream filter to this pipe for reading convenience */
            DataInputStream dinput = new DataInputStream(pin);
            // Create a new pipeDemo thread to write to our pipe
            PipeDemo pipedemo = new PipeDemo(pout);
            // Start the thread
            pipedemo.start();
            // Wait until the writer tread terminates before you continue
            PipeDemo.join();//perhaps Create Object first not static according to gfg
            // read the strings that the writer tread has written into the pipe and print it
            for (int i = 1; i <= 5; i++) {
                String st = dinput.readUTF();
                System.out.println(st);
            }
        } catch (Exception e) {
            System.err.println("Pipe error " + e);
        }
    }
}
