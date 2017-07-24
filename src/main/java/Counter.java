/**
 * Используется для вычисления суммы элементов,
 * находящихся на четных позициях в массиве.
 */
public class Counter {
    public int countEvenValue(int mass[]) {

        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            if ((i % 2) == 0) {
                sum = sum + mass[i];
            }
        }

        return sum;
    }
}