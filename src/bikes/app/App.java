package bikes.app;

import bikes.app.statistics.Statistics;

public class App {
    public static void main(String[] args) {

        System.out.println("Bikes app");

        Statistics statistics = new Statistics();

        statistics.cityStats(1,"Gdansk");

        statistics.countryStats(320,"Germany");

        System.out.println(" -------- __@      __@       __@       __@     __~@\n" +
                " ----- _`\\<,_    _`\\<,_    _`\\<,_     _`\\<,_    _`\\<,_\n" +
                " ---- (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)  (*)/ (*)\n");
    }
}
