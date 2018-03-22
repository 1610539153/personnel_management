package com.iotek.po;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/22.
 */
public class PutResume implements Serializable {
    private Integer id;
    private Integer customerId;
    private String dName;
    private String postName;
    private Integer resumeIsExist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public Integer getResumeIsExist() {
        return resumeIsExist;
    }

    public void setResumeIsExist(Integer resumeIsExist) {
        this.resumeIsExist = resumeIsExist;
    }
    @Override
    public String toString() {
        return "PutResume{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", dName='" + dName + '\'' +
                ", postName='" + postName + '\'' +
                ", resumeIsExist=" + resumeIsExist +
                '}';
    }
}
