public class Customer{
    public String name;
    public String phone_number;

    public Customer(String name,String phone_number){
        this.name=name;
        this.phone_number=phone_number;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public void setPhoneNumber(String phone_number){
        this.phone_number=phone_number;
    }

    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phone_number;
    }

    public void PrintInfo(){
        System.out.println("Name: "+name);
        System.out.println("Phone number: "+phone_number);
    }



}