public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0) throw new IllegalArgumentException("Деление на ноль!");
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }


    // function (a + b) * c / d - e
    public int solver(){
        return dif(div(times(add(2, 3), 4), 5), 6);
    }


}
