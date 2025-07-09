package TaskExamPractice;


//Адаптер - паттерн проектирования, который обеспечивает совместную
//работу классов с несовместимыми интерфейсами, которая без него была бы невозможно

// ToDo Реализовать адаптер
public class Task3Adapter {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.on();
        SmartLamp smartLamp = new SmartLamp(lamp);
        smartLamp.start();
        SmartDevice smartDevice = new SmartDevice(smartLamp);
        smartDevice.work();

    }

    ///ОТВЕТ!!!!!!

    public static class Lamp {
        public void on() {
            System.out.println("on");
        }
        public void off() {
            System.out.println("off");
        }
    }

    //Адаптер
    public static class SmartLamp {
        private Lamp lamp;

        public SmartLamp(Lamp lamp) {
            this.lamp = lamp;
        }

        public void start() {
            lamp.on();
        }

        public void stop() {
            lamp.off();
        }
    }
    //Адаптер закончился

    public static class SmartDevice {
        private SmartLamp smartLamp;

        public SmartDevice(SmartLamp smartLamp) {
            this.smartLamp = smartLamp;
        }
        public void work() {
            smartLamp.start();
            smartLamp.stop();
        }
    }
    /// КОНЕЦ ОТВЕТА!!!!


}
