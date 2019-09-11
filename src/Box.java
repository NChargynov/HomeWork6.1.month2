public class Box <A extends Number>{
    private A number1;
    private A number2;

    public Box(A number1, A number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public A getNumber1() {
        return number1;
    }

    public A getNumber2() {
        return number2;
    }
}
