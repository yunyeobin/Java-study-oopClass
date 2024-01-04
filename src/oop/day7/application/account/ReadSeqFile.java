package oop.day7.application.account;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ReadSeqFile extends Frame implements ActionListener {

    private TextField account, name, balance;
    private Button next, done;
    private DataInputStream input; // 필드에 입력되는 account, naem, balance의 스트링 객체를 담는 객체

    public ReadSeqFile() throws FileNotFoundException {
        super("Read Customer Info");
        try {
            input = new DataInputStream(new FileInputStream("client.doc"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        setSize(250, 250);
        setLayout(new GridLayout(4, 2)); // 4행 2열

        add(new Label("Account Number"));
        account = new TextField();
        account.setEditable(false); // onlyRead
        add(account);

        add(account);
        add(new Label("  Name"));
        name = new TextField(20);
        name.setEditable(false);
        add(name);

        // balance Frame에 붙이기
        add(new Label("Balance"));
        balance = new TextField(20);
        balance.setEditable(false);
        add(balance);

        next = new Button("Output");
        next.addActionListener(this);
        add(next);

        done = new Button("Exit");
        done.addActionListener(this);
        add(done);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == next) readRecord(); // 데이터를 한 레코드씩 읽는 메서드
        else closeFile();
    }

    public void closeFile() {
        try {
            input.close();
            System.exit(0);
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }

    public void readRecord() {
        String accountNumber;
        String nameData;
        double balance;

        try {
            accountNumber = input.readUTF();
            nameData = input.readUTF();
            balance = input.readDouble();

            this.account.setText(String.valueOf(accountNumber));
            this.name.setText(nameData);
            this.balance.setText(String.valueOf(balance));

        } catch (EOFException e) {
            closeFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        new ReadSeqFile();
    }
}