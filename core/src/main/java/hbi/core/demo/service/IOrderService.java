package hbi.core.demo.service;

import hbi.core.demo.dto.Custom;
import hbi.core.demo.dto.InventoryItems;
import hbi.core.demo.dto.OrderHeaders;

import java.util.List;

/**
 * Created by mm on 2017/1/13.
 */
public interface IOrderService {
    List<Custom> getOrderList(Custom custom);
    List<Custom> getInventList();
}
