package ink.irene.demo.mapper;

import ink.irene.demo.model.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {
    @Select("select * from `pasteme`.`user` where id = #{id}")
    User getById(int id);

    @Insert("insert into `pasteme`.`user` (`id`, `name`) values (#{id}, #{name})")
    void insert(User user);
}
