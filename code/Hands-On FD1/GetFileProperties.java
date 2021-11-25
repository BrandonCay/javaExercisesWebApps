
/*------------ Program Class GetFileProperties ----------*/
/* receive the pathname of a file as a command line argument
and create the corresponding File instance and output some
of its properties
*/
import java.io.*;

public class GetFileProperties {
    public static void main(String[] args) {
        /*--- create the corresponding File instance -------*/
        File file = new File(args[0]);
        /*----------- output the name of the file ---------*/
        System.out.println("Name:\t" + file.getName());
        /*---------- output the pathname of the file ------*/
        System.out.println("Path:\t" + file.getPath());
        /*--------- Can I write into the file -------------*/
        System.out.println("Can I write into the file?:\t" + file.canWrite());
        /*--------- is the file a directory? --------------*/
        System.out.println("Is file a directory?:\t" + file.isDirectory());
        /*----------output the length of the file ---------*/
        System.out.println("Length:\t" + file.length());
        /*---output the pathname of the file directory-----*/
        System.out.println("Directory:\t" + file.getParent());
    }
}