package com.acc.feb05;

import com.ibm.jzos.fields.*;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Arrays;

public class F007Crrrisk implements Comparable<F007Crrrisk> {
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField F007DATAVA3 = factory.getStringField(10);
    private static final StringField F007ENT = factory.getStringField(4);
    private static final StringField F007CODPROD = factory.getStringField(2);
    private static final StringField F007ENTCAC = factory.getStringField(4);
    private static final StringField F007CENCAC = factory.getStringField(4);
    private static final StringField F007NUMRISK = factory.getStringField(10);
    private static final PackedDecimalAsIntField F007RISKSEQ = factory.getPackedDecimalAsIntField(3, true);
    private static final StringField F007ENTOWN = factory.getStringField(4);
    private static final StringField F007CENOWN = factory.getStringField(4);
    private static final StringField F007TYPRISK = factory.getStringField(2);
    private static final StringField F007DATFML = factory.getStringField(10);
    private static final StringField F007DATMAT = factory.getStringField(10);
    private static final PackedDecimalAsBigDecimalField F007AMTFML = factory.getPackedDecimalAsBigDecimalField(17, 2, true);
    private static final PackedDecimalAsBigDecimalField F007AMTAVA = factory.getPackedDecimalAsBigDecimalField(17, 2, true);
    private static final PackedDecimalAsBigDecimalField F007DEBTBAL = factory.getPackedDecimalAsBigDecimalField(17, 2, true);
    private static final PackedDecimalAsBigDecimalField F007EXPRBAL = factory.getPackedDecimalAsBigDecimalField(17, 2, true);
    private static final StringField F007CODSLPAY = factory.getStringField(4);
    private static final StringField F007FLGSLPAYRISK = factory.getStringField(1);
    private static final StringField F007DATNPAY = factory.getStringField(10);
    private static final PackedDecimalAsIntField F007NUMNPAY = factory.getPackedDecimalAsIntField(3, true);
    private static final PackedDecimalAsBigDecimalField F007AMTNPAY = factory.getPackedDecimalAsBigDecimalField(17, 2, true);
    private static final PackedDecimalAsBigDecimalField F007AMTPROV = factory.getPackedDecimalAsBigDecimalField(17, 2, true);
    private static final StringField F007FLGINTST = factory.getStringField(3);
    private static final StringField F007KEYCBRISK = factory.getStringField(1);
    private static final StringField F007FCC = factory.getStringField(3);
    private static final StringField F007KEYCBTERM = factory.getStringField(1);
    private static final StringField F007KEYCBCOLT = factory.getStringField(1);
    private static final StringField F007KEYCBST = factory.getStringField(1);
    private static final StringField F007NCBA = factory.getStringField(5);
    private static final PackedDecimalAsIntField F007CODSRGN = factory.getPackedDecimalAsIntField(3, true);
    private static final PackedDecimalAsIntField F007CODCBSEC = factory.getPackedDecimalAsIntField(8, true);
    private static final PackedDecimalAsBigDecimalField F007AMTNOEXPR = factory.getPackedDecimalAsBigDecimalField(17, 2, true);
    private static final PackedDecimalAsBigDecimalField F007AMTLASTEXPRNPAY = factory.getPackedDecimalAsBigDecimalField(17, 2, true);
    private static final PackedDecimalAsBigDecimalField F007AMTPRVEXPRNPAY = factory.getPackedDecimalAsBigDecimalField(17, 2, true);
    private static final PackedDecimalAsBigDecimalField F007IRT = factory.getPackedDecimalAsBigDecimalField(9, 6, true);
    private static final StringField F007FLGGUAPLCY = factory.getStringField(1);
    private static final StringField F007FLGRFNC = factory.getStringField(1);
    private static final StringField F007CODCOMMPROD = factory.getStringField(6);
    private static final PackedDecimalAsIntField F007PERRTN = factory.getPackedDecimalAsIntField(3, true);
    private static final StringField F007FLGINTF = factory.getStringField(1);
    private static final StringField F007FLGMOD = factory.getStringField(1);
    private static final StringField F007ENTLINKACC = factory.getStringField(4);
    private static final StringField F007BRNLINKACC = factory.getStringField(4);
    private static final StringField F007ACCLINK = factory.getStringField(10);
    private static final StringField F007TYPMATFLG = factory.getStringField(1);
    private static final StringField F007CODCOLT = factory.getStringField(3);
    private static final StringField F007FLGLEGJNTRESP = factory.getStringField(1);
    private static final StringField F007ENTLASTMOD = factory.getStringField(4);
    private static final StringField F007BRNLASTMOD = factory.getStringField(4);
    private static final StringField F007CODLASTMODUSER = factory.getStringField(8);
    private static final StringField F007CODLASTMODTRM = factory.getStringField(8);
    private static final StringField F007STP = factory.getStringField(26);
    private static final StringField F007TYPRISKST = factory.getStringField(1);
    private static final StringField F007ENTLINK = factory.getStringField(4);
    private static final StringField F007BRNLINK = factory.getStringField(4);
    private static final StringField F007ACCLINKA1 = factory.getStringField(10);
    private static final StringField F007ENTNEGT = factory.getStringField(4);
    private static final StringField F007BRNNEGT = factory.getStringField(4);
    private static final StringField F007DATST = factory.getStringField(10);
    private static final PackedDecimalAsIntField F007MAXQNTY = factory.getPackedDecimalAsIntField(5, true);
    private static final StringField F007AVA1 = factory.getStringField(10);
    private static final StringField F007AVA2 = factory.getStringField(10);
    private static final StringField F007AVA3 = factory.getStringField(10);
    private static final StringField F007FLGAVA1 = factory.getStringField(1);
    private static final StringField F007FLGAVA2 = factory.getStringField(1);
    private static final StringField F007FLGAVA3 = factory.getStringField(1);
    private static final PackedDecimalAsBigDecimalField F007AMTAVA1 = factory.getPackedDecimalAsBigDecimalField(15, 2, true);
    private static final PackedDecimalAsBigDecimalField F007AMTAVA2 = factory.getPackedDecimalAsBigDecimalField(15, 2, true);
    private static final PackedDecimalAsBigDecimalField F007AMTAVA3 = factory.getPackedDecimalAsBigDecimalField(15, 2, true);
    private static final StringField F007DATAVA1 = factory.getStringField(10);
    private static final StringField F007DATAVA2 = factory.getStringField(10);
    protected static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    private String f007DatAva3 = "";
    private String f007Ent = "";
    private String f007CodProd = "";
    private String f007EntCac = "";
    private String f007CenCac = "";
    private String f007NumRisk = "";
    private int f007Riskseq;
    private String f007EntOwn = "";
    private String f007CenOwn = "";
    private String f007TypRisk = "";
    private String f007DatFml = "";
    private String f007DatMat = "";
    private BigDecimal f007AmtFml = BigDecimal.ZERO;
    private BigDecimal f007AmtAva = BigDecimal.ZERO;
    private BigDecimal f007Debtbal = BigDecimal.ZERO;
    private BigDecimal f007Exprbal = BigDecimal.ZERO;
    private String f007CodSlpay = "";
    private char f007FlgSlpayrisk;
    private String f007DatNpay = "";
    private int f007NumNpay;
    private BigDecimal f007AmtNpay = BigDecimal.ZERO;
    private BigDecimal f007AmtProv = BigDecimal.ZERO;
    private String f007FlgIntst = "";
    private char f007KeyCbrisk;
    private String f007Fcc = "";
    private char f007KeyCbterm;
    private char f007KeyCbcolt;
    private char f007KeyCbst;
    private String f007Ncba = "";
    private int f007CodSrgn;
    private int f007CodCbsec;
    private BigDecimal f007AmtNoexpr = BigDecimal.ZERO;
    private BigDecimal f007AmtLastexprnpay = BigDecimal.ZERO;
    private BigDecimal f007AmtPrvexprnpay = BigDecimal.ZERO;
    private BigDecimal f007Irt = BigDecimal.ZERO;
    private char f007FlgGuaplcy;
    private char f007FlgRfnc;
    private String f007CodCommprod = "";
    private int f007PerRtn;
    private char f007FlgIntf;
    private char f007FlgMod;
    private String f007EntLinkacc = "";
    private String f007BrnLinkacc = "";
    private String f007AccLink = "";
    private char f007TypMatflg;
    private String f007CodColt = "";
    private char f007FlgLegjntresp;
    private String f007EntLastmod = "";
    private String f007BrnLastmod = "";
    private String f007CodLastmoduser = "";
    private String f007CodLastmodtrm = "";
    private String f007Stp = "";
    private char f007TypRiskst;
    private String f007EntLink = "";
    private String f007BrnLink = "";
    private String f007AccLinkA1 = "";
    private String f007EntNegt = "";
    private String f007BrnNegt = "";
    private String f007DatSt = "";
    private int f007Maxqnty;
    private String f007Ava1 = "";
    private String f007Ava2 = "";
    private String f007Ava3 = "";
    private char f007FlgAva1;
    private char f007FlgAva2;
    private char f007FlgAva3;
    private BigDecimal f007AmtAva1 = BigDecimal.ZERO;
    private BigDecimal f007AmtAva2 = BigDecimal.ZERO;
    private BigDecimal f007AmtAva3 = BigDecimal.ZERO;
    private String f007DatAva1 = "";
    private String f007DatAva2 = "";
    
