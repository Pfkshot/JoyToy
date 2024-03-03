public class Toy {
    private int id; // номер игрушки
    private String name; // название
    private double weight; // частота выпадения

    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public Toy() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    // Переопределяем toString() для удобства вывода информации о игрушке
    public String toString() {
        return STR."\{name}";
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}