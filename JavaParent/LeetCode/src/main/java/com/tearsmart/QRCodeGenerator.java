package com.tearsmart;

import com.google.common.collect.Lists;
import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述：     生成二维码工具
 */
public class QRCodeGenerator {


    public static void generateQRCodeImage(String text, int width, int height, String filePath)
            throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }
    public static void main(String[] args) throws Exception {
        // try {
        //     Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
        //     hints.put(EncodeHintType.MARGIN, 0);
        //     BitMatrix bitMatrix = new QRCodeWriter().encode("生成二维码的内容",
        //             BarcodeFormat.QR_CODE, 256, 256,hints);
        //     int width = bitMatrix.getWidth();
        //     int height = bitMatrix.getHeight();
        //     BufferedImage image = new BufferedImage(width, height,BufferedImage.TYPE_INT_ARGB);
        //     for (int x = 0; x < width; x++) {
        //         for (int y = 0; y < height; y++) {
        //             image.setRGB(x, y, bitMatrix.get(x, y) == true ?
        //                     Color.BLACK.getRGB(): Color.WHITE.getRGB());
        //         }
        //     }
        //     ImageIO.write(image,"png", new File("D:/QRTest.png"));
        //     // generateQRCodeImage(base64Str, 350, 350, "D:/QRTest.png");
        // } catch (WriterException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        // QRReader(new File("D:\\1.png"));
        ArrayList<String> list = Lists.newArrayList("A", "b", "ab", "abc", "a", "ab", "a", "abcd", "bd", "abc");
            //结果：abababcaabaabcdbdabc
            list.stream().peek(String::toLowerCase).forEach(System.out::print);

    }
    /**
     * 识别二维码
     */
    public static void QRReader(File file) throws IOException, NotFoundException {
        MultiFormatReader formatReader = new MultiFormatReader();
        //读取指定的二维码文件
        BufferedImage bufferedImage =ImageIO.read(file);
        BinaryBitmap binaryBitmap= new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(bufferedImage)));
        //定义二维码参数
        Map  hints= new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        com.google.zxing.Result result = formatReader.decode(binaryBitmap, hints);
        //输出相关的二维码信息
        System.out.println("解析结果："+result.toString());
        System.out.println("二维码格式类型："+result.getBarcodeFormat());
        System.out.println("二维码文本内容："+result.getText());
        bufferedImage.flush();
    }
}