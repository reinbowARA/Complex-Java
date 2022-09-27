public class Complex {
    double Re, Im;

    Complex(){
        System.out.println("Введите действительную и мнимую часть комплексного числа:");
    }
    public Complex(double Re, double Im){
        this.Re = Re;
        this.Im = Im;
    }
    public void SetReal(double Real){this.Re = Real;}
    double GetRe() {return Re;}
    public void SetImg(double Imges){this.Im = Imges;}
    double GetIm() {return Im;}


    double ComplexABS(){
        var a = Math.pow(Re, 2); 
        var b = Math.pow(Im, 2); 
        double c = a + b;
        double ModuleCompl = Math.sqrt(c);
        System.out.println("Модуль комплексного числа: " + ModuleCompl);  
        return ModuleCompl;
    }

    double ArgComplex(){
        System.out.print("Аргумент комплексного числа: ");
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
    double ADDRe(double Real){return Re + Real;} 
    double ADDIm(double Imges){return Im + Imges;}
    double SUBRe(double Real){return Re - Real;}
    double SUBIm(double Imges){return Im - Imges;} 
}
