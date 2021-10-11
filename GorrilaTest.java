public class GorrilaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        System.out.println("Current energy level = " + gorilla.getEnergyLevel());
        gorilla.throwSomething();
        System.out.println("After gorilla thorws something their energy level is has reduced to " + gorilla.getEnergyLevel());
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.climb();
        gorilla.climb();
        gorilla.climb();
        gorilla.climb();
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.eatBananas();
        System.out.println("Current energy level = " + gorilla.getEnergyLevel());
    }
}
