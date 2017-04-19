package com.example.administrator.myapplication.Bean;

import java.util.List;

/**
 * Created by zmy1 on 2017/4/12.
 */

public class Entruck {

    /**
     * data : {"total":3,"totalSheetAmount":3,"totalStoreAmount":10,"pageNo":1,"pageSize":1000,"lastDownloadDate":"2017-04-12 10:09:57","totalGoodsAmount":10,"rows":[{"fromShopName":"合肥分拨","goodsAmount":2,"goodsName":"配件","id":78748,"sheetNo":"6253170331000348","sheetNoConsign":"","sheetNoShort":"170331000348","storeAmount":2,"toShopName":"太和"},{"fromShopName":"合肥分拨","goodsAmount":4,"goodsName":"配件","id":78747,"sheetNo":"6253170331000347","sheetNoConsign":"","sheetNoShort":"170331000347","storeAmount":4,"toShopName":"太和"},{"fromShopName":"合肥分拨","goodsAmount":4,"goodsName":"配件","id":78739,"sheetNo":"6253170331000339","sheetNoConsign":"","sheetNoShort":"170331000339","storeAmount":4,"toShopName":"太和"}]}
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
         * total : 3
         * totalSheetAmount : 3   总票数
         * totalStoreAmount : 10  库存
         * pageNo : 1
         * pageSize : 1000
         * lastDownloadDate : 2017-04-12 10:09:57
         * totalGoodsAmount : 10   件数
         * rows : [{"fromShopName":"合肥分拨","goodsAmount":2,"goodsName":"配件","id":78748,"sheetNo":"6253170331000348","sheetNoConsign":"","sheetNoShort":"170331000348","storeAmount":2,"toShopName":"太和"},{"fromShopName":"合肥分拨","goodsAmount":4,"goodsName":"配件","id":78747,"sheetNo":"6253170331000347","sheetNoConsign":"","sheetNoShort":"170331000347","storeAmount":4,"toShopName":"太和"},{"fromShopName":"合肥分拨","goodsAmount":4,"goodsName":"配件","id":78739,"sheetNo":"6253170331000339","sheetNoConsign":"","sheetNoShort":"170331000339","storeAmount":4,"toShopName":"太和"}]
         */

        private int total;
        private int totalSheetAmount;
        private int totalStoreAmount;
        private int pageNo;
        private int pageSize;
        private String lastDownloadDate;
        private int totalGoodsAmount;
        private List<RowsBean> rows;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getTotalSheetAmount() {
            return totalSheetAmount;
        }

        public void setTotalSheetAmount(int totalSheetAmount) {
            this.totalSheetAmount = totalSheetAmount;
        }

        public int getTotalStoreAmount() {
            return totalStoreAmount;
        }

        public void setTotalStoreAmount(int totalStoreAmount) {
            this.totalStoreAmount = totalStoreAmount;
        }

        public int getPageNo() {
            return pageNo;
        }

        public void setPageNo(int pageNo) {
            this.pageNo = pageNo;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public String getLastDownloadDate() {
            return lastDownloadDate;
        }

        public void setLastDownloadDate(String lastDownloadDate) {
            this.lastDownloadDate = lastDownloadDate;
        }

        public int getTotalGoodsAmount() {
            return totalGoodsAmount;
        }

        public void setTotalGoodsAmount(int totalGoodsAmount) {
            this.totalGoodsAmount = totalGoodsAmount;
        }

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public static class RowsBean {
            /**
             * fromShopName : 合肥分拨
             * goodsAmount : 2
             * goodsName : 配件
             * id : 78748
             * sheetNo : 6253170331000348
             * sheetNoConsign :
             * sheetNoShort : 170331000348
             * storeAmount : 2
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
}
