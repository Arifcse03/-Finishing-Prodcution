package model.entities;

import java.sql.SQLException;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 11 20:11:16 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgFinishProdDImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DetailId {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getDetailId();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setDetailId((Number)value);
            }
        }
        ,
        LineId {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getLineId();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        SizeValue {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getSizeValue();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setSizeValue((String)value);
            }
        }
        ,
        SizeQty {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getSizeQty();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setSizeQty((Number)value);
            }
        }
        ,
        ProdQty {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getProdQty();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setProdQty((Number)value);
            }
        }
        ,
        BlncQty {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getBlncQty();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setBlncQty((Number)value);
            }
        }
        ,
        SizeWiseRej {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getSizeWiseRej();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setSizeWiseRej((Number)value);
            }
        }
        ,
        PrevProd {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getPrevProd();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setPrevProd((Number)value);
            }
        }
        ,
        TotalInput {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getTotalInput();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setTotalInput((Number)value);
            }
        }
        ,
        DayProd {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getDayProd();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setDayProd((String)value);
            }
        }
        ,
        TotalProd {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getTotalProd();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setTotalProd((Number)value);
            }
        }
        ,
        TotalRej {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getTotalRej();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setTotalRej((Number)value);
            }
        }
        ,
        DayRejection {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getDayRejection();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setDayRejection((String)value);
            }
        }
        ,
        Inseam {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getInseam();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setInseam((Number)value);
            }
        }
        ,
        R1 {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getR1();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setR1((Number)value);
            }
        }
        ,
        R2 {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getR2();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setR2((Number)value);
            }
        }
        ,
        R3 {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getR3();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setR3((Number)value);
            }
        }
        ,
        R4 {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getR4();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setR4((Number)value);
            }
        }
        ,
        R5 {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getR5();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setR5((Number)value);
            }
        }
        ,
        R6 {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getR6();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setR6((Number)value);
            }
        }
        ,
        R7 {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getR7();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setR7((Number)value);
            }
        }
        ,
        R8 {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getR8();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setR8((Number)value);
            }
        }
        ,
        R9 {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getR9();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setR9((Number)value);
            }
        }
        ,
        R10 {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getR10();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setR10((Number)value);
            }
        }
        ,
        R11 {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getR11();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setR11((Number)value);
            }
        }
        ,
        R12 {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getR12();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setR12((Number)value);
            }
        }
        ,
        R13 {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getR13();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setR13((Number)value);
            }
        }
        ,
        SizeInseam {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getSizeInseam();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setSizeInseam((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getCreationDate();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        MnjMfgFinishProdL {
            public Object get(MnjMfgFinishProdDImpl obj) {
                return obj.getMnjMfgFinishProdL();
            }

            public void put(MnjMfgFinishProdDImpl obj, Object value) {
                obj.setMnjMfgFinishProdL((MnjMfgFinishProdLImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjMfgFinishProdDImpl object);

        public abstract void put(MnjMfgFinishProdDImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int DETAILID = AttributesEnum.DetailId.index();
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int SIZEVALUE = AttributesEnum.SizeValue.index();
    public static final int SIZEQTY = AttributesEnum.SizeQty.index();
    public static final int PRODQTY = AttributesEnum.ProdQty.index();
    public static final int BLNCQTY = AttributesEnum.BlncQty.index();
    public static final int SIZEWISEREJ = AttributesEnum.SizeWiseRej.index();
    public static final int PREVPROD = AttributesEnum.PrevProd.index();
    public static final int TOTALINPUT = AttributesEnum.TotalInput.index();
    public static final int DAYPROD = AttributesEnum.DayProd.index();
    public static final int TOTALPROD = AttributesEnum.TotalProd.index();
    public static final int TOTALREJ = AttributesEnum.TotalRej.index();
    public static final int DAYREJECTION = AttributesEnum.DayRejection.index();
    public static final int INSEAM = AttributesEnum.Inseam.index();
    public static final int R1 = AttributesEnum.R1.index();
    public static final int R2 = AttributesEnum.R2.index();
    public static final int R3 = AttributesEnum.R3.index();
    public static final int R4 = AttributesEnum.R4.index();
    public static final int R5 = AttributesEnum.R5.index();
    public static final int R6 = AttributesEnum.R6.index();
    public static final int R7 = AttributesEnum.R7.index();
    public static final int R8 = AttributesEnum.R8.index();
    public static final int R9 = AttributesEnum.R9.index();
    public static final int R10 = AttributesEnum.R10.index();
    public static final int R11 = AttributesEnum.R11.index();
    public static final int R12 = AttributesEnum.R12.index();
    public static final int R13 = AttributesEnum.R13.index();
    public static final int SIZEINSEAM = AttributesEnum.SizeInseam.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int MNJMFGFINISHPRODL = AttributesEnum.MnjMfgFinishProdL.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgFinishProdDImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entities.MnjMfgFinishProdD");
        }
        return mDefinitionObject;
    }

    @Override
    public void postChanges(TransactionEvent e) {
    /* If current entity is new or modified */
    if (getPostState() == STATUS_NEW ||
       getPostState() == STATUS_MODIFIED) {
     /* Get the associated product for the service request */
     MnjMfgFinishProdLImpl header = getMnjMfgFinishProdL();

     /* If there is an associated product */
     if (header != null) {
       /* And if it's post-status is NEW */
       if (header.getPostState() == STATUS_NEW) {
         /*
          * Post the product first, before posting this
          * entity by calling super below
          */
         header.postChanges(e);
       }
     }
    }
    super.postChanges(e);
    }

    /**
     * Gets the attribute value for DetailId, using the alias name DetailId.
     * @return the DetailId
     */
    public Number getDetailId() {
        return (Number)getAttributeInternal(DETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DetailId.
     * @param value value to set the DetailId
     */
    public void setDetailId(Number value) {
        setAttributeInternal(DETAILID, value);
    }

    /**
     * Gets the attribute value for LineId, using the alias name LineId.
     * @return the LineId
     */
    public Number getLineId() {
        return (Number)getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineId.
     * @param value value to set the LineId
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for SizeValue, using the alias name SizeValue.
     * @return the SizeValue
     */
    public String getSizeValue() {
        return (String)getAttributeInternal(SIZEVALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SizeValue.
     * @param value value to set the SizeValue
     */
    public void setSizeValue(String value) {
        setAttributeInternal(SIZEVALUE, value);
    }

    /**
     * Gets the attribute value for SizeQty, using the alias name SizeQty.
     * @return the SizeQty
     */
    public Number getSizeQty() {
        return (Number)getAttributeInternal(SIZEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for SizeQty.
     * @param value value to set the SizeQty
     */
    public void setSizeQty(Number value) {
        setAttributeInternal(SIZEQTY, value);
    }

    /**
     * Gets the attribute value for ProdQty, using the alias name ProdQty.
     * @return the ProdQty
     */
    public Number getProdQty() {
        return (Number)getAttributeInternal(PRODQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProdQty.
     * @param value value to set the ProdQty
     */
    public void setProdQty(Number value) {
        setAttributeInternal(PRODQTY, value);
    }

    /**
     * Gets the attribute value for BlncQty, using the alias name BlncQty.
     * @return the BlncQty
     */
    public Number getBlncQty() {
        return (Number)getAttributeInternal(BLNCQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BlncQty.
     * @param value value to set the BlncQty
     */
    public void setBlncQty(Number value) {
        setAttributeInternal(BLNCQTY, value);
    }

    /**
     * Gets the attribute value for SizeWiseRej, using the alias name SizeWiseRej.
     * @return the SizeWiseRej
     */
    public Number getSizeWiseRej() {
        return (Number)getAttributeInternal(SIZEWISEREJ);
    }

    /**
     * Sets <code>value</code> as the attribute value for SizeWiseRej.
     * @param value value to set the SizeWiseRej
     */
    public void setSizeWiseRej(Number value) {
        setAttributeInternal(SIZEWISEREJ, value);
    }

    /**
     * Gets the attribute value for PrevProd, using the alias name PrevProd.
     * @return the PrevProd
     */
    public Number getPrevProd() {
        return (Number)getAttributeInternal(PREVPROD);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrevProd.
     * @param value value to set the PrevProd
     */
    public void setPrevProd(Number value) {
        setAttributeInternal(PREVPROD, value);
    }

    /**
     * Gets the attribute value for TotalInput, using the alias name TotalInput.
     * @return the TotalInput
     */
    public Number getTotalInput() {
        return (Number)getAttributeInternal(TOTALINPUT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalInput.
     * @param value value to set the TotalInput
     */
    public void setTotalInput(Number value) {
        setAttributeInternal(TOTALINPUT, value);
    }

    /**
     * Gets the attribute value for DayProd, using the alias name DayProd.
     * @return the DayProd
     */
    public String getDayProd() {
        return (String)getAttributeInternal(DAYPROD);
    }

    /**
     * Sets <code>value</code> as the attribute value for DayProd.
     * @param value value to set the DayProd
     */
    public void setDayProd(String value) {
        setAttributeInternal(DAYPROD, value);
    }

    /**
     * Gets the attribute value for TotalProd, using the alias name TotalProd.
     * @return the TotalProd
     */
    public Number getTotalProd() {
        return (Number)getAttributeInternal(TOTALPROD);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalProd.
     * @param value value to set the TotalProd
     */
    public void setTotalProd(Number value) {
        setAttributeInternal(TOTALPROD, value);
    }

    /**
     * Gets the attribute value for TotalRej, using the alias name TotalRej.
     * @return the TotalRej
     */
    public Number getTotalRej() {
        return (Number)getAttributeInternal(TOTALREJ);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalRej.
     * @param value value to set the TotalRej
     */
    public void setTotalRej(Number value) {
        setAttributeInternal(TOTALREJ, value);
    }

    /**
     * Gets the attribute value for DayRejection, using the alias name DayRejection.
     * @return the DayRejection
     */
    public String getDayRejection() {
        return (String)getAttributeInternal(DAYREJECTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for DayRejection.
     * @param value value to set the DayRejection
     */
    public void setDayRejection(String value) {
        setAttributeInternal(DAYREJECTION, value);
    }

    /**
     * Gets the attribute value for Inseam, using the alias name Inseam.
     * @return the Inseam
     */
    public Number getInseam() {
        return (Number)getAttributeInternal(INSEAM);
    }

    /**
     * Sets <code>value</code> as the attribute value for Inseam.
     * @param value value to set the Inseam
     */
    public void setInseam(Number value) {
        setAttributeInternal(INSEAM, value);
    }

    /**
     * Gets the attribute value for R1, using the alias name R1.
     * @return the R1
     */
    public Number getR1() {
        return (Number)getAttributeInternal(R1);
    }

    /**
     * Sets <code>value</code> as the attribute value for R1.
     * @param value value to set the R1
     */
    public void setR1(Number value) {
        setAttributeInternal(R1, value);
    }

    /**
     * Gets the attribute value for R2, using the alias name R2.
     * @return the R2
     */
    public Number getR2() {
        return (Number)getAttributeInternal(R2);
    }

    /**
     * Sets <code>value</code> as the attribute value for R2.
     * @param value value to set the R2
     */
    public void setR2(Number value) {
        setAttributeInternal(R2, value);
    }

    /**
     * Gets the attribute value for R3, using the alias name R3.
     * @return the R3
     */
    public Number getR3() {
        return (Number)getAttributeInternal(R3);
    }

    /**
     * Sets <code>value</code> as the attribute value for R3.
     * @param value value to set the R3
     */
    public void setR3(Number value) {
        setAttributeInternal(R3, value);
    }

    /**
     * Gets the attribute value for R4, using the alias name R4.
     * @return the R4
     */
    public Number getR4() {
        return (Number)getAttributeInternal(R4);
    }

    /**
     * Sets <code>value</code> as the attribute value for R4.
     * @param value value to set the R4
     */
    public void setR4(Number value) {
        setAttributeInternal(R4, value);
    }

    /**
     * Gets the attribute value for R5, using the alias name R5.
     * @return the R5
     */
    public Number getR5() {
        return (Number)getAttributeInternal(R5);
    }

    /**
     * Sets <code>value</code> as the attribute value for R5.
     * @param value value to set the R5
     */
    public void setR5(Number value) {
        setAttributeInternal(R5, value);
    }

    /**
     * Gets the attribute value for R6, using the alias name R6.
     * @return the R6
     */
    public Number getR6() {
        return (Number)getAttributeInternal(R6);
    }

    /**
     * Sets <code>value</code> as the attribute value for R6.
     * @param value value to set the R6
     */
    public void setR6(Number value) {
        setAttributeInternal(R6, value);
    }

    /**
     * Gets the attribute value for R7, using the alias name R7.
     * @return the R7
     */
    public Number getR7() {
        return (Number)getAttributeInternal(R7);
    }

    /**
     * Sets <code>value</code> as the attribute value for R7.
     * @param value value to set the R7
     */
    public void setR7(Number value) {
        setAttributeInternal(R7, value);
    }

    /**
     * Gets the attribute value for R8, using the alias name R8.
     * @return the R8
     */
    public Number getR8() {
        return (Number)getAttributeInternal(R8);
    }

    /**
     * Sets <code>value</code> as the attribute value for R8.
     * @param value value to set the R8
     */
    public void setR8(Number value) {
        setAttributeInternal(R8, value);
    }

    /**
     * Gets the attribute value for R9, using the alias name R9.
     * @return the R9
     */
    public Number getR9() {
        return (Number)getAttributeInternal(R9);
    }

    /**
     * Sets <code>value</code> as the attribute value for R9.
     * @param value value to set the R9
     */
    public void setR9(Number value) {
        setAttributeInternal(R9, value);
    }

    /**
     * Gets the attribute value for R10, using the alias name R10.
     * @return the R10
     */
    public Number getR10() {
        return (Number)getAttributeInternal(R10);
    }

    /**
     * Sets <code>value</code> as the attribute value for R10.
     * @param value value to set the R10
     */
    public void setR10(Number value) {
        setAttributeInternal(R10, value);
    }

    /**
     * Gets the attribute value for R11, using the alias name R11.
     * @return the R11
     */
    public Number getR11() {
        return (Number)getAttributeInternal(R11);
    }

    /**
     * Sets <code>value</code> as the attribute value for R11.
     * @param value value to set the R11
     */
    public void setR11(Number value) {
        setAttributeInternal(R11, value);
    }

    /**
     * Gets the attribute value for R12, using the alias name R12.
     * @return the R12
     */
    public Number getR12() {
        return (Number)getAttributeInternal(R12);
    }

    /**
     * Sets <code>value</code> as the attribute value for R12.
     * @param value value to set the R12
     */
    public void setR12(Number value) {
        setAttributeInternal(R12, value);
    }

    /**
     * Gets the attribute value for R13, using the alias name R13.
     * @return the R13
     */
    public Number getR13() {
        return (Number)getAttributeInternal(R13);
    }

    /**
     * Sets <code>value</code> as the attribute value for R13.
     * @param value value to set the R13
     */
    public void setR13(Number value) {
        setAttributeInternal(R13, value);
    }

    /**
     * Gets the attribute value for SizeInseam, using the alias name SizeInseam.
     * @return the SizeInseam
     */
    public String getSizeInseam() {
        return (String)getAttributeInternal(SIZEINSEAM);
    }

    /**
     * Sets <code>value</code> as the attribute value for SizeInseam.
     * @param value value to set the SizeInseam
     */
    public void setSizeInseam(String value) {
        setAttributeInternal(SIZEINSEAM, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity MnjMfgFinishProdLImpl.
     */
    public MnjMfgFinishProdLImpl getMnjMfgFinishProdL() {
        return (MnjMfgFinishProdLImpl)getAttributeInternal(MNJMFGFINISHPRODL);
    }

    /**
     * Sets <code>value</code> as the associated entity MnjMfgFinishProdLImpl.
     */
    public void setMnjMfgFinishProdL(MnjMfgFinishProdLImpl value) {
        setAttributeInternal(MNJMFGFINISHPRODL, value);
    }


    /**
     * @param detailId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number detailId) {
        return new Key(new Object[]{detailId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_MFG_FINISH_PROD_D_S",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setDetailId(sVal);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Map sessionScope = ADFContext.getCurrent().getSessionScope();   
        String user = (String)sessionScope.get("userId");
        String orgId  =(String)sessionScope.get("orgId");
        String unitName  =(String)sessionScope.get("unitName");
        
        System.out.println("ASSES INS DO DML 1 ------------------>"+user);
        System.out.println("ASSES INS DO DML 2------------------>"+orgId);
        System.out.println("ASSES INS DML 3 ------------------>"+unitName);
        
        if(DML_UPDATE == operation){
                  try {
                      
                      setLastUpdateDate((Date)Date.getCurrentDate()); 
                      setLastUpdatedBy(new oracle.jbo.domain.Number(user));
                  } catch (SQLException f) {
                      System.out.println(f.getMessage());
                  }
              }
              else if (DML_INSERT == operation){
               
                  try {
                      
                      //setHeaderNo(getSrNoString());
                      //setOrgId(new oracle.jbo.domain.Number(orgId));
                      //setAttribute1(unitName);
                      setCreationDate((Date)Date.getCurrentDate());  
                      setCreatedBy(new oracle.jbo.domain.Number(user));
                     
                     
                     
                  } catch (SQLException f) {
                      ;
                  }
              } 
        
        super.doDML(operation, e);
    }
}
