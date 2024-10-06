/*package InterviewQuestion;

public class CountFrequency {
    public static void main(String[] args){
        int[] arr = {20,30,50,20,30,40,50};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]+1));
            }
            else{
                map.put(arr[i],1);
            }

        }
        System.out.println(map);
    }
    
}*/
