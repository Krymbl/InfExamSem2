public class Main {
    public static void main(String[] args) {

    }

    interface Coffee {
        public void makeCoffee();
    }

    public class Amerikano implements Coffee {

        public void makeCoffee() {
            System.out.println("Create Americano");
        }
    }
    public class Espresso implements Coffee {

        public void makeCoffee() {
            System.out.println("Create Espresso");
        }
    }
    public class Latte implements Coffee {

        public void makeCoffee() {
            System.out.println("Create Latte");
        }
    }

    public enum CoffeeType{
        AMERICANO,
        ESPRESSO,
        LATTE
    }

    public class CoffeeShop{
        Coffee coffeee;
        public Coffee chooseCoffee(CoffeeType type) {

            switch (type) {
                case LATTE:
                    coffeee = new Latte();
                    break;
                case AMERICANO:
                    coffeee =  new Amerikano();
                    break;
                case ESPRESSO:
                    coffeee = new Espresso();
                    break;
            }
            return coffeee;

        }


    }
}
