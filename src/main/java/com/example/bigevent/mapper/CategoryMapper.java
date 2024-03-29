package com.example.bigevent.mapper;

import com.example.bigevent.pojo.Category;
import org.apache.ibatis.annotations.*;

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

    //更新
    @Update("update category set category_name=#{categoryName},category_alias=#{categoryAlias},update_time=#{updateTime} where id=#{id}")
    void update(Category category);

    //根据id删除
    @Delete("delete from category where id=#{id}")
    void deleteById(Integer id);
}
