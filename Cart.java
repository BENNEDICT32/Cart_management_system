import java.util.ArrayList;
import java.util.*;

public class Cart {
    public String order;
    public double price;
    ArrayList<Cart>Arr=new ArrayList<Cart>();

    public Cart(){

    }

    public Cart(String order,double price){
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

    public void clearCart(){
        order= null;
        price=0.0;
    }
    public void addCart(){
        Scanner input =new Scanner(System.in);
        price=0.0;
        order= null;
        System.out.println("Here is the list of available meals: \n"+
                          "1. 1X PAP, 1X SHORT RIBS AND 1X COCA-COLA 2L, PRICE: R150.00 \n"+
                          "2. 1X PAP, 1X FULL CHICKEN AND 1X COCA-COLA 2L, PRICE: 170.00 \n"+
                          "3. 1X PAP, 1X POARK AND 1x COCA-COLA 2L, PRICE: R120 \n"+
                          "4. 1X PAP, PRICE: R7.50 \n"+
                          "5. 1X COCA-COLA: 750ml, PRICE: R16.50 \n"+
                          "6. 1X COCA-COLA 2L, PRICE: R25.70 \n"+
                          "7. 1X SHORT RIBS, PRICE: R100.00 \n"+
                          "8. 1X FULL CHICKEN, PRICE: R120.00 \n"+
                          "9. 1X POARK, PRICE: R95.00 \n"+
                          "10. 1X LARGE CHIPS, PRICE: R60.00 \n"+
                          "11. 1X MEDIUM CHIPS, PRICE: R45.00 \n"+
                          "12. 1X SMALL CHIPS, PRICE: R30.00 \n"+
                          "13. 1X SPRING WATER 750ML, PRICE: R12.00 \n"+
                          "14. 1X SPRING WATER : R17.50 \n"+
                          "15. 1X SAUSAGE, PRICE: R12.00 \n"+
                          "16. To exit");
        System.out.println("Please selent the number associated with what you are ordering: ");
        int ordernum=input.nextInt();
        
        while(ordernum!=16){
            if(ordernum==1){
                System.out.println("How many do you like to order: ");
                int quantity = input.nextInt();
                order="1X PAP, 1X SHORT RIBS AND 1X COCA-COLA 2L";
                price+=150.00*quantity;
                
                Cart cart1 =new Cart(order, price);
                Arr.add(cart1);
                break;
            }

            if(ordernum==2){
                System.out.println("How many do you like to order: ");
                int quantity2 = input.nextInt();
                order="1X PAP, 1X FULL CHICKEN AND 1X COCA-COLA 2L";
                price+=150.00*quantity2;
                Cart cart2 =new Cart(order, price);
                Arr.add(cart2);
                break;
            }

            if(ordernum==3){
                System.out.println("How many do you like to order: ");
                int quantity3 = input.nextInt();
                order="1X PAP, 1X POARK AND 1x COCA-COLA 2L";
                price+=150.00*quantity3;
                Cart cart3 =new Cart(order, price);
                Arr.add(cart3);
                break;
            }

            if(ordernum==4){
                System.out.println("How many do you like to order: ");
                int quantity4 = input.nextInt();
                order="1X PAP, 1X POARK AND 1x COCA-COLA 2L";
                price+=150.00*quantity4;
                Cart cart4 =new Cart(order, price);
                Arr.add(cart4);
                break;
            }


            if(ordernum==5){
                System.out.println("How many do you like to order: ");
                int quantity5 = input.nextInt();
                order="1X PAP, 1X POARK AND 1x COCA-COLA 2L";
                price+=150.00*quantity5;
                Cart cart5 =new Cart(order, price);
                Arr.add(cart5);
                break;
            }


            if(ordernum==6){
                System.out.println("How many do you like to order: ");
                int quantity6 = input.nextInt();
                order="1X PAP, 1X POARK AND 1x COCA-COLA 2L";
                price+=150.00*quantity6;
                Cart cart6 =new Cart(order, price);
                Arr.add(cart6);
                break;
            }


            if(ordernum==7){
                System.out.println("How many do you like to order: ");
                int quantity7 = input.nextInt();
                order="1X PAP, 1X POARK AND 1x COCA-COLA 2L";
                price+=150.00*quantity7;
                Cart cart7 =new Cart(order, price);
                Arr.add(cart7);
                break;
            }


            if(ordernum==8){
                System.out.println("How many do you like to order: ");
                int quantity8 = input.nextInt();
                order="1X PAP, 1X POARK AND 1x COCA-COLA 2L";
                price+=150.00*quantity8;
                Cart cart8 =new Cart(order, price);
                Arr.add(cart8);
                break;
            }


            if(ordernum==9){
                System.out.println("How many do you like to order: ");
                int quantity9 = input.nextInt();
                order="1X PAP, 1X POARK AND 1x COCA-COLA 2L";
                price+=150.00*quantity9;
                Cart cart9 =new Cart(order, price);
                Arr.add(cart9);
                break;
            }


            if(ordernum==10){
                System.out.println("How many do you like to order: ");
                int quantity10 = input.nextInt();
                order="1X PAP, 1X POARK AND 1x COCA-COLA 2L";
                price+=150.00*quantity10;
                Cart cart10 =new Cart(order, price);
                Arr.add(cart10);
                break;
            }


            if(ordernum==11){
                System.out.println("How many do you like to order: ");
                int quantity11 = input.nextInt();
                order="1X PAP, 1X POARK AND 1x COCA-COLA 2L";
                price+=150.00*quantity11;
                Cart cart11 =new Cart(order, price);
                Arr.add(cart11);
                break;
            }


            if(ordernum==12){
                System.out.println("How many do you like to order: ");
                int quantity12 = input.nextInt();
                order="1X PAP, 1X POARK AND 1x COCA-COLA 2L";
                price+=150.00*quantity12;
                Cart cart12 =new Cart(order, price);
                Arr.add(cart12);
                break;
            }


            if(ordernum==13){
                System.out.println("How many do you like to order: ");
                int quantity13 = input.nextInt();
                order="1X PAP, 1X POARK AND 1x COCA-COLA 2L";
                price+=150.00*quantity13;
                Cart cart13 =new Cart(order, price);
                Arr.add(cart13);
                break;
            }


            if(ordernum==14){
                System.out.println("How many do you like to order: ");
                int quantity14 = input.nextInt();
                order="1X PAP, 1X POARK AND 1x COCA-COLA 2L";
                price+=150.00*quantity14;
                Cart cart14 =new Cart(order, price);
                Arr.add(cart14);
                break;
            }
            if(ordernum==15){
                System.out.println("How many do you like to order: ");
                int quantity15 = input.nextInt();
                order="1X PAP, 1X POARK AND 1x COCA-COLA 2L";
                price+=150.00*quantity15;
                Cart cart15 =new Cart(order, price);
                Arr.add(cart15);
                break;
            }

            if(ordernum==16){
                System.out.println("How many do you like to order: ");
                int quantity16 = input.nextInt();
                order="1X PAP, 1X POARK AND 1x COCA-COLA 2L";
                price+=150.00*quantity16;
                Cart cart16 =new Cart(order, price);
                Arr.add(cart16);
                break;
            }
        }
    }
    public void showCart(){
        for(int i=0;i<Arr.size();i++){
            System.out.println(Arr.get(i).order+" "+Arr.get(i).getPrice()+"\n");
        }
    }


    public static void main(String[] args){
        Cart cart =new Cart();
        cart.addCart();
        cart.showCart();

    }
    
}

