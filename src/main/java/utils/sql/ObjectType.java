package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name="objectTypeId")
public class ObjectType{
    @Id
    @Column(name="objectTypeId")
    private BigInteger objectTypeId;

    @Column(name="objectTypeName", length=50)
    private String name;

    @Id
    @Column(name="ParentId")
    private BigInteger parentId;

    public BigInteger getObjectTypeId(){
        return objectTypeId;
    }

    public void setObjectTypeId(BigInteger objectTypeId){
        this.objectTypeId=objectTypeId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public BigInteger getParentId(){
        return parentId;
    }

    public void setParentId(BigInteger parentId){
        this.parentId=parentId;
    }
}
