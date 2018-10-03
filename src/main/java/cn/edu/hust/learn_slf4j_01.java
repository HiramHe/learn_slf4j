package cn.edu.hust;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class learn_slf4j_01 {

    private static final Logger logger= LoggerFactory.getLogger(learn_slf4j_01.class);

    public static void main(String[] args) {

        //SLF4J支持{}作为占位符，等价于C语言中的%s，而不必再进行字符串的拼接，效率有显著的提升
        //而无需关心日志是通过哪个日志系统，以什么风格输出的。因为它们取决于部署项目时绑定的日志系统。
        //例如，在项目中使用了SLF4J记录日志，并且绑定了log4j，则日志会以log4j的风格输出；
        // 后期需要改为以logback的风格输出日志，只需要将log4j替换成logback即可，不用修改项目中的代码。
        logger.info("Current Time: {}",System.currentTimeMillis());
    }
}
