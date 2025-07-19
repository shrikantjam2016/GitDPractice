package pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Test_Java {
	public static void main(String[] args) {
		//countSpecialCharacters();
		//rotationOfStirng();
		//segregateEvenOdd();
		//sortOnesZeros();
		//maxMinFrom3x3Matrix();
		//calculateSumFromString();
		//frequencyOfCharacters();
		//frequencyOfCharacters1();
		//frequencyOfWords();
		//frequencyOfWords1();
		//alphanumericstring();
		removeSpecialCharacter();
		reversStringInSentence();
	}
	
	/**
	 * Reverse each string from the sentence keeping white space intact
	 */
	private static void reversStringInSentence() {
		String st="Hello How are You";
		String[] ab=st.split(" ");
		String newName="";
		for(int i=0;i<ab.length;i++)
		{
			String sub=ab[i];
			for(int j=sub.length()-1;j>=0;j--)
			{
				newName=newName+sub.charAt(j);
			}
			newName=newName+" ";
		}
		System.out.println(newName);
		
	}



	private static void removeSpecialCharacter() {
		// remove special characters from the string
		String ab="skdhsaklhd@#%%";
		int count=0;
		String newString="";
		for(int i=0;i<ab.length();i++)
		{
		if(!Character.isDigit(ab.charAt(i))&&!Character.isLetter(ab.charAt(i))&&!Character.isWhitespace(ab.charAt(i)))
		{
			count++;
			
		}
		else
		{
			newString=newString+ab.charAt(i);
		}
		}
		if(count==0)
		{
			System.out.println("Not a special character and the string is ");
		}
		else
		{
			System.out.println("Special character(s) is/are there");
		}
		System.out.println(newString);
		
	}



	private static void alphanumericstring() {
		// Alphanumeric string with 6 characters
		String st=UUID.randomUUID().toString();	
		System.out.println(st);
		st=st.replaceAll("-", "");
		System.out.println(st);
		st=st.substring(0,6);
		System.out.println(st);
	}



	private static void frequencyOfWords1() {
		String st="Big black bug bit a big black dog on his big black nose";
		String[] st1=st.split(" ");
		int count=0;
		for(int i=0;i<st1.length;i++)
		{
			count=1;
			for(int j=i+1;j<st1.length;j++)
			{
				if(st1[i].equals(st1[j]))
				{
					st1[j]="0";
					count++;
				}
			}
			if(count>1&& st1[i]!="0")
			{
				System.out.println(st1[i]+ " "+count);
			}
		}
		
	}



	private static void frequencyOfWords() {
		String st="Big black bug bit a big black dog on his big black nose";
		HashMap<String, Integer> m=new HashMap<String, Integer>();
		
		String[] st1=st.split(" ");
		
		for(int i=0;i<st1.length;i++)
		{
			if(m.containsKey(st1[i])) {
				m.put(st1[i], m.get(st1[i])+1);
			}
			else
				m.put(st1[i], +1);
		}
		
		for(Map.Entry<String, Integer> map1:m.entrySet())
				{
				//System.out.println(map1.getKey()+" "+map1.getValue());
				}
		
		Set<String> l1=m.keySet();
		for(String l2:l1)
		{
			if(m.get(l2)>1)
			{
				System.out.println(l2+" "+m.get(l2));
			}
		}
		
	}



	private static void frequencyOfCharacters1() {
		String st="Big black bug bit a big black dog on his big black nose";
		char[] ch=st.toLowerCase().replace(" ", "").trim().toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=0;
					count++;
				}
			}
			if(count>1 && ch[i]!=0)
			{
				System.out.println(ch[i] +" " +count);
			}
		}
		
		
	}



	private static void frequencyOfCharacters() {
		String ab="Java concept of the day";
		
		HashMap<Character, Integer> m=new HashMap<Character, Integer>();
		
		char[] c=ab.replace(" ", "").toCharArray();
		for(char ch:c)
		{
			if(m.containsKey(ch))
			{
				m.put(ch, m.get(ch)+1);
			}
			else
			{
				m.put(ch, 1);
			}
		}
		
		System.out.println(m);
		
		for(Map.Entry<Character, Integer> mp:m.entrySet())
		{
			//System.out.println(mp.getKey()+" "+mp.getValue());
		}
		
		Set<Character> cset=m.keySet();
		for(Character cha:cset)
		{
			if(m.get(cha)>1)
			{
				System.out.println(cha+" "+m.get(cha));
			}
		}
		
		System.out.println("--------------X----------------");
	}



	private static void calculateSumFromString() {
		String ab="dohdf76hp063j7";
		char[] ch=ab.toCharArray();
		
		int sum=0;
		for(char c:ch)
		{
			if(Character.isDigit(c))
			{
				sum=sum+Integer.parseInt(String.valueOf(c));
			}
		}
		System.out.println(sum);
		
	}



	private static void maxMinFrom3x3Matrix() {
		int[][] a= {{3,5,6},{1,100,5},{5,6,6}};
		int max=-1;
		int rowNum=-1;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
					rowNum=i;
				}
			}
		}
		System.out.println("Max = "+max+" From row "+rowNum);
		int min=max;
		for(int i=0;i<a.length;i++)
		{
			if(a[rowNum][i]<min)
			{
				min=a[rowNum][i];
				
			}
		}
		System.out.println("And mnimum from "+rowNum+ " is "+min);
		
	}



	private static void sortOnesZeros() {
		int[] arr= {0,1,1,0,1,0,0,1};
		int[] a=new int[arr.length];
	
		int index1=0;

		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				a[index1]=arr[i];
				index1++;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				a[index1]=arr[i];
				index1++;
			}
		}
		
		for(int i=0;i<index1;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	
	private static void segregateEvenOdd() {
		int[] arr= {2,4,1,8,5,6,3};
		int[] a=new int[arr.length];
		int[] b=new int[arr.length];
		int index1=0;
		int index2=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				a[index1]=arr[i];
				index1++;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(!(arr[i]%2==0))
			{
				b[index2]=arr[i];
				index2++;
			}
		}
		
		for(int i=0;i<index1;i++)
		{
			System.out.println(a[i]);
		}
		
	}

	private static void rotationOfStirng() {
		// TODO Auto-generated method stub
		
	}

	private static void countSpecialCharacters() {
		String s="CloudTesch$#@$";
		
		int count=0;
		String cc="";
		
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isDigit(s.charAt(i))&&!Character.isLetter(s.charAt(i))&&!Character.isWhitespace(s.charAt(i)))
			{
				count++;
			}
			else
			{
				cc=cc+s.charAt(i);
			}
		}
		
		if(count==0)
		{
			System.out.println("no special character");
		}
		else
		{
			System.out.println("There are "+count+" Special Characters ");
		}
		
		System.out.println(cc);
		
	}

}
