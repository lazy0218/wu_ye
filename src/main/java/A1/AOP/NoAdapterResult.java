package A1.AOP;
/**
 * @author 闫瑞松
 * @date 2021/11/27 9:39
 * @phone 18531958592
 * @function T1
 */

import java.lang.annotation.*;

/**
 * 标识注解，使用此注解标识方法返回结果不需要进行统一包装
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD}) //该注解适用于方法上
@Documented
public @interface NoAdapterResult {
}