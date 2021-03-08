package view.backing_bean;

import java.sql.SQLException;

import java.text.DecimalFormat;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpSession;

import model.AppModuleImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;

public class MyBean {
    private RichTable lineTable;
    private RichTable detTable;
    private ViewObject MnjMfgFinishProdDView1;
    private RichInputText headerId;
    private RichInputText totalProduction1st;
    private RichInputText totalRejection1st;
    private RichInputText wip;
    private RichInputText totalProd2nd;
    private RichInputText totalRej2nd;
    private RichOutputText wip2nd;
    private RichInputText wipnew;
    private RichTable sizeTable;
    private RichInputText dayProductionLine;
    private RichInputText dayprodDetail;
    private RichForm formrrefsh;
    private RichTable ietable;
    private RichTable offStandardLine;
    private RichTable selectAllTable;
    private ViewObject OffStandard;
    private RichTable offStandardLineTable;
    private RichInputText totalAttendedMinH;
    private RichInputText totalProductionH;
    private RichInputText offStandardMinH;
    private RichInputText workingHourBasic;
    private RichInputText manpowerBasic;
    private RichInputText workingHourOvertime;
    private RichInputText manpowerOvertime;
    private RichInputText workingHourExtraot1;
    private RichInputText manPowerExtraot1;
    private RichInputText workingHourExtraot2;
    private RichInputText manPowerExtraot2;
    private RichInputText totalProduceMinutes;
    private RichInputListOfValues SAM;
    private RichInputText producedMIN;
    private RichTable fillBpoTABLE;
    private RichTable workingTabTable;

    public MyBean() {
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl");
        ApplicationModule am = dc.getApplicationModule();
        MnjMfgFinishProdDView1 = am.findViewObject("MnjMfgFinishProdDView1");

        BindingContext bindingContext1 = BindingContext.getCurrent();
        DCDataControl dc1 =
            bindingContext1.findDataControl("AppModuleDataControl");
        ApplicationModule am1 = dc1.getApplicationModule();
        OffStandard = am1.findViewObject("FinishOffStandLVO1");


    }
    
    public AppModuleImpl getAppModuleImpl() {
        DCBindingContainer bindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContainer.findDataControl("AppModuleDataControl"); // Name of application module in datacontrolBinding.cpx
       AppModuleImpl appM = (AppModuleImpl)dc.getDataProvider();
        return appM;
    }
    AppModuleImpl am =  getAppModuleImpl();

    public void editDialogListBPo(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {


            OperationBinding operationBinding = executeOperation("FillLines");
            operationBinding.execute();
            AdfFacesContext.getCurrentInstance().addPartialTarget(lineTable);


        }

    }


    public void editPopupCancelListener(PopupCanceledEvent popupCanceledEvent) {

    }


    public void editPopupFetchListener(PopupFetchEvent popupFetchEvent) {
        OperationBinding operationBinding = executeOperation("Commit");
        operationBinding.execute();
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject vo = am.findViewObject("FillBPO1");
        //vo.executeQuery(); //commented by sakibul islam 05-july-2019 for faster execution
        AdfFacesContext.getCurrentInstance().addPartialTarget(lineTable);

    }

    public void editDialogListSize(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {


            OperationBinding operationBinding =
                executeOperation("FillDetails");
            operationBinding.execute();
            AdfFacesContext.getCurrentInstance().addPartialTarget(detTable);


        }

    }


    public void editPopupFetchLisSize(PopupFetchEvent popupFetchEvent) {

        System.out.println("editDialogListSize enter -->");
        OperationBinding operationBinding =
            executeOperation("setRollwhereClause1");

        OperationBinding operationBinding1 =
            executeOperation("popupDeselectActionListener");

        if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {
            System.out.println("Org ka if");
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding2 =
                bindings.getOperationBinding("CreateInsert");
            operationBinding2.execute();
        }

        setoutsublineIs();

        AdfFacesContext.getCurrentInstance().addPartialTarget(sizeTable);
        AdfFacesContext.getCurrentInstance().addPartialTarget(lineTable);
        AdfFacesContext.getCurrentInstance().addPartialTarget(detTable);
        //          System.out.println("after sive commit-->");
        operationBinding.execute();
        operationBinding1.execute();
        //         if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {
        //
        //                      BindingContainer bindings = getBindings();
        //                      OperationBinding operationBinding2 =
        //                          bindings.getOperationBinding("CreateInsert");
        //                      operationBinding2.execute();
        //                  }
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject vo = am.findViewObject("FillSizeVO1");
        vo.executeQuery();
        AdfFacesContext.getCurrentInstance().addPartialTarget(sizeTable);
        AdfFacesContext.getCurrentInstance().addPartialTarget(lineTable);
        AdfFacesContext.getCurrentInstance().addPartialTarget(detTable);

    }


    /*****Generic Method to Get BindingContainer**/
    public BindingContainer getBindingsCont() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    /**
     * Generic Method to execute operation
     * */
    public OperationBinding executeOperation(String operation) {
        OperationBinding createParam =
            getBindingsCont().getOperationBinding(operation);
        return createParam;

    }

    public void setLineTable(RichTable lineTable) {
        this.lineTable = lineTable;
    }

    public RichTable getLineTable() {
        return lineTable;
    }

    public void setDetTable(RichTable detTable) {
        this.detTable = detTable;
    }

    public RichTable getDetTable() {
        return detTable;
    }

    public void rejecDetAction(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        double val = 0.00;
        val = MyMath.numeric3((valueChangeEvent.getNewValue()));
        double rejTotal = getDetValueSum("SizeWiseRej", val);

        setLineValues("DayRej", rejTotal);
        setLineValues("TotalRej", rejTotal);
    }


    public double getDetValueSum(String column, double currentVal) {

        System.out.println("Method called ======================>");
        RowSetIterator it = MnjMfgFinishProdDView1.createRowSetIterator("tt");
        Row currentRow = MnjMfgFinishProdDView1.getCurrentRow();

        double total = 0.0, a = 0.0;
        while (it.hasNext()) {
            Row r = it.next();
            System.out.println("Total vaue initail --->" + total);
            if (r == currentRow) {
                total = total + currentVal;
                System.out.println("Current row loop--- >" + total);
                continue;
            }

            a = MyMath.numeric3(r.getAttribute(column));
            total = total + a;

        }
        it.closeRowSetIterator();

        return total;


    }


