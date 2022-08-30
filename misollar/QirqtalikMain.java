package misollar;

import java.util.Scanner;

public class QirqtalikMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("sonni kiriting:");
        Float a =  scanner.nextFloat();             // scanner.nextFloat();
        float P = 4 * a;
        float PI = 3.14f;
//        float S = (float) Math.pow(a, 2f);
//        System.out.println("1- misol: "+P);
//        System.out.println("2- misol: "+S);
//        float L = PI * a;
//        System.out.println("4- misol: "+L);
//        float V = (float) Math.pow(a, 3f);
//        float S2 = 6 * a * a;
//        System.out.printf("5-misol hajm: %f   sirti: %f", V,S2);
//        System.out.println("b= ");
//        Float b =  scanner.nextFloat();
//        float son = (float) Math.sqrt(a*b);
//        System.out.println("9-misol "+son);

//        System.out.println("a= ");
//        float e = scanner.nextFloat();
//        System.out.println("b= ");
//        float b = scanner.nextFloat();
//        System.out.println("c= ");
//        float c = scanner.nextFloat();

//        System.out.printf("6-misol: V= %f S= %s", e*b*c, 2*(e*b+b*c+e*c));

//        float Y = (float) (3 * Math.pow(a, 6) - 6 * Math.pow(a, 2) - 7);
//        System.out.println("25-misol: "+ Y);

//          float A2 = (float) Math.pow(a, Math.pow(a,2));
//          int A3 = (int) Math.pow(a, Math.pow(a,4));
//          float A4 = (float) Math.pow(a, Math.pow(a,8));
//        System.out.println("27-misol    A2: "+A2+"  A3 "+A3+" A4 "+A4);

        System.out.println("b= ");
        Float b =  scanner.nextFloat();
        System.out.println("c= ");
        Float c =  scanner.nextFloat();
        float x1;
        float x2;
        float D = (float) (Math.pow(b,2) - 4 * a * c);
        if (D>0){
            x1 = (float) (((-1) * b +Math.sqrt(D)) / (2 * a));
            x2 = (float) (((-1) * b -Math.sqrt(D)) / (2 * a));
            System.out.println("39-misol D= "+D+"  x1= "+x1+" x2= "+x2);
        }


    }
}
