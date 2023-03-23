package TheWorldofObjects;

import java.sql.Array;
import java.util.Arrays;

public class car {
  private   String make;
   private double price;
   private int year;
  private  String color;
private String[] parts;
    public car(String make, double price, int year,String color,String[]parts){ // The constructor must update fields
        this.make =make; //So this reference to the current object that's calling This Constructor which means that this make refer to the Field in that object.
        this.price =price;
        this.year =year;
        this.color =color;
        this.parts =Arrays.copyOf(parts, parts.length);
    }
    // copy constructor  
    public car( car Source){// a create  the constructor that defines one parameter
     this.make =Source.make;
     this.price =Source.price;
     this.year =Source.year;    // the consturctor must update the object's Fields
     this.color =Source.color;
     this.parts =Arrays.copyOf(Source.parts, Source.parts.length);
    }

    /**
     * use getters to access object fields.
     * @return 
     */
    public String getMake(){
    return make; //here we return the make field of that object
    }
    public void setMake(String make){
    this.make =make; 
    }
    /**
     * 
     * @return
     */
  public double getPrice(){
    return price;
  }
  public void setPrice(double price){
  this.price =price;
  }

  public void setYear(int year){
 this.year =year;
  }
 public double getYear(){
    return year;
    }
    public void setColor(String color){
    this.color =color;
    }
    public String getColor(){
        return color;
 }


  public String[] getParts() {
    return Arrays.copyOf(this.parts,this.parts.length);
  }

  public void setParts(String[] parts) {
    this.parts = Arrays.copyOf(parts,parts.length);
  }

 public void drive(){
    System.out.println("\n you ara bought the beautiful "+this.make+" "+this.price +" "+this.year+" "+this.color);
    System.out.println("\n dive you car to the nearest exis.\n");
 }

 public String toString() {
  return  "make: "+ this.make +".\n"+
  " Price: "+this.price+".\n"+"year: "+ this.year+
  "\n"+"color "+this.color  +"\n"+"Sparparts: "+Arrays.toString(parts);
  
}

}



