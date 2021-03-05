package inheritance;

public class TestDog {
        public static void main(String args[]) {
            AnimalOver a = new AnimalOver();
            AnimalOver b = new DogOver();

            a.move();
            b.move();
        }
}
