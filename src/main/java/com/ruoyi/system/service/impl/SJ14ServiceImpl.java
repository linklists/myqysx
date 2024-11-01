package com.ruoyi.system.service.impl;
import com.github.pagehelper.PageInfo;
import com.ruoyi.common.core.domain.SJ14;
import com.ruoyi.common.utils.PageUtils;
import com.ruoyi.system.mapper.SJ14Mapper;
import com.ruoyi.system.service.SJ14Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * 结构物台背回填施工记录表SJ14 业务层处理
 */
@Service
public class SJ14ServiceImpl implements SJ14Service {
    private static final Logger log = LoggerFactory.getLogger(SJ14ServiceImpl.class);

    @Autowired
    private SJ14Mapper sj14Mapper;

    /**
     * 根据条件分页查询结构物台背回填施工记录表SJ14列表
     *
     * @param sj14 结构物台背回填施工记录表SJ14信息
     * @return 结构物台背回填施工记录表SJ14信息集合信息
     */
    @Override
    public PageInfo<SJ14> selectSJ14List(SJ14 sj14, Integer pageNum, Integer pageSize) {
        // 使用分页插件pagehelper进行分页
        PageUtils.startPage();
        return new PageInfo<>(sj14Mapper.selectSJ14List(sj14));
    }

    /**
     * 通过结构物台背回填施工记录表SJ14ID查询结构物台背回填施工记录表SJ14
     *
     * @param id 结构物台背回填施工记录表SJ14ID
     * @return 结构物台背回填施工记录表SJ14对象信息
     */
    @Override
    public SJ14 selectSJ14ById(Long id) {
        return sj14Mapper.selectSJ14ById(id);
    }

    /**
     * 新增保存结构物台背回填施工记录表SJ14信息
     *
     * @param sj14 结构物台背回填施工记录表SJ14信息
     * @return 结果
     */
    @Override
    @Transactional
    public int insertSJ14(SJ14 sj14) {
        // 新增结构物台背回填施工记录表SJ14信息
        int rows = sj14Mapper.insertSJ14(sj14);
        return rows;
    }

    /**
     * 修改保存结构物台背回填施工记录表SJ14信息
     *
     * @param sj14 结构物台背回填施工记录表SJ14信息
     * @return 结果
     */
    @Override
    @Transactional
    public int updateSJ14(SJ14 sj14) {
        return sj14Mapper.updateSJ14(sj14);
    }

    /**
     * 通过结构物台背回填施工记录表SJ14ID删除结构物台背回填施工记录表SJ14
     *
     * @param id 结构物台背回填施工记录表SJ14ID
     * @return 结果
     */
    @Override
    @Transactional
    public int deleteSJ14ById(Long id) {
        return sj14Mapper.deleteSJ14ById(id);
    }

    /**
     * 批量删除结构物台背回填施工记录表SJ14信息
     *
     * @param ids 需要删除的结构物台背回填施工记录表SJ14ID
     * @return 结果
     */
    @Override
    @Transactional
    public int deleteSJ14ByIds(Long[] ids) {
        return sj14Mapper.deleteSJ14ByIds(ids);
    }
}