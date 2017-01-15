package hbi.core.demo.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by mm on 2017/1/13.
 */
@Table(name="HAP_ORG_COMPANYS")
public class Companys {
    @Id
    @Column(name = "COMPANY_ID")
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private  Long  companyId;
    @Column(name = "COMPANY_NUMBER")
    private String companyNumber;
    @Column(name = "COMPANY_NAME")
    private String companyName; //名称
    @Column(name = "ENABLED_FLAG")
    private String enabledFlag;
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @JsonFormat(
            pattern="yyyy-MM-dd HH:mm:ss"
    )

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
