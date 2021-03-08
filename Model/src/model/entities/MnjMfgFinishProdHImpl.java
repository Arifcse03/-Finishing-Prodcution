package model.entities;

import java.sql.SQLException;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
import java.util.Map;
import oracle.adf.share.ADFContext;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 11 20:09:05 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgFinishProdHImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        HeaderId {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getHeaderId();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        HeaderNo {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getHeaderNo();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setHeaderNo((String)value);
            }
        }
        ,
        DocDate {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getDocDate();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setDocDate((Date)value);
            }
        }
        ,
        Remarks {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getRemarks();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setRemarks((String)value);
            }
        }
        ,
        OrgId {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getOrgId();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        CreatedBy {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getCreationDate();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        PostedStatus {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getPostedStatus();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setPostedStatus((String)value);
            }
        }
        ,
        Subinventory {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getSubinventory();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setSubinventory((String)value);
            }
        }
        ,
        Attribute1 {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getAttribute1();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setAttribute1((String)value);
            }
        }
        ,
        Attribute2 {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getAttribute2();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setAttribute2((String)value);
            }
        }
        ,
        TotalAttended {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getTotalAttended();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setTotalAttended((Number)value);
            }
        }
        ,
        TotalProduction {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getTotalProduction();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setTotalProduction((Number)value);
            }
        }
        ,
        OffStandardMin {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getOffStandardMin();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setOffStandardMin((Number)value);
            }
        }
        ,
        Efficiency {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getEfficiency();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setEfficiency((Number)value);
            }
        }
        ,
        TotalProducedMin {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getTotalProducedMin();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setTotalProducedMin((Number)value);
            }
        }
        ,
        MnjMfgFinishProdL {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getMnjMfgFinishProdL();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        MnjMfgFinishProdAddition {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getMnjMfgFinishProdAddition();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        MnjMfgFinishOffStand {
            public Object get(MnjMfgFinishProdHImpl obj) {
                return obj.getMnjMfgFinishOffStand();
            }

            public void put(MnjMfgFinishProdHImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjMfgFinishProdHImpl object);

        public abstract void put(MnjMfgFinishProdHImpl object, Object value);

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


    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int HEADERNO = AttributesEnum.HeaderNo.index();
    public static final int DOCDATE = AttributesEnum.DocDate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int POSTEDSTATUS = AttributesEnum.PostedStatus.index();
    public static final int SUBINVENTORY = AttributesEnum.Subinventory.index();
    public static final int ATTRIBUTE1 = AttributesEnum.Attribute1.index();
    public static final int ATTRIBUTE2 = AttributesEnum.Attribute2.index();
    public static final int TOTALATTENDED = AttributesEnum.TotalAttended.index();
    public static final int TOTALPRODUCTION = AttributesEnum.TotalProduction.index();
    public static final int OFFSTANDARDMIN = AttributesEnum.OffStandardMin.index();
    public static final int EFFICIENCY = AttributesEnum.Efficiency.index();
    public static final int TOTALPRODUCEDMIN = AttributesEnum.TotalProducedMin.index();
    public static final int MNJMFGFINISHPRODL = AttributesEnum.MnjMfgFinishProdL.index();
    public static final int MNJMFGFINISHPRODADDITION = AttributesEnum.MnjMfgFinishProdAddition.index();
    public static final int MNJMFGFINISHOFFSTAND = AttributesEnum.MnjMfgFinishOffStand.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgFinishProdHImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entities.MnjMfgFinishProdH");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for HeaderId, using the alias name HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number)getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeaderId.
     * @param value value to set the HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for HeaderNo, using the alias name HeaderNo.
     * @return the HeaderNo
     */
    public String getHeaderNo() {
        return (String)getAttributeInternal(HEADERNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeaderNo.
     * @param value value to set the HeaderNo
     */
    public void setHeaderNo(String value) {
        setAttributeInternal(HEADERNO, value);
    }

    /**
     * Gets the attribute value for DocDate, using the alias name DocDate.
     * @return the DocDate
     */
    public Date getDocDate() {
        return (Date)getAttributeInternal(DOCDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocDate.
     * @param value value to set the DocDate
     */
    public void setDocDate(Date value) {
        setAttributeInternal(DOCDATE, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the Remarks
     */
    public String getRemarks() {
        return (String)getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for OrgId, using the alias name OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number)getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgId.
     * @param value value to set the OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
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
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for PostedStatus, using the alias name PostedStatus.
     * @return the PostedStatus
     */
    public String getPostedStatus() {
        return (String)getAttributeInternal(POSTEDSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for PostedStatus.
     * @param value value to set the PostedStatus
     */
    public void setPostedStatus(String value) {
        setAttributeInternal(POSTEDSTATUS, value);
    }

    /**
     * Gets the attribute value for Subinventory, using the alias name Subinventory.
     * @return the Subinventory
     */
    public String getSubinventory() {
        return (String)getAttributeInternal(SUBINVENTORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Subinventory.
     * @param value value to set the Subinventory
     */
    public void setSubinventory(String value) {
        setAttributeInternal(SUBINVENTORY, value);
    }

    /**
     * Gets the attribute value for Attribute1, using the alias name Attribute1.
     * @return the Attribute1
     */
    public String getAttribute1() {
        return (String)getAttributeInternal(ATTRIBUTE1);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute1.
     * @param value value to set the Attribute1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**
     * Gets the attribute value for Attribute2, using the alias name Attribute2.
     * @return the Attribute2
     */
    public String getAttribute2() {
        return (String)getAttributeInternal(ATTRIBUTE2);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute2.
     * @param value value to set the Attribute2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**
     * Gets the attribute value for TotalAttended, using the alias name TotalAttended.
     * @return the TotalAttended
     */
    public Number getTotalAttended() {
        return (Number)getAttributeInternal(TOTALATTENDED);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalAttended.
     * @param value value to set the TotalAttended
     */
    public void setTotalAttended(Number value) {
        setAttributeInternal(TOTALATTENDED, value);
    }

    /**
     * Gets the attribute value for TotalProduction, using the alias name TotalProduction.
     * @return the TotalProduction
     */
    public Number getTotalProduction() {
        return (Number)getAttributeInternal(TOTALPRODUCTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalProduction.
     * @param value value to set the TotalProduction
     */
    public void setTotalProduction(Number value) {
        setAttributeInternal(TOTALPRODUCTION, value);
    }

    /**
     * Gets the attribute value for OffStandardMin, using the alias name OffStandardMin.
     * @return the OffStandardMin
     */
    public Number getOffStandardMin() {
        return (Number)getAttributeInternal(OFFSTANDARDMIN);
    }

    /**
     * Sets <code>value</code> as the attribute value for OffStandardMin.
     * @param value value to set the OffStandardMin
     */
    public void setOffStandardMin(Number value) {
        setAttributeInternal(OFFSTANDARDMIN, value);
    }

    /**
     * Gets the attribute value for Efficiency, using the alias name Efficiency.
     * @return the Efficiency
     */
    public Number getEfficiency() {
        return (Number)getAttributeInternal(EFFICIENCY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Efficiency.
     * @param value value to set the Efficiency
     */
    public void setEfficiency(Number value) {
        setAttributeInternal(EFFICIENCY, value);
    }

    /**
     * Gets the attribute value for TotalProducedMin, using the alias name TotalProducedMin.
     * @return the TotalProducedMin
     */
    public Number getTotalProducedMin() {
        return (Number)getAttributeInternal(TOTALPRODUCEDMIN);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalProducedMin.
     * @param value value to set the TotalProducedMin
     */
    public void setTotalProducedMin(Number value) {
        setAttributeInternal(TOTALPRODUCEDMIN, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMnjMfgFinishProdL() {
        return (RowIterator)getAttributeInternal(MNJMFGFINISHPRODL);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMnjMfgFinishProdAddition() {
        return (RowIterator)getAttributeInternal(MNJMFGFINISHPRODADDITION);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMnjMfgFinishOffStand() {
        return (RowIterator)getAttributeInternal(MNJMFGFINISHOFFSTAND);
    }


    /**
     * @param headerId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number headerId) {
        return new Key(new Object[]{headerId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_MFG_FINISH_PROD_H_S",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setHeaderId(sVal);
       // setHeaderNo(getSrNoString());
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
                            setLastUpdatedDate((Date)Date.getCurrentDate()); 
                            setLastUpdatedBy(new oracle.jbo.domain.Number(user));
                        } catch (SQLException f) {
                            System.out.println(f.getMessage());
                        }
                    }
                    else if (DML_INSERT == operation){
                     
                        try {
                            
                            setHeaderNo(getSrNoString());
                            setOrgId(new oracle.jbo.domain.Number(orgId));
                            setAttribute1(unitName);
                            setCreationDate((Date)Date.getCurrentDate());  
                            setCreatedBy(new oracle.jbo.domain.Number(user));
                           
                           
                           
                        } catch (SQLException f) {
                            ;
                        }
                    } 
              
              super.doDML(operation, e);
          }
    
    public String getSrNoString() {
          String srno = null;
          String stmt = "BEGIN :1 := mnj_mfg_doc_no_pkg.finishprod_doc_no; end;";
          java.sql.CallableStatement cs =   getDBTransaction().createCallableStatement(stmt, 1);
          try {
              cs.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
              cs.execute();
              srno = cs.getString(1);
              cs.close();
          } catch (Exception e) {
              e.printStackTrace();
          }
          return srno;
      }
}
