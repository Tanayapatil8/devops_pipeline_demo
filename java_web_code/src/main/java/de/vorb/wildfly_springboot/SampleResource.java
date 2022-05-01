package de.vorb.wildfly_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.*;
//public class SampleResource
//{
  //  public static void main(String[] args)
    //{
      //  int n=5;
        //for(int i=1;i<=10;i++)
          //  System.out.println(n + " * " + i + " = " + n * i);
   // }    
//}    

@RestController
public class SampleResource {

    @RequestMapping("/")
    public String hello() {
        int n=5;
        for(int i=1;i<=10;i++)
           System.out.println(n + " * " + i + " = " + n * i);
    }
}
