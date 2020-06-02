package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name="attribute")
public class Attribute{


    @Id
    @Column(name="attributeId")
    private BigInteger id;

    @Column(name="attributeName")
    private String attributeName;

    @Column(name="attributeType")
    private String attributeType;

    @Id
    @Column(name="listId")
    private BigInteger listId;

    public BigInteger getId(){
        return id;
    }

    public void setId(BigInteger id){
        this.id=id;
    }

    public String getAttributeName(){
        return attributeName;
    }

    public void setAttributeName(String attributeName){
        this.attributeName=attributeName;
    }

    public String getAttributeType(){
        return attributeType;
    }

    public void setAttributeType(String attributeType){
        this.attributeType=attributeType;
    }

    public BigInteger getListId(){
        return listId;
    }

    public void setListId(BigInteger listId){
        this.listId=listId;
    }
}
