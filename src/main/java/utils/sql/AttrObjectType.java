package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name="attrObjectType")
public class AttrObjectType{


    @Id
    @Column(name="attributeId")
    private BigInteger attributeId;

    @Id
    @Column(name="objectTypeId")
    private BigInteger objectTypeId;

    public BigInteger getAttributeId(){
        return attributeId;
    }

    public void setAttributeId(BigInteger attributeId){
        this.attributeId=attributeId;
    }

    public BigInteger getObjectTypeId(){
        return objectTypeId;
    }

    public void setObjectTypeId(BigInteger objectTypeId){
        this.objectTypeId=objectTypeId;
    }

}
