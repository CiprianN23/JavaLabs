public class Lab1String {
	public static void main(String args[]) {
		
		String[] enunturi = new String[3];
		enunturi[0] = "Prima mea clasa in Java";
		enunturi[1] = "Primul meu program Java.";
		enunturi[2] = "Totul pe GitHub.";
		System.out.println(enunturi[0] + " si " + enunturi[1] + enunturi[2]);
		
		//enunturi[0].split("m"); - functia split desparte un string in functie de delimitatorul specificat
		//enunturi[1].contains('J'); - functia contains va returna o valoare bool (adevarat in cazul de fata) in cazul in care stringul contine acel sir de caractere
		//enunturi[2].isEmpty(); - functia isEmpty va returna o valoare bool (fals in cazu de fata) in cazul in care stringul este gol sau nu
		
		String strM = "Java este mai bun decat C++";
		int mijloc = strM.length()/2;
		String[] bucati = {strM.substring(0, mijloc), strM.substring(mijloc)};
		int cPos = strM.indexOf('c');
		String delimitat = strM.substring(0, cPos);
		
	}
}