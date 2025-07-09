package TaskExamTheory;

/// Прототип - паттерн проетирования,
/// который помогает создавать новые объекты путем копирования существующего

public class Task18Prototype {

    interface Sheep{
        Sheep clone();
        void getName();
    }

    public class BlackSheep implements Sheep {
        String name;

        public BlackSheep(String name) {
            this.name = name;
        }

        public Sheep clone() {
            return new BlackSheep(this.name);
        }

        public void getName() {
            this.name = name;
        }
    }
}
