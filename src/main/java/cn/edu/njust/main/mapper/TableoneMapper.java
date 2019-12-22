package cn.edu.njust.main.mapper;

import cn.edu.njust.main.model.Tableone;
import cn.edu.njust.main.model.TableoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableoneMapper {
    long countByExample(TableoneExample example);

    int deleteByExample(TableoneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tableone record);

    int insertSelective(Tableone record);

    List<Tableone> selectByExample(TableoneExample example);

    Tableone selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tableone record, @Param("example") TableoneExample example);

    int updateByExample(@Param("record") Tableone record, @Param("example") TableoneExample example);

    int updateByPrimaryKeySelective(Tableone record);

    int updateByPrimaryKey(Tableone record);
}