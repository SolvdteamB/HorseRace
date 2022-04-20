package animals;

public class Horses {

    private int position;
    private String name;
    private int id = 0;
    private static int counter = 0;

    public Horses(String name) {
        this.name = name;
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
