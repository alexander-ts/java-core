package com.alexander.homework.myexception;

class StringSetter{
    StringSetter(String s) throws ContainsLetterException{
        if (s.contains("s")) {
            throw  new ContainsLetterException("Error!");
        }
        else{
            System.out.println("Success!");
        }
    }
}

class ContainsLetterException extends Error{
   ContainsLetterException(String s){
     super(s);
    }
}

public class Main {
    public static void main(String[] args) throws ContainsLetterException {
        try{
            StringSetter a = new StringSetter("s");
        }
        catch (ContainsLetterException ex){
            System.out.println("Please, put another letter");
        }
    }
}
