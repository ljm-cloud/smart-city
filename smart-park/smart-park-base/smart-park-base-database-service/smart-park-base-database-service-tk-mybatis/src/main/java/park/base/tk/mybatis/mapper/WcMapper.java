package park.base.tk.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import park.base.tk.mybatis.entity.Wc;
import park.base.tk.mybatis.entity.WcExample;
import tk.mybatis.mapper.common.Mapper;

public interface WcMapper extends Mapper<Wc> {
    long countByExample(WcExample example);

    int deleteByExample(WcExample example);

    List<Wc> selectByExample(WcExample example);

    int updateByExampleSelective(@Param("record") Wc record, @Param("example") WcExample example);

    int updateByExample(@Param("record") Wc record, @Param("example") WcExample example);
}