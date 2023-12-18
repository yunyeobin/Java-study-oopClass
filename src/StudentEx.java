public class StudentEx {
    private String id;
    private String name;

    public StudentEx(){}
    public StudentEx(String id, String name){
        this.id = id;
        this.name = name;

    }

    public void inserRecord(String id, String name){
        id = id;
        name = name;
    }
    public void PrintInfo(){
        System.out.println("id : "+id);
        System.out.println("이름 : "+name);
    }
}
