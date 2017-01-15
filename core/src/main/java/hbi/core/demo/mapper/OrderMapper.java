package hbi.core.demo.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.demo.dto.Custom;
import hbi.core.demo.dto.OrderHeaders;

import java.util.List;

/**与数据库建立连接的表
 * Created by mm on 2017/1/13.
 */
public interface OrderMapper {
  List<Custom> selectOrderList(Custom custom);
  List<Custom>  selectByItems();

 }
