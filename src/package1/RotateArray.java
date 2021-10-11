package package1;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RotateArray
{
	private int[] rotateArray(int[] originalArray, int rotationCount) {
		int[] rotatedArray = new int[originalArray.length];
		System.out.println("The original array : "+Arrays.toString(originalArray));
		for(int i=0;i<originalArray.length;i++)
		{
			int count = 0;
			int j=i;
			while(count<rotationCount)
			{
				if(j<originalArray.length-1)
				{
					j++;
					count++;
				}
				else
				{
					j=0;
					count++;
				}
			}
			rotatedArray[j] = originalArray[i];
		}
		System.out.println("The array after rotating it "+rotationCount+" times : "+Arrays.toString(rotatedArray));
		return rotatedArray;
	}

	@Test
	public void testCase1()
	{
		int[] originalArray = {1,2,3,4,5};
		int[] rotatedArray = {3,4,5,1,2};
		Assert.assertEquals(rotateArray(originalArray, 3), rotatedArray);
	}
	@Test
	public void testCase2()
	{
		int[] originalArray = {1,2,3,4,5};
		int[] rotatedArray = {5,1,2,3,4};
		Assert.assertEquals(rotateArray(originalArray, 1), rotatedArray);
	}
}

