package utils.sql;

import java.math.BigInteger;
import java.util.Date;

public class TesTtt{

    private BigInteger ref_id;
    private BigInteger attr_id;
    private String name;
    private BigInteger obj_type_id;
    private BigInteger object_type_id;
    private BigInteger id;
    private String attr_type;
    private BigInteger list_id;
    private BigInteger parent_id;
    private Date date_value;
    private String value;
    private BigInteger obj_id;

    //table references

    public BigInteger getObj_id(){
        return obj_id;
    }

    public void setObj_id(BigInteger obj_id){
        this.obj_id=obj_id;
    }

    public BigInteger getRef_id(){
        return ref_id;
    }

    public void setRef_id(BigInteger ref_id){
        this.ref_id=ref_id;
    }

    // table objects

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public BigInteger getObj_type_id(){
        return obj_type_id;
    }

    public void setObj_type_id(BigInteger obj_type_id){
        this.obj_type_id=obj_type_id;
    }

    //table attr_object_type

    public BigInteger getAttr_id(){
        return attr_id;
    }

    public void setAttr_id(BigInteger attr_id){
        this.attr_id=attr_id;
    }

    public BigInteger getObject_type_id(){
        return object_type_id;
    }

    public void setObject_type_id(BigInteger object_type_id){
        this.object_type_id=object_type_id;
    }

    //table attributes

    public void setId(BigInteger id){
        this.id=id;
    }

    public String getAttr_type(){
        return attr_type;
    }

    public void setAttr_type(String attr_type){
        this.attr_type=attr_type;
    }

    //table list_value

    public BigInteger getList_id(){
        return list_id;
    }

    public void setList_id(BigInteger list_id){
        this.list_id=list_id;
    }

    //table object_type

    public BigInteger getParent_id(){
        return parent_id;
    }

    public void setParent_id(BigInteger parent_id){
        this.parent_id=parent_id;
    }

    //table params

    public Date getDate_value(){
        return date_value;
    }

    public void setDate_value(Date date_value){
        this.date_value=date_value;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value=value;
    }

}
