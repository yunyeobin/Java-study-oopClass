public class AddEx { //클래스 AddEx
    private double a; //필드 선언

    private double b;

    AddEx(){}
    AddEx(int a, int b){
        this.a = a;
        this.b = b;
        Adder(a,b);
    }
    AddEx(double a, double b){
        this.a = a;
        this.b = b;
        Adder(a,b);

    }
    AddEx(int a, double b){
        this.a = a;
        this.b = b;
        Adder(a,b);
    }
//↓메소드 오버로딩
    public void Adder(int a, int b){
        System.out.println(a+"+"+b +"="+ (a+b));

    }
    public void Adder(double a, double b){
        System.out.println(a+"+"+b +"="+ (a+b));

    }
    public void Adder(int a, double b){
        System.out.println(a+"+"+b +"="+ (a+b));

    }

    public void addder(Integer number1, Integer number2){
        if ((number1 instanceof Integer)&&(number2 instanceof Integer));
    }
}
