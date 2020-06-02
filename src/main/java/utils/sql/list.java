package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name="list")
public class list{

    @Id
    @Column(name="id")
    private BigInteger id;

    @Column(name="name", length=50)
    private String name;

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
}
