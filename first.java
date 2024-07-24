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

import java.util.*;
class first{
    public static void main(String args[]){
        Vector<String>a=new Vector<>();
        a.add("Rajeev");
        System.out.println(a);

        LinkedList <String> a=new LinkedList<>();
        a.add("Rajeev");
        System.out.println(a);
    
    HashSet<Double> b=new HashSet<>();
    b.add(1.1);
    b.add(4.4);
    b.add(7.7);
    System.out.println(b);
    

    TreeSet<Double> c=new TreeSet<>();
    c.add(6.2);
    c.add(2.3);
    c.add(4.5);
    System.out.println(c);      //By default it arrange the data in ascending order
    
    
    TreeSet<String> c=new TreeSet<>();
    c.add("Aman");
    c.add("vinay");
    c.add("Rajeev");
    System.out.println(c);       //output=[Aman,Rajeev,vinay]  

    ArrayList<String>name=new ArrayList<>();
    name.add("Rajeev");
    name.add("Akshat");
    name.add("Akash");
    name.add("Aman");
    // System.out.println(name);

    for(String str:name){
        System.out.print(str + "\t" + str.length() + "\t");
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
    
    //output=           Rajeev  6       veejaR
                        Akshat  6       tahskA
                        Akash   5       hsakA
                        Aman    4       namA
    
    
    }

    
    }
}

//4th program

import java.util.*;
class first{
    public static void main(String args[]){
        ArrayList<String>a=new ArrayList<>();
        a.add("Ram");
        a.add("Shyam");
        a.add("Sita");
        a.add("Rohan");

        //Traversing using iterator: Forward Traversing
        
        Iterator<String>b=a.iterator();
        while(b.hasNext()){
            String c=b.next();
            //System.out.println(c);        //output=Ram,Shyam,Sita,Rohan
        }
        //Backward Traversal of collection LISTITERATOR

            ListIterator<String>d=a.listIterator(a.size());
            while(d.hasPrevious()){
                String e=d.previous();
               // System.out.println(e);      //output=Rohan,Sita,Shyam,Ram
            }

            // --------***************************--------

            //for each method

            a.forEach(e->{
               // System.out.println(e);
            });

            TreeSet<String>i=new TreeSet<>();
            i.addAll(a);
            i.forEach(e->{
               // System.out.println(e);
            });

            
        }
    }


