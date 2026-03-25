import java.util.*;
public class arraysize {
public static void main(String args[])
{
    Scanner scan=new Scanner(System.in);
    System.out.print("Size of array:");
    int n=scan.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=scan.nextInt();
    }
    System.out.print("Array:"+(Arrays.toString(arr)));
   
    int firstlarge=0;
    int secondlarge=0;
    for(int num : arr)
    {
        if(num>firstlarge)
        {
            secondlarge=firstlarge;
            firstlarge=num;
        }
        else if(num>secondlarge && num!=firstlarge);
        {
            secondlarge=num;
        }
    }
    if(secondlarge==0){
        System.out.println("NO");
    }
    else{
        System.out.println("Secondlargest:" +secondlarge);
    }
}
}
