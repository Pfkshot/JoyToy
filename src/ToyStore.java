import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ToyStore {
    Random random = new Random();

    private final Queue<Toy> toyList = new PriorityQueue<>(chance);

    public ToyStore() {
    }

    public static Comparator<Toy> chance = new Comparator<Toy>() {
        @Override
        public int compare(Toy o1, Toy o2) {
            return (int) Math.max(o1.getWeight(), o2.getWeight());
        }
    };

    public void createQueue() {
        toyList.add(new Toy(1, "Lego", 20));
        toyList.add(new Toy(2, "Barby", 20));
        toyList.add(new Toy(3, "Robot", 60));
    }

    public void addToy(Toy toy) {
        toyList.add(toy);
    }

    public void drop(int times) throws IOException {
        FileWriter fw = new FileWriter("prize_toys.txt");
        for (int i = 0; i < times; i++) {
            int randomChance = random.nextInt(100);
            Toy targetToy = new Toy();
            double difference;
            int minDifference = Integer.MAX_VALUE;
            for (Toy toy : toyList) {
                difference = randomChance - toy.getWeight();
                if (Math.abs(difference) <= minDifference) {
                    targetToy = toy;
                    minDifference = (int) difference;
                }
            }
            fw.write( STR."id - \{targetToy.getId()}, наименование - \{targetToy}" +
                    STR.", шанс - \{targetToy.getWeight()}%\n");
        }
        fw.close();
    }
}