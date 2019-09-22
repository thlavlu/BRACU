//Created By THLAVLU18301190
package lab01p02t11;
public class Lab01p02t11 {
    public static void main(String[] args) {
          RealNumber rn = new ComplexNumber();
        System.out.println(rn);

        System.out.println("--------------------");

        rn = new ComplexNumber(5, 7);
        System.out.println(rn);

        System.out.println("--------------------");
        ComplexNumber cn = new ComplexNumber();
        cn.check();
    }
}