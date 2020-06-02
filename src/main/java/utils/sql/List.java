package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class List{

    @Id
    @Column(name="listId")
    private BigInteger listId;

    @Column(name="listName", length=50)
    private String listName;

}
