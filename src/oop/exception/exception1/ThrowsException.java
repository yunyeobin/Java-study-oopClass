package oop.exception.exception1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public static void main(String[] args) { // 다중catch
        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("C:src/oop/exception/exception1/data1.txt", "java.lang.String");
        }catch (FileNotFoundException  | ClassNotFoundException cF){ //surround try.multi-Catch 선택해 생성
          /*  f.printStackTrace();
        }catch (ClassNotFoundException cF){*/
            cF.getMessage(); //문제가 생긴 내용을 파일에 저장한 것을 log
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    // throws 예외 처리 미루기 : 메소드를 호출한 위치에서 예외를 처리해라.
    private Class loadClass(String fileName, String className)throws FileNotFoundException,ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }
}
