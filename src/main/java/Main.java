import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MovieManager movieManager = new MovieManager(5);
        movieManager.addMovie("A");
        movieManager.addMovie("B");
        movieManager.addMovie("C");
        movieManager.addMovie("D");
        movieManager.addMovie("E");
        movieManager.addMovie("F");
        movieManager.addMovie("E");
        movieManager.addMovie("G");
        System.out.println(Arrays.toString(movieManager.findAll()));
        System.out.println(Arrays.toString(movieManager.findLast()));
    }

}
