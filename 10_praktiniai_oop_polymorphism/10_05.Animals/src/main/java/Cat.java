public class Cat extends Animal implements NoiseCapable {


    public Cat() {
        super("Cat");
    }

    public Cat(String name) {
        super(name);
    }

    public void Cat() {
        System.out.printf("%s barks%n", super.getName());
    }

    public void purr() {
        System.out.printf("%s purrs%n", super.getName());
    }


    @Override
    public void makeNoise() {
        purr();
    }
}
