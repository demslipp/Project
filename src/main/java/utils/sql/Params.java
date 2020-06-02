package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name="params")
public class Params{

    @Id
    @Column(name="objectId")
    private BigInteger objectId;

    @Id
    @Column(name="attributeId")
    private BigInteger attrId;

    @Id
    @Column(name="listValueId")
    private BigInteger listValueId;

    @Column(name="dateValue")
    private Date dateValue;

    @Column(name="value", length=50)
    private String value;

    public BigInteger getObjectId(){
        return objectId;
    }

    public void setObjectId(BigInteger objectId){
        this.objectId=objectId;
    }

    public BigInteger getAttrId(){
        return attrId;
    }

    public void setAttrId(BigInteger attrId){
        this.attrId=attrId;
    }

    public BigInteger getListValueId(){
        return listValueId;
    }

    public void setListValueId(BigInteger listValueId){
        this.listValueId=listValueId;
    }

    public Date getDateValue(){
        return dateValue;
    }

    public void setDateValue(Date dateValue){
        this.dateValue=dateValue;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value=value;
    }
}
