
public class stro {

	
	
	public static int[] show(int m[])
	{
		for(int i=0;i<m.length;i++)
		{
			System.out.println("el "+m[i]);
			
		}
		return m;
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String m="Москва";
		System.out.println("Сейчас строка "+m);
	
		String b=new StringBuilder(m).reverse().toString();
		
		System.out.println("Сейчас строка "+b);
		
		int mass[]={1,5,6,4,5};
		for(int i=0;i<mass.length;i++)
		{
			System.out.println("el "+mass[i]);
			
		}
		//System.out.println(show(mass));
	
		System.out.println("Перевернутый массив");
		
	
		for(int i=0;i<=mass.length/2;i++)
		{
		int temp=mass[i];
		mass[i]=mass[mass.length-i-1];
		mass[mass.length-i-1]=temp;
			
			
			
			
		}
		
		for(int i=0;i<mass.length;i++)
		{
			System.out.println("el "+mass[i]);
			
		}
		
		
	}

}
