package cn.itcast.hotel.web;

import cn.itcast.hotel.pojo.PageResult;
import cn.itcast.hotel.pojo.RequestParams;
import cn.itcast.hotel.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("hotel")
public class HotelController {

    @Autowired
    private IHotelService hotelService;


    /**
     * 搜索酒店数据
     * - 请求方式：Post
     * - 请求路径：/hotel/list
     * - 请求参数：对象，类型为RequestParam
     * - 返回值：PageResult，包含两个属性
     * - `Long total`：总条数
     * - `List<HotelDoc> hotels`：酒店数据
     * @param params
     * @return
     */
    @PostMapping("list")
    public PageResult search(@RequestBody RequestParams params) {

        return hotelService.search(params);
    }

    @PostMapping("filters")
    public Map<String, List<String>> getFilters(@RequestBody RequestParams params) {
        return hotelService.getFilters(params);
    }

    @GetMapping("suggestion")
    public List<String> getSuggestion(@RequestParam("key") String key) {
        return hotelService.getSuggestion(key);
    }
}
