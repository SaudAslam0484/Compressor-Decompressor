/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compressor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author asifk
 */
public class decompressor {
    public static void method(File file) throws IOException{
        String filedirectory=file.getParent();
        FileInputStream fis=new FileInputStream(file);
        GZIPInputStream gzip=new GZIPInputStream(fis);
        FileOutputStream fos=new FileOutputStream("F:\\Minor Projects\\Compressor decompressor\\Decompress file\\"+"decompress");
        byte[]buffer =new byte[6*1024];
        int len;
        while((len=gzip.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        gzip.close();
        fis.close();
        fos.close();
        
    }
    public static void main(String[] args) throws IOException {
        File path=new File("F:\\Minor Projects\\Compressor decompressor\\Test filecompress1.gz");
        method(path);
    }
}
`