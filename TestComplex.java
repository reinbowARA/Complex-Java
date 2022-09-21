import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args) {

        double Re, Im, ComplxAbs, ArgComplx;

        Complex start = new Complex();
        //-----------------------------------
        Scanner in = new Scanner(System.in);
        System.out.print("Re1 = ");
        Re = in.nextDouble();
        System.out.print("Im1 = ");
        Im = in.nextDouble();
        //System.out.print("Вы ввели:  ");
        System.out.print("Re2 = ");
        double Re2 = in.nextDouble();
        System.out.print("Im2 = ");
        double Im2 = in.nextDouble();
       /*  if(Re == 0){
            if (Im < 0) {
                var ModIm = Math.abs(Im);
                System.out.println(" - i * "+ ModIm);
            }else{
            System.out.println("i * "+Im);
            }
        }
        else if(Im == 0){
            System.out.println(Re);
        }
        else if (Im < 0) {
            var ModIm = Math.abs(Im);
            System.out.println(Re + " - i * "+ ModIm);
        }
        else{
            System.out.println(Re + " + i * "+Im);
        }/* */
        //--------------------------------------------
        Complex complex = new Complex(Re, Im);
        Re = complex.GetRe();
        Im = complex.GetIm();
        ComplxAbs = complex.ComplexABS(Re, Im);
        System.out.print("Аргумент комплексного числа: ");
        ArgComplx = complex.ArgComplex(Re, Im);
        System.out.println(complex.ReComplexPlus(Re, Re2) + " "+ complex.ImComplexPlus(Im, Im2));
    }
}
