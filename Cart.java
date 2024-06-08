import java.util.ArrayList;
import java.io.*;

public class Cart extends Customer{
    public String order;
    public double price;
    ArrayList<Cart>Arr=new ArrayList<Cart>();

    public Cart(String name,String phone_number,String order,double price){
        super(name, phone_number);
        this.order=order;
        this.price=price;
    }

    public void setOrder(String order){
        this.order=order;

    }
    public void setPrice(){
        this.price=price;
    }

    public String getOrder(){
        return order;
    }
    public double getPrice(){
        return price;
    }

    public void AddCart(){
        System.out.println("");
    }



    
}
