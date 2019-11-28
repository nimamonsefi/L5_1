/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Person p=new Person().setUserName("nimamonsefi")
                .setName("nima").setPassword("123456").setAddress("Tehran")
                .setNumber("09124566784").setDegree("Diploma").setAge("19");
        
        System.out.println("UserName :"+p.getUserName());
        System.out.println("Name :"+p.getName());
        System.out.println("Password :"+p.getPassword());
        System.out.println("Address :"+p.getAddress());
        System.out.println("Number :"+p.getNumber());
        System.out.println("Degree :"+p.getDegree());
        System.out.println("Age :"+p.getAge());
    }
    
}
