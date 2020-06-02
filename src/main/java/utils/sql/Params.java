package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Date;

@Entity
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


}
