public class AgeToGroup {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);

        int ageGroup = (age<= 18)?1:(age>65)?2:0;
            
        System.out.println("Age: " + age + ", Age Group: " + ageGroup);
    }
}