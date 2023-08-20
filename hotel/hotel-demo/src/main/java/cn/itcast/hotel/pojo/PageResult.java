package cn.itcast.hotel.pojo;

import lombok.Data;

import java.util.List;

/**
 * 服务端应该返回的响应结果实体
 * 分页查询，需要返回分页结果PageResult，包含两个属性：
 *  total：总条数
 *  List<HotelDoc>：当前页的数据
 */
@Data
public class PageResult {
    private Long total;
    private List<HotelDoc> hotels;

    public PageResult() {
    }

    public PageResult(Long total, List<HotelDoc> hotels) {
        this.total = total;
        this.hotels = hotels;
    }
}
