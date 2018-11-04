package test.dao;

import java.util.List;
import test.model.Country;

public interface CountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Country record);

    Country selectByPrimaryKey(Integer id);

    List<Country> selectAll();

    int updateByPrimaryKey(Country record);
}