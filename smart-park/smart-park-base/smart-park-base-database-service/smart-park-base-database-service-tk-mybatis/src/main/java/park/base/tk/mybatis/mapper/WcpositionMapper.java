package park.base.tk.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import park.base.tk.mybatis.entity.Wcposition;
import park.base.tk.mybatis.entity.WcpositionExample;
import tk.mybatis.mapper.common.Mapper;

public interface WcpositionMapper extends Mapper<Wcposition> {
    long countByExample(WcpositionExample example);

    int deleteByExample(WcpositionExample example);

    List<Wcposition> selectByExample(WcpositionExample example);

    int updateByExampleSelective(@Param("record") Wcposition record, @Param("example") WcpositionExample example);

    int updateByExample(@Param("record") Wcposition record, @Param("example") WcpositionExample example);
}