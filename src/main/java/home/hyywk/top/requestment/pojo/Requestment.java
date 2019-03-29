package home.hyywk.top.requestment.pojo;


import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

/**
 * 需求实体类
 *  name: '',
 *       telephone: '',
 *       email: '',
 *       corporation:'',
 *       corporation_range: '',
 *       usage: '',
 *       request: ''
 */
@Entity
public class Requestment {
    /**
     * 会将生成的id通过短信通知所在人
     */
    @Id
    @GeneratedValue
    private Long id;
    @Column(columnDefinition = "CHAR(20) COMMENT '姓名'", nullable = false)
    private String name;
    @Column(columnDefinition = "CHAR(11) COMMENT '手机号'", nullable = false)
    private String telephone;
    @Column(columnDefinition = "VARCHAR(50) COMMENT '邮箱'", nullable = false)
    private String email;
    @Column(columnDefinition = "VARCHAR(50) COMMENT '公司名称'", nullable = false)
    private String corporation;
    @Column(columnDefinition = "VARCHAR(50) COMMENT '经营范围'", nullable = false)
    private String corporationRange;
    @Column(columnDefinition = "VARCHAR(50) COMMENT '用途'", nullable = false)
    private String touse;
    @Column(columnDefinition = "VARCHAR(255) COMMENT '需求'", nullable = false)
    private String request;
    @Column( columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Generated(GenerationTime.INSERT)
    private Date createTime;

    public Requestment() {
    }

    public Requestment(String name, String telephone, String email, String corporation, String corporationRange, String touse, String request ) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.corporation = corporation;
        this.corporationRange = corporationRange;
        this.touse = touse;
        this.request = request;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }

    public String getCorporationRange() {
        return corporationRange;
    }

    public void setCorporationRange(String corporationRange) {
        this.corporationRange = corporationRange;
    }

    public void setTouse(String touse) {
        this.touse = touse;
    }

    public String getTouse() {
        return touse;
    }
    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return this.corporation + ',' + this.corporationRange + ',' + this.touse;
    }
}
