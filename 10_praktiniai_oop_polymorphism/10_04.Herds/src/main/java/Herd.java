import java.lang.reflect.Member;
import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> herd;

    public Herd() {
        herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable member : herd) {
            member.move(dx, dy);
        }
    }

    @Override
    public String toString() {

        String membersOfHerd = "";
        for (Movable member : herd) {
            membersOfHerd = membersOfHerd.concat(member.toString());
            membersOfHerd = membersOfHerd.concat("\n");
        }
        return membersOfHerd;
    }
}
