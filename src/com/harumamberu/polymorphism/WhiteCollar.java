package com.harumamberu.polymorphism;

import java.util.Scanner;

public class WhiteCollar extends Human {
    private String companyName, legalchars;
    char[] legalcharsArr = new char[55];
    private int flag;

    public WhiteCollar(String name, int age, String companyName){
        super(name, age);
        this.companyName = companyName;
    }

    public void setCompanyName(String companyName){
        for(int i = 0; i < companyName.length(); i++){
            for(int j = 0; j < legalcharsArr.length; j++){
                if(companyName.charAt(i) == legalcharsArr[j]){
                    flag++;
                }
            }
        }
        if(flag==companyName.length()){
            this.companyName = companyName;
            System.out.println("Company name '"+ companyName + "' is setted");
        }else {System.out.println("Company name '"+ companyName + "' is invalid");}
    }

    public void setlegalchars(){
        for (int i = 0; i<26; i++){
            legalcharsArr[i] = (char) (65+i);
            legalcharsArr[i+26] = (char) (97+i);
        }
        legalcharsArr[52]=32;
        legalcharsArr[53]=44;
        legalcharsArr[54]=45;
    }

}
