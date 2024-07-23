//first program

import java.util.*;
class first{
    public static void main(String args[]){

        //Type safe means only one type of object either String or integer 
        ArrayList<String> name=new ArrayList<String>();
        name.add("Rajeev");
        name.add("Akash");
        name.add("Amit");
        name.add("Rajeev");
        
      System.out.println(name);            //output=[Rajeev,Akash,Amit,Rajeev]
      System.out.println(name.remove("Rajeev"));      //output=[Akash,Amit,Rajeev]
        
        //un-type safe means we can put string and integer etc
    }
}

//Second program


import java.util.*;
class first{
    public static void main(String args[]){

        ArrayList<String> name=new ArrayList<String>();
        name.add("Rajeev");
        name.add("Akash");
        name.add("Amit");
        name.add("Rajeev");

        //To find the size
      System.out.println(name.size());     //output=4    

        //to check the element
       System.out.println(name.contains("Rajeev"));    //output=true

        //To check is it empty or not
        System.out.println(name.isEmpty());        //output=false

        //Is used to clear all the element
        System.out.println(name.clear());            //output=[]

        //add value to that index
        name.add(1,Aman);
        System.out.println(name);        //output=[Rajeev,Aman,Akash,Amit,Rajeev]

        //replace the value
        name.set(1,Akash);
        System.out.println(name);        //output=[Rajeev,Aman,Akash,Amit,Rajeev]
        
     }
}


//3rd program


