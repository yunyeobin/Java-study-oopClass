package oop.day7.application.cafeStudyInterface;

public class MyNoteBook {
    private Wifi internet;

    public MyNoteBook(Wifi wifi) {
        //this.internet = wifi;
        this.internet = new Wifi(); //인스턴스를 여기서해 그럼 딴데선 못쓰지
    }

    void openBrowser(){
        //this.internet 인터넷을 이용해서 브라우저를 동작한다.
        this.internet.connectionInternet();
    }
}
