package aldi;

public class main {

	public static void main(String[] args) {
		System.out.println("------Object Kelas Kotak------");
		// membuat object dari class kotak
		kotak main = new kotak();
			
		// method setter kotak
		main.setpanjang(6.66);
		main.setlebar(7.77);
			
		// method getter kotak
		System.out.println("panjang : " + main.getpanjang());
		System.out.println("lebar : " + main.getlebar());
		System.out.println("luas : " + main.getpanjang()*main.getlebar());
		System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
		
		System.out.println("------Object Kelas mahasiswa------");
		//membuat object dari class mahasiswa
		mahasiswa mahasiswa = new mahasiswa();
		
		//method setter mahasiswa
		mahasiswa.nama = "Arnoldus Renaldi";
		mahasiswa.nim = "D0217324";
		mahasiswa.alamat = "Lino Maloga";
		mahasiswa.golonganDarah = "B";
		mahasiswa.status = "Mahasiswa";
		mahasiswa.tinggiBadan = "165";
		mahasiswa.beratBadan = "45";
		
		//method getter mahasiswa
		System.out.println("nama : " + mahasiswa.getnama());
		System.out.println("nim : " + mahasiswa.getnim());
		System.out.println("alamat : " + mahasiswa.getalamat());
		System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
		System.out.println("Status : " + mahasiswa.getstatus());
		System.out.println("tinggi badan : " + mahasiswa.gettinggiBadan());
		System.out.println("berat badan : " + mahasiswa.getberatBadan());

		System.out.println("------Object Kelas node------");
		//membuat object dari kelas node
		node node = new node();
		
		//method setter node
		node.label = "Vespa";
		node.Value = 1;
		
		//method getter node
		System.out.println("Nama Label : " + node.getlabel());
		System.out.println("jumlah label : " + node.getValue());

		System.out.println("------Object Kelas stack------");
		//membuat object dari kelas stack
		stack stack = new stack();
		
		stack.value[0] = "Arnoldus renaldi";
		stack.value[1] = "andi";
		stack.value[2]= "adin";
		stack.value[3]= "dilan";
		stack.value[4]= "nadya";
		stack.value[5]= "trilia";
		stack.value[6]= "anto";
		stack.value[7]= "felix";
		stack.value[8]= "jeklin";
		stack.value[9]= "kristian";
		stack.value[10]= "jessy";
		stack.value[11]= "tono";
		stack.value[12]= "dandi";
		stack.value[13]= "patur";
		stack.value[14]= "arnol";
		stack.value[15]= "muddin";
		stack.value[16]= "jumar";
		stack.value[17]= "mujaeni";
		stack.value[18]= "nurlina";
		stack.value[19]= "sayyidah";
		stack.value[20]= "ani";
		stack.value[21]= "agung";
		stack.value[22]= "alif";
		stack.value[23]= "ammad";
		stack.value[24]= "rewi";
		stack.value[25]= "nurgan";
		stack.value[26]= "dian";
		stack.value[27]= "srigae";
		stack.value[28]= "putri andia";
		stack.value[29]= "rajab";
		stack.value[30]= "putry";
		stack.value[31]= "eka";
		stack.value[32]= "ria";
		stack.value[33]= "asrul";
		stack.value[34]= "maya";
		stack.value[35]= "ramon";
		stack.value[36]= "yunus";
		stack.value[37]= "rian";
		stack.value[38]= "kalik";
		stack.value[39]= "era";
		stack.value[40]= "ikbal";
		stack.value[41]= "aqil";
		stack.value[42]= "idil";
		stack.value[43]= "sukran";
		stack.value[44]= "bambang";
		stack.value[45]= "jacki";
		stack.value[46]= "sitti";
		stack.value[47]= "nanda";
		stack.value[48]= "madina";
		stack.value[49]= "rajab";
		stack.value[50]= "hasan";
		stack.value[51]= "husain";
		stack.value[52]= "opik";
		stack.value[53]= "agus";
		stack.value[54]= "dandi";
		stack.value[55]= "andi";
		stack.value[56]= "ulfa";
		stack.value[57]= "paisal";
		stack.value[58]= "alifah ariani";
		stack.value[59]= "kanda";
		stack.value[60]= "iksan";
		stack.value[61]= "bani";
		stack.value[62]= "prince";
		stack.value[63]= "winda";
		stack.value[64]= "candra";
		stack.value[65]= "ria";
		stack.value[66]= "kiki";
		stack.value[67]= "niko";
		stack.value[68]= "resky";
		stack.value[69]= "narson";
		stack.value[70]= "angga";
		stack.value[71]= "ribka";
		stack.value[72]= "milka";
		stack.value[73]= "vera";
		stack.value[74]= "miskal";
		stack.value[75]= "aidin";
		stack.value[76]= "jsman";
		stack.value[77]= "berdi";
		stack.value[78]= "dadang";
		stack.value[79]= "tentri";
		stack.value[80]= "firman";
		stack.value[81]= "nawir";
		stack.value[82]= "tony";
		stack.value[83]= "bob marley";
		stack.value[84]= "indro";
		stack.value[85]= "kasino";
		stack.value[86]= "ririn";
		stack.value[87]= "ani";
		stack.value[88]= "dono";
		stack.value[89]= "wahyu";
		stack.value[90]= "randy";
		stack.value[91]= "yulianus";
		stack.value[92]= "yuliana";
		stack.value[93]= "jerry";
		stack.value[94]= "darman";
		stack.value[95]= "wahyu";
		stack.value[96]= "trivita";
		stack.value[97]= "karjo";
		stack.value[98]= "yono";
		stack.value[99]= "arpen";
		
		stack.setvalueAt(1 ,"Aldi");

		//menampilkan stack
		for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};

	}

}
