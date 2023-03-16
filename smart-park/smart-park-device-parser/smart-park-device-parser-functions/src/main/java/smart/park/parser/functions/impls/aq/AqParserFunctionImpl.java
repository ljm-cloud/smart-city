package smart.park.parser.functions.impls.aq;

import org.apache.pulsar.functions.api.Context;
import smart.park.common.dto.BaseMsg;
import smart.park.common.dto.ParserInput;
import smart.park.parser.functions.impls.AbstractDeviceParserFunctionImpl;
import java.math.BigDecimal;

/**
 * @author ljm
 * @date 2023/2/17 11:48
 */
public class AqParserFunctionImpl extends AbstractDeviceParserFunctionImpl {

    @Override
    public BaseMsg process(ParserInput input, Context context) throws Exception {
        BaseMsg baseMsg = new BaseMsg(input);
        StringBuffer stringBuffer = new StringBuffer();
        byte[] datas = input.getDatas();
        int fh = (datas[0] & 0xff);
        int temperature = (datas[1] & 0xff);
        int tpoint = (datas[2] & 0xff);
        if (fh == 0) {
            stringBuffer.append("-");
        }
        stringBuffer.append(temperature);
        stringBuffer.append(".");
        String tpointStr = Integer.toHexString(tpoint);
        if (tpointStr.length() < 2) {
            stringBuffer.append(0);
        }
        stringBuffer.append(tpoint);

        double temper = new BigDecimal(stringBuffer.toString()).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();//温度只保留2位小数
        stringBuffer.setLength(0);
        double humidity = getAqData(stringBuffer, datas[3], datas[4]).doubleValue();

        double nh3 = getAqData(stringBuffer, datas[5], datas[6]).doubleValue();

        double h2s = getAqData(stringBuffer, datas[7], datas[8]).doubleValue();

        double ch2o = getAqData(stringBuffer, datas[9], datas[10]).doubleValue();

        int co2 = (datas[11] & 0xff) * 256 + (datas[12] & 0xff);

        int tvoc = (datas[13] & 0xff);

        int pm25 = (datas[14] & 0xff) * 256 + (datas[15] & 0xff);

        int pm10 = (datas[16] & 0xff) * 256 + (datas[17] & 0xff);
        baseMsg.getData().put("temperature", temper);
        baseMsg.getData().put("humidity", humidity);
        baseMsg.getData().put("nh3", nh3);
        baseMsg.getData().put("h2s", h2s);
        baseMsg.getData().put("ch2o", ch2o);
        baseMsg.getData().put("co2", co2);
        baseMsg.getData().put("tvoc", tvoc);
        baseMsg.getData().put("pm25", pm25);
        baseMsg.getData().put("pm10", pm10);
        return baseMsg;
    }

    public static BigDecimal getAqData(StringBuffer stringBuffer, byte data, byte pointData) {
        stringBuffer.setLength(0);
        int dataInt = data & 0xff;
        int pointDataInt = pointData & 0xff;
        stringBuffer.append(dataInt);
        String pointDataStr = Integer.toHexString(pointDataInt);
        stringBuffer.append(".");
        if (pointDataStr.length() < 2) {
            stringBuffer.append(0);
        }
        stringBuffer.append(pointDataInt);
        return new BigDecimal(stringBuffer.toString());
    }
}
