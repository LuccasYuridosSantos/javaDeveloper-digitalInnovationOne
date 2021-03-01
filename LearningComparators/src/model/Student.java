package model;

public class Student implements Comparable<Student>{

    private String name;
    private int idade;

    public Student(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    @Override
    public String toString() {
        return  name + " - " + idade;
    }

    @Override
    public int compareTo(Student o) {
        return this.getIdade() - o.getIdade();
    }
}
