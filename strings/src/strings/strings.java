package strings;

public class strings {
	public static void main(String[] args){
		String message="Have a nice day!";
		System.out.println("text length:"+message.length());
		System.out.println("6.character:"+message.charAt(5));
		System.out.println(message.concat(" GOOD!"));
		System.out.println(message);
		System.out.println(message.startsWith("A"));
		System.out.println(message.endsWith("!"));
		char caracter[]=new char[25];
		message.getChars(0 ,4,caracter,0);
		System.out.println(caracter);
		System.out.println(message.indexOf('e'));
		//'e' yazarsak karakter "ve" yazarsak string arar!
		System.out.println(message.lastIndexOf('e'));
		for(String words:message.split(" "))
		{
			System.out.println(words);
		}
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		
		
	}

}
