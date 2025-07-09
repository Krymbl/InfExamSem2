package TaskExamPractice;

///  Фабричный метод - паттерн проектирования, помогает решить проблему
///  создания нужных нам объектов под определенные условия
// ToDo Реализовать фабричный метод
public class Task13FactoryMethod {

    /// ОТВЕТ!!!!!
    public Coffee CreateCoffee(TypeCoffe typeCoffe) {
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

    public class Americano implements Coffee {

        @Override
        public void makeCoffee() {
            System.out.println("Make Americano");
        }
    }

    public class Latte implements Coffee {

        @Override
        public void makeCoffee() {
            System.out.println("Make Latte");
        }
    }

    public class Espresso implements Coffee {

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
