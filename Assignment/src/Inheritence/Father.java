package Inheritence;

public class Father {
int a = 10;
int add(int y)
{
	int b = y;
	return (a+b);
	
	
}
}
interface Mother
{
	int c = 30;
	void disp();
	
}
class Son extends Father implements Mother
{
	int m = a * Mother.c;
	`
}