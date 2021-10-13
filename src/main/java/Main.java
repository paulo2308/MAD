public class Main {
    public static void main(String[] args) {
        String enderecoUrl = "https://transparencia.tce.sp.gov.br/sites/default/files/csv/despesas-sao-bernardo-do-campo-2021.zip";
        String enderecoArquivoZip = "C:\\Users\\paulo\\Documents\\MAD\\src\\main\\resources\\cidade.zip";
        String pastaDestino = "C:\\Users\\paulo\\Documents\\MAD\\src\\main\\resources\\";

        DownloadFile arquivo = new DownloadFile();
        UnzipFile descompactaArquivo = new UnzipFile();

        arquivo.FazDownload(enderecoUrl, enderecoArquivoZip);
        descompactaArquivo.descompacta(enderecoArquivoZip, pastaDestino);
    }
}
