package com.bj58.hrg.investment.common;

/**
 * @class Assert
 * @author lzxz1234
 * @description 
 * @version v1.0
 */
public class Assert {

    public static void notNull(Object target, String format, Object... args) {
        
        if(target == null)
            throw new RuntimeException(String.format(format, args));
    }
    
}
