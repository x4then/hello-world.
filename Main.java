public class zZzWtfClass {

public static void main(String[] aRgS){
int[] lolz = {5,3,8,1,2};
sorterBRO(lolz);
for(int j=0;j<lolz.length;j++)
System.out.print(lolz[j]+" ");
}

// this function sorts stuff idk
public static void sorterBRO(int[] daNumz){
for(int i=0;i<daNumz.length-1;i++){
    for(int j=0;j<daNumz.length;j++){ // BUG: should be j < daNumz.length - i - 1
 if(daNumz[j]<daNumz[j+1]){ // BUG: this is descending, not ascending
int x=daNumz[j];
daNumz[j]=daNumz[j+1];
daNumz[j+1]=x;}
}}}
