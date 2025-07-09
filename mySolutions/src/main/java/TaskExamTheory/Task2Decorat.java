package TaskExamTheory;

//Декоратор - паттерн проектирования, позволяет задать
// новую функциональность объекту, не изменяя его исходный код

//ToDo Реализовать декоратор
public class Task2Decorat {
    public static void main(String[] args) {

        EnemySimple es = new EnemySimple();
        SuperEnemy se = new SuperEnemy(es);
        es.attack();
        se.attack();
        se.defend();
    }

    /// ОТВЕТ!!!!!!!!
    public static class EnemySimple{
        public void attack() {
            System.out.println("атакую");
        }
    }

    public static class SuperEnemy extends EnemySimple {
        private EnemySimple enemySimple;

        public SuperEnemy(EnemySimple enemySimple) {
            this.enemySimple = enemySimple;
        }

        public void attack() {
            enemySimple.attack();
        }

        public void defend() {
            System.out.println("Защищаюсь");
        }
        /// КОНЕЦ ОТВЕТА!!!!!!!!

    }
}
