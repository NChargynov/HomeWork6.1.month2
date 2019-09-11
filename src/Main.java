public class Main {

    public static void main(String[] args) {

        Box<Number> box1 = new Box<>(1.8, 7);
        Box<Float> box2 = new Box<>(2.5F, 3.0F);

        System.out.println("Урок математики.");
        System.out.println("_______________");
        System.out.println("Найти значение");
        System.out.println(box1.getNumber1() + " + " + box1.getNumber2() + " + "
                + box2.getNumber1() + " + " + box2.getNumber2() + " = " + '?');

        System.out.println("Результат суммы = " + addition(box1,box2));
        System.out.println("_______________");
        System.out.println("Найти значение");
        System.out.println(box1.getNumber1() + " * " + box1.getNumber2() + " * "
                + box2.getNumber1() + " * " + box2.getNumber2() + " = " + '?');

        System.out.println("Результат умножения = " + multiplication(box1,box2));
    }

    public static Number addition (Box<? extends Number> box1, Box<? extends Number> box2){
        return box1.getNumber1().doubleValue() + box1.getNumber2().doubleValue() +
                box2.getNumber1().doubleValue() + box2.getNumber2().doubleValue();
    }

    public static Number multiplication (Box<? extends Number> box1, Box<? extends Number> box2){
        return box1.getNumber1().doubleValue() * box1.getNumber2().doubleValue() *
                box2.getNumber1().doubleValue() * box2.getNumber2().doubleValue();
    }
}
