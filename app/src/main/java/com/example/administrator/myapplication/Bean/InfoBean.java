package com.example.administrator.myapplication.Bean;

/**
 * Created by zmy1 on 2017/4/11.
 */

public class InfoBean {

    private Long loadShiftId;       //装车班次id
    private Long loadShopId;        //装车网点id
    private Long nextShopId;        //下一站网点id
    private String sheetNo;         //运单号
    private String sheetNoShort;    //短运单号
    private String sheetNoConsign;  //三方单号
    private String goodsName;       //货物名称
    private Long fromShopId;        //发货网点
    private Long toShopId;          //到货网点
    private String beginTime;
    private String endTime;
    private Integer pageNo;
    private Integer pageSize;
    private Boolean force;          //是否强制

    public Long getLoadShiftId() {
        return loadShiftId;
    }

    public void setLoadShiftId(Long loadShiftId) {
        this.loadShiftId = loadShiftId;
    }

    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public Long getToShopId() {
        return toShopId;
    }

    public void setToShopId(Long toShopId) {
        this.toShopId = toShopId;
    }

    public Long getFromShopId() {
        return fromShopId;
    }

    public void setFromShopId(Long fromShopId) {
        this.fromShopId = fromShopId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSheetNoConsign() {
        return sheetNoConsign;
    }

    public void setSheetNoConsign(String sheetNoConsign) {
        this.sheetNoConsign = sheetNoConsign;
    }

    public String getSheetNoShort() {
        return sheetNoShort;
    }

    public void setSheetNoShort(String sheetNoShort) {
        this.sheetNoShort = sheetNoShort;
    }

    public String getSheetNo() {
        return sheetNo;
    }

    public void setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo;
    }

    public Long getNextShopId() {
        return nextShopId;
    }

    public void setNextShopId(Long nextShopId) {
        this.nextShopId = nextShopId;
    }

    public Long getLoadShopId() {
        return loadShopId;
    }

    public void setLoadShopId(Long loadShopId) {
        this.loadShopId = loadShopId;
    }
}
