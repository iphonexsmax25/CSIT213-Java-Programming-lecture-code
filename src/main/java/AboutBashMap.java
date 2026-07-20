import java.util.HashMap;

public class AboutBashMap {
    public static void main (String[] args){
        test1();
    }
    public static void test1(){
        HashMap<String, Integer> enrolment = new HashMap<>();
        enrolment.put("CSIT121", 280);
        enrolment.put("CSIT128", 150);
        enrolment.put("CSIT213", 250);
        enrolment.put("CSIT121", 300); // replace original value
        // Accessing HashMap
        for(String modCode : enrolment.keySet()){
            System.out.println(modCode);
        }
        for(int classSize : enrolment.values()){
            System.out.println(classSize);
        }
        // USe th key to get the value
        for(String modCode : enrolment.keySet()){
            System.out.println(modCode + " " + enrolment.get(modCode));
        }
    }
    
}
