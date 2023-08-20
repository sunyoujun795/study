package cn.itcast.hotel.pojo;

import lombok.Data;

/**
 * 前端的请求参数实体
 */
@Data
public class RequestParams {
    private String key;
    private Integer page;
    private Integer size;
    private String sortBy;
    //下面是新增的过滤条件参数
    private String brand;
    private String city;
    private String starName;
    private Integer minPrice;
    private Integer maxPrice;

    //我当前的地理坐标
    //点击地图的定位按钮，地图会找到你所在的位置：
    private String location;
}
