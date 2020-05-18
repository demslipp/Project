package objects;

public class Employee{
    private int id;
    private String name;
    private String surname;
    private Post post;

    public Employee(){
    }

    public Employee(int id, String name, String surname, Post post){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.post=post;
    }

    public Employee newJunior(int id, String name, String surname){
        Post post=new Post(1, 10, 40);
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.post=post;
        return new Employee(id, name, surname, post);
    }

    public Employee newMiddle(int id, String name, String surname){
        Post post=new Post(3, 20, 60);
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.post=post;
        return new Employee(id, name, surname, post);
    }

    public Employee newSenior(int id, String name, String surname){
        Post post=new Post(5, 30, 80);
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.post=post;
        return new Employee(id, name, surname, post);
    }

    @Override
    public String toString(){
        return "Employee{"+
                "id="+id+
                ", name='"+name+'\''+
                ", surname='"+surname+'\''+
                ", post="+post+
                '}';
    }
}