    public F007Crrrisk() {
    }
    
    public F007Crrrisk(String f007DatAva3, String f007Ent, String f007CodProd, String f007EntCac, String f007CenCac, String f007NumRisk, int f007Riskseq, String f007EntOwn, String f007CenOwn, String f007TypRisk, String f007DatFml, String f007DatMat, BigDecimal f007AmtFml, BigDecimal f007AmtAva, BigDecimal f007Debtbal, BigDecimal f007Exprbal, String f007CodSlpay, char f007FlgSlpayrisk, String f007DatNpay, int f007NumNpay, BigDecimal f007AmtNpay, BigDecimal f007AmtProv, String f007FlgIntst, char f007KeyCbrisk, String f007Fcc, char f007KeyCbterm, char f007KeyCbcolt, char f007KeyCbst, String f007Ncba, int f007CodSrgn, int f007CodCbsec, BigDecimal f007AmtNoexpr, BigDecimal f007AmtLastexprnpay, BigDecimal f007AmtPrvexprnpay, BigDecimal f007Irt, char f007FlgGuaplcy, char f007FlgRfnc, String f007CodCommprod, int f007PerRtn, char f007FlgIntf, char f007FlgMod, String f007EntLinkacc, String f007BrnLinkacc, String f007AccLink, char f007TypMatflg, String f007CodColt, char f007FlgLegjntresp, String f007EntLastmod, String f007BrnLastmod, String f007CodLastmoduser, String f007CodLastmodtrm, String f007Stp, char f007TypRiskst, String f007EntLink, String f007BrnLink, String f007AccLinkA1, String f007EntNegt, String f007BrnNegt, String f007DatSt, int f007Maxqnty, String f007Ava1, String f007Ava2, String f007Ava3, char f007FlgAva1, char f007FlgAva2, char f007FlgAva3, BigDecimal f007AmtAva1, BigDecimal f007AmtAva2, BigDecimal f007AmtAva3, String f007DatAva1, String f007DatAva2) {
        this.f007DatAva3 = f007DatAva3;
        this.f007Ent = f007Ent;
        this.f007CodProd = f007CodProd;
        this.f007EntCac = f007EntCac;
        this.f007CenCac = f007CenCac;
        this.f007NumRisk = f007NumRisk;
        this.f007Riskseq = f007Riskseq;
        this.f007EntOwn = f007EntOwn;
        this.f007CenOwn = f007CenOwn;
        this.f007TypRisk = f007TypRisk;
        this.f007DatFml = f007DatFml;
        this.f007DatMat = f007DatMat;
        this.f007AmtFml = f007AmtFml;
        this.f007AmtAva = f007AmtAva;
        this.f007Debtbal = f007Debtbal;
        this.f007Exprbal = f007Exprbal;
        this.f007CodSlpay = f007CodSlpay;
        this.f007FlgSlpayrisk = f007FlgSlpayrisk;
        this.f007DatNpay = f007DatNpay;
        this.f007NumNpay = f007NumNpay;
        this.f007AmtNpay = f007AmtNpay;
        this.f007AmtProv = f007AmtProv;
        this.f007FlgIntst = f007FlgIntst;
        this.f007KeyCbrisk = f007KeyCbrisk;
        this.f007Fcc = f007Fcc;
        this.f007KeyCbterm = f007KeyCbterm;
        this.f007KeyCbcolt = f007KeyCbcolt;
        this.f007KeyCbst = f007KeyCbst;
        this.f007Ncba = f007Ncba;
        this.f007CodSrgn = f007CodSrgn;
        this.f007CodCbsec = f007CodCbsec;
        this.f007AmtNoexpr = f007AmtNoexpr;
        this.f007AmtLastexprnpay = f007AmtLastexprnpay;
        this.f007AmtPrvexprnpay = f007AmtPrvexprnpay;
        this.f007Irt = f007Irt;
        this.f007FlgGuaplcy = f007FlgGuaplcy;
        this.f007FlgRfnc = f007FlgRfnc;
        this.f007CodCommprod = f007CodCommprod;
        this.f007PerRtn = f007PerRtn;
        this.f007FlgIntf = f007FlgIntf;
        this.f007FlgMod = f007FlgMod;
        this.f007EntLinkacc = f007EntLinkacc;
        this.f007BrnLinkacc = f007BrnLinkacc;
        this.f007AccLink = f007AccLink;
        this.f007TypMatflg = f007TypMatflg;
        this.f007CodColt = f007CodColt;
        this.f007FlgLegjntresp = f007FlgLegjntresp;
        this.f007EntLastmod = f007EntLastmod;
        this.f007BrnLastmod = f007BrnLastmod;
        this.f007CodLastmoduser = f007CodLastmoduser;
        this.f007CodLastmodtrm = f007CodLastmodtrm;
        this.f007Stp = f007Stp;
        this.f007TypRiskst = f007TypRiskst;
        this.f007EntLink = f007EntLink;
        this.f007BrnLink = f007BrnLink;
        this.f007AccLinkA1 = f007AccLinkA1;
        this.f007EntNegt = f007EntNegt;
        this.f007BrnNegt = f007BrnNegt;
        this.f007DatSt = f007DatSt;
        this.f007Maxqnty = f007Maxqnty;
        this.f007Ava1 = f007Ava1;
        this.f007Ava2 = f007Ava2;
        this.f007Ava3 = f007Ava3;
        this.f007FlgAva1 = f007FlgAva1;
        this.f007FlgAva2 = f007FlgAva2;
        this.f007FlgAva3 = f007FlgAva3;
        this.f007AmtAva1 = f007AmtAva1;
        this.f007AmtAva2 = f007AmtAva2;
        this.f007AmtAva3 = f007AmtAva3;
        this.f007DatAva1 = f007DatAva1;
        this.f007DatAva2 = f007DatAva2;
    }
    
    public F007Crrrisk(F007Crrrisk that) {
        this.f007DatAva3 = that.f007DatAva3;
        this.f007Ent = that.f007Ent;
        this.f007CodProd = that.f007CodProd;
        this.f007EntCac = that.f007EntCac;
        this.f007CenCac = that.f007CenCac;
        this.f007NumRisk = that.f007NumRisk;
        this.f007Riskseq = that.f007Riskseq;
        this.f007EntOwn = that.f007EntOwn;
        this.f007CenOwn = that.f007CenOwn;
        this.f007TypRisk = that.f007TypRisk;
        this.f007DatFml = that.f007DatFml;
        this.f007DatMat = that.f007DatMat;
        this.f007AmtFml = that.f007AmtFml;
        this.f007AmtAva = that.f007AmtAva;
        this.f007Debtbal = that.f007Debtbal;
        this.f007Exprbal = that.f007Exprbal;
        this.f007CodSlpay = that.f007CodSlpay;
        this.f007FlgSlpayrisk = that.f007FlgSlpayrisk;
        this.f007DatNpay = that.f007DatNpay;
        this.f007NumNpay = that.f007NumNpay;
        this.f007AmtNpay = that.f007AmtNpay;
        this.f007AmtProv = that.f007AmtProv;
        this.f007FlgIntst = that.f007FlgIntst;
        this.f007KeyCbrisk = that.f007KeyCbrisk;
        this.f007Fcc = that.f007Fcc;
        this.f007KeyCbterm = that.f007KeyCbterm;
        this.f007KeyCbcolt = that.f007KeyCbcolt;
        this.f007KeyCbst = that.f007KeyCbst;
        this.f007Ncba = that.f007Ncba;
        this.f007CodSrgn = that.f007CodSrgn;
        this.f007CodCbsec = that.f007CodCbsec;
        this.f007AmtNoexpr = that.f007AmtNoexpr;
        this.f007AmtLastexprnpay = that.f007AmtLastexprnpay;
        this.f007AmtPrvexprnpay = that.f007AmtPrvexprnpay;
        this.f007Irt = that.f007Irt;
        this.f007FlgGuaplcy = that.f007FlgGuaplcy;
        this.f007FlgRfnc = that.f007FlgRfnc;
        this.f007CodCommprod = that.f007CodCommprod;
        this.f007PerRtn = that.f007PerRtn;
        this.f007FlgIntf = that.f007FlgIntf;
        this.f007FlgMod = that.f007FlgMod;
        this.f007EntLinkacc = that.f007EntLinkacc;
        this.f007BrnLinkacc = that.f007BrnLinkacc;
        this.f007AccLink = that.f007AccLink;
        this.f007TypMatflg = that.f007TypMatflg;
        this.f007CodColt = that.f007CodColt;
        this.f007FlgLegjntresp = that.f007FlgLegjntresp;
        this.f007EntLastmod = that.f007EntLastmod;
        this.f007BrnLastmod = that.f007BrnLastmod;
        this.f007CodLastmoduser = that.f007CodLastmoduser;
        this.f007CodLastmodtrm = that.f007CodLastmodtrm;
        this.f007Stp = that.f007Stp;
        this.f007TypRiskst = that.f007TypRiskst;
        this.f007EntLink = that.f007EntLink;
        this.f007BrnLink = that.f007BrnLink;
        this.f007AccLinkA1 = that.f007AccLinkA1;
        this.f007EntNegt = that.f007EntNegt;
        this.f007BrnNegt = that.f007BrnNegt;
        this.f007DatSt = that.f007DatSt;
        this.f007Maxqnty = that.f007Maxqnty;
        this.f007Ava1 = that.f007Ava1;
        this.f007Ava2 = that.f007Ava2;
        this.f007Ava3 = that.f007Ava3;
        this.f007FlgAva1 = that.f007FlgAva1;
        this.f007FlgAva2 = that.f007FlgAva2;
        this.f007FlgAva3 = that.f007FlgAva3;
        this.f007AmtAva1 = that.f007AmtAva1;
        this.f007AmtAva2 = that.f007AmtAva2;
        this.f007AmtAva3 = that.f007AmtAva3;
        this.f007DatAva1 = that.f007DatAva1;
        this.f007DatAva2 = that.f007DatAva2;
    }
    
