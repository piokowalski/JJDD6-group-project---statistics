package bikes.app.statistics;

public class Statistics {
    //statistics of count of bike stations in specific country
    //and cities


    public void countryStats(Integer bikeStations, String country) {
        System.out.println("In " + country + " there is: " + bikeStations + " bike stations.");
    }
        public void cityStats (Integer bikeStations, String city){
            System.out.println("In " + city+ " there is: " + bikeStations + " bike stations.");
        }


    }
