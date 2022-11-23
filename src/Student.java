import java.util.Arrays;

public class Student implements StudentAble {
    private String fullName;
    private int age;
    private String email;
    private Gender gender;

    public Student(String fullName, int age, String email, Gender gender) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Student(){

    }


    @Override
    public void getAllStudent(Student[] students) {
        for (Student student:students) {
            System.out.println(student);
        }
    }

    @Override
    public void getMale(Student[] students) {
        for (Student student:students) {
            if (student.gender.equals(Gender.M)){
                System.out.println(student);
            }
        }
    }

    @Override
    public void getFamele(Student[] students) {
        for (Student student : students){
            if(student.gender.equals(Gender.F)){
                System.out.println(student);
            }
        }
    }

    @Override
    public void findByName(Student[] students, String name) {
        for (Student student:students) {
            if (student.fullName.contains(name)){
                System.out.println(student);
            }
        }
    }

    @Override
    public void sortAge(Student[] students) {
        int[] ages = new int[students.length];
        int index = 0;
        for (Student student:students) {
            ages[index] = student.age;
            index++;
        }
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
    }

    @Override
    public void getSurname(Student[] students) {
        for (Student student:students) {
            String[] strings = student.fullName.split(" ");
            for (int i = 1; i < strings.length; i++) {
                System.out.print("\n" + strings[i]);
            }
        }
    }
    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
    }

