public class Main
{
    public static void main(String[] args)
    {
        int numb[]={5,44,11,5,78,49};
        int largest=0;
        for(int i=0;i<numb.length;i++)
        {
            if(numb[i]>largest)
            {
                largest=numb[i];
            }
        }
        System.out.println("the largest element in the array is "+largest);
    }
}