package com.paulo2308.MAD;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DownloadFile implements IDownloadFile{

    private URL url;
    private File file;

    @Override
    public void DoDownload(String addressUrl, String addressArquivo) {

        try {
            url = new URL(addressUrl);
            file = new File(addressArquivo);

            FileUtils.copyURLToFile(url, file);
        }
        catch (IOException e){
            System.out.println("Erro ao tentar baixar arquivo\n" + e.getMessage());
        }
    }

}