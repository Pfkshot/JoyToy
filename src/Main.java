import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ToyStore store = new ToyStore();

        // add some toys
        store.addToy(1, "Lego", 2, 20);
        store.addToy(2, "Robot", 2, 20);
        store.addToy(3, "Barby", 6, 60);

        // set the weight of a toy
        store.setToyWeight(2, 20);
//        store.setToyWeight(1, 20);
//        store.setToyWeight(2, 60);

        // play the game
        store.play();

        // get the prize toy
        try {
            store.getPrizeToy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}