package lab_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Traffic {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("If Traffic light is indicated as:");
String n=br.readLine();
switch(n)
{
case "red":
	System.out.println("stop");
	break;
case "yellow":
	System.out.println("ready");
	break;
case "green":
	System.out.println("go");
		}


	

	}

}
