package quadraticequation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    private QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }
    private double getA(){
        return this.a;
    }
    private double getB(){
        return this.b;
    }
    private double getC(){
        return this.c;
    }
    private double getDiscriminant(){
        return Math.pow(this.getB(),2)-4*this.getA()*this.getC();
    }
    private double getRoot1(){
        return (-this.getB()+Math.pow(this.getDiscriminant(),0.5))/(2*this.getA());
    }
    private double getRoot2(){
        return (-this.getB()+Math.pow(this.getDiscriminant(),0.5))/(2*this.getA());
    }



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a;
        double b;
        double c;
        do {
            System.out.println("Enter a b c (a>0): ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
        }while(a==0);
        QuadraticEquation equation=new QuadraticEquation(a,b,c);
        if (equation.getDiscriminant()<0){
            System.out.println("The equation has no roots.");
        }else{
            if(equation.getDiscriminant()==0){
                System.out.println("The equation has one root: "+equation.getRoot1());
            }else {
                System.out.println("The equation has two roots: "+equation.getRoot1()+" and "+equation.getRoot2());
            }
        }


    }

}
