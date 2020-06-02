package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
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


}
