package java6.p30;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest {
    public static void main(String[] args) {
        Frame frame = new Frame("Login");
        frame.setSize(300, 200);
        frame.setLayout(null);

        Button confirmButton = new Button("확인");
        confirmButton.setSize(120, 60); // 사이즈 수정
        confirmButton.setLocation(90, 50); // 위치 수정

        Button cancelButton = new Button("취소");
        cancelButton.setSize(120, 60); // 사이즈 수정
        cancelButton.setLocation(90, 50); // 위치 수정
        cancelButton.setVisible(false); // 초기에는 취소 버튼 숨김

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmButton.setVisible(false); // 확인 버튼 숨김
                cancelButton.setVisible(true);  // 취소 버튼 보임
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelButton.setVisible(false); // 취소 버튼 숨김
                confirmButton.setVisible(true); // 확인 버튼 보임
            }
        });

        frame.add(confirmButton);
        frame.add(cancelButton);
        frame.setVisible(true);

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
