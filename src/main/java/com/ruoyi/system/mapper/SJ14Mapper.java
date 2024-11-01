package com.ruoyi.system.mapper;

import com.ruoyi.common.core.domain.SJ14;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 结构物台背回填施工记录表SJ14 数据层
 */
public interface SJ14Mapper {
    /**
     * 根据条件分页查询结构物台背回填施工记录表SJ14列表
     *
     * @param sj14 结构物台背回填施工记录表SJ14信息
     * @return 结构物台背回填施工记录表SJ14信息集合信息
     */
    public List<SJ14> selectSJ14List(SJ14 sj14);

    /**
     * 通过结构物台背回填施工记录表SJ14ID查询结构物台背回填施工记录表SJ14
     *
     * @param id 结构物台背回填施工记录表SJ14ID
     * @return 结构物台背回填施工记录表SJ14对象信息
     */
    public SJ14 selectSJ14ById(Long id);

    /**
     * 新增结构物台背回填施工记录表SJ14信息
     *
     * @param sj14 结构物台背回填施工记录表SJ14信息
     * @return 结果
     */
    public int insertSJ14(SJ14 sj14);

    /**
     * 修改结构物台背回填施工记录表SJ14信息
     *
     * @param sj14 结构物台背回填施工记录表SJ14信息
     * @return 结果
     */
    public int updateSJ14(SJ14 sj14);

    /**
     * 通过结构物台背回填施工记录表SJ14ID删除结构物台背回填施工记录表SJ14
     *
     * @param id 结构物台背回填施工记录表SJ14ID
     * @return 结果
     */
    public int deleteSJ14ById(Long id);

    /**
     * 批量删除结构物台背回填施工记录表SJ14信息
     *
     * @param ids 需要删除的结构物台背回填施工记录表SJ14ID
     * @return 结果
     */
    public int deleteSJ14ByIds(Long[] ids);
}