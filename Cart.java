import java.util.ArrayList;

import java.util.*;

public class Cart {
    public String order;
    public double price;
    

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
    public void addCart(){
        Scanner input =new Scanner(System.in);
        price=0.0;
        order= null;
        System.out.println("Here is the list of available meals: \n"+
                          "1. 1X PAP, 1X SHORT RIBS AND 1X COCA-COLA 2L, PRICE: R125.00 \n"+
                          "2. 1X PAP, 1X FULL CHICKEN AND 1X COCA-COLA 2L, PRICE: 150.00 \n"+
                          "3. 1X PAP, 1X POARK AND 1x COCA-COLA 2L, PRICE: R105 \n"+
                          "4. 1X PAP, PRICE: R7.50 \n"+
                          "5. 1X COCA-COLA: 750ml, PRICE: R16.50 \n"+
                          "6. 1X COCA-COLA 2L, PRICE: R25.70 \n"+
                          "7. 1X SHORT RIBS, PRICE: R100.00 \n"+
                          "8. 1X FULL CHICKEN, PRICE: R120.00 \n"+
                          "9. 1X HALF CHICKEN, PRICE: R60.00 \n"+
                          "10. 1X POARK, PRICE: R95.00 \n"+
                          "11. 1X LARGE CHIPS, PRICE: R30.00 \n"+
                          "12. 1X MEDIUM CHIPS, PRICE: R25.00 \n"+
                          "13. 1X SMALL CHIPS, PRICE: R20.00 \n"+
                          "14. 1X SPRING WATER 750ML, PRICE: R12.00 \n"+
                          "15. 1X SPRING WATER 20L : R17.50 \n"+
                          "17. 1X SAUSAGE, PRICE: R10.00 \n"+
                          "18. To exit \n");
        System.out.println("Please selent the number associated with what you are ordering: ");
        int ordernum=input.nextInt();
        
        while(ordernum!=16){
            if(ordernum==1){
                System.out.println("How many do you like to order: ");
                int quantity = input.nextInt();
                order=quantity+"X PAP,"+quantity+"X SHORT RIBS AND "+quantity+"X COCA-COLA 2L";
                price+=125.00*quantity;
                
                Cart cart1 =new Cart(order, price);
                break;
            }

            if(ordernum==2){
                System.out.println("How many do you like to order: ");
                int quantity2 = input.nextInt();
                order=quantity2+"X PAP, "+quantity2+"X FULL CHICKEN AND "+quantity2+"X COCA-COLA 2L";
                price+=150.00*quantity2;
                Cart cart2 =new Cart(order, price);
                break;
            }

            if(ordernum==3){
                System.out.println("How many do you like to order: ");
                int quantity3 = input.nextInt();
                order=quantity3+"X PAP, "+quantity3+"X POARK AND "+quantity3+"X COCA-COLA 2L";
                price+=105.00*quantity3;
                Cart cart3 =new Cart(order, price);
                break;
            }

            if(ordernum==4){
                System.out.println("How many do you like to order: ");
                int quantity4 = input.nextInt();
                order=quantity4+"X PAP";
                price+=7.50*quantity4;
                Cart cart4 =new Cart(order, price);
                break;
            }


            if(ordernum==5){
                System.out.println("How many do you like to order: ");
                int quantity5 = input.nextInt();
                order=quantity5+"X COCA-COLA: 750ml";
                price+=16.50*quantity5;
                Cart cart5 =new Cart(order, price);
                break;
            }


            if(ordernum==6){
                System.out.println("How many do you like to order: ");
                int quantity6 = input.nextInt();
                order=quantity6+"X COCA-COLA 2L";
                price+=25.50*quantity6;
                Cart cart6 =new Cart(order, price);
                break;
            }


            if(ordernum==7){
                System.out.println("How many do you like to order: ");
                int quantity7 = input.nextInt();
                order=quantity7+"X SHORT RIBS";
                price+=100.00*quantity7;
                Cart cart7 =new Cart(order, price);
                break;
            }


            if(ordernum==8){
                System.out.println("How many do you like to order: ");
                int quantity8 = input.nextInt();
                order=quantity8+"X FULL CHICKEN";
                price+=120.00*quantity8;
                Cart cart8 =new Cart(order, price);
                break;
            }
            if(ordernum==9){
                System.out.println("How many do you want to order: ");
                int quantity9=input.nextInt();
                order=quantity9+"X HALF-CHICKEN";
                price=60.00*quantity9;
                Cart cart9=new Cart(order,price);
                break;

            }


            if(ordernum==10){
                System.out.println("How many do you like to order: ");
                int quantity10 = input.nextInt();
                order=quantity10+"X POARK, PRICE";
                price+=95.00*quantity10;
                Cart cart10 =new Cart(order, price);
                break;
            }


            if(ordernum==11){
                System.out.println("How many do you like to order: ");
                int quantity10 = input.nextInt();
                order=quantity10+"X LARGE CHIPS, PRICE";
                price+=30.00*quantity10;
                Cart cart10 =new Cart(order, price);
                break;
            }


            if(ordernum==12){
                System.out.println("How many do you like to order: ");
                int quantity11 = input.nextInt();
                order=quantity11+"X MEDIUM CHIPS, PRICE ";
                price+=25.00*quantity11;
                Cart cart11 =new Cart(order, price);

                break;
            }


            if(ordernum==13){
                System.out.println("How many do you like to order: ");
                int quantity12 = input.nextInt();
                order=quantity12+"X SMALL CHIPS, PRICE";
                price+=20.00*quantity12;
                Cart cart12 =new Cart(order, price);
                break;
            }


            if(ordernum==14){
                System.out.println("How many do you like to order: ");
                int quantity13 = input.nextInt();
                order=quantity13+"X SPRING WATER 750ML";
                price+=12.00*quantity13;
                Cart cart13 =new Cart(order, price);
                break;
            }


            if(ordernum==15){
                System.out.println("How many do you like to order: ");
                int quantity14 = input.nextInt();
                order=quantity14+"X SPRING WATER 20L : R17.50";
                price+=17.50*quantity14;
                Cart cart14 =new Cart(order, price);
                break;
            }
            if(ordernum==15){
                System.out.println("How many do you like to order: ");
                int quantity15 = input.nextInt();
                order=quantity15+"X SAUSAGE";
                price+=10.00*quantity15;
                Cart cart15 =new Cart(order, price);
                break;
            }
            else{
                System.out.println("The number you've entered is not one of the options");
                break;
            }
        }
    }
    


