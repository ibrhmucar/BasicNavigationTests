package com.cbt.utilities;

public class StringUtility {


        public static void getCheck(String expected, String actual){


            if(expected.equals(actual)){
                System.out.println("Pass");
            }else{
                System.out.println("Fail");
            }

        }

    }

