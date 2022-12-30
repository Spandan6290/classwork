public class Vowels_Count {
    public static void main(String[] args) {
       String str = " My name is Spandan";
       vowels_count(str);
    }

    public static void vowels_count(String str) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char str1 = str.charAt(i);
            if(str1=='a'||str1=='e'||str1=='i'||str1=='o'||str1=='u'){
                count++;
            }
        }
        System.out.println("Number of vowels are "+count);
    }
}
