class Books{
    String names;
    String author;
    public Books(String names,String author) {
        this.names = names;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getNames() {
        return names;
    }
}
public class String_Class {
    public static void main(String[] args) {
//        Books[] bks = new Books[5];
////        System.out.println("Enter the book names");
//        Scanner sc = new Scanner(System.in);
//        System.out.println(bks.length);
//        for (int i = 0; i < bks.length; i++) {
//            String name = sc.nextLine();
//            String author = sc.nextLine();;
//            bks[i]=new Books(name,author);
//            System.out.println(bks[i].names);
//        }
//        for (int i = 0; i < bks.length; i++) {
//            System.out.println(bks[i].getNames());
//            System.out.println(bks[i].getAuthor());
//        }
//        String str1 = "spandan";
//        String name="Tokyo Ghoul";

        String name = "Good Morning";
//        System.out.println(name.startsWith("Bad"));
//        System.out.println(name.endsWith("Bad"));
//        System.out.println(name.indexOf(' '));
//        String name2 = name.concat("I am fine");
//        System.out.println(name.concat());
//        System.out.println(name);
//        System.out.println(name2);

//        String str1 = new String("I am doing java class");
//        String str2 = new String("I am doing Traning");
//        System.out.println(str1==str2);

//        String str3 = "Spandan";
//        String str3 = "Saibal";

        StringBuilder builder = new StringBuilder("Hello My name is Spandan");
        System.out.println(builder.length());
//        System.out.println(builder);
        System.out.println(builder.append(" I am a good boy"));
        System.out.println(builder.length());
//        System.out.println(builder);
////      System.out.println(builder.reverse());
//        System.out.println(builder.insert(6,"Naruto "));
//        System.out.println(builder.insert(0,"Hii "));
//        System.out.println(builder.replace(15,20,"Python"));
//        System.out.println(builder);
//        System.out.println(builder.delete(0,3));
//        System.out.println(builder.indexOf("Hello"));
//        System.out.println(builder.charAt(5));

//        StringBuffer strbuf = new StringBuffer("Hello World");
//        System.out.println(strbuf);
//        System.out.println(strbuf.append(" World"));
//        System.out.println(strbuf);
//        System.out.println(strbuf.capacity());
//        System.out.println(strbuf.charAt(15));
//        System.out.println(strbuf.indexOf("o"));
//        System.out.println(strbuf.substring(4,10));
//        System.out.println(strbuf);
//        System.out.println(strbuf.deleteCharAt(5));

        int count=0;
        for (int i = 0; i < builder.length(); i++) {
            char ch = builder.charAt(i);
            if (ch==' '){
                continue;
            }
            else {
                count++;
            }
        }
        System.out.println(count);
    }
}
