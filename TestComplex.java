import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args) {

        double Re, Im, Re1, Im1;
        Complex comp = new Complex();
        Scanner in = new Scanner(System.in);

        System.out.print("Re = ");
        Re = in.nextDouble();
        comp.SetReal(Re);

        System.out.print("Im = ");
        Im = in.nextDouble();
        comp.SetImg(Im);

        comp.ComplexABS();
        comp.ArgComplex();

        System.out.print("Re1 = ");
        Re1 = in.nextDouble();

        System.out.print("Im1 = ");
        Im1 = in.nextDouble();

        System.out.println(comp.ADDRe(Re1)+"+"+"("+comp.ADDIm(Im1)+"i"+")");
        System.out.println(comp.SUBRe(Re1)+"+"+"("+comp.SUBIm(Im1)+"i"+")");
    }
}