    protected F007Crrrisk(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected F007Crrrisk(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static F007Crrrisk fromBytes(byte[] bytes, int offset) {
        return new F007Crrrisk(bytes, offset);
    }
    
    public static F007Crrrisk fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static F007Crrrisk fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getF007DatAva3() {
        return this.f007DatAva3;
    }
    
    public void setF007DatAva3(String f007DatAva3) {
        this.f007DatAva3 = f007DatAva3;
    }
    
    public String getF007Ent() {
        return this.f007Ent;
    }
    
    public void setF007Ent(String f007Ent) {
        this.f007Ent = f007Ent;
    }
    
    public String getF007CodProd() {
        return this.f007CodProd;
    }
    
    public void setF007CodProd(String f007CodProd) {
        this.f007CodProd = f007CodProd;
    }
    
    public String getF007EntCac() {
        return this.f007EntCac;
    }
    
    public void setF007EntCac(String f007EntCac) {
        this.f007EntCac = f007EntCac;
    }
    
    public String getF007CenCac() {
        return this.f007CenCac;
    }
    
    public void setF007CenCac(String f007CenCac) {
        this.f007CenCac = f007CenCac;
    }
    
    public String getF007NumRisk() {
        return this.f007NumRisk;
    }
    
    public void setF007NumRisk(String f007NumRisk) {
        this.f007NumRisk = f007NumRisk;
    }
    
    public int getF007Riskseq() {
        return this.f007Riskseq;
    }
    
    public void setF007Riskseq(int f007Riskseq) {
        this.f007Riskseq = f007Riskseq;
    }
    
    public String getF007EntOwn() {
        return this.f007EntOwn;
    }
    
    public void setF007EntOwn(String f007EntOwn) {
        this.f007EntOwn = f007EntOwn;
    }
    
    public String getF007CenOwn() {
        return this.f007CenOwn;
    }
    
    public void setF007CenOwn(String f007CenOwn) {
        this.f007CenOwn = f007CenOwn;
    }
    
    public String getF007TypRisk() {
        return this.f007TypRisk;
    }
    
    public void setF007TypRisk(String f007TypRisk) {
        this.f007TypRisk = f007TypRisk;
    }
    
    public String getF007DatFml() {
        return this.f007DatFml;
    }
    
    public void setF007DatFml(String f007DatFml) {
        this.f007DatFml = f007DatFml;
    }
    
    public String getF007DatMat() {
        return this.f007DatMat;
    }
    
    public void setF007DatMat(String f007DatMat) {
        this.f007DatMat = f007DatMat;
    }
    
    public BigDecimal getF007AmtFml() {
        return this.f007AmtFml;
    }
    
    public void setF007AmtFml(BigDecimal f007AmtFml) {
        this.f007AmtFml = f007AmtFml;
    }
    
    public BigDecimal getF007AmtAva() {
        return this.f007AmtAva;
    }
    
    public void setF007AmtAva(BigDecimal f007AmtAva) {
        this.f007AmtAva = f007AmtAva;
    }
    
    public BigDecimal getF007Debtbal() {
        return this.f007Debtbal;
    }
    
    public void setF007Debtbal(BigDecimal f007Debtbal) {
        this.f007Debtbal = f007Debtbal;
    }
    
    public BigDecimal getF007Exprbal() {
        return this.f007Exprbal;
    }
    
    public void setF007Exprbal(BigDecimal f007Exprbal) {
        this.f007Exprbal = f007Exprbal;
    }
    
    public String getF007CodSlpay() {
        return this.f007CodSlpay;
    }
    
    public void setF007CodSlpay(String f007CodSlpay) {
        this.f007CodSlpay = f007CodSlpay;
    }
    
    public char getF007FlgSlpayrisk() {
        return this.f007FlgSlpayrisk;
    }
    
    public void setF007FlgSlpayrisk(char f007FlgSlpayrisk) {
        this.f007FlgSlpayrisk = f007FlgSlpayrisk;
    }
    
    public String getF007DatNpay() {
        return this.f007DatNpay;
    }
    
    public void setF007DatNpay(String f007DatNpay) {
        this.f007DatNpay = f007DatNpay;
    }
    
    public int getF007NumNpay() {
        return this.f007NumNpay;
    }
    
    public void setF007NumNpay(int f007NumNpay) {
        this.f007NumNpay = f007NumNpay;
    }
    
    public BigDecimal getF007AmtNpay() {
        return this.f007AmtNpay;
    }
    
    public void setF007AmtNpay(BigDecimal f007AmtNpay) {
        this.f007AmtNpay = f007AmtNpay;
    }
    
    public BigDecimal getF007AmtProv() {
        return this.f007AmtProv;
    }
    
    public void setF007AmtProv(BigDecimal f007AmtProv) {
        this.f007AmtProv = f007AmtProv;
    }
    
    public String getF007FlgIntst() {
        return this.f007FlgIntst;
    }
    
    public void setF007FlgIntst(String f007FlgIntst) {
        this.f007FlgIntst = f007FlgIntst;
    }
    
    public char getF007KeyCbrisk() {
        return this.f007KeyCbrisk;
    }
    
    public void setF007KeyCbrisk(char f007KeyCbrisk) {
        this.f007KeyCbrisk = f007KeyCbrisk;
    }
    
    public String getF007Fcc() {
        return this.f007Fcc;
    }
    
    public void setF007Fcc(String f007Fcc) {
        this.f007Fcc = f007Fcc;
    }
    
    public char getF007KeyCbterm() {
        return this.f007KeyCbterm;
    }
    
    public void setF007KeyCbterm(char f007KeyCbterm) {
        this.f007KeyCbterm = f007KeyCbterm;
    }
    
    public char getF007KeyCbcolt() {
        return this.f007KeyCbcolt;
    }
    
    public void setF007KeyCbcolt(char f007KeyCbcolt) {
        this.f007KeyCbcolt = f007KeyCbcolt;
    }
    
    public char getF007KeyCbst() {
        return this.f007KeyCbst;
    }
    
    public void setF007KeyCbst(char f007KeyCbst) {
        this.f007KeyCbst = f007KeyCbst;
    }
    
    public String getF007Ncba() {
        return this.f007Ncba;
    }
    
    public void setF007Ncba(String f007Ncba) {
        this.f007Ncba = f007Ncba;
    }
    
    public int getF007CodSrgn() {
        return this.f007CodSrgn;
    }
    
    public void setF007CodSrgn(int f007CodSrgn) {
        this.f007CodSrgn = f007CodSrgn;
    }
    
    public int getF007CodCbsec() {
        return this.f007CodCbsec;
    }
    
    public void setF007CodCbsec(int f007CodCbsec) {
        this.f007CodCbsec = f007CodCbsec;
    }
    
    public BigDecimal getF007AmtNoexpr() {
        return this.f007AmtNoexpr;
    }
    
    public void setF007AmtNoexpr(BigDecimal f007AmtNoexpr) {
        this.f007AmtNoexpr = f007AmtNoexpr;
    }
    
    public BigDecimal getF007AmtLastexprnpay() {
        return this.f007AmtLastexprnpay;
    }
    
    public void setF007AmtLastexprnpay(BigDecimal f007AmtLastexprnpay) {
        this.f007AmtLastexprnpay = f007AmtLastexprnpay;
    }
    
    public BigDecimal getF007AmtPrvexprnpay() {
        return this.f007AmtPrvexprnpay;
    }
    
    public void setF007AmtPrvexprnpay(BigDecimal f007AmtPrvexprnpay) {
        this.f007AmtPrvexprnpay = f007AmtPrvexprnpay;
    }
    
    public BigDecimal getF007Irt() {
        return this.f007Irt;
    }
    
    public void setF007Irt(BigDecimal f007Irt) {
        this.f007Irt = f007Irt;
    }
    
    public char getF007FlgGuaplcy() {
        return this.f007FlgGuaplcy;
    }
    
    public void setF007FlgGuaplcy(char f007FlgGuaplcy) {
        this.f007FlgGuaplcy = f007FlgGuaplcy;
    }
    
    public char getF007FlgRfnc() {
        return this.f007FlgRfnc;
    }
    
    public void setF007FlgRfnc(char f007FlgRfnc) {
        this.f007FlgRfnc = f007FlgRfnc;
    }
    
    public String getF007CodCommprod() {
        return this.f007CodCommprod;
    }
    
    public void setF007CodCommprod(String f007CodCommprod) {
        this.f007CodCommprod = f007CodCommprod;
    }
    
    public int getF007PerRtn() {
        return this.f007PerRtn;
    }
    
    public void setF007PerRtn(int f007PerRtn) {
        this.f007PerRtn = f007PerRtn;
    }
    
    public char getF007FlgIntf() {
        return this.f007FlgIntf;
    }
    
    public void setF007FlgIntf(char f007FlgIntf) {
        this.f007FlgIntf = f007FlgIntf;
    }
    
    public char getF007FlgMod() {
        return this.f007FlgMod;
    }
    
    public void setF007FlgMod(char f007FlgMod) {
        this.f007FlgMod = f007FlgMod;
    }
    
    public String getF007EntLinkacc() {
        return this.f007EntLinkacc;
    }
    
    public void setF007EntLinkacc(String f007EntLinkacc) {
        this.f007EntLinkacc = f007EntLinkacc;
    }
    
    public String getF007BrnLinkacc() {
        return this.f007BrnLinkacc;
    }
    
    public void setF007BrnLinkacc(String f007BrnLinkacc) {
        this.f007BrnLinkacc = f007BrnLinkacc;
    }
    
    public String getF007AccLink() {
        return this.f007AccLink;
    }
    
    public void setF007AccLink(String f007AccLink) {
        this.f007AccLink = f007AccLink;
    }
    
    public char getF007TypMatflg() {
        return this.f007TypMatflg;
    }
    
    public void setF007TypMatflg(char f007TypMatflg) {
        this.f007TypMatflg = f007TypMatflg;
    }
    
    public String getF007CodColt() {
        return this.f007CodColt;
    }
    
    public void setF007CodColt(String f007CodColt) {
        this.f007CodColt = f007CodColt;
    }
    
    public char getF007FlgLegjntresp() {
        return this.f007FlgLegjntresp;
    }
    
    public void setF007FlgLegjntresp(char f007FlgLegjntresp) {
        this.f007FlgLegjntresp = f007FlgLegjntresp;
    }
    
    public String getF007EntLastmod() {
        return this.f007EntLastmod;
    }
    
    public void setF007EntLastmod(String f007EntLastmod) {
        this.f007EntLastmod = f007EntLastmod;
    }
    
    public String getF007BrnLastmod() {
        return this.f007BrnLastmod;
    }
    
    public void setF007BrnLastmod(String f007BrnLastmod) {
        this.f007BrnLastmod = f007BrnLastmod;
    }
    
    public String getF007CodLastmoduser() {
        return this.f007CodLastmoduser;
    }
    
    public void setF007CodLastmoduser(String f007CodLastmoduser) {
        this.f007CodLastmoduser = f007CodLastmoduser;
    }
    
    public String getF007CodLastmodtrm() {
        return this.f007CodLastmodtrm;
    }
    
    public void setF007CodLastmodtrm(String f007CodLastmodtrm) {
        this.f007CodLastmodtrm = f007CodLastmodtrm;
    }
    
    public String getF007Stp() {
        return this.f007Stp;
    }
    
    public void setF007Stp(String f007Stp) {
        this.f007Stp = f007Stp;
    }
    
    public char getF007TypRiskst() {
        return this.f007TypRiskst;
    }
    
    public void setF007TypRiskst(char f007TypRiskst) {
        this.f007TypRiskst = f007TypRiskst;
    }
    
    public String getF007EntLink() {
        return this.f007EntLink;
    }
    
    public void setF007EntLink(String f007EntLink) {
        this.f007EntLink = f007EntLink;
    }
    
    public String getF007BrnLink() {
        return this.f007BrnLink;
    }
    
    public void setF007BrnLink(String f007BrnLink) {
        this.f007BrnLink = f007BrnLink;
    }
    
    public String getF007AccLinkA1() {
        return this.f007AccLinkA1;
    }
    
    public void setF007AccLinkA1(String f007AccLinkA1) {
        this.f007AccLinkA1 = f007AccLinkA1;
    }
    
    public String getF007EntNegt() {
        return this.f007EntNegt;
    }
    
    public void setF007EntNegt(String f007EntNegt) {
        this.f007EntNegt = f007EntNegt;
    }
    
    public String getF007BrnNegt() {
        return this.f007BrnNegt;
    }
    
    public void setF007BrnNegt(String f007BrnNegt) {
        this.f007BrnNegt = f007BrnNegt;
    }
    
    public String getF007DatSt() {
        return this.f007DatSt;
    }
    
    public void setF007DatSt(String f007DatSt) {
        this.f007DatSt = f007DatSt;
    }
    
    public int getF007Maxqnty() {
        return this.f007Maxqnty;
    }
    
    public void setF007Maxqnty(int f007Maxqnty) {
        this.f007Maxqnty = f007Maxqnty;
    }
    
    public String getF007Ava1() {
        return this.f007Ava1;
    }
    
    public void setF007Ava1(String f007Ava1) {
        this.f007Ava1 = f007Ava1;
    }
    
    public String getF007Ava2() {
        return this.f007Ava2;
    }
    
    public void setF007Ava2(String f007Ava2) {
        this.f007Ava2 = f007Ava2;
    }
    
    public String getF007Ava3() {
        return this.f007Ava3;
    }
    
    public void setF007Ava3(String f007Ava3) {
        this.f007Ava3 = f007Ava3;
    }
    
    public char getF007FlgAva1() {
        return this.f007FlgAva1;
    }
    
    public void setF007FlgAva1(char f007FlgAva1) {
        this.f007FlgAva1 = f007FlgAva1;
    }
    
    public char getF007FlgAva2() {
        return this.f007FlgAva2;
    }
    
    public void setF007FlgAva2(char f007FlgAva2) {
        this.f007FlgAva2 = f007FlgAva2;
    }
    
    public char getF007FlgAva3() {
        return this.f007FlgAva3;
    }
    
    public void setF007FlgAva3(char f007FlgAva3) {
        this.f007FlgAva3 = f007FlgAva3;
    }
    
    public BigDecimal getF007AmtAva1() {
        return this.f007AmtAva1;
    }
    
    public void setF007AmtAva1(BigDecimal f007AmtAva1) {
        this.f007AmtAva1 = f007AmtAva1;
    }
    
    public BigDecimal getF007AmtAva2() {
        return this.f007AmtAva2;
    }
    
    public void setF007AmtAva2(BigDecimal f007AmtAva2) {
        this.f007AmtAva2 = f007AmtAva2;
    }
    
    public BigDecimal getF007AmtAva3() {
        return this.f007AmtAva3;
    }
    
    public void setF007AmtAva3(BigDecimal f007AmtAva3) {
        this.f007AmtAva3 = f007AmtAva3;
    }
    
    public String getF007DatAva1() {
        return this.f007DatAva1;
    }
    
    public void setF007DatAva1(String f007DatAva1) {
        this.f007DatAva1 = f007DatAva1;
    }
    
    public String getF007DatAva2() {
        return this.f007DatAva2;
    }
    
    public void setF007DatAva2(String f007DatAva2) {
        this.f007DatAva2 = f007DatAva2;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ f007DatAva3=\"");
        s.append(getF007DatAva3());
        s.append("\" f007Ent=\"");
        s.append(getF007Ent());
        s.append("\" f007CodProd=\"");
        s.append(getF007CodProd());
        s.append("\" f007EntCac=\"");
        s.append(getF007EntCac());
        s.append("\" f007CenCac=\"");
        s.append(getF007CenCac());
        s.append("\" f007NumRisk=\"");
        s.append(getF007NumRisk());
        s.append("\" f007Riskseq=\"");
        s.append(getF007Riskseq());
        s.append("\" f007EntOwn=\"");
        s.append(getF007EntOwn());
        s.append("\" f007CenOwn=\"");
        s.append(getF007CenOwn());
        s.append("\" f007TypRisk=\"");
        s.append(getF007TypRisk());
        s.append("\" f007DatFml=\"");
        s.append(getF007DatFml());
        s.append("\" f007DatMat=\"");
        s.append(getF007DatMat());
        s.append("\" f007AmtFml=\"");
        s.append(getF007AmtFml());
        s.append("\" f007AmtAva=\"");
        s.append(getF007AmtAva());
        s.append("\" f007Debtbal=\"");
        s.append(getF007Debtbal());
        s.append("\" f007Exprbal=\"");
        s.append(getF007Exprbal());
        s.append("\" f007CodSlpay=\"");
        s.append(getF007CodSlpay());
        s.append("\" f007FlgSlpayrisk=\"");
        s.append(getF007FlgSlpayrisk());
        s.append("\" f007DatNpay=\"");
        s.append(getF007DatNpay());
        s.append("\" f007NumNpay=\"");
        s.append(getF007NumNpay());
        s.append("\" f007AmtNpay=\"");
        s.append(getF007AmtNpay());
        s.append("\" f007AmtProv=\"");
        s.append(getF007AmtProv());
        s.append("\" f007FlgIntst=\"");
        s.append(getF007FlgIntst());
        s.append("\" f007KeyCbrisk=\"");
        s.append(getF007KeyCbrisk());
        s.append("\" f007Fcc=\"");
        s.append(getF007Fcc());
        s.append("\" f007KeyCbterm=\"");
        s.append(getF007KeyCbterm());
        s.append("\" f007KeyCbcolt=\"");
        s.append(getF007KeyCbcolt());
        s.append("\" f007KeyCbst=\"");
        s.append(getF007KeyCbst());
        s.append("\" f007Ncba=\"");
        s.append(getF007Ncba());
        s.append("\" f007CodSrgn=\"");
        s.append(getF007CodSrgn());
        s.append("\" f007CodCbsec=\"");
        s.append(getF007CodCbsec());
        s.append("\" f007AmtNoexpr=\"");
        s.append(getF007AmtNoexpr());
        s.append("\" f007AmtLastexprnpay=\"");
        s.append(getF007AmtLastexprnpay());
        s.append("\" f007AmtPrvexprnpay=\"");
        s.append(getF007AmtPrvexprnpay());
        s.append("\" f007Irt=\"");
        s.append(getF007Irt());
        s.append("\" f007FlgGuaplcy=\"");
        s.append(getF007FlgGuaplcy());
        s.append("\" f007FlgRfnc=\"");
        s.append(getF007FlgRfnc());
        s.append("\" f007CodCommprod=\"");
        s.append(getF007CodCommprod());
        s.append("\" f007PerRtn=\"");
        s.append(getF007PerRtn());
        s.append("\" f007FlgIntf=\"");
        s.append(getF007FlgIntf());
        s.append("\" f007FlgMod=\"");
        s.append(getF007FlgMod());
        s.append("\" f007EntLinkacc=\"");
        s.append(getF007EntLinkacc());
        s.append("\" f007BrnLinkacc=\"");
        s.append(getF007BrnLinkacc());
        s.append("\" f007AccLink=\"");
        s.append(getF007AccLink());
        s.append("\" f007TypMatflg=\"");
        s.append(getF007TypMatflg());
        s.append("\" f007CodColt=\"");
        s.append(getF007CodColt());
        s.append("\" f007FlgLegjntresp=\"");
        s.append(getF007FlgLegjntresp());
        s.append("\" f007EntLastmod=\"");
        s.append(getF007EntLastmod());
        s.append("\" f007BrnLastmod=\"");
        s.append(getF007BrnLastmod());
        s.append("\" f007CodLastmoduser=\"");
        s.append(getF007CodLastmoduser());
        s.append("\" f007CodLastmodtrm=\"");
        s.append(getF007CodLastmodtrm());
        s.append("\" f007Stp=\"");
        s.append(getF007Stp());
        s.append("\" f007TypRiskst=\"");
        s.append(getF007TypRiskst());
        s.append("\" f007EntLink=\"");
        s.append(getF007EntLink());
        s.append("\" f007BrnLink=\"");
        s.append(getF007BrnLink());
        s.append("\" f007AccLinkA1=\"");
        s.append(getF007AccLinkA1());
        s.append("\" f007EntNegt=\"");
        s.append(getF007EntNegt());
        s.append("\" f007BrnNegt=\"");
        s.append(getF007BrnNegt());
        s.append("\" f007DatSt=\"");
        s.append(getF007DatSt());
        s.append("\" f007Maxqnty=\"");
        s.append(getF007Maxqnty());
        s.append("\" f007Ava1=\"");
        s.append(getF007Ava1());
        s.append("\" f007Ava2=\"");
        s.append(getF007Ava2());
        s.append("\" f007Ava3=\"");
        s.append(getF007Ava3());
        s.append("\" f007FlgAva1=\"");
        s.append(getF007FlgAva1());
        s.append("\" f007FlgAva2=\"");
        s.append(getF007FlgAva2());
        s.append("\" f007FlgAva3=\"");
        s.append(getF007FlgAva3());
        s.append("\" f007AmtAva1=\"");
        s.append(getF007AmtAva1());
        s.append("\" f007AmtAva2=\"");
        s.append(getF007AmtAva2());
        s.append("\" f007AmtAva3=\"");
        s.append(getF007AmtAva3());
        s.append("\" f007DatAva1=\"");
        s.append(getF007DatAva1());
        s.append("\" f007DatAva2=\"");
        s.append(getF007DatAva2());
        s.append("\" }");
        return s.toString();
    }
    
    public boolean equals(F007Crrrisk that) {
        return this.f007DatAva3.equals(that.f007DatAva3) &&
            this.f007Ent.equals(that.f007Ent) &&
            this.f007CodProd.equals(that.f007CodProd) &&
            this.f007EntCac.equals(that.f007EntCac) &&
            this.f007CenCac.equals(that.f007CenCac) &&
            this.f007NumRisk.equals(that.f007NumRisk) &&
            this.f007Riskseq == that.f007Riskseq &&
            this.f007EntOwn.equals(that.f007EntOwn) &&
            this.f007CenOwn.equals(that.f007CenOwn) &&
            this.f007TypRisk.equals(that.f007TypRisk) &&
            this.f007DatFml.equals(that.f007DatFml) &&
            this.f007DatMat.equals(that.f007DatMat) &&
            this.f007AmtFml.compareTo(that.f007AmtFml) == 0 &&
            this.f007AmtAva.compareTo(that.f007AmtAva) == 0 &&
            this.f007Debtbal.compareTo(that.f007Debtbal) == 0 &&
            this.f007Exprbal.compareTo(that.f007Exprbal) == 0 &&
            this.f007CodSlpay.equals(that.f007CodSlpay) &&
            this.f007FlgSlpayrisk == that.f007FlgSlpayrisk &&
            this.f007DatNpay.equals(that.f007DatNpay) &&
            this.f007NumNpay == that.f007NumNpay &&
            this.f007AmtNpay.compareTo(that.f007AmtNpay) == 0 &&
            this.f007AmtProv.compareTo(that.f007AmtProv) == 0 &&
            this.f007FlgIntst.equals(that.f007FlgIntst) &&
            this.f007KeyCbrisk == that.f007KeyCbrisk &&
            this.f007Fcc.equals(that.f007Fcc) &&
            this.f007KeyCbterm == that.f007KeyCbterm &&
            this.f007KeyCbcolt == that.f007KeyCbcolt &&
            this.f007KeyCbst == that.f007KeyCbst &&
            this.f007Ncba.equals(that.f007Ncba) &&
            this.f007CodSrgn == that.f007CodSrgn &&
            this.f007CodCbsec == that.f007CodCbsec &&
            this.f007AmtNoexpr.compareTo(that.f007AmtNoexpr) == 0 &&
            this.f007AmtLastexprnpay.compareTo(that.f007AmtLastexprnpay) == 0 &&
            this.f007AmtPrvexprnpay.compareTo(that.f007AmtPrvexprnpay) == 0 &&
            this.f007Irt.compareTo(that.f007Irt) == 0 &&
            this.f007FlgGuaplcy == that.f007FlgGuaplcy &&
            this.f007FlgRfnc == that.f007FlgRfnc &&
            this.f007CodCommprod.equals(that.f007CodCommprod) &&
            this.f007PerRtn == that.f007PerRtn &&
            this.f007FlgIntf == that.f007FlgIntf &&
            this.f007FlgMod == that.f007FlgMod &&
            this.f007EntLinkacc.equals(that.f007EntLinkacc) &&
            this.f007BrnLinkacc.equals(that.f007BrnLinkacc) &&
            this.f007AccLink.equals(that.f007AccLink) &&
            this.f007TypMatflg == that.f007TypMatflg &&
            this.f007CodColt.equals(that.f007CodColt) &&
            this.f007FlgLegjntresp == that.f007FlgLegjntresp &&
            this.f007EntLastmod.equals(that.f007EntLastmod) &&
            this.f007BrnLastmod.equals(that.f007BrnLastmod) &&
            this.f007CodLastmoduser.equals(that.f007CodLastmoduser) &&
            this.f007CodLastmodtrm.equals(that.f007CodLastmodtrm) &&
            this.f007Stp.equals(that.f007Stp) &&
            this.f007TypRiskst == that.f007TypRiskst &&
            this.f007EntLink.equals(that.f007EntLink) &&
            this.f007BrnLink.equals(that.f007BrnLink) &&
            this.f007AccLinkA1.equals(that.f007AccLinkA1) &&
            this.f007EntNegt.equals(that.f007EntNegt) &&
            this.f007BrnNegt.equals(that.f007BrnNegt) &&
            this.f007DatSt.equals(that.f007DatSt) &&
            this.f007Maxqnty == that.f007Maxqnty &&
            this.f007Ava1.equals(that.f007Ava1) &&
            this.f007Ava2.equals(that.f007Ava2) &&
            this.f007Ava3.equals(that.f007Ava3) &&
            this.f007FlgAva1 == that.f007FlgAva1 &&
            this.f007FlgAva2 == that.f007FlgAva2 &&
            this.f007FlgAva3 == that.f007FlgAva3 &&
            this.f007AmtAva1.compareTo(that.f007AmtAva1) == 0 &&
            this.f007AmtAva2.compareTo(that.f007AmtAva2) == 0 &&
            this.f007AmtAva3.compareTo(that.f007AmtAva3) == 0 &&
            this.f007DatAva1.equals(that.f007DatAva1) &&
            this.f007DatAva2.equals(that.f007DatAva2);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof F007Crrrisk) && this.equals((F007Crrrisk)that);
    }
    
