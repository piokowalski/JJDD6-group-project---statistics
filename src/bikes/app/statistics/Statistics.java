package bikes.app.statistics;

public class Statistics {
    //statistics of count of bike stations in specific country
    //and cities

    //methods should take informations from xml file
    //countries should be categorized with cities


    public void countryStats(Integer bikeStations, String country) {
        System.out.println("In " + country + " there is: " + bikeStations + " bike stations.");
    }

    public void cityStats(Integer bikeStations, String city) {
        System.out.println("In " + city + " there is: " + bikeStations + " bike stations.");
    }


}
