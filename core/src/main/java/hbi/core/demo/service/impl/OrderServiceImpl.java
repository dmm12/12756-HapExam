package hbi.core.demo.service.impl;

import hbi.core.demo.dto.Custom;
import hbi.core.demo.dto.OrderHeaders;
import hbi.core.demo.mapper.OrderMapper;
import hbi.core.demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**业务逻辑
 * Created by mm on 2017/1/13.
 */
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Custom> getOrderList(Custom custom) {
        List<Custom> getOrderList = orderMapper.selectOrderList(custom);
        if(getOrderList.size() == 0){
            System.out.print("数据没有拿到");
        }else{
            System.out.print("他的数据长度是"+getOrderList.size());
        }
        return getOrderList;
    }

    @Override
    public List<Custom> getInventList() {
       List<Custom> getCustom = orderMapper.selectByItems();
        if (getCustom.size() == 0){
            System.out.print("数据没有拿到");
            return null;
        }else{
            System.out.print("他的数据长度是"+getCustom.size());
        }
        return getCustom;
    }

    /*  @Override
    public List<InventoryItems> getIventoryItems() {
        List<InventoryItems> getIventory = inventoryItemsMapper.selectByItems();
        if(getIventory.size() == 0){
            System.out.print("数据没有拿到");
        }else {
            System.out.print("他的数据长度是"+getIventory.size());
        }
        return getIventory;
    }*/
}
