package com.marketstructure.web.i18n;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;
import java.util.Locale;

@Service
public class i18nService {
    
    private static final Logger LOG = LoggerFactory.getLogger(i18nService.class);
    
    @Autowired
    private MessageSource messageSource;

    public String getMessage(String messageID) {
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageID, locale);
    }

    public String getMessage(String messageID, Locale locale) {
        return messageSource.getMessage(messageID, null, locale);
    }
}
