package model.views;

import model.entities.MnjMfgFinishProdDImpl;

import oracle.jbo.AttributeList;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 12 13:19:42 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgFinishProdDViewRowImpl extends ViewRowImpl {
    @Override
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_MFG_FINISH_PROD_D_S",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setDetailId(sVal);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DetailId {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getDetailId();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setDetailId((Number)value);
            }
        }
        ,
        LineId {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getLineId();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        SizeValue {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getSizeValue();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setSizeValue((String)value);
            }
        }
        ,
        SizeQty {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getSizeQty();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setSizeQty((Number)value);
            }
        }
        ,
        ProdQty {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getProdQty();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setProdQty((Number)value);
            }
        }
        ,
        BlncQty {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getBlncQty();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setBlncQty((Number)value);
            }
        }
        ,
        SizeWiseRej {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getSizeWiseRej();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setSizeWiseRej((Number)value);
            }
        }
        ,
        PrevProd {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getPrevProd();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setPrevProd((Number)value);
            }
        }
        ,
        TotalInput {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getTotalInput();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setTotalInput((Number)value);
            }
        }
        ,
        DayProd {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getDayProd();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setDayProd((String)value);
            }
        }
        ,
        TotalProd {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getTotalProd();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setTotalProd((Number)value);
            }
        }
        ,
        TotalRej {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getTotalRej();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setTotalRej((Number)value);
            }
        }
        ,
        DayRejection {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getDayRejection();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setDayRejection((String)value);
            }
        }
        ,
        Inseam {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getInseam();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setInseam((Number)value);
            }
        }
        ,
        R1 {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getR1();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setR1((Number)value);
            }
        }
        ,
        R2 {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getR2();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setR2((Number)value);
            }
        }
        ,
        R3 {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getR3();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setR3((Number)value);
            }
        }
        ,
        R4 {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getR4();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setR4((Number)value);
            }
        }
        ,
        R5 {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getR5();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setR5((Number)value);
            }
        }
        ,
        R6 {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getR6();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setR6((Number)value);
            }
        }
        ,
        R7 {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getR7();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setR7((Number)value);
            }
        }
        ,
        R8 {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getR8();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setR8((Number)value);
            }
        }
        ,
        R9 {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getR9();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setR9((Number)value);
            }
        }
        ,
        R10 {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getR10();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setR10((Number)value);
            }
        }
        ,
        R11 {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getR11();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setR11((Number)value);
            }
        }
        ,
        R12 {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getR12();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setR12((Number)value);
            }
        }
        ,
        R13 {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getR13();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setR13((Number)value);
            }
        }
        ,
        SizeInseam {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getSizeInseam();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setSizeInseam((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(MnjMfgFinishProdDViewRowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(MnjMfgFinishProdDViewRowImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjMfgFinishProdDViewRowImpl object);

        public abstract void put(MnjMfgFinishProdDViewRowImpl object,
                                 Object value);

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
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgFinishProdDViewRowImpl() {
    }

    /**
     * Gets MnjMfgFinishProdD entity object.
     * @return the MnjMfgFinishProdD
     */
    public MnjMfgFinishProdDImpl getMnjMfgFinishProdD() {
        return (MnjMfgFinishProdDImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for DETAIL_ID using the alias name DetailId.
     * @return the DETAIL_ID
     */
    public Number getDetailId() {
        return (Number) getAttributeInternal(DETAILID);
    }

    /**
     * Sets <code>value</code> as attribute value for DETAIL_ID using the alias name DetailId.
     * @param value value to set the DETAIL_ID
     */
    public void setDetailId(Number value) {
        setAttributeInternal(DETAILID, value);
    }

    /**
     * Gets the attribute value for LINE_ID using the alias name LineId.
     * @return the LINE_ID
     */
    public Number getLineId() {
        return (Number) getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for LINE_ID using the alias name LineId.
     * @param value value to set the LINE_ID
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for SIZE_VALUE using the alias name SizeValue.
     * @return the SIZE_VALUE
     */
    public String getSizeValue() {
        return (String) getAttributeInternal(SIZEVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for SIZE_VALUE using the alias name SizeValue.
     * @param value value to set the SIZE_VALUE
     */
    public void setSizeValue(String value) {
        setAttributeInternal(SIZEVALUE, value);
    }

    /**
     * Gets the attribute value for SIZE_QTY using the alias name SizeQty.
     * @return the SIZE_QTY
     */
    public Number getSizeQty() {
        return (Number) getAttributeInternal(SIZEQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for SIZE_QTY using the alias name SizeQty.
     * @param value value to set the SIZE_QTY
     */
    public void setSizeQty(Number value) {
        setAttributeInternal(SIZEQTY, value);
    }

    /**
     * Gets the attribute value for PROD_QTY using the alias name ProdQty.
     * @return the PROD_QTY
     */
    public Number getProdQty() {
        return (Number) getAttributeInternal(PRODQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for PROD_QTY using the alias name ProdQty.
     * @param value value to set the PROD_QTY
     */
    public void setProdQty(Number value) {
        setAttributeInternal(PRODQTY, value);
    }

    /**
     * Gets the attribute value for BLNC_QTY using the alias name BlncQty.
     * @return the BLNC_QTY
     */
    public Number getBlncQty() {
        return (Number) getAttributeInternal(BLNCQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for BLNC_QTY using the alias name BlncQty.
     * @param value value to set the BLNC_QTY
     */
    public void setBlncQty(Number value) {
        setAttributeInternal(BLNCQTY, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for SIZE_WISE_REJ using the alias name SizeWiseRej.
     * @return the SIZE_WISE_REJ
     */
    public Number getSizeWiseRej() {
        return (Number) getAttributeInternal(SIZEWISEREJ);
    }

    /**
     * Sets <code>value</code> as attribute value for SIZE_WISE_REJ using the alias name SizeWiseRej.
     * @param value value to set the SIZE_WISE_REJ
     */
    public void setSizeWiseRej(Number value) {
        setAttributeInternal(SIZEWISEREJ, value);
    }

    /**
     * Gets the attribute value for PREV_PROD using the alias name PrevProd.
     * @return the PREV_PROD
     */
    public Number getPrevProd() {
        return (Number) getAttributeInternal(PREVPROD);
    }

    /**
     * Sets <code>value</code> as attribute value for PREV_PROD using the alias name PrevProd.
     * @param value value to set the PREV_PROD
     */
    public void setPrevProd(Number value) {
        setAttributeInternal(PREVPROD, value);
    }

    /**
     * Gets the attribute value for TOTAL_INPUT using the alias name TotalInput.
     * @return the TOTAL_INPUT
     */
    public Number getTotalInput() {
        return (Number) getAttributeInternal(TOTALINPUT);
    }

    /**
     * Sets <code>value</code> as attribute value for TOTAL_INPUT using the alias name TotalInput.
     * @param value value to set the TOTAL_INPUT
     */
    public void setTotalInput(Number value) {
        setAttributeInternal(TOTALINPUT, value);
    }

    /**
     * Gets the attribute value for DAY_PROD using the alias name DayProd.
     * @return the DAY_PROD
     */
    public String getDayProd() {
        return (String) getAttributeInternal(DAYPROD);
    }

    /**
     * Sets <code>value</code> as attribute value for DAY_PROD using the alias name DayProd.
     * @param value value to set the DAY_PROD
     */
    public void setDayProd(String value) {
        setAttributeInternal(DAYPROD, value);
    }

    /**
     * Gets the attribute value for TOTAL_PROD using the alias name TotalProd.
     * @return the TOTAL_PROD
     */
    public Number getTotalProd() {
        return (Number) getAttributeInternal(TOTALPROD);
    }

    /**
     * Sets <code>value</code> as attribute value for TOTAL_PROD using the alias name TotalProd.
     * @param value value to set the TOTAL_PROD
     */
    public void setTotalProd(Number value) {
        setAttributeInternal(TOTALPROD, value);
    }

    /**
     * Gets the attribute value for TOTAL_REJ using the alias name TotalRej.
     * @return the TOTAL_REJ
     */
    public Number getTotalRej() {
        return (Number) getAttributeInternal(TOTALREJ);
    }

    /**
     * Sets <code>value</code> as attribute value for TOTAL_REJ using the alias name TotalRej.
     * @param value value to set the TOTAL_REJ
     */
    public void setTotalRej(Number value) {
        setAttributeInternal(TOTALREJ, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DayRejection.
     * @return the DayRejection
     */
    public String getDayRejection() {
        return (String) getAttributeInternal(DAYREJECTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DayRejection.
     * @param value value to set the  DayRejection
     */
    public void setDayRejection(String value) {
        setAttributeInternal(DAYREJECTION, value);
    }

    /**
     * Gets the attribute value for INSEAM using the alias name Inseam.
     * @return the INSEAM
     */
    public Number getInseam() {
        return (Number) getAttributeInternal(INSEAM);
    }

    /**
     * Sets <code>value</code> as attribute value for INSEAM using the alias name Inseam.
     * @param value value to set the INSEAM
     */
    public void setInseam(Number value) {
        setAttributeInternal(INSEAM, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for R1 using the alias name R1.
     * @return the R1
     */
    public Number getR1() {
        return (Number) getAttributeInternal(R1);
    }

    /**
     * Sets <code>value</code> as attribute value for R1 using the alias name R1.
     * @param value value to set the R1
     */
    public void setR1(Number value) {
        setAttributeInternal(R1, value);
    }

    /**
     * Gets the attribute value for R2 using the alias name R2.
     * @return the R2
     */
    public Number getR2() {
        return (Number) getAttributeInternal(R2);
    }

    /**
     * Sets <code>value</code> as attribute value for R2 using the alias name R2.
     * @param value value to set the R2
     */
    public void setR2(Number value) {
        setAttributeInternal(R2, value);
    }

    /**
     * Gets the attribute value for R3 using the alias name R3.
     * @return the R3
     */
    public Number getR3() {
        return (Number) getAttributeInternal(R3);
    }

    /**
     * Sets <code>value</code> as attribute value for R3 using the alias name R3.
     * @param value value to set the R3
     */
    public void setR3(Number value) {
        setAttributeInternal(R3, value);
    }

    /**
     * Gets the attribute value for R4 using the alias name R4.
     * @return the R4
     */
    public Number getR4() {
        return (Number) getAttributeInternal(R4);
    }

    /**
     * Sets <code>value</code> as attribute value for R4 using the alias name R4.
     * @param value value to set the R4
     */
    public void setR4(Number value) {
        setAttributeInternal(R4, value);
    }

    /**
     * Gets the attribute value for R5 using the alias name R5.
     * @return the R5
     */
    public Number getR5() {
        return (Number) getAttributeInternal(R5);
    }

    /**
     * Sets <code>value</code> as attribute value for R5 using the alias name R5.
     * @param value value to set the R5
     */
    public void setR5(Number value) {
        setAttributeInternal(R5, value);
    }

    /**
     * Gets the attribute value for R6 using the alias name R6.
     * @return the R6
     */
    public Number getR6() {
        return (Number) getAttributeInternal(R6);
    }

    /**
     * Sets <code>value</code> as attribute value for R6 using the alias name R6.
     * @param value value to set the R6
     */
    public void setR6(Number value) {
        setAttributeInternal(R6, value);
    }

    /**
     * Gets the attribute value for R7 using the alias name R7.
     * @return the R7
     */
    public Number getR7() {
        return (Number) getAttributeInternal(R7);
    }

    /**
     * Sets <code>value</code> as attribute value for R7 using the alias name R7.
     * @param value value to set the R7
     */
    public void setR7(Number value) {
        setAttributeInternal(R7, value);
    }

    /**
     * Gets the attribute value for R8 using the alias name R8.
     * @return the R8
     */
    public Number getR8() {
        return (Number) getAttributeInternal(R8);
    }

    /**
     * Sets <code>value</code> as attribute value for R8 using the alias name R8.
     * @param value value to set the R8
     */
    public void setR8(Number value) {
        setAttributeInternal(R8, value);
    }

    /**
     * Gets the attribute value for R9 using the alias name R9.
     * @return the R9
     */
    public Number getR9() {
        return (Number) getAttributeInternal(R9);
    }

    /**
     * Sets <code>value</code> as attribute value for R9 using the alias name R9.
     * @param value value to set the R9
     */
    public void setR9(Number value) {
        setAttributeInternal(R9, value);
    }

    /**
     * Gets the attribute value for R10 using the alias name R10.
     * @return the R10
     */
    public Number getR10() {
        return (Number) getAttributeInternal(R10);
    }

    /**
     * Sets <code>value</code> as attribute value for R10 using the alias name R10.
     * @param value value to set the R10
     */
    public void setR10(Number value) {
        setAttributeInternal(R10, value);
    }

    /**
     * Gets the attribute value for R11 using the alias name R11.
     * @return the R11
     */
    public Number getR11() {
        return (Number) getAttributeInternal(R11);
    }

    /**
     * Sets <code>value</code> as attribute value for R11 using the alias name R11.
     * @param value value to set the R11
     */
    public void setR11(Number value) {
        setAttributeInternal(R11, value);
    }

    /**
     * Gets the attribute value for R12 using the alias name R12.
     * @return the R12
     */
    public Number getR12() {
        return (Number) getAttributeInternal(R12);
    }

    /**
     * Sets <code>value</code> as attribute value for R12 using the alias name R12.
     * @param value value to set the R12
     */
    public void setR12(Number value) {
        setAttributeInternal(R12, value);
    }

    /**
     * Gets the attribute value for R13 using the alias name R13.
     * @return the R13
     */
    public Number getR13() {
        return (Number) getAttributeInternal(R13);
    }

    /**
     * Sets <code>value</code> as attribute value for R13 using the alias name R13.
     * @param value value to set the R13
     */
    public void setR13(Number value) {
        setAttributeInternal(R13, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SizeInseam.
     * @return the SizeInseam
     */
    public String getSizeInseam() {
        return (String) getAttributeInternal(SIZEINSEAM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SizeInseam.
     * @param value value to set the  SizeInseam
     */
    public void setSizeInseam(String value) {
        setAttributeInternal(SIZEINSEAM, value);
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
}