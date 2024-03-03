import java.io.IOException;

public class Main {static ToyStore toyStore;

    public static void main(String[] args) throws IOException {
        init();
        toyStore.createQueue();
        toyStore.drop(10);
    }

    private static void init() {
        toyStore = new ToyStore();
    }

}