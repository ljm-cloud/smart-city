package park.base.mybatis.plus.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MyBatisPlusGenerator {

  public static void main(String[] args) {
      //1. 全局配置
      GlobalConfig config = new GlobalConfig();
              // 作者
              config.setAuthor("ljm")
              // 生成路径，最好使用绝对路径，window路径是不一样的
              // 文件存放位置，自定义
              .setOutputDir(System.getProperty("user.dir")+"/smart-park/smart-park-base/smart-park-base-database-service/smart-park-base-database-service-mybatis-plus/src/main/java")
              // 文件覆盖
              .setFileOverride(true)
              // 主键策略
              .setIdType(IdType.AUTO)
              .setDateType(DateType.ONLY_DATE)
              // 设置生成的service接口的名字的首字母是否为I，默认Service是以I开头的
              .setServiceName("%sService")
              //实体类结尾名称
              .setEntityName("%s")
              //生成基本的resultMap
              .setBaseResultMap(true)
              //不使用AR模式
              .setActiveRecord(false)
              //生成基本的SQL片段
              .setBaseColumnList(true);

      //2. 数据源配置
      DataSourceConfig dsConfig = new DataSourceConfig();
      // 设置数据库类型
      dsConfig.setDbType(DbType.MYSQL)
              .setDriverName("com.mysql.cj.jdbc.Driver")
              // 修改！
              .setUrl("jdbc:mysql://192.168.237.130:3306/test?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai")
              .setUsername("root")
              .setPassword("123456");

      //3. 策略配置globalConfiguration中
      StrategyConfig stConfig = new StrategyConfig();
      //全局大写命名
      stConfig.setCapitalMode(true)
              // 数据库表映射到实体的命名策略
              .setNaming(NamingStrategy.underline_to_camel)
              // 使用lombok，前面我们已经添加了lombok插件
              // lombok添加：https://www.jianshu.com/p/5c6f104bbcac
              .setEntityLombokModel(true)
              //使用restcontroller注解
              .setRestControllerStyle(true);
              // 生成的表, 支持多表一起生成，以数组形式填写
              // 修改！
//              .setInclude("user");

      //4. 包名策略配置
      PackageConfig pkConfig = new PackageConfig();
      pkConfig
              .setParent("park.base.mybatis.plus")
              .setMapper("mapper")
              .setService("service")
              .setController("controller")
              .setEntity("entity")
              .setXml("xml");

      //5. 整合配置
      AutoGenerator ag = new AutoGenerator();
      ag.setGlobalConfig(config)
              .setDataSource(dsConfig)
              .setStrategy(stConfig)
              .setPackageInfo(pkConfig);

      //6. 执行操作
      ag.execute();
      System.out.println("======= 代码自动生成完毕！ ========");
  }
}