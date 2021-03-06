package com.molicloud.mqr.plugin.core.annotation;

import java.lang.annotation.*;

/**
 * 自定义任务调度注解
 *
 * @author feitao yyimba@qq.com
 * @since 2020/11/28 2:40 下午
 */
@Inherited
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PJob {

    /**
     * cron 表达式<br/>
     *
     * 例：0 * * * * ?    表示每分钟的0秒被执行<br/>
     * 例：0 10 * * * ?   表示每个小时的10分0秒被执行<br/>
     *
     * @return
     */
    String cron();

    /**
     * 定义钩子名<br/>
     *
     * 定义钩子名后，执行任务时，可以在线程上下文中获取对应钩子的配置信息
     *
     * @return
     */
    String hookName() default "";
}