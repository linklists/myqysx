package com.ruoyi.common.core.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

// 结构物台背回填施工记录表SJ14
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SJ14 extends BaseEntity {
    private int id;     //序号，主键

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;  //采集数据提交的时间，自动采集

    private String position;    //采集数据提交的地点（经纬度），自动采集
    private int userid;      //采集人员编号，自动采集
    private String constructionUnit; // 施工单位
    private String contractNumber; // 合同号
    private String supervisionUnit; // 监理单位
    private String recordNumber; // 编号
    private String projectName; // 工程名称

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date constructionTime;  //施工时间

    private String projectLocation; // 工程部位 (桩号、墩台号、孔号)
    private String concreteStrength; // 结构物砂浆 或砼强度
    private String cleanupCondition;    //清理状况
    private String backfillRange; // 回填范围
    private String backfillMaterial; // 回填材料
    private String compactionMechanical; // 碾压机械及方式
    private int backfillLevel; // 回填 层次
    private float looseThickness; // 松铺厚度 (cm)
    private String compactionCheck; // 压实度检验或 试件取样情况
    private String testRecordNumber; // 试验 记录单号
    private int backfillLevel2; // 回填 层次2
    private float looseThickness2; // 松铺厚度2 (cm)
    private String compactionCheck2; // 压实度检验或 试件取样情况
    private String testRecordNumber2; // 试验 记录单号
    private String description;         //回填后结构物有无位移、裂缝等破坏情况

    public int getId() {
        return id;
    }

    public Date getTime() {
        return time;
    }

    public String getPosition() {
        return position;
    }

    public int getUserid() {
        return userid;
    }

    public String getConstructionUnit() {
        return constructionUnit;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public String getSupervisionUnit() {
        return supervisionUnit;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public String getProjectName() {
        return projectName;
    }

    public Date getConstructionTime() {
        return constructionTime;
    }

    public String getProjectLocation() {
        return projectLocation;
    }

    public String getConcreteStrength() {
        return concreteStrength;
    }

    public String getCleanupCondition() {
        return cleanupCondition;
    }

    public String getBackfillRange() {
        return backfillRange;
    }

    public String getBackfillMaterial() {
        return backfillMaterial;
    }

    public String getCompactionMechanical() {
        return compactionMechanical;
    }

    public int getBackfillLevel() {
        return backfillLevel;
    }

    public float getLooseThickness() {
        return looseThickness;
    }

    public String getCompactionCheck() {
        return compactionCheck;
    }

    public String getTestRecordNumber() {
        return testRecordNumber;
    }

    public int getBackfillLevel2() {
        return backfillLevel2;
    }

    public float getLooseThickness2() {
        return looseThickness2;
    }

    public String getCompactionCheck2() {
        return compactionCheck2;
    }

    public String getTestRecordNumber2() {
        return testRecordNumber2;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setConstructionUnit(String constructionUnit) {
        this.constructionUnit = constructionUnit;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public void setSupervisionUnit(String supervisionUnit) {
        this.supervisionUnit = supervisionUnit;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setConstructionTime(Date constructionTime) {
        this.constructionTime = constructionTime;
    }

    public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }

    public void setConcreteStrength(String concreteStrength) {
        this.concreteStrength = concreteStrength;
    }

    public void setCleanupCondition(String cleanupCondition) {
        this.cleanupCondition = cleanupCondition;
    }

    public void setBackfillRange(String backfillRange) {
        this.backfillRange = backfillRange;
    }

    public void setBackfillMaterial(String backfillMaterial) {
        this.backfillMaterial = backfillMaterial;
    }

    public void setCompactionMechanical(String compactionMechanical) {
        this.compactionMechanical = compactionMechanical;
    }

    public void setBackfillLevel(int backfillLevel) {
        this.backfillLevel = backfillLevel;
    }

    public void setLooseThickness(float looseThickness) {
        this.looseThickness = looseThickness;
    }

    public void setCompactionCheck(String compactionCheck) {
        this.compactionCheck = compactionCheck;
    }

    public void setTestRecordNumber(String testRecordNumber) {
        this.testRecordNumber = testRecordNumber;
    }

    public void setBackfillLevel2(int backfillLevel2) {
        this.backfillLevel2 = backfillLevel2;
    }

    public void setLooseThickness2(float looseThickness2) {
        this.looseThickness2 = looseThickness2;
    }

    public void setCompactionCheck2(String compactionCheck2) {
        this.compactionCheck2 = compactionCheck2;
    }

    public void setTestRecordNumber2(String testRecordNumber2) {
        this.testRecordNumber2 = testRecordNumber2;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}