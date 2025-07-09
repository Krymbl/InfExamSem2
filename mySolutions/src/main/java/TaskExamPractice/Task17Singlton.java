package TaskExamPractice;

// TODO РЕализовать синглтон

/// Singleton (с англ. «одиночка») — паттерн проектирования в Java,
/// который гарантирует, что у класса будет только один экземпляр,
/// и предоставляет глобальную точку доступа к этому экземпляру.
///

public class Task17Singlton {
    private static Task17Singlton singleton = null;

        public static Task17Singlton getSingleton() {
            if (singleton == null) {
                singleton = new Task17Singlton();
            }
            return singleton;
        }
    }
