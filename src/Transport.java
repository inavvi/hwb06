public abstract class Transport  {

    private String brand;
    private String model;
    private String color;
    private String engineVolume;
    private int diagnostics;


    public Transport(String brand, String model, String color, String engineVolume) {
        this.brand=brand;
        this.model=model;
        this.color=color;

        this.engineVolume=engineVolume;}



    public abstract void startDrive();
    public abstract void finishDrive();

    public abstract void refuel();


    public void transportInfo () {
        System.out.println(brand+" "+model+", цвет "+color+".");}

    public int getDiagnostics() {
        return diagnostics;}

    public String getBrand() {
        return brand;}

    public void setBrand(String brand) {
        this.brand = brand;}

    public String getModel() {
        return model;}

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }
}
