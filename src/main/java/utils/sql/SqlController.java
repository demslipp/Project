package utils.sql;

import java.math.BigInteger;
import java.util.Date;

public class SqlController{

    public BigInteger getRef_id(){
        return ref_id;
    }

    public void setRef_id(BigInteger ref_id){
        this.ref_id=ref_id;
    }

    /*
    //table references

    public void setReferenceId(BigInteger attrId, BigInteger referenceId){
            this.ref_id=ref_id;
    }
    public BigInteger getReferenceId(BigInteger attrId){

    }

    //params: value
    public void setStringParameter(BigInteger attrId, String value){
    }

    public String getStringParameter(BigInteger attrId){

    }

    // params: date_value

    public void setDateParameter(BigInteger attrId, Date dateValue){
    }

    public Date getDateParameter(BigInteger attrId){

    }

    //params: list_value_id

    public void setListValueId(BigInteger attrId, BigInteger listId){
    }

    public BigInteger getListValueId(BigInteger attrId){

    }

    //params -> list_value: name
    public String getListValue(BigInteger attrId){
        BigInteger listValueId=getListValueId(attrId);
    }*/
}

