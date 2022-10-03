package com.a.b.service;

import com.a.b.mapper.KnowlageMapper;
import com.a.b.pojo.Knowlage;
import com.a.b.utils.R;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class KnowlageServiceImpl extends ServiceImpl<KnowlageMapper,Knowlage> implements KnowlageService{

    @Autowired
    private KnowlageMapper knowlageMapper;

    public List getList(Knowlage knowlage){

        QueryWrapper<Knowlage> wrapper = new QueryWrapper<>();
        HashMap<String, Integer> map = new HashMap<>();
        if(null!=knowlage.getType()){
            map.put("type",knowlage.getType());
        }
        if(null!=knowlage.getCatagory()){
            map.put("catagory",knowlage.getCatagory());
        }
        if(null!=knowlage.getParentId()){
            map.put("parent_id",knowlage.getParentId());
        }
        wrapper.allEq(map);
        return knowlageMapper.selectList(wrapper);
    }

    public R getListPage(Integer pid,Integer page,Integer size){
        Page<Knowlage> pa = new Page<>(page, size);
        QueryWrapper<Knowlage> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id",pid);
        knowlageMapper.selectPage(pa,wrapper);
        R r = new R();
        r.put("data",pa);
        r.put("hasNext",pa.hasNext());
        return r;
    }

    public R addKnowlage(Knowlage knowlage){
        R r = new R();
        QueryWrapper<Knowlage> wrapper = new QueryWrapper<>();
        wrapper.eq("name",knowlage.getName());
        List<Knowlage> knowlages = knowlageMapper.selectList(wrapper);
        if (knowlages.size()>0){
            r = r.error("名字已存在");
            return r;
        }
        int insert = knowlageMapper.insert(knowlage);
        if(insert<=0){
            r.error();
        }

        r.put("data",knowlage);
        return r;
    }
}
