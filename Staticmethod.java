
public class Staticmethod{
    public static void main(String [] args){
        Mobile mob1=new Mobile();
        mob1.show();
         
    }
    
}
class Mobile{
    String brand="apple";
    int price=110000;
    public void show(){
        System.out.print("Brand Name: "+ brand + " and the price is" + price );
    }
}