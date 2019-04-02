package bikes.app;

import bikes.app.statistics.Statistics;

public class App {
    public static void main(String[] args) {

        System.out.println("Bikes app");

        Statistics statistics = new Statistics();

        statistics.cityStats(15,"Gdansk");

        statistics.countryStats(69,"Poland");

        System.out.println(" -------- __@      __@       __@       __@     __~@\n" +
                " ----- _`\\<,_    _`\\<,_    _`\\<,_     _`\\<,_   _`\\<,_\n" +
                " ---- (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)\n");
    }
}
