import java.io.*;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {
        //This was for creating a new file in java
//        File file= new File("SuperFile");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            System.out.println("File has not been created due to some issue.");
//            throw new RuntimeException(e);
//        }

//        Now how to read a file in java
//        try {
//            Scanner sc =new Scanner(newFile);
//            while (sc.hasNextLine()) {
//                String Line = sc.nextLine();
//                System.out.println(Line);
//            }
//            sc.close();
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("An issue has occured in Reading a file");
//            throw new RuntimeException(e);
//        }

//        Now how to Write in a file

//        try {
//            FileWriter MyfileWrite = new FileWriter("SuperFile");
//            MyfileWrite.write("This is the content of the created file by the user \n This the Line break will it work?");
//            MyfileWrite.close();//Closing the file in jav is very important
//        } catch (IOException e) {
//            System.out.println("Failed to write in a file.");
//            throw new RuntimeException(e);
//        }
//          Now to delete a file in java

        File newFile = new File("WhatisitsName","SuperFile");
        if(newFile.delete())
        {
            System.out.println("This file has been deleted " + newFile.getName() );
        }
        else {
            System.out.println("The file has not been deleted due to some errror");
        }
    }
}