package oop.teamShoppingMallEx.entityEx;

public class BookEx {
    private String isbn;
    private String name;
    private int price;
    private String author;
    private String desc;
    private String category;
    private String datePublish;

    BookEx(){}

    public BookEx(String isbn, String name, int price, String author, String desc, String category, String datePublish) {
        this.isbn = isbn;
        this.name = name;
        this.price = price;
        this.author = author;
        this.desc = desc;
        this.category = category;
        this.datePublish = datePublish;
    }

    public String getIsbn() {
        return isbn;
    }

    public String toString(){
        return "선택한 도서 정보 블라블라";
    }
}