    @Override
    public int hashCode() {
        return f007DatAva3.hashCode() ^
            Integer.rotateLeft(f007Ent.hashCode(), 1) ^
            Integer.rotateLeft(f007CodProd.hashCode(), 2) ^
            Integer.rotateLeft(f007EntCac.hashCode(), 3) ^
            Integer.rotateLeft(f007CenCac.hashCode(), 4) ^
            Integer.rotateLeft(f007NumRisk.hashCode(), 5) ^
            Integer.rotateLeft(Integer.hashCode(f007Riskseq), 6) ^
            Integer.rotateLeft(f007EntOwn.hashCode(), 7) ^
            Integer.rotateLeft(f007CenOwn.hashCode(), 8) ^
            Integer.rotateLeft(f007TypRisk.hashCode(), 9) ^
            Integer.rotateLeft(f007DatFml.hashCode(), 10) ^
            Integer.rotateLeft(f007DatMat.hashCode(), 11) ^
            Integer.rotateLeft(f007AmtFml.unscaledValue().hashCode(), 12) ^
            Integer.rotateLeft(f007AmtAva.unscaledValue().hashCode(), 13) ^
            Integer.rotateLeft(f007Debtbal.unscaledValue().hashCode(), 14) ^
            Integer.rotateLeft(f007Exprbal.unscaledValue().hashCode(), 15) ^
            Integer.rotateLeft(f007CodSlpay.hashCode(), 16) ^
            Integer.rotateLeft(Character.hashCode(f007FlgSlpayrisk), 17) ^
            Integer.rotateLeft(f007DatNpay.hashCode(), 18) ^
            Integer.rotateLeft(Integer.hashCode(f007NumNpay), 19) ^
            Integer.rotateLeft(f007AmtNpay.unscaledValue().hashCode(), 20) ^
            Integer.rotateLeft(f007AmtProv.unscaledValue().hashCode(), 21) ^
            Integer.rotateLeft(f007FlgIntst.hashCode(), 22) ^
            Integer.rotateLeft(Character.hashCode(f007KeyCbrisk), 23) ^
            Integer.rotateLeft(f007Fcc.hashCode(), 24) ^
            Integer.rotateLeft(Character.hashCode(f007KeyCbterm), 25) ^
            Integer.rotateLeft(Character.hashCode(f007KeyCbcolt), 26) ^
            Integer.rotateLeft(Character.hashCode(f007KeyCbst), 27) ^
            Integer.rotateLeft(f007Ncba.hashCode(), 28) ^
            Integer.rotateLeft(Integer.hashCode(f007CodSrgn), 29) ^
            Integer.rotateLeft(Integer.hashCode(f007CodCbsec), 30) ^
            Integer.rotateLeft(f007AmtNoexpr.unscaledValue().hashCode(), 31) ^
            f007AmtLastexprnpay.unscaledValue().hashCode() ^
            Integer.rotateLeft(f007AmtPrvexprnpay.unscaledValue().hashCode(), 1) ^
            Integer.rotateLeft(f007Irt.unscaledValue().hashCode(), 2) ^
            Integer.rotateLeft(Character.hashCode(f007FlgGuaplcy), 3) ^
            Integer.rotateLeft(Character.hashCode(f007FlgRfnc), 4) ^
            Integer.rotateLeft(f007CodCommprod.hashCode(), 5) ^
            Integer.rotateLeft(Integer.hashCode(f007PerRtn), 6) ^
            Integer.rotateLeft(Character.hashCode(f007FlgIntf), 7) ^
            Integer.rotateLeft(Character.hashCode(f007FlgMod), 8) ^
            Integer.rotateLeft(f007EntLinkacc.hashCode(), 9) ^
            Integer.rotateLeft(f007BrnLinkacc.hashCode(), 10) ^
            Integer.rotateLeft(f007AccLink.hashCode(), 11) ^
            Integer.rotateLeft(Character.hashCode(f007TypMatflg), 12) ^
            Integer.rotateLeft(f007CodColt.hashCode(), 13) ^
            Integer.rotateLeft(Character.hashCode(f007FlgLegjntresp), 14) ^
            Integer.rotateLeft(f007EntLastmod.hashCode(), 15) ^
            Integer.rotateLeft(f007BrnLastmod.hashCode(), 16) ^
            Integer.rotateLeft(f007CodLastmoduser.hashCode(), 17) ^
            Integer.rotateLeft(f007CodLastmodtrm.hashCode(), 18) ^
            Integer.rotateLeft(f007Stp.hashCode(), 19) ^
            Integer.rotateLeft(Character.hashCode(f007TypRiskst), 20) ^
            Integer.rotateLeft(f007EntLink.hashCode(), 21) ^
            Integer.rotateLeft(f007BrnLink.hashCode(), 22) ^
            Integer.rotateLeft(f007AccLinkA1.hashCode(), 23) ^
            Integer.rotateLeft(f007EntNegt.hashCode(), 24) ^
            Integer.rotateLeft(f007BrnNegt.hashCode(), 25) ^
            Integer.rotateLeft(f007DatSt.hashCode(), 26) ^
            Integer.rotateLeft(Integer.hashCode(f007Maxqnty), 27) ^
            Integer.rotateLeft(f007Ava1.hashCode(), 28) ^
            Integer.rotateLeft(f007Ava2.hashCode(), 29) ^
            Integer.rotateLeft(f007Ava3.hashCode(), 30) ^
            Integer.rotateLeft(Character.hashCode(f007FlgAva1), 31) ^
            Character.hashCode(f007FlgAva2) ^
            Integer.rotateLeft(Character.hashCode(f007FlgAva3), 1) ^
            Integer.rotateLeft(f007AmtAva1.unscaledValue().hashCode(), 2) ^
            Integer.rotateLeft(f007AmtAva2.unscaledValue().hashCode(), 3) ^
            Integer.rotateLeft(f007AmtAva3.unscaledValue().hashCode(), 4) ^
            Integer.rotateLeft(f007DatAva1.hashCode(), 5) ^
            Integer.rotateLeft(f007DatAva2.hashCode(), 6);
    }
    
