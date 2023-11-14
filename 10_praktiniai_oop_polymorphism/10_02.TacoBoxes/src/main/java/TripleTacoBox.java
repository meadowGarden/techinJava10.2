import java.util.ArrayList;

public class TripleTacoBox implements TacoBox {

    private ArrayList<Taco> tacos;

    public TripleTacoBox() {
        tacos = new ArrayList<>();
        for (int i = 1; i <=3; i++) {
            tacos.add(new Taco());
        }
    }


    @Override
    public int tacosRemaining() {
        return tacos.size();
    }

    @Override
    public void eat() {
        if(!tacos.isEmpty()) {
            tacos.remove(tacos.size() - 1);
        }
    }
}
