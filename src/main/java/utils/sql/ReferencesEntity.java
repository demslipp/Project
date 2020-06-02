package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name="referencesEntity")
public class ReferencesEntity{

    @Id
    @Column(name="id")
    private BigInteger id;

    @Id
    @Column(name="attributeId")
    private BigInteger attributeId;

    @Id
    @Column(name="refId")
    private BigInteger refId;

    public BigInteger getId(){
        return id;
    }

    public void setId(BigInteger id){
        this.id=id;
    }

    public BigInteger getAttributeId(){
        return attributeId;
    }

    public void setAttributeId(BigInteger attributeId){
        this.attributeId=attributeId;
    }

    public BigInteger getRefId(){
        return refId;
    }

    public void setRefId(BigInteger refId){
        this.refId=refId;
    }
}
