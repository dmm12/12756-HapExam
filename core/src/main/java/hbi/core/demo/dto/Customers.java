package hbi.core.demo.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**客户主数据
 * Created by mm on 2017/1/13.
 */
@Table(name = "HAP_AR_CUSTOMERS")
public class Customers {
    @Id
    @GeneratedValue(
            generator = "IDENTITY"
    )
    @Column(name = "CUSTOMER_ID")
    private  Long customerId;//客户Id
    @Column(name = "CUSTOMER_NUMBER")
    private  String customerNumber;
    @Column(name = "CUSTOMER_NAME")
    private  String customerName;//	客户名称
    @Column(name = "COMPANY_ID")
    private  Long companyId;//	公司ID
    @Column(name = "ENABLED_FLAG")
    private String enabledFlag;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }
}
