package com.codingbat.finalmost;

public class Warmup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String stringTimes(String str, int n) {
		  String newStr="";
		  for(int i=0;i<n;i++){
		    newStr=newStr+str;
		    //return newStr;
		  }
		  return newStr;
		}
	public String frontTimes(String str, int n) {

		 if(str.length()>=3){
		  String result="";
		  String newString=str.substring(0,3);
		  
		  for(int i=0;i<n;i++){
		    
		    result=result+newString;
		  }
		  return result;
		 }
		 
		 else{
		  String result="";
		  String newString=str.substring(0,str.length());
		  
		  for(int i=0;i<n;i++){
		    
		    result=result+newString;
		  }
		  return result;
		 }
		}
	int countXX(String str) {
		  int count=0;
		  
		  for(int i=0;i<str.length()-1;i++){
		    if(str.substring(i,i+2).equals("xx")){
		      count++;
		    }
		  }
		  return count;
		}
	boolean doubleX(String str) {
		  boolean res=false;
		  if(str.length()>2){
		  for(int i=0;i<str.length()-1;i++){
		    if(str.substring(i,i+1).equals(str.substring(i+1,i+2))){
		     res=true;
		     break;
		    }else{
		     res=false;
		    }
		  }
		  }
		  else if(str.length()==2){
		    if(str.equals("xx")){
		     res=true;
		    }else{
		      res=false;
		    }
		  }
		    else{
		   res=false;
		  }
		return res;
		}


	public String stringBits(String str) {
		  String result="";
		  if(str.length()>=3){
		  for(int i=0;i<str.length();i=i+2){
		  result=result+str.substring(i,i+1);
		  }
		  }
		  
		   else if(str.length()==2){
		  //for(int i=0;i<str.length();i=i+2){
		  result=result+str.substring(0,1);
		  }
		  
		  else if(str.length()==1){
		  //for(int i=0;i<str.length();i=i+2){
		  result=result+str.substring(0,1);
		  }
		  else
		  result="";
		  return result;
		}
	public String stringSplosion(String str) {
		  String res="";
		  for(int i=0;i<str.length();i++){
		    
		  res= res+str.substring(0,i+1);
		  }
		  return res;
		}
	public int last2(String str) {

		  int res=0;
		  int count=0;
		  if(str.length()>=2){
		      String find=str.substring(str.length()-2);
		  for(int i=0;i<str.length()-2;i++){
		    if(str.substring(i,i+2).equals(find)){
		      count++;
		    }
		  }
		  res=count;
		  }else{
		    res=0;
		  }
		  return count;
		}
	public int arrayCount9(int[] nums) {
		  int count=0;
		  for(int i=0; i<nums.length;i++){
		    if(nums[i]==9){
		      count++;
		    }
		  }
		  return count;
		}
	public boolean arrayFront9(int[] nums) {
		  boolean res=false;
		  int len=nums.length;
		if(len >=4){
		  for(int i=0;i<len;i++){
		    if(nums[i]==9){
		      res=true;
		    }
		    else{
		      res= false;
		    }
		  }
		}

		if(len ==3){
		  for(int i=0;i<3;i++){
		    if(nums[i]==9){
		      res=true;
		    }
		    else{
		      res= false;
		    }
		  }
		}

		if(len ==2){
		  for(int i=0;i<2;i++){
		    if(nums[i]==9){
		      res=true;
		    }
		    else{
		      res= false;
		    }
		  }
		}


		if(len==1){
		  for(int i=0;i<1;i++){
		    if(nums[i]==9){
		      res=true;
		    }
		    else{
		      res= false;
		    }
		  }
		}

		if(len ==0){
		res=false;
		}

		  return res;
		}
	public boolean array123(int[] nums) {

		  for (int i=0; i < (nums.length-2); i++) {

		    if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;

		  }

		  return false;

		}
	public int stringMatch(String a, String b) {
		  int count=0;
		  if(a.length()>=2&&b.length()>=2){
		    for(int i=0;i<a.length()-1&& i<b.length()-1; i++){
		      if(a.substring(i,i+2).equals(b.substring(i,i+2))){
		      count=count+1;
		      }
		    }
		  }
		return count;
		}
	public String stringX(String str) {
	    StringBuilder sb = new StringBuilder(str); // str is not a good name but not your fault
			StringBuilder sbnew = new StringBuilder();
			int index = 1;
			if(str.length()==0){
			  return str;
			}
				if(str.length()==1){
			  return str;
			}
			if(str.startsWith("x")){
			sbnew.append("x");
			}else{
			  sbnew.append(sb.charAt(0));
			}
		while (index < sb.length() - 1)
			{
			  if (sb.charAt(index) == 'x')
			 {
				  sbnew.append("");
				  index++;
			 }
			 else
			 {
				 sbnew.append(sb.charAt(index));
				 index++;
			 }
		}
			
			if(str.endsWith("x")) {
				sbnew.append("x");
			}else{
			  sbnew.append(sb.charAt(str.length()-1));
			}
			return sbnew.toString();
	}
	public String altPairs(String str) {
		  String strr="";
			  for(int i=0;i<str.length();i=i+4){
				  strr=strr+str.charAt(i);
			  
			    
			       if(i+1<str.length()){
			    	  strr=strr+str.charAt(i+1);
			    
			        }
			  }    
			  return strr;
			}

	public String stringYak(String str) {
		  String temp="";
		  for(int i=0;i<str.length();i++){
		       if(i+2<str.length()&&str.charAt(i)=='y'&&str.charAt(i+2)=='k'){
		         i=i+2;
		       }else{
		         temp=temp+str.charAt(i);
		       }
		  }
		  return temp;
		}
	public int array667(int[] nums) {
		  int count=0;
		  for(int i=0;i<nums.length-1;i++){
		    if(nums[i]==6&&(nums[i+1]==6||nums[i+1]==7)){
		     count++;
		    }
		    
		  }
		  return count;
		}
	public boolean noTriples(int[] nums) {
		 // boolean ret=false;
		  for(int i=0;i<nums.length-2;i++){
		    if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
		      return false;
		     // ret=false;
		    }
		  //  else {
		   // return true;
		  //  ret= true;
		  //  }
		  }
		  return true;
		}
	public boolean has271(int[] nums) {
		  for(int i=0;i<nums.length-1;i++){
		    if( (Math.abs(nums[i]-nums[i+1])==5)&& (Math.abs(nums[i+2]-(nums[i]-1))<=2)) {
		      return true;
		    }
		  }
		  return false;
		}

}
