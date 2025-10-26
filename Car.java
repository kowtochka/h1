public class Car{
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    Private int cost;
    Private int regnum;


 public car(int id,String brand,String model,int year,String color,int cost,String regnum){
            this.id=id;
            this.brand=brand;
            this.model=model;
            this.year=year;
            this.color=color;
            this.cost=cost;
            this.regnum=regnum;
      }
      public int getId(){
            return id;
      }
      public void setId(int id){
            this.id=id;
      } 
      public String getbrand(){
            return brand;
      }
      public void setМарка(String brand){
            this.brand=brand;
      }
      public String getmodel(){
            return model;
      }
      public void setmodel(String model){
            this.model=model;
      }
      public int getyear(){
            return year;
      }
      public void setyear(int year){
            this.year=year;
      }  
      public String getcolor(){
            return color;
      }
      public void setcolor(String color){
            this.color=color;
      }
      public int getcost(){
            return cost;
      }
      public void setcost(int Цена){
            this.cost=cost;
      }  
      public String getregnum(){
            return regnum;
      }
      public void setregnum(String regnum){
            this.regnum=regnum;
      }
    }
}