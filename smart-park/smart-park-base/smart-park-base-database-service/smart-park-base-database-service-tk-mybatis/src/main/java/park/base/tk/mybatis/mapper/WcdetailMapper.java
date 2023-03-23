package park.base.tk.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import park.base.tk.mybatis.entity.Wcdetail;
import park.base.tk.mybatis.entity.WcdetailExample;
import tk.mybatis.mapper.common.Mapper;

public interface WcdetailMapper extends Mapper<Wcdetail> {
    long countByExample(WcdetailExample example);

    int deleteByExample(WcdetailExample example);

    List<Wcdetail> selectByExample(WcdetailExample example);

    int updateByExampleSelective(@Param("record") Wcdetail record, @Param("example") WcdetailExample example);

    int updateByExample(@Param("record") Wcdetail record, @Param("example") WcdetailExample example);
}