package com.example.administrator.myapplication.Bean;

import org.xutils.DbManager;
import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;
import org.xutils.ex.DbException;

import java.util.List;

/**
 * Created by zmy1 on 2017/4/13.
 */


@Table(name = "Kucun")
public class DbSheetScan {
    @Column(name = "_id", isId = true, autoGen = true)
    private int id;
    @Column(name = "fromShopName")
    private String fromShopName;
    @Column(name = "goodsAmount")
    private int goodsAmount;
    @Column(name = "goodsName")
    private String goodsName;
    @Column(name = "id")
    private int stockid;
    @Column(name = "sheetNo")
    private String sheetNo;
    @Column(name = "sheetNoConsign")
    private String sheetNoConsign;
    @Column(name = "toShopName")
    private String toShopName;
    @Column(name = "sheetNoShort")
    private String sheetNoShort;
    @Column(name = "storeAmount")
    private int storeAmount;
    @Column(name = "refid")
    private int refid;
    @Column(name = "scantype")
    private int scantype;
    @Column(name = "createDate")
    private String createDate;
    @Column(name = "updateDate")
    private String updateDate;


    public DbSheetScan() {

    }

    public DbSheetScan(String updateDate, String createDate, int scantype, int refid, int storeAmount, String sheetNoShort, String toShopName, String sheetNo, String sheetNoConsign, int stockid, String goodsName, int goodsAmount, String fromShopName) {
        this.updateDate = updateDate;
        this.createDate = createDate;
        this.scantype = scantype;
        this.refid = refid;
        this.storeAmount = storeAmount;
        this.sheetNoShort = sheetNoShort;
        this.toShopName = toShopName;
        this.sheetNo = sheetNo;
        this.sheetNoConsign = sheetNoConsign;
        this.stockid = stockid;
        this.goodsName = goodsName;
        this.goodsAmount = goodsAmount;
        this.fromShopName = fromShopName;
    }

    public List<DbSheetLabelScan> getScanlabel(DbManager db) throws DbException {
        return db.selector(DbSheetLabelScan.class).where("parentId", "=", this.id).findAll();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSheetNoConsign() {
        return sheetNoConsign;
    }

    public void setSheetNoConsign(String sheetNoConsign) {
        this.sheetNoConsign = sheetNoConsign;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getScantype() {
        return scantype;
    }

    public void setScantype(int scantype) {
        this.scantype = scantype;
    }

    public int getRefid() {
        return refid;
    }

    public void setRefid(int refid) {
        this.refid = refid;
    }

    public int getStoreAmount() {
        return storeAmount;
    }

    public void setStoreAmount(int storeAmount) {
        this.storeAmount = storeAmount;
    }

    public String getSheetNoShort() {
        return sheetNoShort;
    }

    public void setSheetNoShort(String sheetNoShort) {
        this.sheetNoShort = sheetNoShort;
    }

    public String getToShopName() {
        return toShopName;
    }

    public void setToShopName(String toShopName) {
        this.toShopName = toShopName;
    }

    public String getSheetNo() {
        return sheetNo;
    }

    public void setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo;
    }

    public int getStockid() {
        return stockid;
    }

    public void setStockid(int stockid) {
        this.stockid = stockid;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(int goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public String getFromShopName() {
        return fromShopName;
    }

    public void setFromShopName(String fromShopName) {
        this.fromShopName = fromShopName;
    }

    @Override
    public String toString() {
        return "DbSheetScan{" +
                "id=" + id +
                ", fromShopName='" + fromShopName + '\'' +
                ", goodsAmount=" + goodsAmount +
                ", goodsName='" + goodsName + '\'' +
                ", stockid=" + stockid +
                ", sheetNo='" + sheetNo + '\'' +
                ", sheetNoConsign='" + sheetNoConsign + '\'' +
                ", toShopName='" + toShopName + '\'' +
                ", sheetNoShort='" + sheetNoShort + '\'' +
                ", storeAmount=" + storeAmount +
                ", refid=" + refid +
                ", scantype=" + scantype +
                ", createDate='" + createDate + '\'' +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }
}
