package com.example.bigevent.mapper;

import com.example.bigevent.pojo.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author xi
 * @create 2024/3/6 22:23
 */
@Mapper
public interface CategoryMapper {
    //新增分类
    @Insert("insert into category(category_name,category_alias,create_user,create_time,update_time) " +
            "values (#{categoryName},#{categoryAlias},#{createUser},#{createTime},#{updateTime})")
    void add(Category category);

    //查询所有
    @Select("select * from category where create_user=#{id}")
    List<Category> list(Integer id);

    //根据id查询
    @Select("select * from category where id=#{id}")
    Category findById(Integer id);
}
