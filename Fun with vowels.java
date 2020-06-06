import java.util.*;




class TestClass{
public static void main(String arg[] )throws Exception {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();int d=1;int c=1;
    char s1[]={'a','e','i','o','u'};
    char a='a';int j;
    TreeSet <Integer> ls=new TreeSet<Integer>();
    for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)==a){
        for(j=1;j<=s.length()-1;j++){
            if(s.charAt(j)==a){
                c=c+1;}
                else{
                    if(s.charAt(j)<a)
                        continue;
                }
                if(j!=s.length()-1){
                    if(a<s.charAt(j+1))
                    a=s1[d++];
                }
        }
        }
        ls.add(c);
        c=1;
        d=0;
        a=s1[d];
    }
    System.out.print(ls.pollLast());
}
}  
