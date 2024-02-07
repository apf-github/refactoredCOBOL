package com.acc.feb05;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Rvfc007 implements Comparable<Rvfc007> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ByteArrayField F007CRRRISK = factory.getByteArrayField(F007Crrrisk.SIZE);
    private static final ByteArrayField F007DTARIECCIM = factory.getByteArrayField(F007DtaRieccim.SIZE);
    private static final ByteArrayField F007DTARVECASN = factory.getByteArrayField(F007DtaRvecasn.SIZE);
    private static final StringField F007DECLINRSN = factory.getStringField(225);
    private static final StringField F007DECLINBRN = factory.getStringField(6);
    private static final StringField F007CUN = factory.getStringField(8);
    private static final StringField F007CODCRG = factory.getStringField(3);
    private static final StringField F007MGTSECTOR = factory.getStringField(2);
    private static final StringField F007CODOOT = factory.getStringField(2);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private F007Crrrisk f007Crrrisk = new F007Crrrisk();
    private F007DtaRieccim f007DtaRieccim = new F007DtaRieccim();
    private F007DtaRvecasn f007DtaRvecasn = new F007DtaRvecasn();
    private String f007DeclinRsn = "";
    private String f007DeclinBrn = "";
    private String f007Cun = "";
    private String f007CodCrg = "";
    private String f007MgtSector = "";
    private String f007CodOot = "";
    
    public Rvfc007() {
    }
    
    public Rvfc007(F007Crrrisk f007Crrrisk, F007DtaRieccim f007DtaRieccim, F007DtaRvecasn f007DtaRvecasn, String f007DeclinRsn, String f007DeclinBrn, String f007Cun, String f007CodCrg, String f007MgtSector, String f007CodOot) {
        this.f007Crrrisk = f007Crrrisk;
        this.f007DtaRieccim = f007DtaRieccim;
        this.f007DtaRvecasn = f007DtaRvecasn;
        this.f007DeclinRsn = f007DeclinRsn;
        this.f007DeclinBrn = f007DeclinBrn;
        this.f007Cun = f007Cun;
        this.f007CodCrg = f007CodCrg;
        this.f007MgtSector = f007MgtSector;
        this.f007CodOot = f007CodOot;
    }
    
    public Rvfc007(Rvfc007 that) {
        this.f007Crrrisk = new F007Crrrisk(that.f007Crrrisk);
        this.f007DtaRieccim = new F007DtaRieccim(that.f007DtaRieccim);
        this.f007DtaRvecasn = new F007DtaRvecasn(that.f007DtaRvecasn);
        this.f007DeclinRsn = that.f007DeclinRsn;
        this.f007DeclinBrn = that.f007DeclinBrn;
        this.f007Cun = that.f007Cun;
        this.f007CodCrg = that.f007CodCrg;
        this.f007MgtSector = that.f007MgtSector;
        this.f007CodOot = that.f007CodOot;
    }
    
    protected Rvfc007(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected Rvfc007(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static Rvfc007 fromBytes(byte[] bytes, int offset) {
        return new Rvfc007(bytes, offset);
    }
    
    public static Rvfc007 fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static Rvfc007 fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public F007Crrrisk getF007Crrrisk() {
        return this.f007Crrrisk;
    }
    
    public void setF007Crrrisk(F007Crrrisk f007Crrrisk) {
        this.f007Crrrisk = f007Crrrisk;
    }
    
    public F007DtaRieccim getF007DtaRieccim() {
        return this.f007DtaRieccim;
    }
    
    public void setF007DtaRieccim(F007DtaRieccim f007DtaRieccim) {
        this.f007DtaRieccim = f007DtaRieccim;
    }
    
    public F007DtaRvecasn getF007DtaRvecasn() {
        return this.f007DtaRvecasn;
    }
    
    public void setF007DtaRvecasn(F007DtaRvecasn f007DtaRvecasn) {
        this.f007DtaRvecasn = f007DtaRvecasn;
    }
    
    public String getF007DeclinRsn() {
        return this.f007DeclinRsn;
    }
    
    public void setF007DeclinRsn(String f007DeclinRsn) {
        this.f007DeclinRsn = f007DeclinRsn;
    }
    
    public String getF007DeclinBrn() {
        return this.f007DeclinBrn;
    }
    
    public void setF007DeclinBrn(String f007DeclinBrn) {
        this.f007DeclinBrn = f007DeclinBrn;
    }
    
    public String getF007Cun() {
        return this.f007Cun;
    }
    
    public void setF007Cun(String f007Cun) {
        this.f007Cun = f007Cun;
    }
    
    public String getF007CodCrg() {
        return this.f007CodCrg;
    }
    
    public void setF007CodCrg(String f007CodCrg) {
        this.f007CodCrg = f007CodCrg;
    }
    
    public String getF007MgtSector() {
        return this.f007MgtSector;
    }
    
    public void setF007MgtSector(String f007MgtSector) {
        this.f007MgtSector = f007MgtSector;
    }
    
    public String getF007CodOot() {
        return this.f007CodOot;
    }
    
    public void setF007CodOot(String f007CodOot) {
        this.f007CodOot = f007CodOot;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ f007Crrrisk=\"");
        s.append(getF007Crrrisk());
        s.append("\" f007DtaRieccim=\"");
        s.append(getF007DtaRieccim());
        s.append("\" f007DtaRvecasn=\"");
        s.append(getF007DtaRvecasn());
        s.append("\" f007DeclinRsn=\"");
        s.append(getF007DeclinRsn());
        s.append("\" f007DeclinBrn=\"");
        s.append(getF007DeclinBrn());
        s.append("\" f007Cun=\"");
        s.append(getF007Cun());
        s.append("\" f007CodCrg=\"");
        s.append(getF007CodCrg());
        s.append("\" f007MgtSector=\"");
        s.append(getF007MgtSector());
        s.append("\" f007CodOot=\"");
        s.append(getF007CodOot());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(Rvfc007 that) {
        return this.f007Crrrisk.equals(that.f007Crrrisk) &&
            this.f007DtaRieccim.equals(that.f007DtaRieccim) &&
            this.f007DtaRvecasn.equals(that.f007DtaRvecasn) &&
            this.f007DeclinRsn.equals(that.f007DeclinRsn) &&
            this.f007DeclinBrn.equals(that.f007DeclinBrn) &&
            this.f007Cun.equals(that.f007Cun) &&
            this.f007CodCrg.equals(that.f007CodCrg) &&
            this.f007MgtSector.equals(that.f007MgtSector) &&
            this.f007CodOot.equals(that.f007CodOot);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof Rvfc007) && this.equals((Rvfc007)that);
    }
    
    @Override
    public int hashCode() {
        return f007Crrrisk.hashCode() ^
            Integer.rotateLeft(f007DtaRieccim.hashCode(), 1) ^
            Integer.rotateLeft(f007DtaRvecasn.hashCode(), 2) ^
            Integer.rotateLeft(f007DeclinRsn.hashCode(), 3) ^
            Integer.rotateLeft(f007DeclinBrn.hashCode(), 4) ^
            Integer.rotateLeft(f007Cun.hashCode(), 5) ^
            Integer.rotateLeft(f007CodCrg.hashCode(), 6) ^
            Integer.rotateLeft(f007MgtSector.hashCode(), 7) ^
            Integer.rotateLeft(f007CodOot.hashCode(), 8);
    }
    
    @Override
    public int compareTo(Rvfc007 that) {
        int c = this.f007Crrrisk.compareTo(that.f007Crrrisk);
        if ( c != 0 ) return c;
        c = this.f007DtaRieccim.compareTo(that.f007DtaRieccim);
        if ( c != 0 ) return c;
        c = this.f007DtaRvecasn.compareTo(that.f007DtaRvecasn);
        if ( c != 0 ) return c;
        c = this.f007DeclinRsn.compareTo(that.f007DeclinRsn);
        if ( c != 0 ) return c;
        c = this.f007DeclinBrn.compareTo(that.f007DeclinBrn);
        if ( c != 0 ) return c;
        c = this.f007Cun.compareTo(that.f007Cun);
        if ( c != 0 ) return c;
        c = this.f007CodCrg.compareTo(that.f007CodCrg);
        if ( c != 0 ) return c;
        c = this.f007MgtSector.compareTo(that.f007MgtSector);
        if ( c != 0 ) return c;
        c = this.f007CodOot.compareTo(that.f007CodOot);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        f007Crrrisk.getBytes(bytes, F007CRRRISK.getOffset() + offset);
        f007DtaRieccim.getBytes(bytes, F007DTARIECCIM.getOffset() + offset);
        f007DtaRvecasn.getBytes(bytes, F007DTARVECASN.getOffset() + offset);
        F007DECLINRSN.putString(f007DeclinRsn, bytes, offset);
        F007DECLINBRN.putString(f007DeclinBrn, bytes, offset);
        F007CUN.putString(f007Cun, bytes, offset);
        F007CODCRG.putString(f007CodCrg, bytes, offset);
        F007MGTSECTOR.putString(f007MgtSector, bytes, offset);
        F007CODOOT.putString(f007CodOot, bytes, offset);
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
        f007Crrrisk.setBytes(bytes, F007CRRRISK.getOffset() + offset);
        f007DtaRieccim.setBytes(bytes, F007DTARIECCIM.getOffset() + offset);
        f007DtaRvecasn.setBytes(bytes, F007DTARVECASN.getOffset() + offset);
        f007DeclinRsn = F007DECLINRSN.getString(bytes, offset);
        f007DeclinBrn = F007DECLINBRN.getString(bytes, offset);
        f007Cun = F007CUN.getString(bytes, offset);
        f007CodCrg = F007CODCRG.getString(bytes, offset);
        f007MgtSector = F007MGTSECTOR.getString(bytes, offset);
        f007CodOot = F007CODOOT.getString(bytes, offset);
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
