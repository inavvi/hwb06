public class Race {

    public String  name;
    public double bestLapTime;


    public Race (String name) {
        this.name=name;
        this.bestLapTime=10000;}


    public double getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(double bestLapTime) {
        this.bestLapTime = bestLapTime;
    }


}
