package com.paulo2308.MAD;

import com.paulo2308.MAD.configurations.ConfigurationFiles;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;


public class TestExecutor {
    @Mock
    private IDownloadFile iDownloadFile;
    private IUnzipFile iUnzipFile;
    private ConfigurationFiles configurationFiles;

    @Test
    public void TestDoDownloadWithSuccess(){
        iDownloadFile = mock(DownloadFile.class);
        iUnzipFile = mock(UnzipFile.class);
        configurationFiles = mock(ConfigurationFiles.class);

        Mockito.doNothing().when(iDownloadFile).DoDownload("google.com", "p:");

        Executor exec = new Executor(iDownloadFile, iUnzipFile, configurationFiles);
        try {
            exec.RunProgram();
            Assert.assertTrue(true);
        } catch(Exception e){
            Assert.assertTrue(false);
        }

    }

    @Test
    public void TestUnzipFileWithSuccess(){
        iUnzipFile = mock(UnzipFile.class);
        iDownloadFile = mock(DownloadFile.class);

        Mockito.doNothing().when(iUnzipFile).descompact("pasta1", "pasta2");

        Executor exec = new Executor(iDownloadFile, iUnzipFile, configurationFiles);
        try {
            exec.RunProgram();
            Assert.assertTrue(true);
        } catch(Exception e){
            Assert.assertTrue(false);
        }
    }
}
