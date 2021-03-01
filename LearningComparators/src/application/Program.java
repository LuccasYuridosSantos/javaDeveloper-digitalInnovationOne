package application;

import model.Student;
import model.StudentOrderReverseAgeComparator;

import java.util.*;

public class Program {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Pedro", 19));
        students.add(new Student("Carlos", 23));
        students.add(new Student("Mariana", 21));
        students.add(new Student("João", 18));
        students.add(new Student("Thiago", 20));
        students.add(new Student("George", 22));
        students.add(new Student("Larissa", 21));

        System.out.println("------ Order of inscription ------");
        System.out.println(students);

        System.out.println("------ numerical order ------");
        students.sort(((o1, o2) -> o1.getIdade() - o2.getIdade()));
        System.out.println(students);

        System.out.println("------ reverse numerical order ------");
        students.sort((first, second)->second.getIdade() - first.getIdade());
        System.out.println(students);

        System.out.println("------ numerical order (method reference)------");
        students.sort(Comparator.comparingInt(Student::getIdade));
        System.out.println(students);

        System.out.println("------ reverse numerical order (method reference) ------");
        students.sort(Comparator.comparingInt(Student::getIdade).reversed());
        System.out.println(students);

        System.out.println("------ numerical order (Interface Comparable)------");
        Collections.sort(students);
        System.out.println(students);

        System.out.println("------ reverse numerical order (Interface Comparable) ------");
        Collections.sort(students,new StudentOrderReverseAgeComparator());
        System.out.println(students);



    }
}
