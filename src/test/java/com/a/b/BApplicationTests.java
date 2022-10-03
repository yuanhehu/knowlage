/*
package com.a.b;

import com.a.b.mapper.KnowlageMapper;
import com.a.b.pojo.Knowlage;
import com.a.b.service.KnowlageService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@MapperScan("com.a.b.mapper")
class BApplicationTests {

    @Autowired
    KnowlageMapper knowlageMapper;

    @Autowired
    KnowlageService knowlageService;

    @Test
    public void list() {
      */
/*  List<Knowlage> knowlages = knowlageMapper.selectList(null); //条件构造器先不用
        knowlages.forEach(System.out::println);*//*

        */
/*List<Knowlage> knowlages = knowlageService.getList(); //条件构造器先不用
        knowlages.forEach(System.out::println);*//*

    }

    @Test
    public void pageList() {
        Page<Knowlage> page = new Page<>(1, 2);
        QueryWrapper<Knowlage> w = new QueryWrapper<>();
        w.eq("parent_id",1);
        knowlageMapper.selectPage(page, w);
        System.out.println("当前页数据:"+page.getRecords());
        System.out.println("总分页数量:"+page.getPages());
        System.out.println("总记录数量:"+page.getTotal());
        System.out.println("是否有下一页:"+page.hasNext());
        System.out.println("是否有上一页:"+page.hasPrevious());
    }

    @Test
    public void insert(){
        */
/*Knowlage knowlage = new Knowlage();
        knowlage.setParentId(1);
        knowlage.setType(1);
        knowlage.setCatagory(2);
        knowlage.setName("aaa");
        knowlage.setUrl("agagaga");
        knowlageMapper.insert(knowlage);*//*




    }
    @Test
    public void update(){
        */
/*Knowlage knowlage = new Knowlage();
        knowlage.setId(5);
        knowlage.setType(1);
        knowlageMapper.updateById(knowlage);*//*



    }

    @Test
    public void delete(){
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(2);
        integers.add(3);
        integers.add(4);

        knowlageMapper.deleteBatchIds(integers);

    }
}
*/
