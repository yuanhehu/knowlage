package com.a.b.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Knowlage {

    @TableId(type = IdType.AUTO) //采用数据库自增
    private Integer id;
    private Integer parentId;
    private Integer type;
    private Integer catagory;
    private String name;
    private String url;
}
