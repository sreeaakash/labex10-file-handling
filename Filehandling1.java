/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling1;
import java.io.*;
import java.io.File;

/**
 *
 * @author Admin
 */
public class Filehandling1 {

    /**
     * @param args the command line arguments
     */
    private static String fileExtension(File f2)
    {
        String name=f2.getName();
        if(name.lastIndexOf(".")!=-1&&name.lastIndexOf(".")!=0)
            return  name.substring(name.lastIndexOf(".")+1);
        else
             return "";
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File f2=new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\filehandling1\\src\\filehandling1\\textfile.txt");
        System.out.println("Name-->"+f2.getName());
        if(f2.exists())
        {
            System.out.println("File exists");
        }
        else
               System.out.println("File Does not exists");
        
        System.out.println(f2.canRead());
        System.out.println(f2.canWrite());
        System.out.println(f2.length());
        System.out.println("The file extension is"+fileExtension(f2));
       
        
        
    }

    
    }

    
    
    

