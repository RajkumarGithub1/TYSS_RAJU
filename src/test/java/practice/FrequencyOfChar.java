package practice;

public class FrequencyOfChar 
{
//	 public static void main(String args[])
//	    {
//	        String s1="VacancY AvaiLable";
//	        String s=s1.replace(" ", "");
//	        System.out.println(s+"```````");
//	        int lower=0;
//	        int upper=0;
//	        for(int i=0; i<s.length(); i++)
//	        {
//	            char ch=s.charAt(i);
//	         
//	            if(ch<=96)
//	            {
//	            	upper++;
//	            }
//	            else if(ch>=97)
//	            {
//	            	lower++;
//	            }
//	        }
//	        System.out.println("lower case letters are :"+lower);
//	        System.out.println("upper case letters are :"+upper);
//	        
//	    }   
	 
	
	 public static void main(String args[])
	    {
	        String s="VacancY AvaiLable";
	      
	        int distinct = 0 ;

	        while(s.length()>0)
	        {
	            
	            for (int j = 0; j < s.length(); j++) 
	            {

	                if(s.charAt(0)==s.charAt(j))
	                {
	                    distinct++;

	                }
	            }   
	            
	            System.out.println(s.charAt(0)+"--"+distinct);
	            String d=String.valueOf(s.charAt(0)).trim();
	            s=s.replaceAll(d,"");
	            distinct = 0;   
	        }
	        	
	        	
	      
	    }
}