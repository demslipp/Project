package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name="attr_object_type")
public class attr_object_type{

    @Id
    @Column(name="attr_id")
    private BigInteger attr_Id;

    @Id
    @Column(name="object_type_id")
    private BigInteger object_type_id;

    public BigInteger getAttr_id(){
        return attr_Id;
    }

    public void setAttr_Id(BigInteger attr_id){
        this.attr_Id=attr_id;
    }

    public BigInteger getObject_type_id(){
        return object_type_id;
    }

    public void setObject_type_id(BigInteger object_type_id){
        this.object_type_id=object_type_id;
    }
}
