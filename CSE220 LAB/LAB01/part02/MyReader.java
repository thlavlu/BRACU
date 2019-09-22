//Created By THLAVLU18301190
package lab01p02t05;

import java.util.Scanner;

public class MyReader {

    public int readInteger() throws EitaIntegerNoiException {
        Scanner thl = new Scanner(System.in);
        String s = thl.nextLine();
        float d = 0;
        int integer = 0;
        if (s.contains(".")) {
            throw new EitaIntegerNoiException();

        } else {
            integer = Integer.parseInt(s);
        }
        return integer;

    }
}
