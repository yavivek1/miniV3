package com.vksprojects.miniv3.config;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Class is responsible for configuring data source and data directory for application.
 * Created by vivek on 3/13/18.
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class AppConfig {

    private static final Logger logger = LogManager.getLogger(AppConfig.class);

    @Autowired
    private Environment env;

    /**
     * Method created DataSource Bean by reading settings in application.yml
     * @return DataSource
     */
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.dataSource.driver-class-name"));
        dataSource.setUrl(env.getProperty("spring.dataSource.url"));
        dataSource.setUsername(env.getProperty("spring.dataSource.username"));
        dataSource.setPassword(env.getProperty("spring.dataSource.password"));
        return dataSource;
    }


    @Value("${filesystem.storage.path.root-dir: miniv3}")
    private String baseLocation;

    @Value("${filesystem.storage.path.absolute: false}")
    private boolean isAbsolutePah;

    /**
     * Method creates Bean to hold Path to storage directory as specified in settings and created directory if doesn't exist already.
     * @return Path to storage directory
     */
    @Bean
    public Path baseDirectory() {
        Path path = null;
        if(isAbsolutePah) path = Paths.get(baseLocation);
        else path = Paths.get(System.getProperty("user.home"), baseLocation);
        if(!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            }catch (IOException e) {
                logger.error("Unable to create baseDirectory with path: " + path);
            }
        }
        return path;
    }

    /**
     * Creates Bean for Apache ServletFileUpload.
     * @return
     */
    @Bean
    public ServletFileUpload servletFileUpload() {
        return new ServletFileUpload();
    }

}
