/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

import java.util.Scanner;
public class loginconsole {
    public loginconsole {
    
}    
    public static void main(String[] args) {
        boolean loginstatus=false;
        Scanner sc=new Scanner(System.in);
        int n=0;
        
        do{
            System.out.println("********LOGIN CONSOLE**********");
            System.out.println("1. admin login");
            System.out.println("2. liabrarian login");
            System.out.println("3. exit");
            System.out.println(" please enter your choice");
            n=sc.nextInt();
            switch(n){
                case 1:
                System.out.println("enter the username");
                String name=sc.next();
                System.out.println("enter password");
                String pass=sc.next();
                adminlogin admin=new adminlogin();
                loginstatus=admin.checklogin(name,pass);
                       
                       if(loginstatus){
//                        admin.open adminconsole();    
                    }
                       System.exit(0);
                       break;
                case 2:
                    System.out.println("librarian login func");
                    break;
                      }
        }
            while(n!=3);
         }
                           
                    
                    
        }
          
        
