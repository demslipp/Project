package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name="attributes")
public class attributes{


    @Id
    @Column(name="id")
    private BigInteger id;

    @Column(name="name")
    private String name;

    @Column(name="attr_type")
    private String attr_type;

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

    public String getAttr_type(){
        return attr_type;
    }

    public void setAttr_type(String attr_type){
        this.attr_type=attr_type;
    }

    public BigInteger getList_id(){
        return list_id;
    }

    public void setList_id(BigInteger list_id){
        this.list_id=list_id;
    }
}
