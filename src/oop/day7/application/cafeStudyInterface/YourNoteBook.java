package oop.day7.application.cafeStudyInterface;

public class YourNoteBook {
    private Wifi internet;

    public YourNoteBook(Wifi internet) {
        this.internet = internet;
    }

    void openKakaoTalk(){
        this.internet.connectionInternet();
    }
}
