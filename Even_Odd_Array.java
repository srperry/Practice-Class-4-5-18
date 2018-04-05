
public class Even_Odd_Array {

	public static void main(String[] args) {
		
int a[]={24,79,65,36,48};
int counter=0;
for(int i=0;i<a.length;i++){
	if(a[i]%2==1){
		counter=counter+1;
	}
	}
System.out.println("The total number of ODD nnumbers in the array is " +counter);

System.out.println("The total number of EVEN nnumbers in the array is " +(a.length - counter));

}

}