    public static void main(String[] args){
        ArrayList<Cart>Arr=new ArrayList<Cart>();
        Scanner input=new Scanner(System.in);
        System.out.println("Here is the list of available meals: \n"+
        "1. 1X PAP, 1X SHORT RIBS AND 1X COCA-COLA 2L, PRICE: R125.00 \n"+
        "2. 1X PAP, 1X FULL CHICKEN AND 1X COCA-COLA 2L, PRICE: 150.00 \n"+
        "3. 1X PAP, 1X POARK AND 1x COCA-COLA 2L, PRICE: R105 \n"+
        "4. 1X PAP, PRICE: R7.50 \n"+
        "5. 1X COCA-COLA: 750ml, PRICE: R16.50 \n"+
        "6. 1X COCA-COLA 2L, PRICE: R25.70 \n"+
        "7. 1X SHORT RIBS, PRICE: R100.00 \n"+
        "8. 1X FULL CHICKEN, PRICE: R120.00 \n"+
        "9. 1X HALF CHICKEN, PRICE: R60.00 \n"+
        "10. 1X POARK, PRICE: R95.00 \n"+
        "11. 1X LARGE CHIPS, PRICE: R30.00 \n"+
        "12. 1X MEDIUM CHIPS, PRICE: R25.00 \n"+
        "13. 1X SMALL CHIPS, PRICE: R20.00 \n"+
        "14. 1X SPRING WATER 750ML, PRICE: R12.00 \n"+
        "15. 1X SPRING WATER 20L : R17.50 \n"+
        "17. 1X SAUSAGE, PRICE: R10.00 \n"+
        "18. To exit \n");
        System.out.println("How many orders will you would you like to make up to a maximum of 10 orders: ");
        int numoforders=input.nextInt();
        for(int i=0;i<numoforders;i++){
            Cart cart=new Cart();
            cart.addCart();
            Arr.add(cart);
            
        }
        for(int i=0;i<Arr.size();i++){
            System.out.println(Arr.get(i).order+" "+Arr.get(i).getPrice()+"\n");
        }
        

       

    }
    
}

