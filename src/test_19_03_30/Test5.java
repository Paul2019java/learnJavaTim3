package test_19_03_30;

public class Test5 {

        public static void main(String[] args) {
            Car car = new Audi();
            car.message();
            System.out.println();

            Vechicle vechicle = new Vechicle() {
                @Override
                public void message() {
                    System.out.println("vechicle");
                }
            };
            vechicle.message();

            Car car1 = new Car() {
                @Override
                public void text() throws Exception {

                }
                @Override
                public void message() {
                    System.out.println("car");
                }
            };
            car.message();
        }
}
