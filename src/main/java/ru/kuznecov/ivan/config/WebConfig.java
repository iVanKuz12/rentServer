package ru.kuznecov.ivan.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


import java.util.Collections;
import java.util.List;

@Configuration
@EnableWebMvc
@ComponentScan("ru.kuznecov.ivan")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(new ObjectMapper().disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));


        converters.add(converter);
    }
}
