package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name="list_value")
public class list_value{

    @Id
    @Column(name="id")
    private BigInteger id;

    @Column(name="name")
    private String name;

    @Id
    @Column(name="list_id")
    private BigInteger list_id;

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

    public BigInteger getList_id(){
        return list_id;
    }

    public void setList_id(BigInteger list_id){
        this.list_id=list_id;
    }
}
