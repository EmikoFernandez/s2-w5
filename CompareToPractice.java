import java.util.*;
class Main {
  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<String>(){
      {
        add("vivacious");
        add("weigh");
        add("planes");
        add("art");
        add("sugar");
        add("waggish");
        add("instinctive");
        add("shrug");
        add("clip");
        add("lovely");
        add("mind");
        add("offbeat");
      }
    };

    // char c = 'q';
    // int code = (int)c;
    // System.out.println(code);

    // String s1 = "Dog";
    // String s2 = "dog";
    // String s3 = "doggy";

    // int res = s1.compareTo(s2);
    // System.out.println(res);

    // res = s2.compareTo(s3);
    // System.out.println(res);

    // D = 68, d = 100
    // D - d = -32


    //we will play with compareTo here

    Collections.sort(words);
    System.out.println(words);
  }
}

