
package TheWorldofObjects;
public class main{

public static void main(String[] args) {  
  String[] Sparpats =new String[]{"Tires","Keys"};
    car nissan =new car("nissan", 1400000, 2021, "blue",Sparpats);

    String []carparts = nissan.getParts();
      carparts[0] ="miror";
    car toyota =new car("toyota", 150000, 2023, "Green",Sparpats);

    car toyota2 = new car(toyota);
  System.out.println(nissan.toString());
    //  toyota2.setColor("Black");
    //   toyota2.drive();
    //  System.out.println("Nissan :"+nissan.getMake()+", "+ nissan.getPrice()+", "+nissan.getYear()+", "+nissan.getColor()+""+nissan.getParts());
    //    //Sparpats[0] ="filter";
    // car   toyota2  = toyota; Hera We not creat new object All we're doing is copying over the referenec
    //  toyota2.setColor("Red");
    //  System.out.println("Toyota2: "+toyota2.getMake()+", "+ toyota2.getPrice()+", "+toyota2.getYear()+", "+toyota2.getColor());

     //System.out.println("Nissan :"+nissan.getMake()+", "+ nissan.getPrice()+", "+nissan.getYear()+", "+nissan.getColor());
    //  System.out.println("toyota: "+toyota.getMake()+", "+ toyota.getPrice()+", "+toyota.getYear()+", "+toyota.getColor());
    
    
    //toyota The variable automatically stores a reference to that object
      
    //  System.out.println(nissan.make +", "+nissan.price+", "+nissan.year+", "+nissan.color);
    //   System.out.println(toyota.make +", "+toyota.price+", "+toyota.year+", "+toyota.color);

    // car bnw =new car(); //objec Thing That Contains Fields //Thing that can perform tasks.
    // bnw.make ="bnw";
    // bnw.price =12000;
    // bnw.year =2022;
    // bnw.color ="blue";
    // car tayoya =new car();//object creating

    // tayoya.make ="tayota";
    // tayoya.year =2016;
    // tayoya.color ="red";

    // tayoya.color ="Green";//update tayoya color
    // System.out.println(bnw.make+", "+bnw.price+", "+bnw.year+", "+bnw.color);
    // System.out.println(tayoya.make+", "+tayoya.price+", "+tayoya.year+", "+tayoya.color);
   }
}
