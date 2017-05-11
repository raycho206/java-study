package uml.aggregation;

public class AggregationExample {

    public static void main(String[] args) {
        Car car = new Car();
        Engine engine = new Engine();
        Wheel[] wheel = new Wheel[1];
//        Order order = new Order(engine);

        car.setEngine(engine);
        car.setWheels(wheel);
    }

    private static class Car {
        private Wheel[] wheels;
        private Engine engine;

        public void setWheels(Wheel[] wheels) {
            this.wheels = wheels;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }
    }

    private static class Engine {

    }

    private static class Wheel {

    }

    private static class Order {
        protected Engine engine;

        public void orderEngin() {

        }
    }

}
