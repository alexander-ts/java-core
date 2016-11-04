package com.alexander.homework.generics;

public class Main {
   static class  Generic<T, V>{
       public T Type;
       public V value;
       public T getType() {
           return Type;
       }

       public V getValue() {
           return value;
       }

       public void setType(T type) {
           this.Type = type;
       }

       public void setValue(V value) {
           this.value = value;
       }
   }

    public static void main(String[] args) {
       Generic obj = new Generic();
        obj.setType("Car");
        obj.setValue(65);
        System.out.println(obj.getType());
        System.out.println(obj.getValue());


    }
}
