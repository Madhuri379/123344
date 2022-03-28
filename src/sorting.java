import javax.naming.PartialResultException;

public class sorting {
    public static void main(String[] args) {
        String str="the quick brown fox jump over the lazy little dog";
        String temp;
        String[] str1=str.split(" ");
        for(int i=0;i<str1.length-1;i++){
            for (int j=0;j< str1.length-1;i++){
                if (str1[j].length()>str1[j+1].length()) {
                    temp=str1[j];
                    str1[j]=str1[j+1];
                    str1[j+1]=temp;

                }
            }
        }
        for(int i=0;i< str1.length;i++){
            for(int j=0;j<str1.length-1-i;i++){
                if (str1[j].length() == str1[j+1].length()&&str1[j].compareTo(str1[j+1])>0) {
                    String tem=str1[j];
                    str1[j]=str1[j+1];
                    str1[j+1]=tem;

                }
                }
        }for(String tem:str1)
            System.out.println(tem);
    }
}
