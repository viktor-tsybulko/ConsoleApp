package output;

import logic.CounterFiles;

/**
 * Created by viktor on 10.07.17.
 */
public class View {
    static {

        System.out.println("-----------------------------------------------------");
        System.out.printf("|%-3s| %-12s| %s%n", "№", "Count Files", "Path");
        System.out.println("-----------------------------------------------------");
    }

    public void showResults(long countFiles) {
        int numberOfThread = CounterFiles.getNumberOfThread();
        long count = countFiles;
        String path = CounterFiles.getPath();
        if (countFiles == -1) {
            System.out.printf("|%-3d| %-12d| %s%n", numberOfThread, 0, path + " - INVALID PATH");
            return;
        }
        System.out.printf("|%-3d| %-12d| %s%n", numberOfThread, count, path);
    }
}
