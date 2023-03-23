package park.base.tk.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import park.base.tk.mybatis.entity.Regionalunits;
import park.base.tk.mybatis.entity.RegionalunitsExample;
import tk.mybatis.mapper.common.Mapper;

public interface RegionalunitsMapper extends Mapper<Regionalunits> {
    long countByExample(RegionalunitsExample example);

    int deleteByExample(RegionalunitsExample example);

    List<Regionalunits> selectByExample(RegionalunitsExample example);

    int updateByExampleSelective(@Param("record") Regionalunits record, @Param("example") RegionalunitsExample example);

    int updateByExample(@Param("record") Regionalunits record, @Param("example") RegionalunitsExample example);
}