package com.acc.test1;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CustinptFile implements Comparable<CustinptFile> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ByteArrayField CUSTINPRIKEY = factory.getByteArrayField(CustinPriKey.SIZE);
    private static final StringField CUSTINCUSTMNAMEFRSTNM = factory.getStringField(15);
    private static final StringField CUSTINCUSTMNAMEMDLNM = factory.getStringField(8);
    private static final StringField CUSTINCUSTMNAMELASTNM = factory.getStringField(15);
    private static final StringField CUSTINCUSTMADDR = factory.getStringField(35);
    private static final StringField CUSTINCUSTMDOB = factory.getStringField(10);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private CustinPriKey custinPriKey = new CustinPriKey();
    private String custinCustmNameFrstnm = "";
    private String custinCustmNameMdlnm = "";
    private String custinCustmNameLastnm = "";
    private String custinCustmAddr = "";
    private String custinCustmDob = "";
    
    public CustinptFile() {
    }
    
    public CustinptFile(CustinPriKey custinPriKey, String custinCustmNameFrstnm, String custinCustmNameMdlnm, String custinCustmNameLastnm, String custinCustmAddr, String custinCustmDob) {
        this.custinPriKey = custinPriKey;
        this.custinCustmNameFrstnm = custinCustmNameFrstnm;
        this.custinCustmNameMdlnm = custinCustmNameMdlnm;
        this.custinCustmNameLastnm = custinCustmNameLastnm;
        this.custinCustmAddr = custinCustmAddr;
        this.custinCustmDob = custinCustmDob;
    }
    
    public CustinptFile(CustinptFile that) {
        this.custinPriKey = new CustinPriKey(that.custinPriKey);
        this.custinCustmNameFrstnm = that.custinCustmNameFrstnm;
        this.custinCustmNameMdlnm = that.custinCustmNameMdlnm;
        this.custinCustmNameLastnm = that.custinCustmNameLastnm;
        this.custinCustmAddr = that.custinCustmAddr;
        this.custinCustmDob = that.custinCustmDob;
    }
    
    protected CustinptFile(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected CustinptFile(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static CustinptFile fromBytes(byte[] bytes, int offset) {
        return new CustinptFile(bytes, offset);
    }
    
    public static CustinptFile fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static CustinptFile fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public CustinPriKey getCustinPriKey() {
        return this.custinPriKey;
    }
    
    public void setCustinPriKey(CustinPriKey custinPriKey) {
        this.custinPriKey = custinPriKey;
    }
    
    public String getCustinCustmNameFrstnm() {
        return this.custinCustmNameFrstnm;
    }
    
    public void setCustinCustmNameFrstnm(String custinCustmNameFrstnm) {
        this.custinCustmNameFrstnm = custinCustmNameFrstnm;
    }
    
    public String getCustinCustmNameMdlnm() {
        return this.custinCustmNameMdlnm;
    }
    
    public void setCustinCustmNameMdlnm(String custinCustmNameMdlnm) {
        this.custinCustmNameMdlnm = custinCustmNameMdlnm;
    }
    
    public String getCustinCustmNameLastnm() {
        return this.custinCustmNameLastnm;
    }
    
    public void setCustinCustmNameLastnm(String custinCustmNameLastnm) {
        this.custinCustmNameLastnm = custinCustmNameLastnm;
    }
    
    public String getCustinCustmAddr() {
        return this.custinCustmAddr;
    }
    
    public void setCustinCustmAddr(String custinCustmAddr) {
        this.custinCustmAddr = custinCustmAddr;
    }
    
    public String getCustinCustmDob() {
        return this.custinCustmDob;
    }
    
    public void setCustinCustmDob(String custinCustmDob) {
        this.custinCustmDob = custinCustmDob;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ custinPriKey=\"");
        s.append(getCustinPriKey());
        s.append("\" custinCustmNameFrstnm=\"");
        s.append(getCustinCustmNameFrstnm());
        s.append("\" custinCustmNameMdlnm=\"");
        s.append(getCustinCustmNameMdlnm());
        s.append("\" custinCustmNameLastnm=\"");
        s.append(getCustinCustmNameLastnm());
        s.append("\" custinCustmAddr=\"");
        s.append(getCustinCustmAddr());
        s.append("\" custinCustmDob=\"");
        s.append(getCustinCustmDob());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(CustinptFile that) {
        return this.custinPriKey.equals(that.custinPriKey) &&
            this.custinCustmNameFrstnm.equals(that.custinCustmNameFrstnm) &&
            this.custinCustmNameMdlnm.equals(that.custinCustmNameMdlnm) &&
            this.custinCustmNameLastnm.equals(that.custinCustmNameLastnm) &&
            this.custinCustmAddr.equals(that.custinCustmAddr) &&
            this.custinCustmDob.equals(that.custinCustmDob);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof CustinptFile) && this.equals((CustinptFile)that);
    }
    
    @Override
    public int hashCode() {
        return custinPriKey.hashCode() ^
            Integer.rotateLeft(custinCustmNameFrstnm.hashCode(), 1) ^
            Integer.rotateLeft(custinCustmNameMdlnm.hashCode(), 2) ^
            Integer.rotateLeft(custinCustmNameLastnm.hashCode(), 3) ^
            Integer.rotateLeft(custinCustmAddr.hashCode(), 4) ^
            Integer.rotateLeft(custinCustmDob.hashCode(), 5);
    }
    
    @Override
    public int compareTo(CustinptFile that) {
        int c = this.custinPriKey.compareTo(that.custinPriKey);
        if ( c != 0 ) return c;
        c = this.custinCustmNameFrstnm.compareTo(that.custinCustmNameFrstnm);
        if ( c != 0 ) return c;
        c = this.custinCustmNameMdlnm.compareTo(that.custinCustmNameMdlnm);
        if ( c != 0 ) return c;
        c = this.custinCustmNameLastnm.compareTo(that.custinCustmNameLastnm);
        if ( c != 0 ) return c;
        c = this.custinCustmAddr.compareTo(that.custinCustmAddr);
        if ( c != 0 ) return c;
        c = this.custinCustmDob.compareTo(that.custinCustmDob);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        custinPriKey.getBytes(bytes, CUSTINPRIKEY.getOffset() + offset);
        CUSTINCUSTMNAMEFRSTNM.putString(custinCustmNameFrstnm, bytes, offset);
        CUSTINCUSTMNAMEMDLNM.putString(custinCustmNameMdlnm, bytes, offset);
        CUSTINCUSTMNAMELASTNM.putString(custinCustmNameLastnm, bytes, offset);
        CUSTINCUSTMADDR.putString(custinCustmAddr, bytes, offset);
        CUSTINCUSTMDOB.putString(custinCustmDob, bytes, offset);
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
        custinPriKey.setBytes(bytes, CUSTINPRIKEY.getOffset() + offset);
        custinCustmNameFrstnm = CUSTINCUSTMNAMEFRSTNM.getString(bytes, offset);
        custinCustmNameMdlnm = CUSTINCUSTMNAMEMDLNM.getString(bytes, offset);
        custinCustmNameLastnm = CUSTINCUSTMNAMELASTNM.getString(bytes, offset);
        custinCustmAddr = CUSTINCUSTMADDR.getString(bytes, offset);
        custinCustmDob = CUSTINCUSTMDOB.getString(bytes, offset);
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
