/**
 * Используется для генерации массива
 */
public class MassCreater {
    /** Размер массива */
    private final int SIZE_MASS = 20;

    /** Метод генерации массива */
    public int[] createMass() {

        int mass[] = new int[SIZE_MASS];

        for (int i = 0; i < 20; i++) {
            mass[i] = (int) (Math.random() * 21) - 10;
        }

        return mass;
    }
}