package com.example.administrator.myapplication.Bean;

/**
 * Created by zmy1 on 2017/4/18.
 */

public class SheetLabel {

    /**
     * data : {"fromShopName":"合肥分拨","goodsAmount":5,"goodsName":"配件","id":78992,"sheetNo":"6253170413002838","sheetNoConsign":"","sheetNoShort":"170413002838","storeAmount":5,"toShopName":"太和"}
     * message : 成功
     * statusCode : 200
     * success : true
     */

    private DataBean data;
    private String message;
    private int statusCode;
    private boolean success;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class DataBean {
        /**
         * fromShopName : 合肥分拨
         * goodsAmount : 5
         * goodsName : 配件
         * id : 78992
         * sheetNo : 6253170413002838
         * sheetNoConsign :
         * sheetNoShort : 170413002838
         * storeAmount : 5
         * toShopName : 太和
         */

        private String fromShopName;
        private int goodsAmount;
        private String goodsName;
        private int id;
        private String sheetNo;
        private String sheetNoConsign;
        private String sheetNoShort;
        private int storeAmount;
        private String toShopName;

        public String getFromShopName() {
            return fromShopName;
        }

        public void setFromShopName(String fromShopName) {
            this.fromShopName = fromShopName;
        }

        public int getGoodsAmount() {
            return goodsAmount;
        }

        public void setGoodsAmount(int goodsAmount) {
            this.goodsAmount = goodsAmount;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSheetNo() {
            return sheetNo;
        }

        public void setSheetNo(String sheetNo) {
            this.sheetNo = sheetNo;
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

        public int getStoreAmount() {
            return storeAmount;
        }

        public void setStoreAmount(int storeAmount) {
            this.storeAmount = storeAmount;
        }

        public String getToShopName() {
            return toShopName;
        }

        public void setToShopName(String toShopName) {
            this.toShopName = toShopName;
        }
    }
}
