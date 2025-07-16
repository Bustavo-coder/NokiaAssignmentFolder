public class Checkformonth{
	
public int amountofDays(int day,int year,String month){
int totaldaysInmonth = 0;

switch(month){
case "january" :
	totaldaysInmonth = 31;
	break;
	
case "february" :
	totaldaysInmonth = year % 4 == 0 && year % 100 != 0 || year % 400 == 0? 29 : 28;
	break;

case "march":
	totaldaysInmonth = 31;
	break;
case "april" :
	totaldaysInmonth = 30;
	break;
case "may" :
	totaldaysInmonth = 31;
	break;
case "june":
	totaldaysInmonth = 30;
	break;
case "july" :
	totaldaysInmonth = 31;
	break;
case "august" :
	totaldaysInmonth = 31;
	break;
case "september" :
	totaldaysInmonth = 31;
	break;
case "october":
	totaldaysInmonth = 31;
	break;
case"november" :
	totaldaysInmonth = 30;
	break;
case"december" :
	totaldaysInmonth = 31;
	break;
default :
 System.out.print("Invalid Month");
	break;
	
};
 	int daysRemainder = totaldaysInmonth - day;
	return  daysRemainder;

}

}
