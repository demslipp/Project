package objects;

public class ExampleEmployee{
    private int id;
    private String name;
    private String surname;
    private Post post;

    public ExampleEmployee(){
    }

    public ExampleEmployee(int id, String name, String surname, Post post){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.post=post;
    }

    public ExampleEmployee newJunior(int id, String name, String surname){
        Post post=new Post(1, 10, 40);
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.post=post;
        return new ExampleEmployee(id, name, surname, post);
    }

    public ExampleEmployee newMiddle(int id, String name, String surname){
        Post post=new Post(3, 20, 60);
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.post=post;
        return new ExampleEmployee(id, name, surname, post);
    }

    public ExampleEmployee newSenior(int id, String name, String surname){
        Post post=new Post(5, 30, 80);
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.post=post;
        return new ExampleEmployee(id, name, surname, post);
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
