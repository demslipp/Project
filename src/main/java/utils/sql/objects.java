package utils.sql;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="objects")
public class objects{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name="name", length=50)
    private String name;

    @Id
    @Column(name="obj_type_id")
    private BigInteger obj_type_id;

    public BigInteger getId(){
        return id;
    }

    public void setId(BigInteger id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public BigInteger getObj_type_id(){
        return obj_type_id;
    }

    public void setObj_type_id(BigInteger obj_type_id){
        this.obj_type_id=obj_type_id;
    }
}
