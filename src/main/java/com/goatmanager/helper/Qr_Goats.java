package com.goatmanager.helper;

import com.goatmanager.modules.goats.entity.Goats;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


@Component
public class Qr_Goats {

    public byte[]  generateQrCode(String url,int width,int height)  {
       try {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(url, BarcodeFormat.QR_CODE,width,height);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "png", baos);
        return baos.toByteArray();
       } catch (WriterException | IOException e) {
           throw new RuntimeException("Lỗi Trong Việc Tạo QR");
       }
    }

}
