package com.yuxiao.taotao.controller;

import com.yuxiao.taotao.pojo.EUDataGridResult;
import com.yuxiao.taotao.pojo.TbItem;
import com.yuxiao.taotao.pojo.TbItemExample;
import com.yuxiao.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ${邹} on 2019/2/2.
 * 描述：
 */
@Controller
@RequestMapping("/api/item")
public class ItemController {
    @Autowired
    ItemService itemService;
    @RequestMapping("/list")
    @ResponseBody
    public List<TbItem> list(TbItemExample example){
        List<TbItem> items = itemService.list( example );
        return items;
    }
    @RequestMapping("/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        TbItem tbItem = itemService.getItemById(itemId);
        System.out.println( tbItem );
        return tbItem;
    }
    @RequestMapping("/pagelist")
    @ResponseBody
    public EUDataGridResult getItemList(Integer page, Integer rows) {
        EUDataGridResult result = itemService.getItemList(page, rows);
        return result;
    }
}
