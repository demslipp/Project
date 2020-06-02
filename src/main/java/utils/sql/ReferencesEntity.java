package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
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


}