    @Override
    public int compareTo(F007Crrrisk that) {
        int c = this.f007DatAva3.compareTo(that.f007DatAva3);
        if ( c != 0 ) return c;
        c = this.f007Ent.compareTo(that.f007Ent);
        if ( c != 0 ) return c;
        c = this.f007CodProd.compareTo(that.f007CodProd);
        if ( c != 0 ) return c;
        c = this.f007EntCac.compareTo(that.f007EntCac);
        if ( c != 0 ) return c;
        c = this.f007CenCac.compareTo(that.f007CenCac);
        if ( c != 0 ) return c;
        c = this.f007NumRisk.compareTo(that.f007NumRisk);
        if ( c != 0 ) return c;
        c = Integer.compare(this.f007Riskseq, that.f007Riskseq);
        if ( c != 0 ) return c;
        c = this.f007EntOwn.compareTo(that.f007EntOwn);
        if ( c != 0 ) return c;
        c = this.f007CenOwn.compareTo(that.f007CenOwn);
        if ( c != 0 ) return c;
        c = this.f007TypRisk.compareTo(that.f007TypRisk);
        if ( c != 0 ) return c;
        c = this.f007DatFml.compareTo(that.f007DatFml);
        if ( c != 0 ) return c;
        c = this.f007DatMat.compareTo(that.f007DatMat);
        if ( c != 0 ) return c;
        c = this.f007AmtFml.compareTo(that.f007AmtFml);
        if ( c != 0 ) return c;
        c = this.f007AmtAva.compareTo(that.f007AmtAva);
        if ( c != 0 ) return c;
        c = this.f007Debtbal.compareTo(that.f007Debtbal);
        if ( c != 0 ) return c;
        c = this.f007Exprbal.compareTo(that.f007Exprbal);
        if ( c != 0 ) return c;
        c = this.f007CodSlpay.compareTo(that.f007CodSlpay);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007FlgSlpayrisk, that.f007FlgSlpayrisk);
        if ( c != 0 ) return c;
        c = this.f007DatNpay.compareTo(that.f007DatNpay);
        if ( c != 0 ) return c;
        c = Integer.compare(this.f007NumNpay, that.f007NumNpay);
        if ( c != 0 ) return c;
        c = this.f007AmtNpay.compareTo(that.f007AmtNpay);
        if ( c != 0 ) return c;
        c = this.f007AmtProv.compareTo(that.f007AmtProv);
        if ( c != 0 ) return c;
        c = this.f007FlgIntst.compareTo(that.f007FlgIntst);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007KeyCbrisk, that.f007KeyCbrisk);
        if ( c != 0 ) return c;
        c = this.f007Fcc.compareTo(that.f007Fcc);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007KeyCbterm, that.f007KeyCbterm);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007KeyCbcolt, that.f007KeyCbcolt);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007KeyCbst, that.f007KeyCbst);
        if ( c != 0 ) return c;
        c = this.f007Ncba.compareTo(that.f007Ncba);
        if ( c != 0 ) return c;
        c = Integer.compare(this.f007CodSrgn, that.f007CodSrgn);
        if ( c != 0 ) return c;
        c = Integer.compare(this.f007CodCbsec, that.f007CodCbsec);
        if ( c != 0 ) return c;
        c = this.f007AmtNoexpr.compareTo(that.f007AmtNoexpr);
        if ( c != 0 ) return c;
        c = this.f007AmtLastexprnpay.compareTo(that.f007AmtLastexprnpay);
        if ( c != 0 ) return c;
        c = this.f007AmtPrvexprnpay.compareTo(that.f007AmtPrvexprnpay);
        if ( c != 0 ) return c;
        c = this.f007Irt.compareTo(that.f007Irt);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007FlgGuaplcy, that.f007FlgGuaplcy);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007FlgRfnc, that.f007FlgRfnc);
        if ( c != 0 ) return c;
        c = this.f007CodCommprod.compareTo(that.f007CodCommprod);
        if ( c != 0 ) return c;
        c = Integer.compare(this.f007PerRtn, that.f007PerRtn);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007FlgIntf, that.f007FlgIntf);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007FlgMod, that.f007FlgMod);
        if ( c != 0 ) return c;
        c = this.f007EntLinkacc.compareTo(that.f007EntLinkacc);
        if ( c != 0 ) return c;
        c = this.f007BrnLinkacc.compareTo(that.f007BrnLinkacc);
        if ( c != 0 ) return c;
        c = this.f007AccLink.compareTo(that.f007AccLink);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007TypMatflg, that.f007TypMatflg);
        if ( c != 0 ) return c;
        c = this.f007CodColt.compareTo(that.f007CodColt);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007FlgLegjntresp, that.f007FlgLegjntresp);
        if ( c != 0 ) return c;
        c = this.f007EntLastmod.compareTo(that.f007EntLastmod);
        if ( c != 0 ) return c;
        c = this.f007BrnLastmod.compareTo(that.f007BrnLastmod);
        if ( c != 0 ) return c;
        c = this.f007CodLastmoduser.compareTo(that.f007CodLastmoduser);
        if ( c != 0 ) return c;
        c = this.f007CodLastmodtrm.compareTo(that.f007CodLastmodtrm);
        if ( c != 0 ) return c;
        c = this.f007Stp.compareTo(that.f007Stp);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007TypRiskst, that.f007TypRiskst);
        if ( c != 0 ) return c;
        c = this.f007EntLink.compareTo(that.f007EntLink);
        if ( c != 0 ) return c;
        c = this.f007BrnLink.compareTo(that.f007BrnLink);
        if ( c != 0 ) return c;
        c = this.f007AccLinkA1.compareTo(that.f007AccLinkA1);
        if ( c != 0 ) return c;
        c = this.f007EntNegt.compareTo(that.f007EntNegt);
        if ( c != 0 ) return c;
        c = this.f007BrnNegt.compareTo(that.f007BrnNegt);
        if ( c != 0 ) return c;
        c = this.f007DatSt.compareTo(that.f007DatSt);
        if ( c != 0 ) return c;
        c = Integer.compare(this.f007Maxqnty, that.f007Maxqnty);
        if ( c != 0 ) return c;
        c = this.f007Ava1.compareTo(that.f007Ava1);
        if ( c != 0 ) return c;
        c = this.f007Ava2.compareTo(that.f007Ava2);
        if ( c != 0 ) return c;
        c = this.f007Ava3.compareTo(that.f007Ava3);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007FlgAva1, that.f007FlgAva1);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007FlgAva2, that.f007FlgAva2);
        if ( c != 0 ) return c;
        c = Character.compare(this.f007FlgAva3, that.f007FlgAva3);
        if ( c != 0 ) return c;
        c = this.f007AmtAva1.compareTo(that.f007AmtAva1);
        if ( c != 0 ) return c;
        c = this.f007AmtAva2.compareTo(that.f007AmtAva2);
        if ( c != 0 ) return c;
        c = this.f007AmtAva3.compareTo(that.f007AmtAva3);
        if ( c != 0 ) return c;
        c = this.f007DatAva1.compareTo(that.f007DatAva1);
        if ( c != 0 ) return c;
        c = this.f007DatAva2.compareTo(that.f007DatAva2);
        return c;
    }
    
    public byte[] getBytes(byte[] bytes, int offset) {
        F007DATAVA3.putString(f007DatAva3, bytes, offset);
        F007ENT.putString(f007Ent, bytes, offset);
        F007CODPROD.putString(f007CodProd, bytes, offset);
        F007ENTCAC.putString(f007EntCac, bytes, offset);
        F007CENCAC.putString(f007CenCac, bytes, offset);
        F007NUMRISK.putString(f007NumRisk, bytes, offset);
        F007RISKSEQ.putInt(f007Riskseq, bytes, offset);
        F007ENTOWN.putString(f007EntOwn, bytes, offset);
        F007CENOWN.putString(f007CenOwn, bytes, offset);
        F007TYPRISK.putString(f007TypRisk, bytes, offset);
        F007DATFML.putString(f007DatFml, bytes, offset);
        F007DATMAT.putString(f007DatMat, bytes, offset);
        F007AMTFML.putBigDecimal(f007AmtFml, bytes, offset);
        F007AMTAVA.putBigDecimal(f007AmtAva, bytes, offset);
        F007DEBTBAL.putBigDecimal(f007Debtbal, bytes, offset);
        F007EXPRBAL.putBigDecimal(f007Exprbal, bytes, offset);
        F007CODSLPAY.putString(f007CodSlpay, bytes, offset);
        F007FLGSLPAYRISK.putString(f007FlgSlpayrisk, bytes, offset);
        F007DATNPAY.putString(f007DatNpay, bytes, offset);
        F007NUMNPAY.putInt(f007NumNpay, bytes, offset);
        F007AMTNPAY.putBigDecimal(f007AmtNpay, bytes, offset);
        F007AMTPROV.putBigDecimal(f007AmtProv, bytes, offset);
        F007FLGINTST.putString(f007FlgIntst, bytes, offset);
        F007KEYCBRISK.putString(f007KeyCbrisk, bytes, offset);
        F007FCC.putString(f007Fcc, bytes, offset);
        F007KEYCBTERM.putString(f007KeyCbterm, bytes, offset);
        F007KEYCBCOLT.putString(f007KeyCbcolt, bytes, offset);
        F007KEYCBST.putString(f007KeyCbst, bytes, offset);
        F007NCBA.putString(f007Ncba, bytes, offset);
        F007CODSRGN.putInt(f007CodSrgn, bytes, offset);
        F007CODCBSEC.putInt(f007CodCbsec, bytes, offset);
        F007AMTNOEXPR.putBigDecimal(f007AmtNoexpr, bytes, offset);
        F007AMTLASTEXPRNPAY.putBigDecimal(f007AmtLastexprnpay, bytes, offset);
        F007AMTPRVEXPRNPAY.putBigDecimal(f007AmtPrvexprnpay, bytes, offset);
        F007IRT.putBigDecimal(f007Irt, bytes, offset);
        F007FLGGUAPLCY.putString(f007FlgGuaplcy, bytes, offset);
        F007FLGRFNC.putString(f007FlgRfnc, bytes, offset);
        F007CODCOMMPROD.putString(f007CodCommprod, bytes, offset);
        F007PERRTN.putInt(f007PerRtn, bytes, offset);
        F007FLGINTF.putString(f007FlgIntf, bytes, offset);
        F007FLGMOD.putString(f007FlgMod, bytes, offset);
        F007ENTLINKACC.putString(f007EntLinkacc, bytes, offset);
        F007BRNLINKACC.putString(f007BrnLinkacc, bytes, offset);
        F007ACCLINK.putString(f007AccLink, bytes, offset);
        F007TYPMATFLG.putString(f007TypMatflg, bytes, offset);
        F007CODCOLT.putString(f007CodColt, bytes, offset);
        F007FLGLEGJNTRESP.putString(f007FlgLegjntresp, bytes, offset);
        F007ENTLASTMOD.putString(f007EntLastmod, bytes, offset);
        F007BRNLASTMOD.putString(f007BrnLastmod, bytes, offset);
        F007CODLASTMODUSER.putString(f007CodLastmoduser, bytes, offset);
        F007CODLASTMODTRM.putString(f007CodLastmodtrm, bytes, offset);
        F007STP.putString(f007Stp, bytes, offset);
        F007TYPRISKST.putString(f007TypRiskst, bytes, offset);
        F007ENTLINK.putString(f007EntLink, bytes, offset);
        F007BRNLINK.putString(f007BrnLink, bytes, offset);
        F007ACCLINKA1.putString(f007AccLinkA1, bytes, offset);
        F007ENTNEGT.putString(f007EntNegt, bytes, offset);
        F007BRNNEGT.putString(f007BrnNegt, bytes, offset);
        F007DATST.putString(f007DatSt, bytes, offset);
        F007MAXQNTY.putInt(f007Maxqnty, bytes, offset);
        F007AVA1.putString(f007Ava1, bytes, offset);
        F007AVA2.putString(f007Ava2, bytes, offset);
        F007AVA3.putString(f007Ava3, bytes, offset);
        F007FLGAVA1.putString(f007FlgAva1, bytes, offset);
        F007FLGAVA2.putString(f007FlgAva2, bytes, offset);
        F007FLGAVA3.putString(f007FlgAva3, bytes, offset);
        F007AMTAVA1.putBigDecimal(f007AmtAva1, bytes, offset);
        F007AMTAVA2.putBigDecimal(f007AmtAva2, bytes, offset);
        F007AMTAVA3.putBigDecimal(f007AmtAva3, bytes, offset);
        F007DATAVA1.putString(f007DatAva1, bytes, offset);
        F007DATAVA2.putString(f007DatAva2, bytes, offset);
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
        f007DatAva3 = F007DATAVA3.getString(bytes, offset);
        f007Ent = F007ENT.getString(bytes, offset);
        f007CodProd = F007CODPROD.getString(bytes, offset);
        f007EntCac = F007ENTCAC.getString(bytes, offset);
        f007CenCac = F007CENCAC.getString(bytes, offset);
        f007NumRisk = F007NUMRISK.getString(bytes, offset);
        f007Riskseq = F007RISKSEQ.getInt(bytes, offset);
        f007EntOwn = F007ENTOWN.getString(bytes, offset);
        f007CenOwn = F007CENOWN.getString(bytes, offset);
        f007TypRisk = F007TYPRISK.getString(bytes, offset);
        f007DatFml = F007DATFML.getString(bytes, offset);
        f007DatMat = F007DATMAT.getString(bytes, offset);
        f007AmtFml = F007AMTFML.getBigDecimal(bytes, offset);
        f007AmtAva = F007AMTAVA.getBigDecimal(bytes, offset);
        f007Debtbal = F007DEBTBAL.getBigDecimal(bytes, offset);
        f007Exprbal = F007EXPRBAL.getBigDecimal(bytes, offset);
        f007CodSlpay = F007CODSLPAY.getString(bytes, offset);
        f007FlgSlpayrisk = F007FLGSLPAYRISK.getString(bytes, offset);
        f007DatNpay = F007DATNPAY.getString(bytes, offset);
        f007NumNpay = F007NUMNPAY.getInt(bytes, offset);
        f007AmtNpay = F007AMTNPAY.getBigDecimal(bytes, offset);
        f007AmtProv = F007AMTPROV.getBigDecimal(bytes, offset);
        f007FlgIntst = F007FLGINTST.getString(bytes, offset);
        f007KeyCbrisk = F007KEYCBRISK.getString(bytes, offset);
        f007Fcc = F007FCC.getString(bytes, offset);
        f007KeyCbterm = F007KEYCBTERM.getString(bytes, offset);
        f007KeyCbcolt = F007KEYCBCOLT.getString(bytes, offset);
        f007KeyCbst = F007KEYCBST.getString(bytes, offset);
        f007Ncba = F007NCBA.getString(bytes, offset);
        f007CodSrgn = F007CODSRGN.getInt(bytes, offset);
        f007CodCbsec = F007CODCBSEC.getInt(bytes, offset);
        f007AmtNoexpr = F007AMTNOEXPR.getBigDecimal(bytes, offset);
        f007AmtLastexprnpay = F007AMTLASTEXPRNPAY.getBigDecimal(bytes, offset);
        f007AmtPrvexprnpay = F007AMTPRVEXPRNPAY.getBigDecimal(bytes, offset);
        f007Irt = F007IRT.getBigDecimal(bytes, offset);
        f007FlgGuaplcy = F007FLGGUAPLCY.getString(bytes, offset);
        f007FlgRfnc = F007FLGRFNC.getString(bytes, offset);
        f007CodCommprod = F007CODCOMMPROD.getString(bytes, offset);
        f007PerRtn = F007PERRTN.getInt(bytes, offset);
        f007FlgIntf = F007FLGINTF.getString(bytes, offset);
        f007FlgMod = F007FLGMOD.getString(bytes, offset);
        f007EntLinkacc = F007ENTLINKACC.getString(bytes, offset);
        f007BrnLinkacc = F007BRNLINKACC.getString(bytes, offset);
        f007AccLink = F007ACCLINK.getString(bytes, offset);
        f007TypMatflg = F007TYPMATFLG.getString(bytes, offset);
        f007CodColt = F007CODCOLT.getString(bytes, offset);
        f007FlgLegjntresp = F007FLGLEGJNTRESP.getString(bytes, offset);
        f007EntLastmod = F007ENTLASTMOD.getString(bytes, offset);
        f007BrnLastmod = F007BRNLASTMOD.getString(bytes, offset);
        f007CodLastmoduser = F007CODLASTMODUSER.getString(bytes, offset);
        f007CodLastmodtrm = F007CODLASTMODTRM.getString(bytes, offset);
        f007Stp = F007STP.getString(bytes, offset);
        f007TypRiskst = F007TYPRISKST.getString(bytes, offset);
        f007EntLink = F007ENTLINK.getString(bytes, offset);
        f007BrnLink = F007BRNLINK.getString(bytes, offset);
        f007AccLinkA1 = F007ACCLINKA1.getString(bytes, offset);
        f007EntNegt = F007ENTNEGT.getString(bytes, offset);
        f007BrnNegt = F007BRNNEGT.getString(bytes, offset);
        f007DatSt = F007DATST.getString(bytes, offset);
        f007Maxqnty = F007MAXQNTY.getInt(bytes, offset);
        f007Ava1 = F007AVA1.getString(bytes, offset);
        f007Ava2 = F007AVA2.getString(bytes, offset);
        f007Ava3 = F007AVA3.getString(bytes, offset);
        f007FlgAva1 = F007FLGAVA1.getString(bytes, offset);
        f007FlgAva2 = F007FLGAVA2.getString(bytes, offset);
        f007FlgAva3 = F007FLGAVA3.getString(bytes, offset);
        f007AmtAva1 = F007AMTAVA1.getBigDecimal(bytes, offset);
        f007AmtAva2 = F007AMTAVA2.getBigDecimal(bytes, offset);
        f007AmtAva3 = F007AMTAVA3.getBigDecimal(bytes, offset);
        f007DatAva1 = F007DATAVA1.getString(bytes, offset);
        f007DatAva2 = F007DATAVA2.getString(bytes, offset);
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