    public void setLineValues(String column, double value) {

        oracle.adf.view.rich.component.UIXTable table = getLineTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double CutQty = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
            try {
                selectedRow.setAttribute(column, value);
            } catch (Exception e) {
                ;
            }
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(dayprodDetail);
        AdfFacesContext.getCurrentInstance().addPartialTarget(dayProductionLine);
        AdfFacesContext.getCurrentInstance().addPartialTarget(lineTable);

    }

    public void setHeaderIdS(RichInputText id) {

        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("HeaderIdNEW", id.getValue());
        System.out.println("Session header id-->" + headerId.getValue());
    }

    public void setHeaderId(RichInputText headerId) {
        this.headerId = headerId;
        setHeaderIdS(headerId);
    }

    public RichInputText getHeaderId() {
        return headerId;
    }

    public String completion() {

        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("completion");


        operationBinding.getParamsMap().put("headerId",
                                            getHeaderId().getValue());


        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "Failed!";
        }
        FacesMessage fm = new FacesMessage(message);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        return null;
    }

    public String post() {
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("callPost");


        operationBinding.getParamsMap().put("headerId",
                                            getHeaderId().getValue());


        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "Failed!";
        }
        FacesMessage fm = new FacesMessage(message);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        return null;
    }

    ///////////////////////

    //    public void prodQtyAction(ValueChangeEvent valueChangeEvent) {
    //
    //        double val = 0.00;
    //        try {
    //            val =Double.parseDouble(valueChangeEvent.getNewValue().toString());
    //
    //        } catch (Exception e) {
    //            ;
    //        }
    //
    //double t = getDetValueSum1("DayProd",val);
    //        System.out.println("T Value in method action ----------->"+t);
    //        setLineValues("DayProduction",t);
    //    }
    //////////new////////////

    public void prodQtyAction(ValueChangeEvent valueChangeEvent) {

        double val = 0.00;
        try {
            val =
Double.parseDouble(valueChangeEvent.getNewValue().toString());

        } catch (Exception e) {
            ;
        }

        double t = getDetValueSum1("DayProd", val);
        // double tt = getDetValueSum("TotalInput",val);
        System.out.println("T Value in method action ----------->" + t);
        AdfFacesContext.getCurrentInstance().addPartialTarget(dayprodDetail);
        AdfFacesContext.getCurrentInstance().addPartialTarget(dayProductionLine);
        setLineValues("DayProduction", t);
        Save();

        // setLineValues("TotalInput",tt);

        //        double TotalProduetion = Double.parseDouble((getTotalProduetion().getValue().toString()));
        //        System.out.println("TotalProduetion --->"+TotalProduetion);
        //        double TotRejection = Double.parseDouble((getTotRejection().getValue().toString()));
        //        System.out.println("TotRejection --->"+TotRejection);
        ////        double TotalProduetion = Double.parseDouble((getTotalProduetion().getValue().toString()));
        ////        System.out.println("TotalProduetion --->"+TotalProduetion);
        ////
        //        double Totalinput  = TotalProduetion - TotRejection ;
        //        System.out.println("Tt devided action ----------->"+Totalinput);
        //        setLineValues("Wip",Totalinput);
        //


    }
    //////////////////////

    public void prodQtyAction1(ValueChangeEvent valueChangeEvent) {

        double val = 0.00;
        try {
            val =
Double.parseDouble(valueChangeEvent.getNewValue().toString());

        } catch (Exception e) {
            ;
        }

        double t = getDetValueSum1("DayRejection", val);
        System.out.println("T Value in method action ----------->" + t);
        setLineValues("DayRejection", t);
        save();
    }

    public void prodQtyAction2(ValueChangeEvent valueChangeEvent) {

        double val = 0.00;
        try {
            val =
Double.parseDouble(valueChangeEvent.getNewValue().toString());

        } catch (Exception e) {
            ;
        }

        double t = getDetValueSum("TotalInput", val);
        System.out.println("T Value in method action ----------->" + t);
        setLineValues("TotalInput", t);
    }


    ///////////new sum///////

    public double getDetValueSum1(String column, double currentVal) {

        System.out.println("Method called ======================>");
        RowSetIterator it = MnjMfgFinishProdDView1.createRowSetIterator("tt");
        Row currentRow = MnjMfgFinishProdDView1.getCurrentRow();

        double total = 0.0, a = 0.0;
        while (it.hasNext()) {
            Row r = it.next();
            System.out.println("Total vaue initail --->" + total);
            if (r == currentRow) {
                total = total + currentVal;
                System.out.println("Current row loop--- >" + total);
                continue;
            }

            try {
                a = Double.parseDouble(r.getAttribute(column).toString());
                System.out.println("Row count a ---->" + a);

            } catch (Exception e) {

                continue;
            }

            total = total + a;
            System.out.println("Total in while looop---->" + total);
        }
        it.closeRowSetIterator();
        System.out.println("total return from method " + total);
        return total;


    }

    //////////////////////////////////////
    ////////////////////////


    //    public double getDetValueSum1(String column , double currentVal) {
    //
    //        System.out.println("Method called ======================>");
    //        RowSetIterator it = MnjMfgFinishProdDView1.createRowSetIterator("tt");
    //        Row currentRow = MnjMfgFinishProdDView1.getCurrentRow();
    //
    //        double total = 0.0, a = 0.0;
    //        while (it.hasNext()) {
    //            Row r = it.next();
    //            System.out.println("Total vaue initail --->"+total);
    //            if (r == currentRow) {
    //                total = total + currentVal;
    //                System.out.println("Current row loop--- >"+total);
    //                continue;
    //            }
    //
    //            try {
    //                a = Double.parseDouble(r.getAttribute(column).toString());
    //                System.out.println("Row count a ---->"+a);
    //
    //            } catch (Exception e) {
    //
    //                continue;
    //            }
    //
    //            total = total + a;
    //            System.out.println("Total in while looop---->"+total);
    //        }
    //        it.closeRowSetIterator();
    //        System.out.println("total return from method "+total);
    //        return total;
    //
    //
    //    }


    //////////////////////


    //    public void valueChanger(ValueChangeEvent valueChangeEvent) {
    //        // Add event code here...
    //        double Yds = Double.parseDouble((getTotalProduction1st().getValue().toString()));
    //        double Inches = Double.parseDouble((getTotalRejection1st().getValue().toString()));
    //        double Ydss = Double.parseDouble((getTotalProd2nd().getValue().toString()));
    //        double Inchess = Double.parseDouble((getTotalRej2nd().getValue().toString()));
    //        double ff = 0.0,gg = 0.0, ee = 0.0,  hh = 0.0,  MWM = 0.0, NN =0.0;
    //
    //        ff = Yds - Inches;
    //        ee = Ydss - Inchess ;
    //
    //        System.out.println("ff --->"+ff);
    //        System.out.println("ee --->"+ee);
    //
    //
    ////       functionalarea.setValue(gg);
    ////        AdfFacesContext.getCurrentInstance().addPartialTarget(functionalarea);
    //
    //        try {
    //            wip.setValue(new oracle.jbo.domain.Number(ff));
    //            System.out.println("fill bpo --->"+wip);
    //
    //
    //        } catch (SQLException e)
    //        {
    //
    //        }
    //
    //        try {
    //            wipnew.setValue(new oracle.jbo.domain.Number(ee));
    //            System.out.println("fill size --->"+wipnew);
    //        } catch (Exception e) {
    //            // TODO: Add catch code
    //        }
    //    }
    //


    /////////////////////////

    public void setTotalProduction1st(RichInputText totalProduction1st) {
        this.totalProduction1st = totalProduction1st;
    }

    public RichInputText getTotalProduction1st() {
        return totalProduction1st;
    }

    public void setTotalRejection1st(RichInputText totalRejection1st) {
        this.totalRejection1st = totalRejection1st;
    }

    public RichInputText getTotalRejection1st() {
        return totalRejection1st;
    }

    public void setWip(RichInputText wip) {
        this.wip = wip;
    }

    public RichInputText getWip() {
        return wip;
    }

    public void setTotalProd2nd(RichInputText totalProd2nd) {
        this.totalProd2nd = totalProd2nd;
    }

    public RichInputText getTotalProd2nd() {
        return totalProd2nd;
    }

    public void setTotalRej2nd(RichInputText totalRej2nd) {
        this.totalRej2nd = totalRej2nd;
    }

    public RichInputText getTotalRej2nd() {
        return totalRej2nd;
    }

    public void setWip2nd(RichOutputText wip2nd) {
        this.wip2nd = wip2nd;
    }

    public RichOutputText getWip2nd() {
        return wip2nd;
    }

    public void setWipnew(RichInputText wipnew) {
        this.wipnew = wipnew;
    }

    public RichInputText getWipnew() {
        return wipnew;
    }
    /////////calculation///////////////////
    ///////////Code To Get Total ***********************

    public double getTotalValue() {

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("MnjMfgFinishProdDView1"); //ImpSaleContractDetailEOView1

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double val = 0.0, total = 0.0;
        while (it.hasNext()) {

            Row r = it.next();
            try {
                val =
Double.parseDouble(r.getAttribute("TotalInput").toString());
            } catch (Exception e) {
                ;
            }

            total = total + val;
        } //end of while loop
        it.closeRowSetIterator();
        return total;
    }

    /// Code to Set Total

    public void setLineValueTotal(double val) {

        oracle.adf.view.rich.component.UIXTable table = getLineTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();


            selectedRow.setAttribute("TotalInput", val);


        }

    }
    /////////////////////////////////////
    /////////////////////////////////////

    public double getTotalValueLine() {

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("MnjMfgFinishProdLView1"); //ImpSaleContractDetailEOView1

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double val = 0.0, total = 0.0;
        while (it.hasNext()) {

            Row r = it.next();
            try {
                val =
Double.parseDouble(r.getAttribute("DayProduction").toString());
            } catch (Exception e) {
                ;
            }

            total = total + val;
        } //end of while loop
        it.closeRowSetIterator();
        return total;
    }

    public void setTotalValueLine(double val) {

        oracle.adf.view.rich.component.UIXTable table = getLineTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
            System.out.println("setTotalValueLine --->" + val);
            //total_prod();
            System.out.println("inter total_prod --->");
            selectedRow.setAttribute("TotalProduction", val);

            System.out.println("setTotalValueLine 2 --->" + val);
        }

    }

    ////////////////////////////////////
    /////////////////////////////////////

    public double getTotalRegection() {

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("MnjMfgFinishProdLView1"); //ImpSaleContractDetailEOView1

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double val = 0.0, total = 0.0;
        while (it.hasNext()) {

            Row r = it.next();
            try {
                val =
Double.parseDouble(r.getAttribute("DayRejection").toString());
            } catch (Exception e) {
                ;
            }

            total = total + val;
        } //end of while loop
        it.closeRowSetIterator();
        return total;
    }

    public void setTotalRejectionLine(double val) {

        oracle.adf.view.rich.component.UIXTable table = getLineTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
            System.out.println("setTotalValueLine --->" + val);
            // total_Rejection();
            System.out.println("inter total_prod --->");
            selectedRow.setAttribute("TotalRejection", val);

            System.out.println("setTotalValueLine 2 --->" + val);
        }

    }

    ////////////////////////////////////
    /////////////////////////////////////

    public double getTotalValueDetail() {

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("MnjMfgFinishProdDView1"); //ImpSaleContractDetailEOView1

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double val = 0.0, total = 0.0;
        while (it.hasNext()) {

            Row r = it.next();
            try {
                val = Double.parseDouble(r.getAttribute("DayProd").toString());
            } catch (Exception e) {
                ;
            }

            total = total + val;
        } //end of while loop
        it.closeRowSetIterator();
        return total;
    }

    public void setTotalValueDetail(double val) {

        oracle.adf.view.rich.component.UIXTable table = getDetTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
            System.out.println("setTotalValueLine --->" + val);
            total_prodDetail();
            System.out.println("inter total_prod --->");
            // selectedRow.setAttribute("TotalProduetion",val);

            System.out.println("setTotalValueLine 2 --->" + val);
        }

    }

    ////////////////////////////////////
    /////////////////////////////////////

    public double getTotalValueRejDetail() {

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("MnjMfgFinishProdDView1"); //ImpSaleContractDetailEOView1

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double val = 0.0, total = 0.0;
        while (it.hasNext()) {

            Row r = it.next();
            try {
                val =
Double.parseDouble(r.getAttribute("DayRejection").toString());
            } catch (Exception e) {
                ;
            }

            total = total + val;
        } //end of while loop
        it.closeRowSetIterator();
        return total;
    }

    public void setTotalRejValueDetail(double val) {

        oracle.adf.view.rich.component.UIXTable table = getDetTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
            System.out.println("setTotalValueLine --->" + val);
            total_RejectionDetail();
            System.out.println("inter total_prod --->");
            // selectedRow.setAttribute("TotalProduetion",val);

            System.out.println("setTotalValueLine 2 --->" + val);
        }

    }

    ////////////////////////////////////
    /////////////////////////////////////

    public double getTotalWIP() {

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("MnjMfgFinishProdLView1"); //ImpSaleContractDetailEOView1

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double val = 0.0, total = 0.0, vall = 0.0, valll = 0.0;
        //while (it.hasNext())
        {

            Row r = it.next();
            try {
                val =
Double.parseDouble(r.getAttribute("TotalInput").toString());
                System.out.println("TotalInput value --->" + val);
            } catch (Exception e) {
                ;
            }
            try {
                vall =
Double.parseDouble(r.getAttribute("TotalProduction").toString());
                System.out.println("TotalProduetion value --->" + vall);
            } catch (Exception e) {
                ;
            }
            try {
                valll =
                        Double.parseDouble(r.getAttribute("TotalRejection").toString());
                System.out.println("TotRejection value --->" + valll);
            } catch (Exception e) {
                ;
            }

            total = val - vall - valll;
        } //end of while loop
        it.closeRowSetIterator();
        return total;
    }

    public void setTotalWIP(double total) {

        oracle.adf.view.rich.component.UIXTable table = getLineTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
            System.out.println("setTotalValueLine wip --->" + total);
            // total_prod();
            System.out.println("inter total_prod wip --->");
            selectedRow.setAttribute("Wip", total);

            System.out.println("setTotalValueLine 2  wip--->" + total);
        }

    }

    ////////////////////////////////////
    /////////////////////////////////////

    public double getTotalWIPDetail() {

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("MnjMfgFinishProdDView1"); //ImpSaleContractDetailEOView1

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double val = 0.0, total = 0.0, vall = 0.0, valll = 0.0;
        // while (it.hasNext())
        {

            Row r = it.next();
            try {
                val =
Double.parseDouble(r.getAttribute("TotalInput").toString());
                System.out.println("TotalInput value --->" + val);
            } catch (Exception e) {
                ;
            }
            try {
                vall =
Double.parseDouble(r.getAttribute("TotalProd").toString());
                System.out.println("TotalProduetion value --->" + vall);
            } catch (Exception e) {
                ;
            }
            try {
                valll =
                        Double.parseDouble(r.getAttribute("TotalRej").toString());
                System.out.println("TotRejection value --->" + valll);
            } catch (Exception e) {
                ;
            }

            total = val - vall - valll;


        } //end of while loop


        it.closeRowSetIterator();
        return total;
    }

    public void setTotalWIPDetail(double total) {

        oracle.adf.view.rich.component.UIXTable table = getDetTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
            System.out.println("setTotalValueLine 2nd wip --->" + total);
            // total_prod();
            System.out.println("inter total_prod wip 2nd --->");
            selectedRow.setAttribute("BlncQty", total);

            System.out.println("setTotalValueLine 2  wip--->" + total);
        }

    }

    ////////////////////////////////////


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    /////////////////

    public String total_prod(int loopvar) {
        System.out.println("enter in total_prod -->");
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        //OperationBinding operationBinding = executeOperation("CalculateTotalProductionNewLINE");
        OperationBinding operationBinding =
            bindings.getOperationBinding("CalculateTotalProductionNewLINE");


        //                                                 operationBinding.getParamsMap().put("headerId",headerId.getValue().toString());
        //                                                                                     //getHeaderId().getValue());
        operationBinding.getParamsMap().put("headerId",
                                            getHeaderId().getValue());
        System.out.println("Header id -->" + headerId.getValue().toString());
        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
        }

        if (loopvar == 1) {
            Object methodReturnValue = operationBinding.getResult();
            String message = null;
            if (methodReturnValue != null)


            {
                message = methodReturnValue.toString();
            } else

            {
                message = "Record has been Saved Successfully!";
                System.out.println("if errors 3-->" + message);
            }

            if (message.contains("OK") == false) {
                System.out.println("if errors 4-->" + message);
                FacesMessage fm = new FacesMessage(message);
                fm.setSeverity(FacesMessage.SEVERITY_INFO);
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, fm);
                System.out.println("if errors 4-->");
            }

        }
        return null;
    }
    ////////////////

    public String Save() {
        efficient_cal();
        
        ViewObject HeadVO=am.getMnjMfgFinishProdHView1();
        for (int a = 0; a <= 1; a++) {
            save();
            double x = getTotalProduction();
            System.out.println("Level 1 BEAN  " + x);
            System.out.println("Level 1 BEAN");
            HeadVO.getCurrentRow().setAttribute("TotalProduction", x);
            
//            try {
//                totalProductionH.setValue(new oracle.jbo.domain.Number(x));
//            } catch (SQLException e) {
//            }
//            //           Save();
            double xx = gettotalStandardMinutesHeader();
            try {
                offStandardMinH.setValue(new oracle.jbo.domain.Number(xx));
            } catch (SQLException e) {
            }
            //           Save();
            double xxx = gettotalAttendedMinuts();
            // samStitch.setValue(getSAMTotalQty());
            try {
                totalAttendedMinH.setValue(new oracle.jbo.domain.Number(xxx));
            } catch (SQLException e) {
            }
            total_prod(a);
            save();
        }
        total_produced_min();
        save();
        return null;
    }


    public void save() {
    
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        
        
       
        
    }

    public void total_Rejection() {

        System.out.println("Charge Detail ID-------->");
        OperationBinding operationBinding =
            executeOperation("sumtotalRejection");
        System.out.println("Charge Detail ID 2-------->");
        // operationBinding.getParamsMap().put("ChrgDetId",557);
        operationBinding.execute();

    }

    public void total_prodDetail() {

        System.out.println("Charge Detail ID-------->");
        OperationBinding operationBinding =
            executeOperation("sumtotalprodetail");
        System.out.println("Charge Detail ID 2-------->");
        // operationBinding.getParamsMap().put("ChrgDetId",557);
        operationBinding.execute();

    }

    public void total_RejectionDetail() {

        System.out.println("Charge Detail ID-------->");
        OperationBinding operationBinding =
            executeOperation("sumtotalRejectiondetail");
        System.out.println("Charge Detail ID 2-------->");
        // operationBinding.getParamsMap().put("ChrgDetId",557);
        operationBinding.execute();

    }

    public String Delete() {
        //setTotalValueLine (getTotalValueLine());
        //////////////////////////////////////////
        //        double t = getDetValueSum1("DayProd",val);
        //        System.out.println("T Value in method action ----------->"+t);
        //        setLineValues("DayProduction",t);

        //////////////////////////////////
        double val = 0.00;
        double t = getDetValueSum1("DayProd", val);
        // double tt = getDetValueSum("TotalInput",val);
        System.out.println("T Value in method action ----------->" + t);
        setLineValues("DayProduction", t);
        //////////////////////////////////////////////////
        //        double t = getDetValueSum1("DayRejection",val);
        //        System.out.println("T Value in method action ----------->"+t);
        //        setLineValues("DayRejection",t);
        //////////////////////////////////////
        double vall = 0.00;
        double ttt = getDetValueSum1("DayRejection", vall);
        System.out.println("T Value in method action ----------->" + t);
        setLineValues("DayRejection", ttt);
        //        System.out.println("enter in delet ---->");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Delete1");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            // AdfFacesContext.getCurrentInstance().addPartialTarget(samFinish);
            AdfFacesContext.getCurrentInstance().addPartialTarget(lineTable);
            System.out.println("enter in delet 2 ---->");
            Save();
            System.out.println("enter in delet 3---->");
            //AdfFacesContext.getCurrentInstance().addPartialTarget(samFinish);
            AdfFacesContext.getCurrentInstance().addPartialTarget(detTable);
            AdfFacesContext.getCurrentInstance().addPartialTarget(formrrefsh);
            return null;
        }
        Save();
        return null;
    }

    public void setoutsublineIs() {

        oracle.adf.view.rich.component.UIXTable table = getLineTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        int vall = 0;

        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();

            System.out.println("LineId 1 ---->");

            vall =
Integer.parseInt(selectedRow.getAttribute("LineId").toString());

            System.out.println("LineId 2 get value ---->" + vall);
        }
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("LineIdNew", vall);
        System.out.println("LineId 2 set value ---->" + vall);


    }


    public void setSizeTable(RichTable sizeTable) {
        this.sizeTable = sizeTable;
    }

    public RichTable getSizeTable() {
        return sizeTable;
    }


    public void setDayProductionLine(RichInputText dayProductionLine) {
        this.dayProductionLine = dayProductionLine;
    }

    public RichInputText getDayProductionLine() {
        return dayProductionLine;
    }

    public void setDayprodDetail(RichInputText dayprodDetail) {
        this.dayprodDetail = dayprodDetail;
    }

    public RichInputText getDayprodDetail() {
        return dayprodDetail;
    }

    public void setFormrrefsh(RichForm formrrefsh) {
        this.formrrefsh = formrrefsh;
    }

    public RichForm getFormrrefsh() {
        return formrrefsh;
    }


    ////////////////////////////////////////new popup////////////////

    public void editPopupFetchNEW(PopupFetchEvent popupFetchEvent) {
        System.out.println("size inter-->");
        OperationBinding operationBinding = executeOperation("Commit");
        System.out.println("after sive commit NEW-->");
        OperationBinding operationBinding1 =
            executeOperation("setSizeWherCaluseNew");
        operationBinding1.execute();
        if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {

            BindingContainer bindings = getBindings();
            OperationBinding operationBinding2 =
                bindings.getOperationBinding("CreateInsert");
            operationBinding2.execute();
        }
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject vo = am.findViewObject("AdditionPOPVO1");
        vo.executeQuery();
    }

    public void editDialogListenerNEW(DialogEvent dialogEvent) {

        System.out.println("editDialogListener enter ----------->");
        if (dialogEvent.getOutcome().name().equals("ok")) {

            BindingContext bctx = BindingContext.getCurrent();
            BindingContainer bindings = bctx.getCurrentBindingsEntry();
            System.out.println("editDialogListener enter AGAIN ----------->");
            OperationBinding operationBinding =
                bindings.getOperationBinding("FillLinesNEW");
            //invoke method
            operationBinding.execute();
            System.out.println("editDialogListener enter 2 ----------->");
            BindingContext bindingContext = BindingContext.getCurrent();
            DCDataControl dc =
                bindingContext.findDataControl("AppModuleDataControl"); //
            ApplicationModule am = dc.getApplicationModule();
            ViewObject vo = am.findViewObject("AdditionVO1");
            vo.executeQuery();
            System.out.println("editDialogListener enter 3----------->");
            AdfFacesContext.getCurrentInstance().addPartialTarget(ietable);
        }
    }


    /////////////////////////////////////////////////////////////////////////////////////////


    public void setIetable(RichTable ietable) {
        this.ietable = ietable;
    }

    public RichTable getIetable() {
        return ietable;
    }

    ////////////////////////////////////////new popup another tab////////////////

    public void editPopupFetchNEWTab(PopupFetchEvent popupFetchEvent) {
        System.out.println("size inter-->");
        OperationBinding operationBinding = executeOperation("Commit");
        System.out.println("after sive commit NEW-->");
        if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding2 =
                bindings.getOperationBinding("CreateInsert");
            operationBinding2.execute();
        }
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject vo = am.findViewObject("CodeDesreptionVO1");
        vo.executeQuery();
    }

    public void editDialogListenerNEWTab(DialogEvent dialogEvent) {
        System.out.println("enter editDialogListShade-------------->");
        if (dialogEvent.getOutcome().name().equals("ok")) {


            OperationBinding operationBinding =
                executeOperation("FillLinesNEWTab");
            operationBinding.execute();
            System.out.println("editDialogListener enter 2 ----------->");
            //                          BindingContext bindingContext = BindingContext.getCurrent();
            //                           DCDataControl dc =bindingContext.findDataControl("InquiryInfoAMDataControl"); //
            //                           ApplicationModule am = dc.getApplicationModule();
            //                           ViewObject vo =am.findViewObject("OffStandardLineVO1");
            //                           vo.executeQuery();
            AdfFacesContext.getCurrentInstance().addPartialTarget(offStandardLine);


        }

    }


    public void setOffStandardLine(RichTable offStandardLine) {
        this.offStandardLine = offStandardLine;
    }

    public RichTable getOffStandardLine() {
        return offStandardLine;
    }

    /////////////////////

    public void SelectAll(ActionEvent actionEvent) {
        System.out.println("SelectAll");
        // Add event code here...
        OperationBinding operationBinding = executeOperation("selectAllLines");
        operationBinding.getParamsMap().put("FlagNEWTab", "Y");
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(selectAllTable);
        System.out.println("selectAllTable");
    }

    public void DeSelectAll(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding = executeOperation("selectAllLines");
        operationBinding.getParamsMap().put("FlagNEWTab", "N");
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(selectAllTable);
    }

    ////////////////////////////////////////


    public void setSelectAllTable(RichTable selectAllTable) {
        this.selectAllTable = selectAllTable;
    }

    public RichTable getSelectAllTable() {
        return selectAllTable;
    }

    //////////////////////////////////////////////////////////

    public void setLineValuesOffStandard(String column, double value) {
        System.out.println("enter in setLineValuesOffStandard---->");
        oracle.adf.view.rich.component.UIXTable table =
            getOffStandardLineTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double CutQty = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
            try {
                selectedRow.setAttribute(column, value);
                System.out.println("setLineValuesOffStandard bean usman---->" +
                                   value);
            } catch (Exception e) {
                ;
            }
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(offStandardLineTable);

    }

    public void prodQtyActionOffStandard(ValueChangeEvent valueChangeEvent) {
        System.out.println("enter in ValueChangeEvent---->");

        double val = 0.00;
        try {
            val =
Double.parseDouble(valueChangeEvent.getNewValue().toString());

        } catch (Exception e) {
            ;
        }

        double t = getDetValueSumOffStandard("TotalStandad", val);
        System.out.println("T Value in method action ----------->" + t);
        setLineValuesOffStandard("TotalStandad", t);
    }

    public double getDetValueSumOffStandard(String column, double currentVal) {

        System.out.println("Method called ======================>");
        RowSetIterator it = OffStandard.createRowSetIterator("tt");
        Row currentRow = OffStandard.getCurrentRow();

        double total = 0.0, a = 0.0;
        while (it.hasNext()) {
            Row r = it.next();
            System.out.println("Total vaue initail --->" + total);
            if (r == currentRow) {
                total = total + currentVal;
                System.out.println("Current row loop--- >" + total);
                continue;
            }

            a = MyMath.numeric3(r.getAttribute(column));
            total = total + a;

        }
        it.closeRowSetIterator();

        return total;


    }

    //////////////////////////////////////////////////////////

    public void setOffStandardLineTable(RichTable offStandardLineTable) {
        this.offStandardLineTable = offStandardLineTable;
    }

    public RichTable getOffStandardLineTable() {
        return offStandardLineTable;
    }

    public void setTotalAttendedMinH(RichInputText totalAttendedMinH) {
        this.totalAttendedMinH = totalAttendedMinH;
    }

    public RichInputText getTotalAttendedMinH() {
        return totalAttendedMinH;
    }

    public void setTotalProductionH(RichInputText totalProductionH) {
        this.totalProductionH = totalProductionH;
    }

    public RichInputText getTotalProductionH() {
        return totalProductionH;
    }

    public void setOffStandardMinH(RichInputText offStandardMinH) {
        this.offStandardMinH = offStandardMinH;
    }

    public RichInputText getOffStandardMinH() {
        return offStandardMinH;
    }

    public double getTotalProduction() {

        System.out.println("getTotalProduction Level 1");
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("MnjMfgFinishProdLView1"); //ImpSaleContractDetailEOView1

        System.out.println("getTotalProduction Level 2");

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double val = 0.00, total = 0.00;
        while (it.hasNext()) {

            Row r = it.next();
            try {
                val =
Double.parseDouble(r.getAttribute("DayProduction").toString());
            } catch (Exception e) {
                ;
            }

            total = total + val;
        } //end of while loop
        it.closeRowSetIterator();
        //return roundTo2(total);
        System.out.println("getSAMTotalQty Level 3 ---->" + total);
        //AdfFacesContext.getCurrentInstance().addPartialTarget(samStitch);
        return total;
    }
    ///////////////////

    public double gettotalStandardMinutesHeader() {

        System.out.println("getTotalProduction Level 1");
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("FinishOffStandVO1"); //ImpSaleContractDetailEOView1

        System.out.println("getTotalProduction Level 2");

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double val = 0.00, total = 0.00;
        while (it.hasNext()) {

            Row r = it.next();
            try {
                val =
Double.parseDouble(r.getAttribute("TotalStandad").toString());
            } catch (Exception e) {
                ;
            }

            total = total + val;
        } //end of while loop
        it.closeRowSetIterator();
        //return roundTo2(total);
        System.out.println("getSAMTotalQty Level 3 ---->" + total);
        //AdfFacesContext.getCurrentInstance().addPartialTarget(samStitch);
        return total;
    }
    ///////////////////////////////////////////////////////////

    public double gettotalAttendedMinuts() {

        System.out.println("getTotalProduction Level 1");
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("AdditionVO1"); //ImpSaleContractDetailEOView1

        System.out.println("getTotalProduction Level 2");

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double val = 0.00, total = 0.00;
        while (it.hasNext()) {

            Row r = it.next();
            try {
                val = Double.parseDouble(r.getAttribute("BuyerId").toString());
            } catch (Exception e) {
                ;
            }

            total = total + val;
        } //end of while loop
        it.closeRowSetIterator();
        //return roundTo2(total);
        System.out.println("getSAMTotalQty Level 3 ---->" + total);
        //AdfFacesContext.getCurrentInstance().addPartialTarget(samStitch);
        return total;
    }
    ///////////////////////////////////////////////////////////


    public void setWorkingHourBasic(RichInputText workingHourBasic) {
        this.workingHourBasic = workingHourBasic;
    }

    public RichInputText getWorkingHourBasic() {
        return workingHourBasic;
    }

    public void setManpowerBasic(RichInputText manpowerBasic) {
        this.manpowerBasic = manpowerBasic;
    }

    public RichInputText getManpowerBasic() {
        return manpowerBasic;
    }

    public void setWorkingHourOvertime(RichInputText workingHourOvertime) {
        this.workingHourOvertime = workingHourOvertime;
    }

    public RichInputText getWorkingHourOvertime() {
        return workingHourOvertime;
    }

    public void setManpowerOvertime(RichInputText manpowerOvertime) {
        this.manpowerOvertime = manpowerOvertime;
    }

    public RichInputText getManpowerOvertime() {
        return manpowerOvertime;
    }

    public void setWorkingHourExtraot1(RichInputText workingHourExtraot1) {
        this.workingHourExtraot1 = workingHourExtraot1;
    }

    public RichInputText getWorkingHourExtraot1() {
        return workingHourExtraot1;
    }

    public void setManPowerExtraot1(RichInputText manPowerExtraot1) {
        this.manPowerExtraot1 = manPowerExtraot1;
    }

    public RichInputText getManPowerExtraot1() {
        return manPowerExtraot1;
    }

    public void setWorkingHourExtraot2(RichInputText workingHourExtraot2) {
        this.workingHourExtraot2 = workingHourExtraot2;
    }

    public RichInputText getWorkingHourExtraot2() {
        return workingHourExtraot2;
    }

    public void setManPowerExtraot2(RichInputText manPowerExtraot2) {
        this.manPowerExtraot2 = manPowerExtraot2;
    }

    public RichInputText getManPowerExtraot2() {
        return manPowerExtraot2;
    }

    public void setTotalProduceMinutes(RichInputText totalProduceMinutes) {
        this.totalProduceMinutes = totalProduceMinutes;
    }

    public RichInputText getTotalProduceMinutes() {
        return totalProduceMinutes;
    }

    public void valueChanger(ValueChangeEvent valueChangeEvent) {
        System.out.println("valueChanger Enter--->");
        // Add event code here...
        double WorkingHourBasic =
            Double.parseDouble((getWorkingHourBasic().getValue().toString()));
        System.out.println("WorkingHourBasic--->" + WorkingHourBasic);
        double ManpowerBasic =
            Double.parseDouble((getManpowerBasic().getValue().toString()));
        System.out.println("ManpowerBasic--->" + ManpowerBasic);
        double WorkingHourOvertime =
            Double.parseDouble((getWorkingHourOvertime().getValue().toString()));
        System.out.println("WorkingHourOvertime--->" + WorkingHourOvertime);
        double ManpowerOvertime =
            Double.parseDouble((getManpowerOvertime().getValue().toString()));
        System.out.println("ManpowerOvertime--->" + ManpowerOvertime);
        double WorkingHourExtraot1 =
            Double.parseDouble((getWorkingHourExtraot1().getValue().toString()));
        System.out.println("WorkingHourExtraot1--->" + WorkingHourExtraot1);
        double ManPowerExtraot1 =
            Double.parseDouble((getManPowerExtraot1().getValue().toString()));
        System.out.println("ManPowerExtraot1--->" + ManPowerExtraot1);
        double WorkingHourExtraot2 =
            Double.parseDouble((getWorkingHourExtraot2().getValue().toString()));
        System.out.println("WorkingHourExtraot2--->" + WorkingHourExtraot2);
        double ManPowerExtraot2 =
            Double.parseDouble((getManPowerExtraot2().getValue().toString()));
        System.out.println("ManPowerExtraot2--->" + ManPowerExtraot2);

        double Basic = 0.0, OverTime = 0.0, ExtraOverTime1 =
            0.0, ExtraOverTime2 = 0.0, ADD = 0.0, NN = 0.0, Add_Minutes = 0.0;

        Basic = WorkingHourBasic * ManpowerBasic;
        System.out.println("Basic Multiply--->" + Basic);

        OverTime = WorkingHourOvertime * ManpowerOvertime;

        System.out.println("OverTime Multiply--->" + OverTime);

        ExtraOverTime1 = WorkingHourExtraot1 * ManPowerExtraot1;
        System.out.println("ExtraOverTime1 Multiply--->" + ExtraOverTime1);

        ExtraOverTime2 = WorkingHourExtraot2 * ManPowerExtraot2;
        System.out.println("ExtraOverTime2 Multiply--->" + ExtraOverTime2);


        ADD = (Basic + OverTime + ExtraOverTime1 + ExtraOverTime2);
        Add_Minutes = ADD * 60;
        System.out.println("ADD all values--->" + Add_Minutes);

        // totalProduceMinutes.setValue(ADD);
        try {
            totalProduceMinutes.setValue(new oracle.jbo.domain.Number(Add_Minutes));
        } catch (SQLException e) {

        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(totalProduceMinutes);
    }


    public String Calculation() {
        Save();
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        return null;
    }

    public void valueChangeCal(ValueChangeEvent valueChangeEvent) {
             
        double SamValue = Double.parseDouble((getSAM().getValue().toString()));  
        System.out.println("....................................................sam"+SamValue);
        double dayproduction=0.00;
        try{
             dayproduction = Double.parseDouble((getDayProductionLine().getValue().toString()));
        }
        catch(Exception e) {
            dayproduction=0.00;
        }
        double produced=0.0;
        produced =( SamValue*dayproduction);
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.println("....................................................promin"+produced);
        ViewObject lineView=am.getMnjMfgFinishProdLView1();
        String pro=df.format(produced);
       produced=  Double.parseDouble(pro);
       lineView.getCurrentRow().setAttribute("ProducedMin",produced);
        AdfFacesContext.getCurrentInstance().addPartialTarget(producedMIN);
        // Add event code here...
    }

    public void setSAM(RichInputListOfValues SAM) {
        this.SAM = SAM;
    }

    public RichInputListOfValues getSAM() {
        return SAM;
    }

    public void setProducedMIN(RichInputText producedMIN) {
        this.producedMIN = producedMIN;
    }

    public RichInputText getProducedMIN() {
        return producedMIN;
    }

    private void efficient_cal() {
        ViewObject headerVO=am.getMnjMfgFinishProdHView1();
        ViewObject lineVO=am.getMnjMfgFinishProdLView1();
        lineVO.setRangeSize(500);
        double total_totalAttendMIN=0.0;
        double efficiency=0.0;
        double producedmin=0.0;
        double totalProducedMin=0.0;
        DecimalFormat df = new DecimalFormat("###.##");
        
        Row[] r =lineVO.getAllRowsInRange();
        System.out.println("................lineVO...................."+r.length);
        for (Row row : r) {
           
            
            try {
               producedmin =Double.parseDouble(row.getAttribute("ProducedMin").toString());
            } catch (Exception e) {
                 producedmin  = 0.0;
            }
            totalProducedMin=totalProducedMin+ producedmin;
        }
        String totalproMin=df.format(totalProducedMin);
        
        totalProducedMin=Double.parseDouble(totalproMin);
        try{
            total_totalAttendMIN= Double.parseDouble(headerVO.getCurrentRow().getAttribute("TotalAttended").toString());
        }catch(Exception e) {
            total_totalAttendMIN=0.0;
        }
      
        
        if(total_totalAttendMIN==0) {
            efficiency=0.0;
        }
        else {
            efficiency=(totalProducedMin/total_totalAttendMIN)*100;
            String ef=df.format( efficiency);
            efficiency=Double.parseDouble(ef);
        }
        headerVO.getCurrentRow().setAttribute("Efficiency", efficiency);
        headerVO.getCurrentRow().setAttribute("TotalProducedMin", totalProducedMin);
        
    
    }

    private void total_produced_min() {
        ViewObject LineView = am.getMnjMfgFinishProdLView1();
        Row[] r =LineView.getAllRowsInRange();
        DecimalFormat df = new DecimalFormat("###.##");
        for (Row row : r) {
            Double Sam=0.00;
            Double DayProduc=0.00;
            try{
                 Sam = Double.parseDouble(row.getAttribute("SamValue").toString());
            }
            catch(Exception e){
                Sam=0.00;
            }
           
            System.out.println("................SAM =.................... "+Sam);
            
            try{
                  DayProduc = Double.parseDouble(row.getAttribute("DayProduction").toString());
            }
            catch(Exception e) {
                DayProduc=0.00;
            }
           
            System.out.println("................DayProduc =.................... "+DayProduc);
            Double total_proMin=Sam*DayProduc;
            
            
            String totalprodmin=df.format(total_proMin);
            total_proMin=Double.parseDouble(totalprodmin);
            row.setAttribute("ProducedMin", total_proMin);
            System.out.println("................ total; DayProduc =.................... "+total_proMin);
            
            
        }
        
        
        
    }

    public void select_ALL(ActionEvent actionEvent) {
        // Add event code here...
        ViewObject fillbopSelectView = am.getFillBPO1();
        Row[] r =fillbopSelectView.getAllRowsInRange();
       // DecimalFormat df = new DecimalFormat("###.##");
        for (Row row : r) {
            row.setAttribute("Flag", "Y");
        } 
        AdfFacesContext.getCurrentInstance().addPartialTarget(fillBpoTABLE);
    }

    public void De_Select_ALL(ActionEvent actionEvent) {
        // Add event code here...
        ViewObject fillbopSelectView = am.getFillBPO1();
        Row[] r =fillbopSelectView.getAllRowsInRange();
        // DecimalFormat df = new DecimalFormat("###.##");
        for (Row row : r) {
            row.setAttribute("Flag", "N");
        } 
        AdfFacesContext.getCurrentInstance().addPartialTarget(fillBpoTABLE);
    }

    public void setFillBpoTABLE(RichTable fillBpoTABLE) {
        this.fillBpoTABLE = fillBpoTABLE;
    }

    public RichTable getFillBpoTABLE() {
        return fillBpoTABLE;
    }

    public void selectAllWorkingTab(ActionEvent actionEvent) {
        // Add event code here...
        ViewObject fillWorkingTabSelectView = am.getAdditionPOPVO1();
        Row[] r =fillWorkingTabSelectView.getAllRowsInRange();
        // DecimalFormat df = new DecimalFormat("###.##");
        for (Row row : r) {
            row.setAttribute("FlagNEW", "Y");
        } 
        AdfFacesContext.getCurrentInstance().addPartialTarget(workingTabTable);
    }

    public void deSelectAllWorkingTab(ActionEvent actionEvent) {
        // Add event code here...
        ViewObject fillWorkingTabDeSelectView =am.getAdditionPOPVO1();
        Row[] r =fillWorkingTabDeSelectView.getAllRowsInRange();
        // DecimalFormat df = new DecimalFormat("###.##");
        for (Row row : r) {
            row.setAttribute("FlagNEW", "N");
        } 
        AdfFacesContext.getCurrentInstance().addPartialTarget(workingTabTable);
    }

    public void setWorkingTabTable(RichTable workingTabTable) {
        this.workingTabTable = workingTabTable;
    }

    public RichTable getWorkingTabTable() {
        return workingTabTable;
    }
}
