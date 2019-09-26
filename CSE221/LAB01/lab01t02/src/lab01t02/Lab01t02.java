// Hi am Tousif Hasan Lavlu.
// Department of computer science and engineering.
// BRAC University.
package lab01t02;

/**
 *
 * @author 18301190
 */
import java.io.*;

public class Lab01t02 {

    public static void main(String[] args) {
     try {
            File f = new File("D:\\BRACU\\PROGRAMMING\\NetBean\\CSE221\\LAB01\\lab01t02\\input.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String st;

            System.out.println("Output from text file.");
            while ((st = br.readLine()) != null) {
                System.out.println(st);

            }
        } catch (Exception e) {

            System.out.println("Oops, you Are Not TH Lavlu. Firstly, change your file path. You know what to do now.");
        }
    }

}
