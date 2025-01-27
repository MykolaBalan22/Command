package service;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class BookService {

    public static boolean isExistBook(String book) {
        return new File("src/resources" + book).exists();
    }

    public static void startDialog(){
        Scanner input = new Scanner(System.in);
        String bookName;
        do {
            System.out.println("-----------------------------");
            System.out.println("Enter book name or \"exit\" for close programm: ");
            bookName = input.next();

            if (bookName.equals("exit")){
                break;
            }else if(BookService.isExistBook(bookName)){

            }else{
                System.err.println("This book not found , try again !!!");
            }
        } while (bookName.equals("exit"));

    }


//    public static List<String> getMostPopularWords(String bookName) {
//
//        TreeMap<String, Integer> uniqueWordss = new TreeMap<>();
//        File book = new File("src/resources" + bookName);
//
//        try (BufferedReader inputData = new BufferedReader(new FileReader(book))) {
//            String currentLine = null;
//            while ((currentLine = inputData.readLine()) != null) {
//                String[] words = currentLine.split("");
//                Arrays.stream(words)
//                        .peek(String::toLowerCase)
//                        .forEach(s->{
//
//                });
//            }
//        } catch (IOException exception) {
//            System.err.println("some problems during reading book" + exception.getMessage());
//
//        }
//    }


}
