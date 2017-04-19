package com.example.administrator.myapplication.Bean;

/**
 * Created by zmy1 on 2017/4/14.
 */

public class Stockbean {
    private String fromshopname;
    private String toshopname;
    private String goodsname;
    private String sheetno;
    private int proamount;

    public int getProamount() {
        return proamount;
    }

    public void setProamount(int proamount) {
        this.proamount = proamount;
    }

    public String getFromshopname() {
        return fromshopname;
    }

    public void setFromshopname(String fromshopname) {
        this.fromshopname = fromshopname;
    }

    public String getSheetno() {
        return sheetno;
    }

    public void setSheetno(String sheetno) {
        this.sheetno = sheetno;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getToshopname() {
        return toshopname;
    }

    public void setToshopname(String toshopname) {
        this.toshopname = toshopname;
    }

    @Override
    public String toString() {
        return "Stockbean{" +
                "fromshopname='" + fromshopname + '\'' +
                ", toshopname='" + toshopname + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", sheetno='" + sheetno + '\'' +
                ", proamount=" + proamount +
                '}';
    }
}
