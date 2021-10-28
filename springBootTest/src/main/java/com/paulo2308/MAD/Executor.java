package com.paulo2308.MAD;

import com.paulo2308.MAD.configurations.ConfigurationFiles;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public class Executor {

    private IDownloadFile iDownloadFile;
    private IUnzipFile iUnzipFile;
    private ConfigurationFiles config;
    
    public Executor(IDownloadFile iDownloadFile, IUnzipFile iUnzipFile, ConfigurationFiles config) {
        this.iDownloadFile = iDownloadFile;
        this.iUnzipFile = iUnzipFile;
        this.config = config;
    }

    public void RunProgram() {
        String addressUrl =  config.getAddressUrl();
        String addressZipFile = "C:\\Users\\paulo\\Documents\\MAD\\src\\main\\resources\\cidade.zip";
        String destinyFolder = "C:\\Users\\paulo\\Documents\\MAD\\src\\main\\resources\\";

        WeekFilter weekFilter = new WeekFilter(new ReadFile());

        iDownloadFile.DoDownload(addressUrl, addressZipFile);
        iUnzipFile.descompact(addressZipFile, destinyFolder);
        weekFilter.lastSevenDays(destinyFolder);
    }
}
