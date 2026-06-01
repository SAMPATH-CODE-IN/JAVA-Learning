// Method overloading in Java means:

// Same method name, but different parameters.

// Java decides which method to call based on:

// number of parameters
// type of parameters
// order of parameters

public class Methodoverloading{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        cal calc=new cal();
        calc.calculator(a, b);

    }
}
class cal{
    public void calculator(int a,int b){
       int  result=a+b;
       System.out.print(result);

    }
     public void calculator(int a,int b,int c){
       int  result=a+b+c;
       System.out.print(result);
       
    }
     public void calculator(double a,double b,double c){
       double  result=a+b+c;
       System.out.print(result);
       
    }
}