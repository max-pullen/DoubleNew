public class Greeter {
    public String Greet;

    public Greeter(String Greet) {
        this.Greet = Greet;
    }

    public String getGreet() {
        return Greet;
    }

    public void setGreet(String greet) {
        Greet = greet;
    }

    public void greet() {
        System.out.println("Hello " + Greet);
    }
}