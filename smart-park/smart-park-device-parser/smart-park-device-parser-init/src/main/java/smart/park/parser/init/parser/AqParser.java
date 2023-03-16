package smart.park.parser.init.parser;

/**
 * @author ljm
 * @date 2023/3/15 18:15
 */
public class AqParser extends AbstractParser{
    @Override
    public String getParserTopicInput() {
        return "smp_aq_parser_input";
    }

    @Override
    public Integer getFPort() {
        return 101;
    }
}
