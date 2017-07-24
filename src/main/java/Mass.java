import java.util.Arrays;

/** Используется для хранения массива */
public class Mass {
    /** Генерируемый массив */
    private int mass[];

    /** Конструктоп по умолчанию */
    public Mass() {
    }

    /** Конструктоп с параментрами */
    public Mass(int[] mass) {
        this.mass = mass;
    }

    /** Метод get для переменной mass */
    public int[] getMass() {
        return mass;
    }

    /** Метод set для переменной mass */
    public void setMass(int[] mass) {
        this.mass = mass;
    }

    /** Метод конвертирования массива в строку */
    @Override
    public String toString() {
        String showMass = Arrays.toString(mass);
        return showMass;
    }
}
