import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ClassWork {
    public ClassWork() {
    }

    public int[] generateArray() {
        int[] myArray = new int[10];
        for(int i=0; i<10;i++) {
            myArray[i] = i;
        }
        return myArray;
    }

    public void generateMatrix() throws IOException {
        FileWriter fileWriter = new FileWriter("src/test.txt");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter number of columns:");
        int numberOfColumns = scanner.nextInt();
        int maxRandomNumber = 1000;
        int array[][] = new int[numberOfRows][numberOfColumns];
        for(int i =1; i <= numberOfRows; i++) {
            for(int j =1; j <= numberOfColumns; j++) {
                int randomNumber = random.nextInt(maxRandomNumber);
                String line = Integer.toString(randomNumber);
                fileWriter.write(line);
                if (i != numberOfColumns) {
                    fileWriter.write(" ");
                }
            }
            fileWriter.write("\r\n");
        }
        fileWriter.close();
        scanner.close();

    }

    public void read() throws IOException {

        String pathToFile = "src/test.txt";
        FileReader reader = new FileReader(pathToFile);
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        reader.close();
        scanner.close();

        }

    public void write() throws IOException {
        Random random = new Random();
        String pathToFile = "src/test.txt";
        FileWriter fileWriter = new FileWriter(pathToFile);
        int sizeOfArray = 10;
        int maxRandomNumber = 1000;
        fileWriter.write(Integer.toString(sizeOfArray));
        fileWriter.write("\n");
        for(int i =1; i <= sizeOfArray; i++) {
            int randomNumber = random.nextInt(maxRandomNumber);
            String line = Integer.toString(randomNumber);
            fileWriter.write(line);
            if (i != sizeOfArray) {
                fileWriter.write(" ");
            }
        }
        fileWriter.close();
    }

}
