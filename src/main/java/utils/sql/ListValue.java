package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class ListValue{

    @Id
    @Column(name="listValueId")
    private BigInteger listValueId;

    @Column(name="listName")
    private String listName;

    @Id
    @Column(name="listId")
    private BigInteger listId;

}
