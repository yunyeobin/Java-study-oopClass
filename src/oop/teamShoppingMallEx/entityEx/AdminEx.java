package oop.teamShoppingMallEx.entityEx;

public class AdminEx extends PersonEx {
    private final String ID_ADMIN = "admin";
    private final String PASSWORD_ADMIN = "admin1234";
    //어떠한 경우에도 값이 변하지 않기 위해 final.
    //그리고 얘네는 여기에서 값 할당하고 초기화해주었다.

    private static AdminEx instanceSingleton = null;

    public AdminEx(String name, String userMobile) {
        super(name, userMobile);
    }

    public static AdminEx getInstanceSingleton() {
        return instanceSingleton;
    }

    public static AdminEx getInstance(String name, String userMobile) {
        if (instanceSingleton == null) {
            instanceSingleton = new AdminEx(name, userMobile);
        }
        return instanceSingleton;

    }

    public String getID_ADMIN() {
        return ID_ADMIN;
    }

    public String getPASSWORD_ADMIN() {
        return PASSWORD_ADMIN;
    }

    public String toString(){
        return "관리자정보 블라블라";
    }
}
