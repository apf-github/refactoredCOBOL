package com.acc.feb05;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class VaAlcons implements Comparable<VaAlcons> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField CALOAN = factory.getStringField(2);
    private static final StringField CADEPOSIT1 = factory.getStringField(2);
    private static final StringField CADEPOSIT2 = factory.getStringField(2);
    private static final StringField CADEPOSIT3 = factory.getStringField(2);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String caLoan = "96";
    private String caDeposit1 = "01";
    private String caDeposit2 = "02";
    private String caDeposit3 = "07";
    
    public VaAlcons() {
    }
    
    public VaAlcons(String caLoan, String caDeposit1, String caDeposit2, String caDeposit3) {
        this.caLoan = caLoan;
        this.caDeposit1 = caDeposit1;
        this.caDeposit2 = caDeposit2;
        this.caDeposit3 = caDeposit3;
    }
    
    public VaAlcons(VaAlcons that) {
        this.caLoan = that.caLoan;
        this.caDeposit1 = that.caDeposit1;
        this.caDeposit2 = that.caDeposit2;
        this.caDeposit3 = that.caDeposit3;
    }
    
    protected VaAlcons(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected VaAlcons(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static VaAlcons fromBytes(byte[] bytes, int offset) {
        return new VaAlcons(bytes, offset);
    }
    
    public static VaAlcons fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static VaAlcons fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getCaLoan() {
        return this.caLoan;
    }
    
    public void setCaLoan(String caLoan) {
        this.caLoan = caLoan;
    }
    
    public String getCaDeposit1() {
        return this.caDeposit1;
    }
    
    public void setCaDeposit1(String caDeposit1) {
        this.caDeposit1 = caDeposit1;
    }
    
    public String getCaDeposit2() {
        return this.caDeposit2;
    }
    
    public void setCaDeposit2(String caDeposit2) {
        this.caDeposit2 = caDeposit2;
    }
    
    public String getCaDeposit3() {
        return this.caDeposit3;
    }
    
    public void setCaDeposit3(String caDeposit3) {
        this.caDeposit3 = caDeposit3;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ caLoan=\"");
        s.append(getCaLoan());
        s.append("\" caDeposit1=\"");
        s.append(getCaDeposit1());
        s.append("\" caDeposit2=\"");
        s.append(getCaDeposit2());
        s.append("\" caDeposit3=\"");
        s.append(getCaDeposit3());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(VaAlcons that) {
        return this.caLoan.equals(that.caLoan) &&
            this.caDeposit1.equals(that.caDeposit1) &&
            this.caDeposit2.equals(that.caDeposit2) &&
            this.caDeposit3.equals(that.caDeposit3);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof VaAlcons) && this.equals((VaAlcons)that);
    }
    
    @Override
    public int hashCode() {
        return caLoan.hashCode() ^
            Integer.rotateLeft(caDeposit1.hashCode(), 1) ^
            Integer.rotateLeft(caDeposit2.hashCode(), 2) ^
            Integer.rotateLeft(caDeposit3.hashCode(), 3);
    }
    
    @Override
    public int compareTo(VaAlcons that) {
        int c = this.caLoan.compareTo(that.caLoan);
        if ( c != 0 ) return c;
        c = this.caDeposit1.compareTo(that.caDeposit1);
        if ( c != 0 ) return c;
        c = this.caDeposit2.compareTo(that.caDeposit2);
        if ( c != 0 ) return c;
        c = this.caDeposit3.compareTo(that.caDeposit3);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        CALOAN.putString(caLoan, bytes, offset);
        CADEPOSIT1.putString(caDeposit1, bytes, offset);
        CADEPOSIT2.putString(caDeposit2, bytes, offset);
        CADEPOSIT3.putString(caDeposit3, bytes, offset);
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
        caLoan = CALOAN.getString(bytes, offset);
        caDeposit1 = CADEPOSIT1.getString(bytes, offset);
        caDeposit2 = CADEPOSIT2.getString(bytes, offset);
        caDeposit3 = CADEPOSIT3.getString(bytes, offset);
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
