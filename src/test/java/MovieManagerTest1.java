import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest1 {

    @Test
    public void test() {

        MovieManager manager = new MovieManager(5);

        manager.addMovie("A");
        manager.addMovie("B");
        manager.addMovie("C");
        manager.addMovie("D");
        manager.addMovie("E");
        manager.addMovie("F");
        manager.addMovie("G");
        manager.addMovie("H");
        manager.addMovie("I");
        manager.addMovie("J");

        String[] expected = {"J", "I", "H", "G", "F"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {

        MovieManager manager = new MovieManager();

        manager.addMovie("A");
        manager.addMovie("B");
        manager.addMovie("C");
        manager.addMovie("D");
        manager.addMovie("E");
        manager.addMovie("F");
        manager.addMovie("G");
        manager.addMovie("H");
        manager.addMovie("I");
        manager.addMovie("J");

        String[] expected = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {

        MovieManager manager = new MovieManager();

        manager.addMovie("A");
        manager.addMovie("B");
        manager.addMovie("C");
        manager.addMovie("D");
        manager.addMovie("E");
        manager.addMovie("F");
        manager.addMovie("G");

        String[] expected = {"G", "F", "E", "D", "C", "B", "A"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
