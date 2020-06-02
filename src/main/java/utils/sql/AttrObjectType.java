package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class AttrObjectType{

    @Id
    @Column(name="attributeId")
    private BigInteger attributeId;

    @Id
    @Column(name="objectTypeId")
    private BigInteger objectTypeId;


}
