import java.util.Scanner;
class speed
{
public static void main(String[] args)
{

float sp,spk,spm;
Scanner myObj = new Scanner(System.in);


System.out.println("Enter distance in meters");
float distance= myObj.nextFloat();
System.out.println("Enter time in hours");
int th= myObj.nextInt();

System.out.println("Enter time in min");
int tm= myObj.nextInt();

System.out.println("Enter time in sec");
int ts= myObj.nextInt();

float km=distance/1000f;
System.out.println("Distance in km :"+km);

float ml=distance/1609f;
System.out.println("Distance in miles :"+df.format(ml));

sp=distance/ts;
System.out.println("Speed in m/s:" + df.format(sp));

spk=km/th;
System.out.println("Speed in km/h:" + df.format(spk));

spm=ml/th;
System.out.println("Speed in ml/h:" +df.format(spm));
}
}
