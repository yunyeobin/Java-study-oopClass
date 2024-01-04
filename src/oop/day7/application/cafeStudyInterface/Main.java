package oop.day7.application.cafeStudyInterface;

public class Main {
    public static void main(String[] args) {
        Wifi internet = new Wifi();


        MyNoteBook myNoteBook = new MyNoteBook(internet);
        YourNoteBook yourNoteBook = new YourNoteBook(internet);
        myNoteBook.openBrowser();
        yourNoteBook.openKakaoTalk();
    }
}
