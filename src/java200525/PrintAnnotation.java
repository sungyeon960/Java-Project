package java200525;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//타겟이 필요
@Target({ElementType.METHOD})
//동작을 runtime까지 유지하겠다
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	// value라 하는 메소드형태
	String value() default "-"; 
	int number() default 15;
}
