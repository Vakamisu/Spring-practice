package xmlConfig;

public class Student {
    private ITeacher teacher;

    //Dependency Injection (DI)
    public Student (ITeacher teacher){
        this.teacher = teacher;
    }

    public void printHomeWork(){
        System.out.println(teacher.getHomeWork());
    }

    public void printTeacherNotes() {
        System.out.println(teacher.getNote());
    }

    public void printTeacherName() {
        System.out.println(teacher.getName());
    }

    public ITeacher getTeacher() {
        return teacher;
    }
}
