package com.example.administrator.myapplication.Bean;

import java.util.List;

/**
 * Created by zmy1 on 2017/4/15.
 */

public class SheetScanRecordUpload {

    private String sheetno;
    private List<DbSheetLabelScan> dbSheetLabelScanList;
    private List<ScanInput> scanInputList;

    public String getSheetno() {
        return sheetno;
    }

    public void setSheetno(String sheetno) {
        this.sheetno = sheetno;
    }

    public List<ScanInput> getScanInputList() {
        return scanInputList;
    }

    public void setScanInputList(List<ScanInput> scanInputList) {
        this.scanInputList = scanInputList;
    }

    public List<DbSheetLabelScan> getDbSheetLabelScanList() {
        return dbSheetLabelScanList;
    }

    public void setDbSheetLabelScanList(List<DbSheetLabelScan> dbSheetLabelScanList) {
        this.dbSheetLabelScanList = dbSheetLabelScanList;
    }


}
