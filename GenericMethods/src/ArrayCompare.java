import java.util.Arrays;
public class ArrayCompare {
	public static <T> boolean compare_Arrays(T[] array1,T[] array2) {
		if(array1.length != array2.length) {
			return false;
		}
		
		for(int i=0;i<array1.length;i++) {
			if(!array1[i].equals(array2[i])) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args) {
		Integer [] arr1= {1,2,3,4}; //Eğer bu metodun sadece Object türünden türetilmiş array'lerle çalışmasını istiyorsanız, int[] gibi temel veri 
		      //türlerini kullanmak yerine Integer[] gibi nesne türlerini kullanabilirsiniz.
		Integer [] arr2= {1,2,3,4};
		String [] arr3= {"Ali","Mehmet","Fatih"};
		String [] arr4= {"Ayşe","Selin","Tuğçe"};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		System.out.println("Arr1-Arr2 : " +compare_Arrays(arr1, arr2));
		//System.out.println("Arr3-Arr4 : " +compare_Arrays(arr3, arr4));
				
	}

}
