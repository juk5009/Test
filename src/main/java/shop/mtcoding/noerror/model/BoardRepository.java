package shop.mtcoding.noerror.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {

    public List<Board> findAll();

}
