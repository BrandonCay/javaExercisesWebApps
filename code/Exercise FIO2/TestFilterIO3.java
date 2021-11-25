import java.io.*;

public class TestFilterIO3 {
    public static void main(String args[]) {
        int inum = 7;
        double dnum = 10.5;
        String name = "John Doe";
//faster than deleting loops. Less destructive route

        int[] ilist = { inum };
        double[] dlist = { dnum };
        String[] slist = { name };
        int arraySz = 1;
        try {
            /*--- Create a byte-based output stream for the file: fio3.data---*/
            FileOutputStream foutput = new FileOutputStream("fio3.data");
            /* connect a DataOutputStream filter to this stream */
            DataOutputStream doutput = new DataOutputStream(foutput);
            /* write the elements of the arrays into this file */
            for (int i = 0; i < arraySz; i++)
                doutput.writeInt(ilist[i]);
            for (int i = 0; i < arraySz; i++)
                doutput.writeDouble(dlist[i]);
            for (int i = 0; i < arraySz; i++)
                doutput.writeUTF(slist[i]);
            doutput.close();
            foutput.close();
            /* Create a byte-based input stream for the file: fio3.data--- */
            FileInputStream finput = new FileInputStream("fio3.data");
            /* connect a DataInputputStream filter to this tream */
            DataInputStream dinput = new DataInputStream(finput);
            /*- Create an output stream for the file: fio3.txt-*/
            FileOutputStream newfoutput = new FileOutputStream("fio3.txt");
            /*- connect a PrintStream filter to this stream--*/
            PrintStream poutput = new PrintStream(newfoutput);
            /*------read the content of the binary file fio3.data and
             write it into the text file fio3.txt -----------*/
            for (int i = 0; i < arraySz; i++) {
                int inun = dinput.readInt();
                poutput.println(inun);
            }
            for (int i = 0; i < arraySz; i++) {
                double dnum2 = dinput.readDouble();
                poutput.println(dnum2);
            }
            for (int i = 0; i < arraySz; i++) {
                String st = dinput.readUTF();
                poutput.println(st);
            }
            // Close the files
            dinput.close();
            finput.close();
            poutput.close();
            newfoutput.close();
        } catch (IOException ioe) {
            System.err.println("I/O error - " + ioe);
        }
    }
}