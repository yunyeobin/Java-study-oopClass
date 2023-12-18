public class AddObject {
    private Object a;

    private Object b;

    AddObject(){}
    AddObject(int a, int b){
        this.a = (Integer)a; //하나하나 만들필요가 없어요 다 담을수 있거든
        this.b = (Integer)b;
        Adder(a,b);
    }
    AddObject(double a, double b){
        this.a = a;
        this.b = b;
        Adder(a,b);

    }
    AddObject(int a, double b){
        this.a = a;
        this.b = b;
        Adder(a,b);
    }
    //↓메소드 오버로딩
    public void Adder(Integer a, Integer b){


    }
    public void Adder(Double a, Double b){


    }
    public void Adder(Integer a, Double b){


    }
}
