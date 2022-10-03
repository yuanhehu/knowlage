package com.a.b.service;

import com.a.b.pojo.Knowlage;
import com.a.b.utils.R;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface KnowlageService extends IService<Knowlage> {
    List<Knowlage> getList(Knowlage knowlage);

    R getListPage(Integer pId,Integer page,Integer size);

    R addKnowlage(Knowlage knowlage);
}
