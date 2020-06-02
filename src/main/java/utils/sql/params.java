package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name="params")
public class params{

    @Id
    @Column(name="attr_id")
    private BigInteger attr_id;

    @Id
    @Column(name="obj_id")
    private BigInteger obj_id;

    @Id
    @Column(name="list_value_id")
    private BigInteger list_value_id;

    @Column(name="date_value")
    private Date date_value;

    @Column(name="value", length=50)
    private String value;

    public BigInteger getAttr_id(){
        return attr_id;
    }

    public void setAttr_id(BigInteger attr_id){
        this.attr_id=attr_id;
    }

    public BigInteger getObj_id(){
        return obj_id;
    }

    public void setObj_id(BigInteger obj_id){
        this.obj_id=obj_id;
    }

    public BigInteger getList_value_id(){
        return list_value_id;
    }

    public void setList_value_id(BigInteger list_value_id){
        this.list_value_id=list_value_id;
    }

    public Date getDate_value(){
        return date_value;
    }

    public void setDate_value(Date date_value){
        this.date_value=date_value;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value=value;
    }
}
