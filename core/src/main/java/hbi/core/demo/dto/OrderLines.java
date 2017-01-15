package hbi.core.demo.dto;

import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**销售单行数据
 * Created by mm on 2017/1/13.
 */
@Table(name = "HAP_OM_ORDER_LINES")
public class OrderLines extends BaseDTO {

    @Id
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private  long lineId;//订单头
    @Column(name = "LINE_ID")
    private Integer headerId;
    @NotEmpty
    @Column(name = "LINE_NUMBER")
    private Integer lineNumber;//销售数量
    @NotEmpty
    @Column(name = "INVENTORY_ITEM_ID")
    private  Integer inventoryItemId;
    @NotEmpty
    @Column(name = "ORDERD_QUANTITY")
    private BigDecimal orderdQuantity;//数量
    @NotEmpty
    @Column(name = "ORDER_QUANTITY_UOM")
    private String  orderQuantityUom;
    @NotEmpty
    @Column(name = "UNIT_SELLING_PRICE")
    private BigDecimal unitSellingPrice;//单价
    @NotEmpty
    @Column(name = "DESCRIPTION")
    private String description;
    @NotEmpty
    @Column(name = "COMPANY_ID")
    private Integer companyId;

    public long getLineId() {
        return lineId;
    }

    public void setLineId(long lineId) {
        this.lineId = lineId;
    }

    public Integer getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Integer headerId) {
        this.headerId = headerId;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Integer getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Integer inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public BigDecimal getOrderdQuantity() {
        return orderdQuantity;
    }

    public void setOrderdQuantity(BigDecimal orderdQuantity) {
        this.orderdQuantity = orderdQuantity;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public void setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
    }

    public BigDecimal getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public void setUnitSellingPrice(BigDecimal unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
