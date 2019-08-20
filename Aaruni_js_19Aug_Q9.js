function mergeArray(arr1,arr2)
{

	var arr3= arr1.concat(arr2);
	
	var arr4=new Set(arr3);
	 

	console.log(arr4);

}
Arr1=[1,2,3,4]
Arr2=[3,4,5,6,7]
mergeArray(Arr1,Arr2)