package com.yuxiao.taotao.pojo;

import java.util.List;

/**
 * Created by ${邹} on 2019/2/3.
 * 描述：
 */
public class EUDataGridResult {
    private long total;
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
