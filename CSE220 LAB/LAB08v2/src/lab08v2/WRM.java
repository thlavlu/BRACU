// HI, WELCOME TO MY PROGRAM.
// I AM THLAVLU, A BRACU STUDENT.
// FOR FURTHURE, YOU CAN FIND ME..
// https://github.com/compboy
// (-:)
//
package lab08v2;

/**
 *
 * @author thlavlu
 */
import java.util.Scanner;

public class WRM {

    Scanner k = new Scanner(System.in);
    Queuedata Qdata = new Queuedata();

    public void RegisterPatient() throws QueueOverflowException {
        Patient p = null;
        try {
            System.out.println("Patient name");
            String na = k.nextLine();
            System.out.println("Patient Blood group");
            String blood = String.valueOf(k.next());
            System.out.println("Patient AGE");
            int age = k.nextInt();
            p = new Patient(na, age, blood);
        } catch (Exception e) {
            System.out.println("wrong input");
        }
        Qdata.Enqueue(p);
    }

    public void ServePatient() throws QueueUnderflowException {
        System.out.println(Qdata.Dequeue() + " Served\n");
    }

    public void CancelAll() throws QueueUnderflowException {
        if (Qdata.isEmpty() == true) {
            System.out.print("Cancalled\n");
        } else {
            for (int c = Qdata.front; c < Qdata.front + Qdata.size; c++) {
                Qdata.Dequeue();
            }
            System.out.print("Cancalled\n");
        }
    }

    public boolean CanDoctorGoHome() {
        if (Qdata.isEmpty() == true) {
            return true;
        } else {
            return false;
        }
    }

    public void ShowAllPatient() {
        if (Qdata.isEmpty() == true) {
            System.out.println("None Available");
        }
        Patient min;
        Patient temp;
        int minL = 0;
        Patient[] prr = new Patient[Qdata.size];
        for (int i = 0, c = Qdata.front; i < Qdata.size && i < prr.length; i++, c++) {
            prr[i] = (Patient) Qdata.qArray[c];
        }
        for (int i = 0; i < prr.length; i++) {
            min = prr[i];
            for (int c = i + 1; c < prr.length; c++) {
                if (min.getName().charAt(0) > prr[c].getName().charAt(0)) {
                    min = prr[c];
                    minL = c;
                }
            }
            if (prr[i] != min) {
                temp = prr[i];
                prr[i] = min;
                prr[minL] = temp;
            }
        }
        for (int i = 0; i < prr.length; i++) {
            System.out.print(prr[i].toString() + " ");
        }
    }
}
