package oop.teamShoppingMallEx.serviceEx;

import oop.teamShoppingMallEx.entityEx.BookEx;

public class BookServiceEx {
    private BookEx bookEx;

    public BookServiceEx(BookEx bookEx) {
        this.bookEx = bookEx;
    }

    public BookEx getBookEx() {
        return bookEx;
    }
}
