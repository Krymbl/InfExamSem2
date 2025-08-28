package TaskExamTheory;

/// Стратегия - паттеррн проектирования,
/// позволяет выбирать поведение объекта во время выполнения программы
// TODO Реализовать сттратегия

public class Task16Strategy {


    interface ArmStrategy {
        void attack();
    }

    public class SwordStrategy implements ArmStrategy {
        public void attack() {
            System.out.println("Sword attack");
        }
    }

    public class BowStrategy implements ArmStrategy {
        @Override
        public void attack() {
            System.out.println("Bow attack");
        }
    }

    public class Warior {
        ArmStrategy armStrategy;

        public Warior(ArmStrategy armStrategy) {
            this.armStrategy = armStrategy;
        }

        public void attack() {
            armStrategy.attack();
        }
    }
}
