class CodeingBatString
{
  public static void main(String args[])
   {
     String str ="abcggabs";
      int c,i,j,f=0;
   char ch;
   for(i=0; i<str.length()-1; i++)
  {
    c=0;
    ch= str.charAt(i);
    if(ch== 'g')
    {
      ch= str.charAt(i+1);
      while(ch =='g')
      {
      c++;
      ch= str.charAt(i+1);
        
      }
    }
   if(c==1)
    {f=1;break;}
  }
  
  ch= str.charAt(str.length()-1);
  if(ch=='g'){f=1;}
   System.out.println(f);
   }
}