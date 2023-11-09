//Program to print the largest element in an array
class  FindLargestElement
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 10, 7, 3, 8, 8};
        System.out.println(findLargestElements(arr));
    }

    public static int findLargestElements(int []arr)
    {
        int n = arr.length, max=arr[0];
        for(int i=1; i<n; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
