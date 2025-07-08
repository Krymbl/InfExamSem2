package TaskExamPractice;

import java.util.ArrayList;
import java.util.List;

public class Task2Decorat {
    public static void main(String[] args) {

//        List<Integer> integerList = new ArrayList<>();
//        integerList.add(1);
//        integerList.add(2);
//        System.out.println(integerList);
//
//        List<? extends Number> numbersList = integerList;
//        System.out.println(numbersList);
//        System.out.println(numbersList.get(0));




        List<Number> numberList2 = new ArrayList<>();
        numberList2.add(1);
        numberList2.add(2);
        System.out.println(numberList2);

        List<? super Integer> integersList2 = numberList2;
        integersList2.add(2);
        System.out.println(numberList2);
        System.out.println(integersList2.get(0));
    }

    /// ОТВЕТ!!!!!!!!
    ///

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
