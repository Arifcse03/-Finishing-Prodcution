package model.client;

import model.common.AppModule;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 12 12:29:06 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleClient extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleClient() {
    }


    public void FillLines() {
        Object _ret = this.riInvokeExportedMethod(this,"FillLines",null,null);
        return;
    }

    public void FillDetails() {
        Object _ret = this.riInvokeExportedMethod(this,"FillDetails",null,null);
        return;
    }

    public String callPost(String headerId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"callPost",new String [] {"java.lang.String"},new Object[] {headerId});
        return (String)_ret;
    }

    public String completion(String headerId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"completion",new String [] {"java.lang.String"},new Object[] {headerId});
        return (String)_ret;
    }

    public void setSessionValues(String orgId, String userId, String respId,
                                 String respAppl) {
        Object _ret =
            this.riInvokeExportedMethod(this,"setSessionValues",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {orgId, userId, respId, respAppl});
        return;
    }

    public int sumtotalProduction() {
        Object _ret =
            this.riInvokeExportedMethod(this,"sumtotalProduction",null,null);
        return ((Integer)_ret).intValue();
    }

    public int sumtotalRejection() {
        Object _ret =
            this.riInvokeExportedMethod(this,"sumtotalRejection",null,null);
        return ((Integer)_ret).intValue();
    }

    public int sumtotalRejectiondetail() {
        Object _ret =
            this.riInvokeExportedMethod(this,"sumtotalRejectiondetail",null,null);
        return ((Integer)_ret).intValue();
    }

    public int sumtotalprodetail() {
        Object _ret =
            this.riInvokeExportedMethod(this,"sumtotalprodetail",null,null);
        return ((Integer)_ret).intValue();
    }

    public String CalculateTotalProductionNewLINE(String headerId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"CalculateTotalProductionNewLINE",new String [] {"java.lang.String"},new Object[] {headerId});
        return (String)_ret;
    }

    public void setRollwhereClause1() {
        Object _ret =
            this.riInvokeExportedMethod(this,"setRollwhereClause1",null,null);
        return;
    }

    public void FillLinesNEW() {
        Object _ret = this.riInvokeExportedMethod(this,"FillLinesNEW",null,null);
        return;
    }

    public void setSizeWherCaluseNew() {
        Object _ret =
            this.riInvokeExportedMethod(this,"setSizeWherCaluseNew",null,null);
        return;
    }

    public void FillLinesNEWTab() {
        Object _ret =
            this.riInvokeExportedMethod(this,"FillLinesNEWTab",null,null);
        return;
    }

    public void selectAllLines(String FlagNEWTab) {
        Object _ret =
            this.riInvokeExportedMethod(this,"selectAllLines",new String [] {"java.lang.String"},new Object[] {FlagNEWTab});
        return;
    }

    public void popupDeselectActionListener() {
        Object _ret =
            this.riInvokeExportedMethod(this,"popupDeselectActionListener",null,null);
        return;
    }
}
