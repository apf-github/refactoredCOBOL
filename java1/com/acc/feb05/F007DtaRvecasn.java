package com.acc.feb05;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class F007DtaRvecasn implements Comparable<F007DtaRvecasn> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField F007CODSTOBJDEBT = factory.getStringField(2);
    private static final StringField F007CODSTSUBJDEBT = factory.getStringField(2);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String f007CodStobjdebt = "";
    private String f007CodStsubjdebt = "";
    
    public F007DtaRvecasn() {
    }
    
    public F007DtaRvecasn(String f007CodStobjdebt, String f007CodStsubjdebt) {
        this.f007CodStobjdebt = f007CodStobjdebt;
        this.f007CodStsubjdebt = f007CodStsubjdebt;
    }
    
    public F007DtaRvecasn(F007DtaRvecasn that) {
        this.f007CodStobjdebt = that.f007CodStobjdebt;
        this.f007CodStsubjdebt = that.f007CodStsubjdebt;
    }
    
    protected F007DtaRvecasn(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected F007DtaRvecasn(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static F007DtaRvecasn fromBytes(byte[] bytes, int offset) {
        return new F007DtaRvecasn(bytes, offset);
    }
    
    public static F007DtaRvecasn fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static F007DtaRvecasn fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getF007CodStobjdebt() {
        return this.f007CodStobjdebt;
    }
    
    public void setF007CodStobjdebt(String f007CodStobjdebt) {
        this.f007CodStobjdebt = f007CodStobjdebt;
    }
    
    public String getF007CodStsubjdebt() {
        return this.f007CodStsubjdebt;
    }
    
    public void setF007CodStsubjdebt(String f007CodStsubjdebt) {
        this.f007CodStsubjdebt = f007CodStsubjdebt;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ f007CodStobjdebt=\"");
        s.append(getF007CodStobjdebt());
        s.append("\" f007CodStsubjdebt=\"");
        s.append(getF007CodStsubjdebt());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(F007DtaRvecasn that) {
        return this.f007CodStobjdebt.equals(that.f007CodStobjdebt) &&
            this.f007CodStsubjdebt.equals(that.f007CodStsubjdebt);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof F007DtaRvecasn) && this.equals((F007DtaRvecasn)that);
    }
    
    @Override
    public int hashCode() {
        return f007CodStobjdebt.hashCode() ^
            Integer.rotateLeft(f007CodStsubjdebt.hashCode(), 1);
    }
    
    @Override
    public int compareTo(F007DtaRvecasn that) {
        int c = this.f007CodStobjdebt.compareTo(that.f007CodStobjdebt);
        if ( c != 0 ) return c;
        c = this.f007CodStsubjdebt.compareTo(that.f007CodStsubjdebt);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        F007CODSTOBJDEBT.putString(f007CodStobjdebt, bytes, offset);
        F007CODSTSUBJDEBT.putString(f007CodStsubjdebt, bytes, offset);
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
        f007CodStobjdebt = F007CODSTOBJDEBT.getString(bytes, offset);
        f007CodStsubjdebt = F007CODSTSUBJDEBT.getString(bytes, offset);
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
