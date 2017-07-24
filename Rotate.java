public class Rotate{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
ArrayList<Integer> a=new ArrayList<Integer>();
System.out.println("Enter n values");
Integer n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++){
a.add(Integer.parseInt(br.readLine()));
}
System.out.println("Enter key value");
Integer key=Integer.parseInt(br.readLine());
Collections.rotate(a,key);
 System.out.println(Arrays.toString(a.toArray()));
}
}
