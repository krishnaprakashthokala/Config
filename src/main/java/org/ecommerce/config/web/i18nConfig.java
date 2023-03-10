package org.ecommerce.config.web;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 * @author sergio
 */
@Configuration
public class i18nConfig {
    
    @Autowired
    private Environment env;

    @Bean(name="messageSource")
    public MessageSource  provideMessageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setCacheSeconds(env.getProperty("i18n.cache.seconds", Integer.class, 30));
        messageSource.setUseCodeAsDefaultMessage(true);
        messageSource.addBasenames(
                env.getProperty("i18n.admin.messages.basename"), 
                env.getProperty("i18n.frontend.messages.basename"),
                env.getProperty("i18n.common.messages.basename"));
        messageSource.setFallbackToSystemLocale(true);
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
    
    @Bean(name="localeChangeInterceptor")
    public LocaleChangeInterceptor provideLocaleChangeInterceptor(){
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("lang");
        return localeChangeInterceptor;
    }
    
    @Bean(name="sessionLocaleResolver")
    public SessionLocaleResolver provideSessionLocaleResolver(){
        SessionLocaleResolver localeResolver= new SessionLocaleResolver();
        localeResolver.setDefaultLocale(new Locale("en","IN"));
        return localeResolver;
    }
}

