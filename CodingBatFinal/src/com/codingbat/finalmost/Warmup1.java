package com.codingbat.finalmost;

public class Warmup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
			return true;
		} else {
			return false;
		}
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		if (aSmile && bSmile || !aSmile && !bSmile) {
			return true;
		} else
			return false;
	}

	public int sumDouble(int a, int b) {
		if (a == b) {
			return 4 * a;
		} else {
			return a + b;
		}
	}

	public int diff21(int n) {
		if (n > 21) {
			return 2 * (n - 21);
		} else {
			return 21 - n;
		}
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		if (talking && (hour < 7 || hour > 20)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean makes10(int a, int b) {
		if ((a == 10 || b == 10) || (a + b == 10)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean nearHundred(int n) {
		if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean posNeg(int a, int b, boolean negative) {
		boolean ret = false;
		if (negative) {
			if ((a <= 0 && b <= 0)) {
				ret = true;
			}
		}

		else if (((a <= 0) && (b >= 0)) || ((a >= 0) && (b <= 0))) {
			ret = true;
		}

		return ret;
	}

	public String notString(String str) {
		if (str.startsWith("not")) {
			return str;
		} else {
			return "not " + str;
		}
	}

	public String missingChar(String str, int n) {

		if (str.length() >= 1) {
			return (str.substring(0, n) + str.substring(n + 1, str.length()));
		} else {
			return str;
		}
	}
	
	public String frontBack(String str) {
		  if(str.length()>1){
		  return str.substring(str.length()-1)+str.substring(1,str.length()-1)+str.substring(0,1);
		  }
		  else{
		    return str;
		  }
		}

	public String front3(String str) {
		  if(str.length()<3){
		    return str+str+str;
		  }
		  else{
		    return str.substring(0,3)+str.substring(0,3)+str.substring(0,3);
		  }
		}

	public String backAround(String str) {
		  if(str.length()>=1){
		  return  (  str.substring( str.length()-1,str.length() )  +  str.substring(0,str.length()) +  str.substring( str.length()-1,str.length() ));
		  
		  }
		  else return str;
		  }

	public boolean or35(int n) {
		  return n%3 ==00 || n%5 ==00;
		}
	public String front22(String str) {
		  if(str.length()>=2){
		  return ( str.substring(0,2)+ str.substring(0,str.length())+str.substring(0,2));
		  }
		  else{
		   return str+str+str;
		  }
		}
	public boolean startHi(String str) {
		  return str.startsWith("hi");
		}

	public boolean icyHot(int temp1, int temp2) {
		  return ( (temp1<0 && temp2>100) || (temp1>100 && temp2<0) );
		  
		}

	public boolean in1020(int a, int b) {
		  return ( (a>=10 && a<=20) || (b>=10 && b<=20) );
		}
	public boolean hasTeen(int a, int b, int c) {
		  if(a>=13 && a<=19){
		    return true;
		  } else  if(b>=13 && b<=19){
		    return true;
		  }else  if(c>=13 && c<=19){
		    return true;
		  }
		  return false;
		}
	public boolean loneTeen(int a, int b) {
	    if((a>=13 && a<=19) && (b>=13 && b<=19) ){
	    return false;
	  }
	    else if(a>=13 && a<=19){
	    return true;
	  } else  if(b>=13 && b<=19){
	    return true;
	  }
	  return false;
	}

	public String delDel(String str) {
		  if(str.contains("del")){
		    int pos=str.indexOf("del");
		    if(pos==1){
		    return str.substring(0,pos)+str.substring(pos+3,str.length()) ;
		    }
		    else {
		      return str;
		    }
		  }
		  else
		  return str;
		}

	public boolean mixStart(String str) {
		  if(str.length()>=3){
		  if(str.substring(1,3).equals("ix") ){
		    return true;
		  }
		  else {
		    return false;
		  }
		  }
		  return false;
		}
	public String startOz(String str) {
		  if(str.length()>2){
		  if(str.startsWith("oz")){
		    return str.substring(0,2);
		  }else  if(str.startsWith("o")){
		    return str.substring(0,1);
		  }else  if(str.substring(1,2).equals("z")){
		    return str.substring(1,2);
		  }
		  }
		  else{
		    return str;
		  }
		  
		  
		  return "";
		}

	public int intMax(int a, int b, int c) {
		  if(a>b){
		    if(a>c){
		      return a;
		    }else{
		      return c;
		    }
		  }
		   if(c>b){
		    if(c>a){
		      return c;
		    }else{
		      return a;
		    }
		  }
		  
		  return b;
		}

	public int close10(int a, int b) {
		  int max=0;
		  if(Math.abs(a-10) > Math.abs(b-10)){
		    max=b;
		    //return a;
		  }else  if(Math.abs(a-10) < Math.abs(b-10)){
		    //return b;
		    max=a;
		  }
		  return max;
		  
		}
	public boolean in3050(int a, int b) {
		  if( (a>=30 && a<=40) && (b>=30 && b<=40)){
		    return true;
		  }
		  
		  if(( a>=40 && a<=50) && (b>=40 && b<=50)){
		    return true;
		  }

		  else 
		  return false;
		}

	public int max1020(int a, int b) {
		  int value=0;
		  if( (a>=10 && a<=20) && (b>=10 && b<=20) ){
		    if(Math.abs(a-10)>Math.abs(b-10)){
		      return a;
		    }
		    else{
		      return b;
		    }
		  }
		   if( (a>=10 && a<=20) ){
		      return a;
		  }
		   if(  (b>=10 && b<=20) ){
		  
		      return b;
		  
		  }
		  
		  return 0;
		  
		}

	public boolean stringE(String str) {
		  int count=0;
		  for(int i=0; i<str.length();i++){
		  if(str.charAt(i)=='e'){
		   // return true;
		   count++;
		  }
		  else {
		   // return false;
		   //count=count;
		  }
		  }
		  
		  if(count>=1 && count<=3){
		    return true;
		  }
		  else{
		    return false;
		  }
		}
	public boolean lastDigit(int a, int b) {
		  return (a%10)==(b%10);
		}
	public String endUp(String str) {
		   String ret="";
		  if(str.length()>=3){
			  String lastThree=str.substring(str.length()-2, str.length());
			 
			  if(str.length()>=3){
			  String stringLower = str.substring(0,str.length()-3)   ;
			 String stringUpper = (str.substring(str.length()-3, str.length()).toUpperCase() ) ;
			  ret= stringLower+stringUpper;
			  }
		  }
			  else{
			   ret= str.toUpperCase();
			  }
			  return ret;
			}
	public String everyNth(String str, int n) {
		  String newStr = str.substring(0,1);
		  
		  for(int i=0;i<str.length()-n;i=i+n){
			  newStr= newStr+str.charAt(i+n);
			 // i=i+1;
		    
		  }
		  return newStr;
		}


	
	

}


