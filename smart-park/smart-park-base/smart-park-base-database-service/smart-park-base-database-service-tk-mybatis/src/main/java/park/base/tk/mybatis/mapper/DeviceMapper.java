package park.base.tk.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import park.base.tk.mybatis.entity.Device;
import park.base.tk.mybatis.entity.DeviceExample;
import tk.mybatis.mapper.common.Mapper;

public interface DeviceMapper extends Mapper<Device> {
    long countByExample(DeviceExample example);

    int deleteByExample(DeviceExample example);

    List<Device> selectByExample(DeviceExample example);

    int updateByExampleSelective(@Param("record") Device record, @Param("example") DeviceExample example);

    int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);
}