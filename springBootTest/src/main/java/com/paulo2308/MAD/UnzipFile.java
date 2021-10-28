package com.paulo2308.MAD;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipFile implements IUnzipFile{

    private static final int BUFFER = 2048;

    public void descompact(String enderecoArquivo, String pastaDestino) {
        try {

            String zipFile = enderecoArquivo;

            File file = new File(pastaDestino);

            if (file.exists() == false) {
                file.mkdirs();
            }

            BufferedOutputStream dest = null;
            FileInputStream fis = new FileInputStream(zipFile);
            ZipInputStream zis = new ZipInputStream(new BufferedInputStream(fis));
            ZipEntry entry;

            while ((entry = zis.getNextEntry()) != null) {

                int contador;
                byte data[] = new byte[BUFFER];

                FileOutputStream fos = new FileOutputStream(pastaDestino + entry.getName());
                dest = new BufferedOutputStream(fos, BUFFER);
                while ((contador = zis.read(data, 0, BUFFER)) != -1) {
                    dest.write(data, 0, contador);
                }
                dest.flush();
                dest.close();
            }
            zis.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
