package thuchanh;

public class BinarySearch {
    static int[]list={2,3,7,8,9,10,12,34,45,66};
    static int BinarySearch(int[]list,int key){
        int low=0;
        int hight=list.length-1;
        while(hight>=low){
          int mid=(low+hight)/2;
          if(key<list[mid])
              hight=mid-1;
          else if(key==list[mid])
              return mid;
          else low=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(BinarySearch(list,2));
        System.out.println(BinarySearch(list,7));
        System.out.println(BinarySearch(list,11));
        System.out.println(BinarySearch(list,34));
        System.out.println(BinarySearch(list,66));

    }
}
