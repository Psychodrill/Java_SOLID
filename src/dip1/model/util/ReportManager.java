package dip1.model.util;

import java.util.List;

import dip1.model.ReportItem;

public class ReportManager {
    Reportable reportable;

    public ReportManager(Reportable reportable){
        this.reportable=reportable;
    }
    public void output(List<ReportItem> items){
        reportable.output(null);
    }
}
