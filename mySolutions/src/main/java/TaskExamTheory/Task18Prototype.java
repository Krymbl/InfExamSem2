package TaskExamTheory;

/// Прототип - паттерн проетирования,
/// который помогает создавать новые объекты путем копирования существующего

public class Task18Prototype {
    public static void main(String[] args) {
        Sheep blackSheep = new BlackSheep("Bogdan", "black");
        Sheep blackSheepClone = blackSheep.clone();

        blackSheep.getName();
        blackSheepClone.getName();

        System.out.println(blackSheep ==  blackSheepClone);
    }

    interface Sheep{
        Sheep clone();
        void getName();
    }

    public static class BlackSheep implements Sheep {
        String name;
        String color;

        public BlackSheep(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public Sheep clone() {
            return new BlackSheep(this.name, this.color);
        }

        public void getName() {
            System.out.println(this.name + " " + this.color);
        }
    }
}
