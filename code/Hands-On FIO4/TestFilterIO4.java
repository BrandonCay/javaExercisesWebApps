import java.io.*;

public class TestFilterIO4 {
    public static void main(String args[]) {
        int[] ilist = { 2, 13, 24, 35, 46 };
        double[] dlist = { 3.5, 13.6, 24.7, 35.8, 46.9 };
        String[] slist = { "John", "Mark", "Peter", "Ann", "Vicky" };
        try {
            /*--- Create a byte-based output stream for the file: fio4.data---*/
            FileOutputStream foutput = new FileOutputStream("fio3.data");
            /*--- connect a BufferedOutputStream filter to this stream---*/
            BufferedOutputStream boutput = new BufferedOutputStream(foutput);
            /*- connect a DataOutputStream filter to the BufferedOutputStream
            filter --*/
            DataOutputStream doutput = new DataOutputStream(boutput);
            /*-----write the elements of the arrays into this file -----------*/
            for (int i = 0; i < 5; i++)
                doutput.writeInt(ilist[i]);
            for (int i = 0; i < 5; i++)
                doutput.writeDouble(dlist[i]);
            for (int i = 0; i < 5; i++)
                doutput.writeUTF(slist[i]);
            doutput.close();
            boutput.close();
            foutput.close();
            /*--- Create a byte-based input stream for the file: fio4.data---*/
            FileInputStream finput = new FileInputStream("fio3.data");
            /*--- connect a BufferedInputStream filter to this stream---*/
            BufferedInputStream binput = new BufferedInputStream(finput);
            /*- connect a DataInputStream filter to the BufferedInputStream
            filter --*/
            DataInputStream dinput = new DataInputStream(binput);
            // © 2011 Gilbert Ndjatou Page 323
            /*--- Create an output stream for the file: fio4.txt---*/
            FileOutputStream newfoutput = new FileOutputStream("fio3.txt");
            /*------- connect a PrintStream filter to this stream-----*/
            PrintStream poutput = new PrintStream(newfoutput);
            // *-------read the content of the binary file fio3.data and
            // write it into the text file fio4.txt -----------------------*/
            for (int i = 0; i < 5; i++) {
                int inun = dinput.readInt();
                poutput.println(inun);
            }
            for (int i = 0; i < 5; i++) {
                double dnum = dinput.readDouble();
                poutput.println(dnum);
            }
            for (int i = 0; i < 5; i++) {
                String st = dinput.readUTF();
                poutput.println(st);
            }
            // Close the files
            dinput.close();
            binput.close();
            finput.close();
            poutput.close();
            newfoutput.close();
        } catch (IOException ioe) {
            System.err.println("I/O error - " + ioe);
        }
    }
}