package hbi.core.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**业务数据表
 * Created by mm on 2017/1/13.
 */
@Table(name="HAP_OM_ORDER_HEADERS")
public class OrderHeaders extends BaseDTO{

    @Id
    @GeneratedValue(
            generator = "IDENTITY"
    )
    @Column(name = "HEADER_ID")
    private Long headerId;//	订单头ID
    @NotEmpty
    @Column(name = "ORDER_NUMBER")
    private  String orderNumber;//订单编号
    @NotEmpty
    @Column(name = "COMPANY_ID")
    private  Long companyId;
    @NotEmpty
    @Column(name = "ORDER_DATE")
    private Date orderDate; //订单日期
    @JsonFormat(
            pattern="yyyy-MM-dd HH:mm:ss"
    )
    @Column(name = "ORDER_STATUS")
    private  String orderStatus;//订单状态
    @Column(name = "CUSTOMER_ID")
    private  Integer customerId;

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
