package com.yuxiao.taotao.service.impl;


import com.yuxiao.taotao.dao.TbItemMapper;
import com.yuxiao.taotao.pojo.TbItem;
import com.yuxiao.taotao.pojo.TbItemExample;
import com.yuxiao.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ${邹} on 2019/2/2.
 * 描述：
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;
    @Override
    public List<TbItem> list(TbItemExample example) {
        return itemMapper.selectByExample( example );
    }

    @Override
    public TbItem getItemById(long itemId) {
        //TbItem item = itemMapper.selectByPrimaryKey(itemId);
        //添加查询条件
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(itemId);
        List<TbItem> list = itemMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            TbItem item = list.get(0);
            return item;
        }
        return null;
    }


}
