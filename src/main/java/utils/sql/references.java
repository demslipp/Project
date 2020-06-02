package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name="references")
public class references{

    @Id
    @Column(name="obj_id")
    private BigInteger obj_id;

    @Id
    @Column(name="attr_id")
    private BigInteger attr_id;

    @Id
    @Column(name="ref_id")
    private BigInteger ref_id;

    public BigInteger getObj_id(){
        return obj_id;
    }

    public void setObj_id(BigInteger obj_id){
        this.obj_id=obj_id;
    }

    public BigInteger getAttr_id(){
        return attr_id;
    }

    public void setAttr_id(BigInteger attr_id){
        this.attr_id=attr_id;
    }

    public BigInteger getRef_id(){
        return ref_id;
    }

    public void setRef_id(BigInteger ref_id){
        this.ref_id=ref_id;
    }
}
