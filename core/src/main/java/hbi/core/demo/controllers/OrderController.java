package hbi.core.demo.controllers;

import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.demo.dto.Custom;
import hbi.core.demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**控制层
 * Created by mm on 2017/1/13.
 */
@RestController
@RequestMapping("/order")
public class OrderController extends BaseController {
    @Autowired
    IOrderService orderService;

    @RequestMapping(value = "/getOrderList",method = RequestMethod.POST)
    @ResponseBody
    public ResponseData getOrderList(@RequestBody Custom custom){
        System.out.println("所要查询的值是"+custom.getCompanyId()+custom.getCustomerId()+custom.getInventoryItemId()+custom.getOrderNumber()+custom.getOrderStatus());
        System.out.print("到了getOrderList");
        List<Custom> getList =  orderService.getOrderList(custom);
        if(getList.size() == 0){
            System.out.print("没有数据");
            //getErrorMessage(Errors errors, HttpServletRequest request
            return null;
        }else {
            return new ResponseData(getList);
        }
    }

    @RequestMapping(value = "/getInvent",method = RequestMethod.POST)
    @ResponseBody
    public  ResponseData getInventList(){
        System.out.print("到了getInventList");
        List<Custom>  getInventList = orderService.getInventList();
        if (getInventList.size() == 0){
            System.out.print("这数据没有拿到");
            return null;
        }else{
            return  new ResponseData(getInventList);
        }
    }
}
