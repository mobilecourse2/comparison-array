public class same{

public static void main(String[] args){

		int arr[]={15,2,3,4,5};
		int arr2[]={11,7,3,4,4};
		int a=arr[0];
		int b= arr2[0];
		for(int i=0;i<arr.length;i++){
			
			a=a+arr[i];
		}
		for(int i=0;i<arr2.length;i++){
			b=b+arr2[i];
		}
		if (a==b){
			System.out.print("Both are same");
			
		}
		else{
			System.out.print("Not Same");
		}

}
}