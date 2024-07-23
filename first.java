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
        
      System.out.println(name.size());     //output=4           
        
     }
}
