public class palandrome_chk{
public static void main(String[] str){
int num=123;
String s=String.valueOf(num);
StringBuilder sc=new StringBuilder();
int l=s.length();
int i=0;
while(i<l){
sc.append(s.charAt(l-i-1));
i++;
}
String revs=sc.toString();
if(s.equals(revs)){System.out.println("palindrome");}
else{System.out.println("Not palindrome");}  
}
}
