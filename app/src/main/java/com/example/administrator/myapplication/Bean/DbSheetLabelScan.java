package com.example.administrator.myapplication.Bean;

import org.xutils.DbManager;
import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;
import org.xutils.ex.DbException;

/**
 * Created by zmy1 on 2017/4/15.
 */

@Table(name = "DbSheetLabelScan")
public class DbSheetLabelScan {
    @Column(name = "_id",isId = true,autoGen = true)
    private int id;
    @Column(name = "label")
    private String label;
    @Column(name = "timestamp")
    private String timestamp;
    @Column(name = "StockId")
    private long StockId;

    public DbSheetLabelScan(){}

    public DbSheetLabelScan(String label, String timestamp) {
        this.label = label;
        this.timestamp = timestamp;
    }
    public DbSheetScan getStock(DbManager db) throws DbException {
        return db.findById(DbSheetScan.class, StockId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStockId() {
        return StockId;
    }

    public void setStockId(long stockId) {
        StockId = stockId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "DbSheetLabelScan{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", StockId=" + StockId +
                '}';
    }
}
