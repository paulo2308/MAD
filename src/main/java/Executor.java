public class Executor {

    private IDownloadFile iDownloadFile;
    private IUnzipFile iUnzipFile;

    public Executor(IDownloadFile iDownloadFile, IUnzipFile iUnzipFile) {
        this.iDownloadFile = iDownloadFile;
        this.iUnzipFile = iUnzipFile;
    }

    public void RunProgram() {
        String addressUrl = "https://transparencia.tce.sp.gov.br/sites/default/files/csv/despesas-itapevi-2021.zip";
        String addressZipFile = "C:\\Users\\paulo\\Documents\\MAD\\src\\main\\resources\\cidade.zip";
        String destinyFolder = "C:\\Users\\paulo\\Documents\\MAD\\src\\main\\resources\\";

        WeekFilter weekFilter = new WeekFilter(new ReadFile());

        iDownloadFile.DoDownload(addressUrl, addressZipFile);
        iUnzipFile.descompact(addressZipFile, destinyFolder);
        weekFilter.lastSevenDays(destinyFolder);
    }
}
