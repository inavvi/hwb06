
public class Main {

public static void checkDiagnosticsCar(Transport... transports) {
    for (Transport transport1 : transports) {
        if (transport1.getDiagnostics() == 1) {
            System.out.println(transport1.getBrand() + " " + transport1.getModel() + " " + transport1.getColor() + " диагностика проведена!");
        } else {
            System.out.println(transport1.getBrand() + " " + transport1.getModel() + " " + transport1.getColor() + " диагностика не проведена!");
        }
    }
}

public static void allowanceDiagnostics(Car... cars){
        int count=0;
        try {
            for (Car car: cars) {
                car.diagnostics();
                count++;
            } } catch (ErrorDiagnosticsException e) {
            System.out.println(e.getMessage());
        } finally { System.out.println(count);}
    }


    public static void main(String[] args) {

        Users batman =new Users("Batman","b2C135","b2C135");
        Users bat =new Users("Bat","b2C136","b2C136");


        Car murcielago=new Car("Lamborghini","Murcielago", Car.BodyType.COUPE,"оранжевый","6,19 л.");
        Car murcielagob=new Car("Lamborghini","Murcielago", Car.BodyType.COUPE,"белый","6,19 л.");
        Car murcielagoc=new Car("Lamborghini","Murcielago", Car.BodyType.COUPE,"красный","6,19 л.");
        Car lancer=new Car("Mitsubishi","Lancer Evolution VIII", Car.BodyType.SEDAN,"красный","2 л.");

        Bus tourismo=new Bus("Mercedes-Benz","Tourismo","оранжевый","11,98 л.");
        Bus tourismob=new Bus("Mercedes-Benz","Tourismo","белый","11,98 л.");
        Bus tourismoc=new Bus("Mercedes-Benz","Tourismo","красный","11,98 л.");
        Bus tourismod=new Bus("Mercedes-Benz","Tourismo","жёлтый","11,98 л.");

        Truck actros=new Truck ("Mercedes-Benz","Actros","оранжевый","11,94 л.");
        Truck actrosb=new Truck ("Mercedes-Benz","Actros","белый","11,94 л.");
        Truck actrosc=new Truck ("Mercedes-Benz","Actros","красный","11,94 л.");
        Truck actrosd=new Truck ("Mercedes-Benz","Actros","жёлтый","11,94 л.");

        Driver shumaher=new Driver("Михаэль Шумахер","Б");
        Driver ivanov=new Driver("Иван Иванов","Б, С");
        Driver ivanovs=new Driver("Сергей Иванов","Д");

        Lb b=new Lb("Б");
        Lc c=new Lc("С");
        Ld d=new Ld("Д");


        batman.logIn("Batman","b2C135",murcielago);
        Users.checkUsers(batman, bat);

        checkDiagnosticsCar(murcielago,actros);
        allowanceDiagnostics(murcielago,murcielagob);


        Race leman=new Race("Леман");

        murcielago.carInfo();
        lancer.carInfo();

        tourismo.startDrive();
        actros.startDrive();

        murcielagoc.pitStop();
        murcielago.finishDrive();
        murcielago.refuel();
        murcielago.setBestLapTimeCar(leman,180.48);
        murcielagob.setBestLapTimeCar(leman,178.21);
        murcielago.bestLapTimeRace(leman);

        b.goTransport(shumaher,murcielago);
        b.goTransport(shumaher,actrosd);
        b.goTransport(ivanov,murcielagob);
        c.goTransport(ivanov,actrosd);
        d.goTransport(ivanovs,tourismo);


    }
}