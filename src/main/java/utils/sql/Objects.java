package utils.sql;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="objects")
public class Objects{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name="objectName", length=50)
    private String name;

    @Id
    @Column(name="objectTypeId")
    private BigInteger objectTypeId;

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

    public BigInteger getObjectTypeId(){
        return objectTypeId;
    }

    public void setObjectTypeId(BigInteger objectTypeId){
        this.objectTypeId=objectTypeId;
    }
}
