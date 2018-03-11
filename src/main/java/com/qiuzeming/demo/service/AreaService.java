package com.qiuzeming.demo.service;

import com.qiuzeming.demo.entity.Area;

import java.util.List;

/**
 * Created by qiuzeming on 2018/3/11.
 */
public interface AreaService {

    List<Area> getAreaList();

    Area getAreaById(int areaId);

    boolean addArea(Area area);

    boolean modifyArea(Area area);

    boolean deleteArea(int areaId);
}