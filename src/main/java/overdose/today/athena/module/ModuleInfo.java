package overdose.today.athena.module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ModuleInfo {
    String name() default "Module";
    String description() default "No description provided.";
    ModuleCategory category() default ModuleCategory.MISCELLANEOUS;
    int key() default 0;
}
