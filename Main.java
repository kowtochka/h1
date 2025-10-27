public class Main {
  public static Car[] getCarByBrand(Car cars[],String Mark){
        int k=0;
        for (int i=0; i<cars.length;i++){
            if (cars[i].getbrand().equals(brand)){
                k++; 
            }
        }
        Car need[]=new Car[k];
        k = 0;
        for (int l=0; l< cars.length ;l++){
        if (cars[l].getbrand().equals(brand)){
            need[k]=cars[l];
            k++;
            }

        }
        return need
    }
    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brand, int years){
        int k=0;
        for (int i=0; i<cars.length;i++){
            if ((cars[i].getbrand().equals(brand)) && (2025-cars[i].getyear()>years)){
                k++; 
            }
        }
        Car need[]=new Car[k];
        k=0;
        for (int m=0; m<cars.length;m++){
        if ((cars[m].getbrand().equals(brand)) && (2025-cars[m].getyear()>years)){
                need[k]=cars[m];
                k++;
        }
    }
    return need
}
    public static void main(String[] args) {
        Car cars[]={
            new Car(8273641, "Honda", "Civic", 2010, "Black", 720000, "B567XM")
            new Car(1938462, "Ford", "Focus", 2008, "Blue", 450000, "C891YZ")
            new Car(5064729, "BMW", "X5", 2015, "White", 2100000, "D124HK")
            new Car(3741208, "Volkswagen", "Golf", 2012, "Red", 680000, "E456RT")
            new Car(6923814, "Mercedes", "C-Class", 2018, "Grey", 1800000, "F789PL")
            new Car(2519073, "Hyundai", "Solaris", 2014, "Silver", 550000, "G321MN")
            new Car(4482937, "Audi", "A4", 2009, "Black", 820000, "H654KJ")
            new Car(7153029, "Kia", "Rio", 2016, "Green", 620000, "J987TL")
            new Car(3478216, "Nissan", "Sentra", 2014, "Grey", 670000, "N543KL")
            new Car(5912048, "Nissan", "Qashqai", 2019, "Black", 1350000, "P219WS")
        }
        Car nissan[]=getCarByBrand(cars, "Nissan");
        System.out.println("Машины марки Nissan:");
        for (int a=0; a< nissan.length;a++){
            System.out.println(nissan[a]);
        }
        Car nissan7[]=getCarByBrendAndYearOperational(cars, "Nissan",7);
        System.out.println("Машины марки Nissan,которые эксплуатируются более 7 лет:");
        for (int a=0; a< nissan77.length;a++){
            System.out.println(nissan7[a]);
        }
    }
}
    

