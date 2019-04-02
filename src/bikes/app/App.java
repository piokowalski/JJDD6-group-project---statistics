package bikes.app;

import bikes.app.statistics.Statistics;

public class App {
    public static void main(String[] args) {

        System.out.println("Bikes app");

        Statistics statistics = new Statistics();

        statistics.cityStats(1,"Gdansk");

        statistics.countryStats(320,"Germany");
    }
}
