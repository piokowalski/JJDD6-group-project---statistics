package bikes.app.statistics;

public class Statistics {
    //statistics of count of bike stations in specific country
    //and cities

    public String country;
    public String city;

    public Integer bikeStations;

    public void stats(Integer bikeStations, String country) {
        System.out.println("In " + country + " there is: " + bikeStations + " bike stations.");
    }






}
