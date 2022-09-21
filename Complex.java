public class Complex {
    double Re, Im;

    Complex(){
        System.out.println("Введите действительную и мнимую часть комплексного числа:");

    }
    Complex(double _Re, double _Im){
        Re = _Re;
        Im = _Im;

    }
    double GetRe() {return Re;}
    double GetIm() {return Im;}

    double ComplexABS(double Re, double Im){
        var a = Math.pow(Re, 2); 
        var b = Math.pow(Im, 2); 
        double c = a + b;
        double ModuleCompl = Math.sqrt(c);
        System.out.println("Модуль комплексного числа: " + ModuleCompl);  
        return ModuleCompl;
    }

    double ArgComplex(double Re, double Im){
        double argComplex;
        if (Re > 0 && Im > 0) {//1
            argComplex = Math.atan(Im/Re);
            System.out.println(argComplex);
            return argComplex;
        }else if(Re > 0 && Im < 0){//2
            argComplex = Math.atan(Im/Re);
            System.out.println(argComplex);
            return -argComplex;
        }else if(Re < 0 && Im > 0){//3
            argComplex = Math.PI - Math.atan(Im/Re);
            System.out.println(argComplex);
            return argComplex;
        }else if(Re < 0 && Im < 0){//4
            argComplex = -Math.PI + Math.atan(Im/Re);
            System.out.println(argComplex);
            return argComplex;
        }else if(Re == 0 && Im > 0){//5
            argComplex = Math.PI/2;
            System.out.println(argComplex + "= pi/2");
            return argComplex;
        }else if(Re == 0 && Im < 0){//6
            argComplex = -Math.PI/2;
            System.out.println(argComplex + "= -pi/2");
            return argComplex;
        }else if(Re > 0 && Im == 0){//7
            argComplex = 0;
            System.out.println(argComplex);
            return argComplex;
        }else if(Re < 0 && Im == 0){//8
            argComplex = Math.PI;
            System.out.println(argComplex + "= pi");
            return argComplex;
        }else{
            System.out.println("impasible");
            return 0;
        }
    }

    double ReComplexPlus(double Re1, double Re2){
        double Re3;
        Re3 = Re1 + Re2;
        return Re3;
    }
    double ImComplexPlus(double Im1, double Im2){
        double Im3;
        Im3 = Im1 + Im2;
        return Im3;
    }
    double ReComplexMinus(double Re1, double Re2){
        double Re3;
        Re3 = Re1 - Re2;
        return Re3;
    }
    double ImComplexMinus(double Im1, double Im2){
        double Im3;
        Im3 = Im1 + Im2;
        return Im3;
    }
}
