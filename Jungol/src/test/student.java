package test;

class Student {
    private String name;
    private String school;
    private int grade;

    public Student(String name, String school, int grade) {
        this.name = name;
        this.school = school;
        this.grade = grade;
    }

    public void print() {
        System.out.println("Name : " + name);
        System.out.println("School : " + school);
        System.out.println("Grade : " + grade);
    }
}