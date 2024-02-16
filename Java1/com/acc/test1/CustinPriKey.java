package com.acc.test1;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CustinPriKey implements Comparable<CustinPriKey> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField CUSTINREQTYPE = factory.getStringField(2);
    private static final StringField CUSTINCUSTMNO = factory.getStringField(10);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String custinReqType = "";
    private String custinCustmNo = "";
    
    public CustinPriKey() {
    }
    
    public CustinPriKey(String custinReqType, String custinCustmNo) {
        this.custinReqType = custinReqType;
        this.custinCustmNo = custinCustmNo;
    }
    
    public CustinPriKey(CustinPriKey that) {
        this.custinReqType = that.custinReqType;
        this.custinCustmNo = that.custinCustmNo;
    }
    
    protected CustinPriKey(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected CustinPriKey(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static CustinPriKey fromBytes(byte[] bytes, int offset) {
        return new CustinPriKey(bytes, offset);
    }
    
    public static CustinPriKey fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static CustinPriKey fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getCustinReqType() {
        return this.custinReqType;
    }
    
    public void setCustinReqType(String custinReqType) {
        this.custinReqType = custinReqType;
    }
    
    public String getCustinCustmNo() {
        return this.custinCustmNo;
    }
    
    public void setCustinCustmNo(String custinCustmNo) {
        this.custinCustmNo = custinCustmNo;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ custinReqType=\"");
        s.append(getCustinReqType());
        s.append("\" custinCustmNo=\"");
        s.append(getCustinCustmNo());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(CustinPriKey that) {
        return this.custinReqType.equals(that.custinReqType) &&
            this.custinCustmNo.equals(that.custinCustmNo);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof CustinPriKey) && this.equals((CustinPriKey)that);
    }
    
    @Override
    public int hashCode() {
        return custinReqType.hashCode() ^
            Integer.rotateLeft(custinCustmNo.hashCode(), 1);
    }
    
    @Override
    public int compareTo(CustinPriKey that) {
        int c = this.custinReqType.compareTo(that.custinReqType);
        if ( c != 0 ) return c;
        c = this.custinCustmNo.compareTo(that.custinCustmNo);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        CUSTINREQTYPE.putString(custinReqType, bytes, offset);
        CUSTINCUSTMNO.putString(custinCustmNo, bytes, offset);
        return bytes;
    }
    
    public final byte[] getBytes(byte[] bytes) {
        return getBytes(bytes, 0);
    }
    
    public final byte[] getBytes() {
        return getBytes(new byte[numBytes()]);
    }
    
    public final String toByteString() {
        try {
            return new String(getBytes(), factory.getStringEncoding());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void setBytes(byte[] bytes, int offset) {
        if (bytes.length < SIZE + offset) {
            byte[] newBytes = Arrays.copyOf(bytes, SIZE + offset);
            Arrays.fill(newBytes, bytes.length, SIZE + offset, (byte)0x40 /*default EBCDIC space character*/);
            bytes = newBytes;
        }
        custinReqType = CUSTINREQTYPE.getString(bytes, offset);
        custinCustmNo = CUSTINCUSTMNO.getString(bytes, offset);
    }
    
    public final void setBytes(byte[] bytes) {
        setBytes(bytes, 0);
    }
    
    public final void setBytes(String bytes) {
        try {
            setBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public int numBytes() {
        return SIZE;
    }
}
