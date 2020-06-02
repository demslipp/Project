package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name="list")
public class List{
    public BigInteger getListId(){
        return listId;
    }

    public void setListId(BigInteger listId){
        this.listId=listId;
    }

    public String getListName(){
        return listName;
    }

    public void setListName(String listName){
        this.listName=listName;
    }

    @Id
    @Column(name="listId")
    private BigInteger listId;

    @Column(name="listName", length=50)
    private String listName;

}
