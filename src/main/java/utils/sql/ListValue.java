package utils.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name="listValue")
public class ListValue{

    @Id
    @Column(name="listValueId")
    private BigInteger listValueId;

    @Column(name="listName")
    private String listName;

    @Id
    @Column(name="listId")
    private BigInteger listId;

    public BigInteger getListValueId(){
        return listValueId;
    }

    public void setListValueId(BigInteger listValueId){
        this.listValueId=listValueId;
    }

    public String getListName(){
        return listName;
    }

    public void setListName(String listName){
        this.listName=listName;
    }

    public BigInteger getListId(){
        return listId;
    }

    public void setListId(BigInteger listId){
        this.listId=listId;
    }
}
