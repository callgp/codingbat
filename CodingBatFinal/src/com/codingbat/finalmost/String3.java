package com.codingbat.finalmost;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int countYZ(String str) {
		  final String yz = "YZyz"; // saves toLower Case call
		  int count = 0;
		  str += ".";
		  for (int i = 1; i < str.length(); i++)
		  {
		    if (yz.contains(str.substring(i - 1, i)) &&
		       !Character.isLetter(str.charAt(i)))
		    {
		      count++;
		    }
		  }
		  return count;
		}
	public String withoutString(String base, String remove) {
		  
	}

	public boolean equalIsNot(String str) {
		   boolean ret = false;
     int isCount = 0;
     int notCount = 0;
     for (int i = 0; i < str.length() - 1; i++) {
         if (str.indexOf("is",i)) {
            // System.out.println("is str.substring(i, i + 2) "+str.substring(i, i + 2));
            // System.out.println("is found at "+i);
             isCount++;
         }
        // System.out.println("isCount "+isCount);

     }

     for (int i = 0; i < str.length() - 2; i++) {
          if (str.indexOf("not",i)) {
             //System.out.println("not str.substring(i, i + 3) "+str.substring(i, i + 3));
            // System.out.println("not found at "+i);
             notCount++;
         }
         //System.out.println("notCount "+notCount);
     }

     if (isCount == notCount) {
         return true;
     } else {
         return false;
     }
 }
	public boolean gHappy(String str) {
		boolean ret = true;
		if (str.equals("")) {
			ret = true;
		} else if (str.length() <= 1) {
			ret = false;
		} else {
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.substring(i, i + 1).equals("g")) {

					if (i > 0 && str.substring(i - 1, i).equals("g")) {
						// ret = false;
						continue;
					} else if ((str.substring(i + 1, i + 2)).equals("g") && (i < str.length() )) {
						// ret = true;
						continue;
					} else {
						ret = false;
					}

				}
			}

			// return ret;
		}
		return ret;
	}
	
	public int countTriple(String str) {
		  int count=0;
		  for(int i=0;i<str.length()-2;i++){
		    
		    if( str.substring(i,i+1).equals(str.substring(i+1,i+2))
		       && str.substring(i,i+1).equals(str.substring(i+2,i+3))){
		         count++;
		       }
		       else{
		         count=count;
		       }
		  }
		  return count;
		}
	public int sumDigits(String str) {
		  int sum=0;
		  for(char c : str.toCharArray()){
		    if(Character.isDigit(c)){
		      int value=Integer.parseInt(String.valueOf(c));
		      sum=sum+value;
		    }
		  }
		  return sum;
		}
	public String sameEnds(String string) {
		  String ret="";
		  for(int i=0; i<string.length()/2+1; i++){
		    
		    if(string.substring(0,i).equals(string.substring(string.length()-i) )){
		      ret=string.substring(0,i);
		    }
		  }
		  return ret;
		}
	public String mirrorEnds(String string) {
		  String ret="";
				  for(int i=0; i<string.length()/2+1; i++){
				    String sub=string.substring(0,i);
				    if(string.startsWith(sub)&&string.endsWith(reverse(sub))){
				      ret=string.substring(0,i);
				    }
				  }
				  return ret;
				}
				
			public String	reverse(String str){
				  String res="";
				  for(int j=str.length()-1;j>=0;j--){
				    res=res+str.charAt(j);
				    return res;
				  }
				  return res;
				}
			public int maxBlock(String str) {
				  
				  int maxLen=0;
				  for(int i=0;i<str.length();i++){
				    
				    char c= str.charAt(i);// testtttttt
				    int j=i+1;
				    while(j<str.length() && str.charAt(j)==c){
				      j++;
				    }
				    int first =i;
				    int last=j-1;
				    int blockLen=last-first+1;
				    if(blockLen>maxLen){
				      maxLen=blockLen;
				    }
				    
				    
				  }
				  return maxLen;
				}
			public int sumNumbers(String str) {
				  int ret;
				  int sum=0;
				  for(int i=0;i<str.length();){
				    if(!Character.isDigit(str.charAt(i))){
				     i++;
				     continue;
				    }
				    
				    int j=i+1;
				    while(j<str.length() && Character.isDigit(str.charAt(j))){
				      j++;
				      String numStr=str.substring(i,j);
				        sum=sum+Integer.parseInt(numStr);
				        i=j;
				    }
				    
				    
				    }
				  return sum;
				}
			  public String notReplace(String str) {
				    String ret="";
				    for(int i=0;i<str.length()-1;i++){
				      if(str.substring(i).startsWith("is") &&
				      (i==0 && !Character.isLetter(str.charAt(i-1))) &&
				      (i==str.length()-2 || !Character.isLetter(str.charAt(i+2)))){
				        ret=ret+"is not";
				      }
				      else{
				        ret=ret+str.charAt(i);
				      }
				    }
				    return ret;
				  }

}
