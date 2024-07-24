import java.util.*;
class map{
    public static void main(String args[]){
        HashMap<String,Integer> a=new HashMap<>();
        a.put("java",4000);
        a.put("C++",3500);
        a.put("python",3999);
        //System.out.println(a);      //output={C++=3500, python=3999, java=4000}

        a.forEach((key,value)->{
            System.out.println(key +" => "+ value);     
        }); 

        //output
        //C++ => 3500
        //python => 3999
        //java => 4000                                             
                                                           
        
        //To find the value

        System.out.println(a.get("java"));          //output=4000
    }
}
