package batis.batis.api.mybatis;

import batis.batis.api.sample.SampleResource;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleMapper {
    List<SampleResource> findAll();

    SampleResource findById(int id);

    int insert(SampleResource resource);

    int update(SampleResource resource);

    int delete(int id);
}