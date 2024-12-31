package q614;

public class Student {
    private String schoolName; // 학교명
    private int grade;         // 학년

    // 학교명 반환
    public String getSchoolName() {
        return schoolName;
    }

    // 학교명 설정
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // 학년 반환
    public int getGrade() {
        return grade;
    }

    // 학년 설정
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // 정보 출력
    public void print() {
        System.out.println(grade + " grade in " + schoolName + " School");
    }
}