package TaskExamPractice;

///  Шаблонный метод - паттер проектирования, который определяет
/// скелет нашего алгоритма в базовом классе
/// и позволяет потомкам переопределить некоторые шаги алгоритма
/// не меняю его структуру

// TODO Реализовать шаблонный метод
public abstract class Task15PatternMethod {


    /// ОТВЕТ!!!!!
    //final - чтобы подклассы не могли его изменить
    // Это важное условие
    public final void PatternMethodForCoffee() {
        first();
        second();
        third();
        fouth();

    }
    /// КОНЕЦ ОТВЕТ!!!!!

    private void first() {
        System.out.println("Засыпать зерна");
    }
    //Пусть второй класс отвечает за добавление жидкости, переопределим этот метод у потомков
    protected abstract void second();

    private void third() {
        System.out.println("Добавить сироп");
    }

    //Пусть на этом шаге мы добавим или не добавим сахар, переопределим этот метод у потомков
    protected abstract void fouth();


}
