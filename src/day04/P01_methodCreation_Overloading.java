package day04;

public class P01_methodCreation_Overloading {
    public static void main(String[] args) {
        dortSayiOrtalamayiBul(12,35,65,128);
        dortSayiOrtalamayiBul(12,35,65,128.0);
    }

    public static void dortSayiOrtalamayiBul(int a, int b, int c,int d) {
        int ort=(a+b+c+d)/4;
        System.out.println("ort1= " + ort);
    }
    public static void dortSayiOrtalamayiBul(double a, double b, double c,double d) {
        double ort=(a+b+c+d)/4;
        System.out.println("ort2= " + ort);
    }




}
