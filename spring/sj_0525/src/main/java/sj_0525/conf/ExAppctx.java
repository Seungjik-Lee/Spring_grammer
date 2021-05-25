package sj_0525.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import sj_0525.anno.MyAnno;

@Configuration
@ComponentScan(basePackages = {"mh0525.beans"}, excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = {MyAnno.class}))
public class ExAppctx {

}
