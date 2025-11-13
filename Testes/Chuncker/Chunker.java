package Java.Testes.Chuncker;

import java.io.*;
import java.util.Scanner;

public class Chunker {
    // 1 - check file size
    // 2 - estimate how many chunk will be and their size
    // 3 - read the chunks
    // 4 -
    // 5 - put they in files
    static String filePath() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type the file path: ");
        String response = scanner.nextLine();
        System.out.println(response);
        scanner.close();
        return response;
    }
    static int numberOfChunks(long size, int maxChunkSize) {
        int result = Math.toIntExact(size / maxChunkSize);
        return size % maxChunkSize != 0 ? result+1 : result;
    }

    static String appendName(File file, String nameToAppend, String extension) {
        String fileName = file.getName();
        int dot = fileName.lastIndexOf('.');

        String baseName = (dot == -1) ? fileName : fileName.substring(0, dot);
        return baseName + nameToAppend + extension;
    }

    public static void main(String[] args) {
        File file = new File(filePath());

        int chunkSize = 1024;
        int numberOfChunks = numberOfChunks(file.length(),chunkSize);
        byte[][] buffer = new byte[numberOfChunks][chunkSize];
        try {
            InputStream inputStream = new FileInputStream(file);
            for (int i = 0; i < numberOfChunks; i++) {
                inputStream.read(buffer[i]);
            }
            inputStream.close();
            for (int i = 0; i < numberOfChunks; i++) {
                File newFile = new File(appendName(file,"_part_"+i,".bin"));
                newFile.createNewFile();
                OutputStream outputStream = new FileOutputStream(newFile);
                outputStream.write(buffer[i]);
                outputStream.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}