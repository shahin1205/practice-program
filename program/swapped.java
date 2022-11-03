/*
Name : Mohammed shahin Ali
date : 27-10-2022
Question : swapped

*/


public class swapped {
	static void bubleSort(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			for( int j=i+1;j<a.length;j++){
				if(a[i]>a[j]) {
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];}
			}
		}
	}
public static void main(String args[]) {
	int a[]={55,92,78,41,80};
	for(int k=0;k<a.length;k++)
	System.out.print(" "+a[k]);
	System.out.println("After Swaping");
	bubleSort(a);
	for(int l=0;l<a.length;l++) {
	System.out.print(a[l]+" ");
	 }
}
}
