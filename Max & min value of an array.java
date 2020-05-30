public class Main
{
public static void main(String[] args) {
int[] arr = {23, 92, 56, 39, 93};
int n=arr.length;
int max = 0;

for(int i=0; i&lt;n; i++ ) {
if(arr[i]&gt;max) {
max = arr[i];

}
}
System.out.println(max);
int min = arr[0];
for(int i=0; i&lt;n; i++ ) {
if(arr[i]&lt;min) {
min = arr[i];

}
}
System.out.println(min);
}
}
