/**
 * Используется для запуска приложения
 */
public class Runner {
    /** Метод для запуска приложения */
    public static void main(String[] args) {

        /** Объекты используемых классов */
        Mass mass = new Mass();
        MassCreater massCreater = new MassCreater();
        Counter counter = new Counter();

        /** Создание массива и его передача в объект класса Mass */
        mass.setMass(massCreater.createMass());

        /** Вывод созданного массива в консоль */
        System.out.println("Parent massive:" + mass.toString());
        /** Вывод суммы элементов массива на четных позициях в консоль */
        System.out.println("Sum of even elements in massive:" + counter.countEvenValue(mass.getMass()));
    }
}
