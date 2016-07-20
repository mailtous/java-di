package org.osgl.genie.annotation;

import org.osgl.genie.ElementLoader;
import org.osgl.genie.KeyExtractor;

import java.lang.annotation.*;

/**
 * Used to specify how to extract {@link java.util.Map} key
 * from a value
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface MapKey {

    /**
     * Specify the `hint` to be passed into {@link KeyExtractor#keyOf(String, Object)}
     * function call
     * @return the `hint` used to extract the key. Default value is ""
     */
    String value() default "";

    /**
     * Specify a {@link KeyExtractor key extractor}. Default value is
     * {@link org.osgl.genie.KeyExtractor.PropertyExtractor}
     */
    Class<? extends KeyExtractor> extractor() default KeyExtractor.PropertyExtractor.class;
}
