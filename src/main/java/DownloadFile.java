import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DownloadFile {

    private URL url = null;
    private File file = null;

    public void FazDownload(String enderecoUrl, String enderecoArquivo) {

        try {
            url = new URL(enderecoUrl);
            file = new File(enderecoArquivo);

            FileUtils.copyURLToFile(url, file);
        }
        catch (IOException e){
            System.out.println("Erro ao tentar baixar arquivo\n" + e.getMessage());
        }
    }
}