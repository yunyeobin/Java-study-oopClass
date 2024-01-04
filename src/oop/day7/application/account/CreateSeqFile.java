package oop.day7.application.account;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class CreateSeqFile extends Frame implements ActionListener {

    private TextField account, name, balance;
    private Button enter, done;
    private DataOutputStream output; // 필드에 입력되는 account, naem, balance의 스트링 객체를 담는 객체

    public CreateSeqFile() {
        super("Create User Info File");
        try {
            output = new DataOutputStream(new FileOutputStream("client.doc"));
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
        account.setEditable(true);
        add(account);

        add(new Label("  Name"));
        name = new TextField(20);
        name.setEditable(true);
        add(name);

        // balance Frame에 붙이기
        add(new Label("Balance"));
        balance = new TextField(20);
        balance.setEditable(true);
        add(balance);

        enter = new Button("Input");
        enter.addActionListener(this);
        add(enter);

        done = new Button("Exit");
        enter.addActionListener(this);
        add(done);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        addRecord(); // 데이터를 한 레코드씩 읽는 메서드
        if (event.getSource() == done) try {
            output.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void addRecord() {
        String accountNo = "";
        double balance = 0.0;

        if (!this.account.getText().isEmpty() || this.account.getText() != null) {
            try {
                accountNo = String.valueOf(this.account.getText());
                output.writeUTF(accountNo);
                output.writeUTF(name.getText());
                output.writeDouble(Double.parseDouble(this.balance.getText()));
            } catch (NumberFormatException e) {
                System.err.println(e);
            } catch (IOException e) {
                System.err.println(e);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }

    public void closeFile() {

    }

    public static void main(String[] args) throws FileNotFoundException {
        new CreateSeqFile();
    }
}