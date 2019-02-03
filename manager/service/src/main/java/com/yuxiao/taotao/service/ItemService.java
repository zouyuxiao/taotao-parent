package com.yuxiao.taotao.service;


import com.yuxiao.taotao.pojo.EUDataGridResult;
import com.yuxiao.taotao.pojo.TbItem;
import com.yuxiao.taotao.pojo.TbItemExample;

import java.util.List;

/**
 * Created by ${邹} on 2019/2/2.
 * 描述：
 */
public interface ItemService {
    List<TbItem> list(TbItemExample example);
    TbItem getItemById(long itemId);

    EUDataGridResult getItemList(int page, int rows);
}
