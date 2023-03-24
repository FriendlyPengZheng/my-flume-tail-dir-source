package com.cn.taildir.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "tail")
@Data
public class TailConfig {
    private String filePaths;
    //  private   String homePath = System.getProperty("user.home").replace('\\', '/');
    private String positionFilePath;
    //  private   Path positionFile = Paths.get(positionFilePath);
    private int batchSize;
    private boolean SkipToEnd;
    private int idleTimeout;
    private int writePosInterval;
    private int maxBatchCount;


}
