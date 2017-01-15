package hbi.core.demo.dto;

import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**物料表
 * Created by mm on 2017/1/14.
 */
@Table(name="hap_inv_inventory_items")
public class InventoryItems extends BaseDTO{
    @Id
    @GeneratedValue(
            generator = "IDENTITY"
    )
    @Column(name = "INVENTORY_ITEM_ID")
    private  Long inventoryItemId;//物料id
    @Column(name = "ITEM_CODE")
    private  String itemCode;//物料编码
    @NotEmpty
    @Column(name = "ITEM_UOM")
    private String itemUom;//物料单位
    @NotEmpty
    @Column(name = "ITEM_DESCRIPTION")
    private String itemDescription;//物料描述
    @NotEmpty
    @Column(name = "ORDER_FLAG")
    private String  orderFlag;
    @Column(name = "START_ACTIVE_DATE")
    private Date startActiveDate;
    @Column(name = "END_ACTIVE_DATE")
    private Date endActiveDate;
    @NotEmpty
    @Column(name = "ENABLED_FLAG")
    private String  enabledFlag;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "CREATED_BY")
    private Long createdBy;
    @Column(name = "LAST_UPDATED_BY")
    private  Long lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private  Date lastUpdateDate;
    @Transient
    private BigDecimal orderdQuantity;//数量
    @Transient
    private BigDecimal unitSellingPrice;//单价
    @Transient
    private String addition1;

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemUom() {
        return itemUom;
    }

    public void setItemUom(String itemUom) {
        this.itemUom = itemUom;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(String orderFlag) {
        this.orderFlag = orderFlag;
    }

    public Date getStartActiveDate() {
        return startActiveDate;
    }

    public void setStartActiveDate(Date startActiveDate) {
        this.startActiveDate = startActiveDate;
    }

    public Date getEndActiveDate() {
        return endActiveDate;
    }

    public void setEndActiveDate(Date endActiveDate) {
        this.endActiveDate = endActiveDate;
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

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public BigDecimal getOrderdQuantity() {
        return orderdQuantity;
    }

    public void setOrderdQuantity(BigDecimal orderdQuantity) {
        this.orderdQuantity = orderdQuantity;
    }

    public BigDecimal getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public void setUnitSellingPrice(BigDecimal unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public String getAddition1() {
        return addition1;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }
}
