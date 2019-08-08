

class Demo{
	
	char r[][]= new  char[4][10];
	char rep[][]= new  char[4][10];


void replacefunction(s1)//function to replace the text into slang
{
    char r[][]={"yes","you","today","why"};
    char rep[][]={"s","u","2day","y"};
    char buff[]=new buff[500];
    int i;
    char ch;
    for(i=0;i<4;i++)
        if((ch=strstr(s1,r[i])))
        {
            strncpy(buff,s1,ch-s1);
            buff[ch-s1]=0;
            sprintf(buff+(ch-s1),"%s%s",rep[i],ch+strlen(r[i]));
            s1[0]=0;
            strcpy(s1,buff);
             replace(s1);
        }
    


class dff
{
	public static void main(String[] args) {
		
		char s1[]= new char[100];
	    gets(s1);
	    replacefunction(s1);//calling function
	    System.out.println(s1); //printing the SMS Language oriented text
	   
	}
}



   