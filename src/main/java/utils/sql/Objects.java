package utils.sql;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Objects{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name="objectName", length=50)
    private String name;

    @Id
    @Column(name="objectTypeId")
    private BigInteger objectTypeId;


}
