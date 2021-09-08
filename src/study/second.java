package study;

public class second {
    public static void main(String args[]){
        String s1="How to play and eat";
        String s2="Hello world";
        int length=s1.length();
        int firstindex=s1.indexOf(' ');
        int lastindex=s1.indexOf(' ');
        String firstworld=s1.substring(0,firstindex);
        String lastworld=s1.substring(lastindex+1,length);
        System.out.println("第一个单词为："+firstworld);
        System.out.println("最后一个单词为："+lastworld);
        String stringArray[]=s1.split(" ");
        System.out.println("拆分之后的各单词：");
        for(int i=0;i<stringArray.length;i++){
            System.out.println(stringArray[i]);
        }
        String s3=s1.concat(s2);
        System.out.println(s3);
        String s4=s1.toLowerCase();
        System.out.println(s4);
        String s5=s1.replaceFirst("(?!)and","hai");
        System.out.println(s5);
    }

}
