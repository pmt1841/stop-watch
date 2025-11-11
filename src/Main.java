public class Main {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        System.out.println("Start algorithm");

        watch.start();
        System.out.println("Start time: " + watch.getStartTime());

        SelectionSortAlgorithm sort = new SelectionSortAlgorithm();
        System.out.println(sort.runAlgorithm());

        watch.stop();
        System.out.println("Stop time: " + watch.getStopTime());

        System.out.println("Elapsed time: " + watch.getElapsedTime() + " milliseconds");
    }
}
