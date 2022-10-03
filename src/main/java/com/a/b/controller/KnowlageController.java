package com.a.b.controller;

import com.a.b.pojo.Knowlage;
import com.a.b.service.KnowlageService;
import com.a.b.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("knowlage")
public class KnowlageController {

    @Autowired
    private KnowlageService knowlageService;

    /**
     * 根据参数查询knowlage列表
     * @param knowlage
     * @return
     */
    @RequestMapping("getKnowlages")
    public R getKnowlages(Knowlage knowlage){
        R r = new R();
        List<Knowlage> knowlages = knowlageService.getList(knowlage);
        r.put("data",knowlages);
        return r;
    }

    /**
     * 根据参数查询knowlage列表
     * 分页
     * @param parent_id
     * @return
     */
    @RequestMapping("getKnowlagesByParentId")
    public R getKnowlagesByParentId(Integer parent_id,Integer page,Integer size){
        R r = knowlageService.getListPage(parent_id,page,size);
        return r;
    }

    /**
     * 添加
     * @param knowlage
     * @return
     */
    @PostMapping("addKnowlage")
    public R addKnowlage(Knowlage knowlage){
        R r = knowlageService.addKnowlage(knowlage);
        return r;
    }
}
