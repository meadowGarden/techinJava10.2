import java.util.ArrayList;

public class CustomTacoBox implements TacoBox {

    private ArrayList<Taco> tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = new ArrayList<>();
        for (int i = 1; i <=tacos; i++) {
            this.tacos.add(new Taco());
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
