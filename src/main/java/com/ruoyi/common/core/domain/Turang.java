package com.ruoyi.common.core.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

//土壤数据
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Turang extends BaseEntity {
    private int id;         //序号
    private String name;    //土壤名字
    private String wendu;   //温度
    private String shidu;   //湿度

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdate;  //创建日期

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWendu() {
        return wendu;
    }

    public String getShidu() {
        return shidu;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public void setShidu(String shidu) {
        this.shidu = shidu;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
