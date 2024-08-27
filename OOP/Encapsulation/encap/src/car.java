public class car {
    private String brand;
    private String model;
    private int year;
    //Getter:Bir özelliğin değerini döndürür.
    //Setter: Bir özelliğe değer atar.
    
    public String getBrand(){
        return brand;
    }
    public void  setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void  setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public void  setYear(int year){
        if(year> 1960){
            this.year = year;}

        }
    }
