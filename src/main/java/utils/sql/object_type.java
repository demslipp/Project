package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name="object_type")
public class object_type{
    @Id
    @Column(name="id")
    private BigInteger id;

    @Column(name="name", length=50)
    private String name;

    @Id
    @Column(name="parent_id")
    private BigInteger parent_id;

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

    public BigInteger getParent_id(){
        return parent_id;
    }

    public void setParent_id(BigInteger parent_id){
        this.parent_id=parent_id;
    }
}
