/*
 * @author ruby
 * @since 160404
 * demo how to use file decorator
 */

package com.j1.w5;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class FileDemoMain {
    public static void main(String[] args) throws Exception {
        File readme=null;
        InputStream isReadme = null;
        InputStreamReader isrReadme = null;
        int i;
        char c;
        String str;
        BufferedReader brReadme=null;
      
        try{
            // new input stream created
            File myhome=new File(System.getProperty("user.home"));
            System.out.println("myhome is "+myhome);

            String cwd=new File( "." ).getCanonicalPath();
            System.out.println("current working dir is "+cwd);

            readme=new File("C:/Users/ruby/Documents/javaDesign2016/j1_201211173","hello.txt");
            System.out.println("readme file is "+readme);

            isReadme=new FileInputStream(readme);
            System.out.println("Characters printed:");
            while((i=isReadme.read())!=-1) {
                c=(char)i;
                System.out.print(c);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(isReadme != null)
                isReadme.close();
        }
        try{
          isReadme = new FileInputStream(readme);
          isrReadme = new InputStreamReader(isReadme,"UTF8");
          brReadme = new BufferedReader(isrReadme);
          
          while((str=brReadme.readLine())!=null){
            System.out.println("--"+str);
          }
          
        }catch(Exception e){
          e.printStackTrace();
        }finally{
          if(brReadme != null)brReadme.close();
        }
       
    }
}