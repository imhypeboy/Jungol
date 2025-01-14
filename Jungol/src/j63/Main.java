package j63;

import java.awt.Frame;
import java.awt.List;
 
public class Main {
    public static void main(String[] args) {
        Frame f = new Frame("List - Select");
        f.setSize(300, 200);
        f.setLayout(null);
 
        List selectOne = new List(6);
        selectOne.setLocation(20, 40);
        selectOne.setSize(100, 120);
        selectOne.add("Student");
        selectOne.add("Teacher");
        selectOne.add("Driver");
        selectOne.add("Computer Programmer");
        selectOne.add("Sales Man");
        selectOne.add("Musician");
        selectOne.add("Director");
        List selectMany = new List(6, true);
        selectMany.setLocation(150, 40);
        selectMany.setSize(100, 120);
        selectMany.add("Student");
        selectMany.add("Teacher");
        selectMany.add("Driver");
        selectMany.add("Computer Programmer");
        selectMany.add("Sales Man");
        selectMany.add("Musician");
        selectMany.add("Director");
 
        f.add(selectOne);
        f.add(selectMany);
        f.setVisible(true);
    }
}

 
