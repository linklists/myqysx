package com.ruoyi.web.controller.system;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.SJ14;
import com.ruoyi.system.service.SJ14Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 结构物台背回填施工记录表SJ14 控制层
 */
@RestController
//@RequestMapping("/system/sj14")
public class SJ14Controller {
    @Autowired
    private SJ14Service sj14Service;

    /**
     * 分页查询 结构物台背回填施工记录表SJ14
     */
    @GetMapping("/getSJ14s")
    public AjaxResult getSJ14s(SJ14 sj14, Integer pageNum, Integer pageSize) {
        AjaxResult ajax = AjaxResult.success(
                sj14Service.selectSJ14List(sj14, pageNum, pageSize));
        ajax.put("code", 0);
        ajax.put("msg", "查询成功");
        return ajax;
    }

    /**
     * 单个查询，根据ID查询结构物台背回填施工记录表SJ14
     */
    @GetMapping("/getSJ14/{id}")
    public AjaxResult getSJ14(@PathVariable("id") Long id) {
        AjaxResult ajax = AjaxResult.success(
                sj14Service.selectSJ14ById(id));
        ajax.put("code", 0);
        ajax.put("msg", "查询成功");
        return ajax;
    }

    /**
     * 添加 结构物台背回填施工记录表SJ14
     */
    @PostMapping("/addSJ14")
    public AjaxResult addSJ14(@RequestBody SJ14 sj14) {
        AjaxResult ajax = AjaxResult.success(sj14Service.insertSJ14(sj14));
        ajax.put("code", 0);
        ajax.put("msg", "添加成功");
        return ajax;
    }

    /**
     * 修改   结构物台背回填施工记录表SJ14
     */
    @PutMapping("/editSJ14")
    public AjaxResult editSJ14(@RequestBody SJ14 sj14) {
        AjaxResult ajax = AjaxResult.success(sj14Service.updateSJ14(sj14));
        ajax.put("code", 0);
        ajax.put("msg", "修改成功");
        return ajax;
    }

    /**
     * 根据ID 删除  结构物台背回填施工记录表SJ14
     */
    @DeleteMapping("/deleteSJ14/{id}")
    public AjaxResult deleteSJ14(@PathVariable("id") Long id) {
        AjaxResult ajax = AjaxResult.success(sj14Service.deleteSJ14ById(id));
        ajax.put("code", 0);
        ajax.put("msg", "删除成功");
        return ajax;
    }
}