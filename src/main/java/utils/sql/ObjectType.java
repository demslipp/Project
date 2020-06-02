package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class ObjectType{
    @Id
    @Column(name="objectTypeId")
    private BigInteger objectTypeId;

    @Column(name="objectTypeName", length=50)
    private String name;

    @Id
    @Column(name="ParentId")
    private BigInteger parentId;
}
