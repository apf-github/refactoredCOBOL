package com.acc.feb05;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Arrays;

public class F007DtaRieccim implements Comparable<F007DtaRieccim> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField F007DATRCPT = factory.getStringField(10);
    private static final StringField F007DATPROV = factory.getStringField(10);
    private static final StringField F007PERCAP = factory.getStringField(4);
    private static final StringField F007PERIRT = factory.getStringField(4);
    private static final PackedDecimalAsBigDecimalField F007AMTCAP = factory.getPackedDecimalAsBigDecimalField(15, 2, true);
    private static final PackedDecimalAsBigDecimalField F007AMTITR = factory.getPackedDecimalAsBigDecimalField(15, 2, true);
    private static final PackedDecimalAsBigDecimalField F007AMTCOM = factory.getPackedDecimalAsBigDecimalField(15, 2, true);
    private static final PackedDecimalAsBigDecimalField F007AMTEXPN = factory.getPackedDecimalAsBigDecimalField(15, 2, true);
    private static final PackedDecimalAsBigDecimalField F007AMTARR = factory.getPackedDecimalAsBigDecimalField(15, 2, true);
    private static final PackedDecimalAsBigDecimalField F007PERARR = factory.getPackedDecimalAsBigDecimalField(5, 3, true);
    private static final StringField F007FLGAVA1A1 = factory.getStringField(1);
    private static final StringField F007AMTPENDCAPA1 = factory.getStringField(8);
    private static final StringField F007AMTLEGALCOA1 = factory.getStringField(8);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String f007DatRcpt = "";
    private String f007DatProv = "";
    private String f007PerCap = "";
    private String f007PerIrt = "";
    private BigDecimal f007AmtCap = BigDecimal.ZERO;
    private BigDecimal f007AmtItr = BigDecimal.ZERO;
    private BigDecimal f007AmtCom = BigDecimal.ZERO;
    private BigDecimal f007AmtExpn = BigDecimal.ZERO;
    private BigDecimal f007AmtArr = BigDecimal.ZERO;
    private BigDecimal f007PerArr = BigDecimal.ZERO;
    private char f007FlgAva1A1;
    private String f007AmtPendcapA1 = "";
    private String f007AmtLegalcoA1 = "";
    
    public F007DtaRieccim() {
    }
    
    public F007DtaRieccim(String f007DatRcpt, String f007DatProv, String f007PerCap, String f007PerIrt, BigDecimal f007AmtCap, BigDecimal f007AmtItr, BigDecimal f007AmtCom, BigDecimal f007AmtExpn, BigDecimal f007AmtArr, BigDecimal f007PerArr, char f007FlgAva1A1, String f007AmtPendcapA1, String f007AmtLegalcoA1) {
        this.f007DatRcpt = f007DatRcpt;
        this.f007DatProv = f007DatProv;
        this.f007PerCap = f007PerCap;
        this.f007PerIrt = f007PerIrt;
        this.f007AmtCap = f007AmtCap;
        this.f007AmtItr = f007AmtItr;
        this.f007AmtCom = f007AmtCom;
        this.f007AmtExpn = f007AmtExpn;
        this.f007AmtArr = f007AmtArr;
        this.f007PerArr = f007PerArr;
        this.f007FlgAva1A1 = f007FlgAva1A1;
        this.f007AmtPendcapA1 = f007AmtPendcapA1;
        this.f007AmtLegalcoA1 = f007AmtLegalcoA1;
    }
    
    public F007DtaRieccim(F007DtaRieccim that) {
        this.f007DatRcpt = that.f007DatRcpt;
        this.f007DatProv = that.f007DatProv;
        this.f007PerCap = that.f007PerCap;
        this.f007PerIrt = that.f007PerIrt;
        this.f007AmtCap = that.f007AmtCap;
        this.f007AmtItr = that.f007AmtItr;
        this.f007AmtCom = that.f007AmtCom;
        this.f007AmtExpn = that.f007AmtExpn;
        this.f007AmtArr = that.f007AmtArr;
        this.f007PerArr = that.f007PerArr;
        this.f007FlgAva1A1 = that.f007FlgAva1A1;
        this.f007AmtPendcapA1 = that.f007AmtPendcapA1;
        this.f007AmtLegalcoA1 = that.f007AmtLegalcoA1;
    }
    
    protected F007DtaRieccim(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected F007DtaRieccim(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static F007DtaRieccim fromBytes(byte[] bytes, int offset) {
        return new F007DtaRieccim(bytes, offset);
    }
    
    public static F007DtaRieccim fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static F007DtaRieccim fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getF007DatRcpt() {
        return this.f007DatRcpt;
    }
    
    public void setF007DatRcpt(String f007DatRcpt) {
        this.f007DatRcpt = f007DatRcpt;
    }
    
    public String getF007DatProv() {
        return this.f007DatProv;
    }
    
    public void setF007DatProv(String f007DatProv) {
        this.f007DatProv = f007DatProv;
    }
    
    public String getF007PerCap() {
        return this.f007PerCap;
    }
    
    public void setF007PerCap(String f007PerCap) {
        this.f007PerCap = f007PerCap;
    }
    
    public String getF007PerIrt() {
        return this.f007PerIrt;
    }
    
    public void setF007PerIrt(String f007PerIrt) {
        this.f007PerIrt = f007PerIrt;
    }
    
    public BigDecimal getF007AmtCap() {
        return this.f007AmtCap;
    }
    
    public void setF007AmtCap(BigDecimal f007AmtCap) {
        this.f007AmtCap = f007AmtCap;
    }
    
    public BigDecimal getF007AmtItr() {
        return this.f007AmtItr;
    }
    
    public void setF007AmtItr(BigDecimal f007AmtItr) {
        this.f007AmtItr = f007AmtItr;
    }
    
    public BigDecimal getF007AmtCom() {
        return this.f007AmtCom;
    }
    
    public void setF007AmtCom(BigDecimal f007AmtCom) {
        this.f007AmtCom = f007AmtCom;
    }
    
    public BigDecimal getF007AmtExpn() {
        return this.f007AmtExpn;
    }
    
    public void setF007AmtExpn(BigDecimal f007AmtExpn) {
        this.f007AmtExpn = f007AmtExpn;
    }
    
    public BigDecimal getF007AmtArr() {
        return this.f007AmtArr;
    }
    
    public void setF007AmtArr(BigDecimal f007AmtArr) {
        this.f007AmtArr = f007AmtArr;
    }
    
    public BigDecimal getF007PerArr() {
        return this.f007PerArr;
    }
    
    public void setF007PerArr(BigDecimal f007PerArr) {
        this.f007PerArr = f007PerArr;
    }
    
    public char getF007FlgAva1A1() {
        return this.f007FlgAva1A1;
    }
    
    public void setF007FlgAva1A1(char f007FlgAva1A1) {
        this.f007FlgAva1A1 = f007FlgAva1A1;
    }
    
    public String getF007AmtPendcapA1() {
        return this.f007AmtPendcapA1;
    }
    
    public void setF007AmtPendcapA1(String f007AmtPendcapA1) {
        this.f007AmtPendcapA1 = f007AmtPendcapA1;
    }
    
    public String getF007AmtLegalcoA1() {
        return this.f007AmtLegalcoA1;
    }
    
    public void setF007AmtLegalcoA1(String f007AmtLegalcoA1) {
        this.f007AmtLegalcoA1 = f007AmtLegalcoA1;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ f007DatRcpt=\"");
        s.append(getF007DatRcpt());
        s.append("\" f007DatProv=\"");
        s.append(getF007DatProv());
        s.append("\" f007PerCap=\"");
        s.append(getF007PerCap());
        s.append("\" f007PerIrt=\"");
        s.append(getF007PerIrt());
        s.append("\" f007AmtCap=\"");
        s.append(getF007AmtCap());
        s.append("\" f007AmtItr=\"");
        s.append(getF007AmtItr());
        s.append("\" f007AmtCom=\"");
        s.append(getF007AmtCom());
        s.append("\" f007AmtExpn=\"");
        s.append(getF007AmtExpn());
        s.append("\" f007AmtArr=\"");
        s.append(getF007AmtArr());
        s.append("\" f007PerArr=\"");
        s.append(getF007PerArr());
        s.append("\" f007FlgAva1A1=\"");
        s.append(getF007FlgAva1A1());
        s.append("\" f007AmtPendcapA1=\"");
        s.append(getF007AmtPendcapA1());
        s.append("\" f007AmtLegalcoA1=\"");
        s.append(getF007AmtLegalcoA1());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(F007DtaRieccim that) {
        return this.f007DatRcpt.equals(that.f007DatRcpt) &&
            this.f007DatProv.equals(that.f007DatProv) &&
            this.f007PerCap.equals(that.f007PerCap) &&
            this.f007PerIrt.equals(that.f007PerIrt) &&
            this.f007AmtCap.compareTo(that.f007AmtCap) == 0 &&
            this.f007AmtItr.compareTo(that.f007AmtItr) == 0 &&
            this.f007AmtCom.compareTo(that.f007AmtCom) == 0 &&
            this.f007AmtExpn.compareTo(that.f007AmtExpn) == 0 &&
            this.f007AmtArr.compareTo(that.f007AmtArr) == 0 &&
            this.f007PerArr.compareTo(that.f007PerArr) == 0 &&
            this.f007FlgAva1A1 == that.f007FlgAva1A1 &&
            this.f007AmtPendcapA1.equals(that.f007AmtPendcapA1) &&
            this.f007AmtLegalcoA1.equals(that.f007AmtLegalcoA1);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof F007DtaRieccim) && this.equals((F007DtaRieccim)that);
    }
    
    @Override
    public int hashCode() {
        return f007DatRcpt.hashCode() ^
            Integer.rotateLeft(f007DatProv.hashCode(), 1) ^
            Integer.rotateLeft(f007PerCap.hashCode(), 2) ^
            Integer.rotateLeft(f007PerIrt.hashCode(), 3) ^
            Integer.rotateLeft(f007AmtCap.unscaledValue().hashCode(), 4) ^
            Integer.rotateLeft(f007AmtItr.unscaledValue().hashCode(), 5) ^
            Integer.rotateLeft(f007AmtCom.unscaledValue().hashCode(), 6) ^
            Integer.rotateLeft(f007AmtExpn.unscaledValue().hashCode(), 7) ^
            Integer.rotateLeft(f007AmtArr.unscaledValue().hashCode(), 8) ^
            Integer.rotateLeft(f007PerArr.unscaledValue().hashCode(), 9) ^
            Integer.rotateLeft(Character.hashCode(f007FlgAva1A1), 10) ^
            Integer.rotateLeft(f007AmtPendcapA1.hashCode(), 11) ^
            Integer.rotateLeft(f007AmtLegalcoA1.hashCode(), 12);
    }
    
    @Override
    public int compareTo(F007DtaRieccim that) {
        int c = this.f007DatRcpt.compareTo(that.f007DatRcpt);
        if ( c != 0 ) return c;
        c = this.f007DatProv.compareTo(that.f007DatProv);
        if ( c != 0 ) return c;
        c = this.f007PerCap.compareTo(that.f007PerCap);
        if ( c != 0 ) return c;
        c = this.f007PerIrt.compareTo(that.f007PerIrt);
        if ( c != 0 ) return c;
        c = this.f007AmtCap.compareTo(that.f007AmtCap);
        if ( c != 0 ) return c;
        c = this.f007AmtItr.compareTo(that.f007AmtItr);
        if ( c != 0 ) return c;
        c = this.f007AmtCom.compareTo(that.f007AmtCom);
        if ( c != 0 ) return c;
        c = this.f007AmtExpn.compareTo(that.f007AmtExpn);
        if ( c != 0 ) return c;
        c = this.f007AmtArr.compareTo(that.f007AmtArr);
        if ( c != 0 ) return c;
        c = this.f007PerArr.compareTo(that.f007PerArr);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007FlgAva1A1, that.f007FlgAva1A1);
        if ( c != 0 ) return c;
        c = this.f007AmtPendcapA1.compareTo(that.f007AmtPendcapA1);
        if ( c != 0 ) return c;
        c = this.f007AmtLegalcoA1.compareTo(that.f007AmtLegalcoA1);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        F007DATRCPT.putString(f007DatRcpt, bytes, offset);
        F007DATPROV.putString(f007DatProv, bytes, offset);
        F007PERCAP.putString(f007PerCap, bytes, offset);
        F007PERIRT.putString(f007PerIrt, bytes, offset);
        F007AMTCAP.putBigDecimal(f007AmtCap, bytes, offset);
        F007AMTITR.putBigDecimal(f007AmtItr, bytes, offset);
        F007AMTCOM.putBigDecimal(f007AmtCom, bytes, offset);
        F007AMTEXPN.putBigDecimal(f007AmtExpn, bytes, offset);
        F007AMTARR.putBigDecimal(f007AmtArr, bytes, offset);
        F007PERARR.putBigDecimal(f007PerArr, bytes, offset);
        F007FLGAVA1A1.putString(f007FlgAva1A1, bytes, offset);
        F007AMTPENDCAPA1.putString(f007AmtPendcapA1, bytes, offset);
        F007AMTLEGALCOA1.putString(f007AmtLegalcoA1, bytes, offset);
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
        f007DatRcpt = F007DATRCPT.getString(bytes, offset);
        f007DatProv = F007DATPROV.getString(bytes, offset);
        f007PerCap = F007PERCAP.getString(bytes, offset);
        f007PerIrt = F007PERIRT.getString(bytes, offset);
        f007AmtCap = F007AMTCAP.getBigDecimal(bytes, offset);
        f007AmtItr = F007AMTITR.getBigDecimal(bytes, offset);
        f007AmtCom = F007AMTCOM.getBigDecimal(bytes, offset);
        f007AmtExpn = F007AMTEXPN.getBigDecimal(bytes, offset);
        f007AmtArr = F007AMTARR.getBigDecimal(bytes, offset);
        f007PerArr = F007PERARR.getBigDecimal(bytes, offset);
        f007FlgAva1A1 = F007FLGAVA1A1.getString(bytes, offset);
        f007AmtPendcapA1 = F007AMTPENDCAPA1.getString(bytes, offset);
        f007AmtLegalcoA1 = F007AMTLEGALCOA1.getString(bytes, offset);
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
