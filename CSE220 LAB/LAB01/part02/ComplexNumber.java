//Created By THLAVLU18301190
package lab01p02t11;

public class ComplexNumber extends RealNumber {
    public double imaginaryPart=1;
    public ComplexNumber(){
        super.setRealValue(1);
    }
    public ComplexNumber(double rp,double ip){
    imaginaryPart=ip;
    super.setRealValue(rp);
    }
    public String toString(){
    return "RealPart: "+super.getRealValue()+"\nImaginaryPart: "+imaginaryPart;
    }
    public void check(){
    System.out.println("I'm in ComplexNumber class");
    super.ping();
    System.out.println("checking ended");
    }
}
