package objects;

/*import lombok.Data;

@Data*/
public class Post{
    private int experience;
    private int coefficient;
    private int salary;

    public Post(int experience, int coefficient, int salary){
        this.salary=salary;
        this.coefficient=coefficient;
        this.experience=experience;
    }

    @Override
    public String toString(){
        return "("+
                "experience="+experience+
                ", coefficient="+coefficient+
                ", salary="+salary+
                ')';
    }
}