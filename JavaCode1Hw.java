/**
 * Java Code Home work #1
 *
 * @author Valerii
 * @todo 5.9.2022
 * @date 11.9.2022
 */
 class JavaCode1Hw {
    public static void main(String[] args) {
        // task 1
        int a = 7;
        int b = 13;
        int c = (a+b) * 2;
        int d = a * b;
        System.out.println("Perimetr = " + c);
        System.out.println("Area = " + d);

        // task 2
        a = 5;
        b = 3;
        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %f\n", a, b, (float)a/b);

        // task 
        int[] array = {8, 4, 3, 9, 6};
        System.out.printf("[%d, %d, %d, %d, %d]\n", array[0], array[1],
        array[2], array[3], array[4]);

        // task 4
        int pizzaDiameter = 64;
        double pizzaRadius = pizzaDiameter / 2d;
        double pizzaArea = Math.PI * pizzaRadius * pizzaRadius;
        double pizzaCalories = pizzaArea * 40;
        System.out.printf("Pizza %d cm in diameter has %.2f calories",
        pizzaDiameter, pizzaCalories);
        }
 }