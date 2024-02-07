package com.acc.feb05;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class RV3C0100 implements Comparable<RV3C0100> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    public RV3C0100() {
    }
    
    public RV3C0100(RV3C0100 that) {
    }
    
    protected RV3C0100(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected RV3C0100(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static RV3C0100 fromBytes(byte[] bytes, int offset) {
        return new RV3C0100(bytes, offset);
    }
    
    public static RV3C0100 fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static RV3C0100 fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String[] args){
    String reOutput = "";
    Rvfc007 rvfc007 = new Rvfc007();
    VaAlcons vaAlcons = new VaAlcons();

    if (rvfc007.getF007Crrrisk().getF007CodProd().equals(vaAlcons.getCaDeposit1()) ||
        rvfc007.getF007Crrrisk().getF007CodProd().equals(vaAlcons.getCaDeposit2()) ||
        rvfc007.getF007Crrrisk().getF007CodProd().equals(vaAlcons.getCaDeposit3())) {
        rvfc007.getF007Crrrisk().setF007AmtAva1(rvfc007.getF007Crrrisk().getF007AmtFml());
    }
    else if (rvfc007.getF007Crrrisk().getF007CodProd().equals(vaAlcons.getCaLoan())) {
        rvfc007.getF007Crrrisk().setF007AmtAva1(rvfc007.getF007Crrrisk().getF007Debtbal().subtract(rvfc007.getF007DtaRieccim().getF007AmtCap()).subtract(rvfc007.getF007DtaRieccim().getF007AmtItr()).subtract(rvfc007.getF007DtaRieccim().getF007AmtCom()));
        if (rvfc007.getF007Crrrisk().getF007AmtAva1().compareTo(BigDecimal.ZERO) < 0) {
            rvfc007.getF007Crrrisk().setF007AmtAva1(BigDecimal.ZERO);
        }
    }
    else {
        rvfc007.getF007Crrrisk().setF007AmtAva1(BigDecimal.ZERO);
    }


    if (!rvfc007.getF007Crrrisk().getF007TypRiskst().equals('0')) {
        rvfc007.getF007Crrrisk().setF007AmtAva1(BigDecimal.ZERO);
    }


    if (rvfc007.getF007Crrrisk().getF007CodProd().equals(vaAlcons.getCaLoan())) {
        if (rvfc007.getF007Crrrisk().getF007AmtAva1().compareTo(rvfc007.getF007Crrrisk().getF007AmtFml()) < 0) {
            rvfc007.getF007Crrrisk().setF007PerRtn(((rvfc007.getF007Crrrisk().getF007AmtFml().subtract(rvfc007.getF007Crrrisk().getF007AmtAva1())).subtract(rvfc007.getF007Crrrisk().getF007Debtbal().subtract(rvfc007.getF007DtaRieccim().getF007AmtItr()).subtract(rvfc007.getF007DtaRieccim().getF007AmtCom()))).divide(rvfc007.getF007Crrrisk().getF007AmtFml().subtract(rvfc007.getF007Crrrisk().getF007AmtAva1()), 2, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100)).setScale(0, RoundingMode.HALF_UP).remainder(BigDecimal.TEN.pow(3));
        }
        else {
            rvfc007.getF007Crrrisk().setF007PerRtn(BigDecimal.ZERO);
        }

        if (rvfc007.getF007Crrrisk().getF007PerRtn().compareTo(BigDecimal.ZERO) < 0) {
            rvfc007.getF007Crrrisk().setF007PerRtn(BigDecimal.ZERO);
        }
    }
    else {
        rvfc007.getF007Crrrisk().setF007PerRtn(BigDecimal.ZERO);
    }


    reOutput = String.valueOf('"').repeat(750);
}


    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(RV3C0100 that) {
        return true;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof RV3C0100) && this.equals((RV3C0100)that);
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public int compareTo(RV3C0100 that) {
        int c = 0;
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
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
