package TaskExamTheory;

///  Фабричный метод - паттерн проектирования, помогает решить проблему
///  создания нужных нам объектов под определенные условия
// ToDo Реализовать фабричный метод
public class Task13FactoryMethod {
    public static void main(String[] args) {
        Coffee americano = createCoffee(TypeCoffe.LATTE);
        americano.makeCoffee();
    }

    /// ОТВЕТ!!!!!
    public static Coffee createCoffee(TypeCoffe typeCoffe) {
        Coffee coffee = null;

        switch (typeCoffe) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case LATTE:
                coffee = new Latte();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
        }

        return coffee;
    }
    /// КОНЕЦ ОТВЕТА!!!!!

    interface Coffee {
        void makeCoffee();

    }

    public static class Americano implements Coffee {

        @Override
        public void makeCoffee() {
            System.out.println("Make Americano");
        }
    }

    public static class Latte implements Coffee {

        @Override
        public void makeCoffee() {
            System.out.println("Make Latte");
        }
    }

    public static class Espresso implements Coffee {

        @Override
        public void makeCoffee() {
            System.out.println("Make Espresso");
        }
    }


    enum TypeCoffe {
        AMERICANO,
        ESPRESSO,
        LATTE
    }
}
